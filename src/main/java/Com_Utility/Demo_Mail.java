package Com_Utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail {

    public static void main(String[] args) {
        sendReportEmail();
    }

    public static void sendReportEmail() {
        System.out.println("======= Sending Email with Extent Report OneDrive Link =======");

        // ✅ Path to the report folder
        String reportFolderPath = "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Test\\test-output\\Extent_Reports";

        // ✅ OneDrive link (used in email body)
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/sites/QATeam/Shared%20Documents/Forms/AllItems.aspx?id=%2Fsites%2FQATeam%2FShared%20Documents%2FQA%20Shared%20Folder&viewid=efe5bcf8%2De44d%2D4de2%2Db0cd%2D8ac68543bb53&p=true&ga=1";

        // ✅ Shared folder path (where to copy ZIP)
        String sharedDrivePath = "C:\\Users\\10277\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";

        String zipPath;
        try {
            zipPath = zipReportFolder(reportFolderPath);
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report folder: " + e.getMessage());
            return;
        }

        String copiedPath;
        try {
            copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy ZIP to OneDrive folder: " + e.getMessage());
            copiedPath = "❌ Copy failed. Refer to logs.";
        }

        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "F.922060763339uy"));
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

            // ✅ Attach ZIP
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

    // ✅ Method to zip the report folder
    public static String zipReportFolder(String folderPath) throws IOException {
        File folderToZip = new File(folderPath);

        if (!folderToZip.exists() || !folderToZip.isDirectory()) {
            throw new IOException("Invalid folder path: " + folderPath);
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String zipFilePath = folderToZip.getParent() + File.separator + "Extent_Reports_" + timestamp + ".zip";

        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zipOut = new ZipOutputStream(fos)) {
            zipDirectory(folderToZip, folderToZip.getName(), zipOut);
        }

        System.out.println("✅ Folder zipped: " + zipFilePath);
        return zipFilePath;
    }

    private static void zipDirectory(File folder, String parentFolder, ZipOutputStream zipOut) throws IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                zipDirectory(file, parentFolder + "/" + file.getName(), zipOut);
            } else {
                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(parentFolder + "/" + file.getName());
                    zipOut.putNextEntry(zipEntry);

                    byte[] bytes = new byte[1024];
                    int length;
                    while ((length = fis.read(bytes)) >= 0) {
                        zipOut.write(bytes, 0, length);
                    }
                }
            }
        }
    }

    // ✅ Method to copy ZIP to OneDrive folder
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetDir = Paths.get(sharedDrivePath);
        Path targetPath = targetDir.resolve(sourceFile.getName());

        Files.createDirectories(targetDir); // Ensure folder exists
        Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("✅ Report copied to shared folder: " + targetPath);

        return targetPath.toString();
    }
}
