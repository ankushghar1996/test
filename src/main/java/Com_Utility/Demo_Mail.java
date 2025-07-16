package Com_Utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.*;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail {

    public static void main(String[] args) throws Exception {
        sendReportEmail();
    }

    public static void sendReportEmail() throws Exception {
        System.out.println("======= Sending Email with Extent Report OneDrive Link =======");

        // Step 1: Path to the HTML report
        // aniket path
     //   String reportPath = "C:\\COde\\test-new\test\\test-output\\Extent_Reports\\TestReport.html";

        // ankush path
        String reportPath = "C:\\COde\\test\\test-output\\Extent_Reports\\TestReport.html";
        
        // Step 2: Zip the HTML report
        String zipPath = zipReport(reportPath);

        // Step 3: Public OneDrive link (used for email reference)
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/:f:/r/sites/HSPL_Testing_Team/Shared%20Documents/HSPL_Testing_Team/Common/Ankush%20Gharsele/Automation%20Test%20Reports%20Result?csf=1&web=1&e=AcjdO1";

        // Step 4: UNC path to shared folder (not a mapped drive like S:\ or Z:\)
        String sharedDrivePath = "C:\\Users\\10389\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";

        //Ankush Path = S:\Heera_Common_Shared\Ankush\Automation Test Reports
        
        String copiedPath = copyToSharedFolder(zipPath, sharedDrivePath, oneDriveLink);

        // Step 5: Compose and send email
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
                + "📄 File Name: " + new File(copiedPath).getName() + "\n"
                + "📂 Copied To: " + copiedPath + "\n\n"
                + "Also attached as a backup.\n\n"
                + "Regards,\nAutomation Team");

        email.addTo("aniket.jadhav@heerasoftware.com");
        email.addTo("ankush.gharsele@heerasoftware.com");

        // Step 6: Attach ZIP report as backup
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(zipPath);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setName(new File(zipPath).getName());
        email.attach(attachment);

        // Step 7: Send email
        email.send();
        System.out.println("✅ Email sent successfully with OneDrive link and attachment!");
    }

    // Zip the report HTML file
    public static String zipReport(String filePath) throws IOException {
        String zipFilePath = filePath.replace(".html", ".zip");

        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zipOut = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(new File(filePath))) {

            ZipEntry zipEntry = new ZipEntry(new File(filePath).getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
        }

        System.out.println("✅ Report zipped: " + zipFilePath);
        return zipFilePath;
    }

    // Copy ZIP to OneDrive shared folder
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath, String oneDriveLink) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetDir = Paths.get(sharedDrivePath);
        Path targetPath = targetDir.resolve(sourceFile.getName());

        try {
            Files.createDirectories(targetDir); // Ensure directory exists
            Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Report copied to shared folder: " + targetPath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy to shared folder: " + e.getMessage());
            System.out.println("📌 Please manually check OneDrive link: " + oneDriveLink);
            throw e;
        }

        return targetPath.toString();
    }
}
