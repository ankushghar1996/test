package Com_Utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail {

    public static void main(String[] args) throws Exception {
        sendReportEmail();
    }

    public static void sendReportEmail() {
        System.out.println("======= Sending Email with Extent Report OneDrive Link =======");

        // Folder path to the full Extent Reports directory
        String reportFolderPath = "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Test\\test-output\\Extent_Reports";

        // Generate timestamped ZIP file
        String zipPath;
        try {
            zipPath = zipReportFolder(reportFolderPath);
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report folder: " + e.getMessage());
            return;
        }

        // OneDrive link
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/sites/QATeam/Shared%20Documents/Forms/AllItems.aspx?id=%2Fsites%2FQATeam%2FShared%20Documents%2FQA%20Shared%20Folder&viewid=efe5bcf8%2De44d%2D4de2%2Db0cd%2D8ac68543bb53&p=true&ga=1";

        // Shared folder path (OneDrive sync folder)
        String sharedDrivePath = "C:\\Users\\10277\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";
        String copiedPath;

        try {
            copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy to shared folder: " + e.getMessage());
            System.out.println("📌 Please manually check OneDrive link: " + oneDriveLink);
            copiedPath = "❌ Copy failed. Refer to logs.";
        }

        // Send email
        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator(
                "qaautomation@heerasoftware.com", 
                "F.922060763339uy" // 🔒 REPLACE with Jenkins credential or environment variable
            ));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);

            email.setFrom("qaautomation@heerasoftware.com");
            email.setSubject("Automation Test Execution Report - OneDrive Link + Backup Attachment");

            email.setMsg("Hi Team,\n\n"
                    + "The Automation Test Report has been uploaded to OneDrive.\n\n"
                    + "🔗 OneDrive Link: " + oneDriveLink + "\n\n"
                    + "📄 File Name: " + new File(zipPath).getName() + "\n"
                    + "📂 Copied To: " + copiedPath + "\n\n"
                    + "Also attached as a backup.\n\n"
                    + "Regards,\nAutomation Team");

            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach ZIP file
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(zipPath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setName(new File(zipPath).getName());
            email.attach(attachment);

            email.send();
            System.out.println("✅ Email sent successfully with OneDrive link and attachment!");
        } catch (Exception e) {
            System.err.println("❌ Failed to send email: " + e.getMessage());
        }
    }

    // ✅ Zip the entire report folder
    public static String zipReportFolder(String folderPath) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String zipFilePath = folderPath + "_" + timestamp + ".zip";

        try (
            FileOutputStream fos = new FileOutputStream(zipFilePath);
            ZipOutputStream zos = new ZipOutputStream(fos)
        ) {
            Path sourceDir = Paths.get(folderPath);
            Files.walk(sourceDir)
                .filter(path -> !Files.isDirectory(path))
                .forEach(path -> {
                    ZipEntry zipEntry = new ZipEntry(sourceDir.relativize(path).toString());
                    try {
                        zos.putNextEntry(zipEntry);
                        Files.copy(path, zos);
                        zos.closeEntry();
                    } catch (IOException e) {
                        System.err.println("❌ Error zipping file: " + path + " - " + e.getMessage());
                    }
                });
        }

        System.out.println("✅ Folder zipped: " + zipFilePath);
        return zipFilePath;
    }

    // ✅ Copy the ZIP to OneDrive shared folder
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetDir = Paths.get(sharedDrivePath);
        Path targetPath = targetDir.resolve(sourceFile.getName());

        Files.createDirectories(targetDir); // Ensure directory exists
        Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("✅ Report copied to shared folder: " + targetPath);

        return targetPath.toString();
    }
}
