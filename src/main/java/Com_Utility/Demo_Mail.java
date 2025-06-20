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
      String reportPath = "C:\\COde\\test-new\\test\\test-output\\Extent_Reports\\TestReport.html";
    //  C:\\COde\\test-new\\test\\test-output\\Extent_Reports
        
    //  String reportPath ="FSRC_PR\\test-output\\Extent_Reports\\TestReport.html";
    

        // Step 2: Zip the HTML report
        String zipPath = zipReport(reportPath);

        // Step 3: Copy ZIP to shared OneDrive folder
        String sharedDrivePath = "S:\\Heera_Common_Shared\\Ankush\\Automation Test Reports";
        // Optional: Use UNC path if S: mapping fails
        // String sharedDrivePath = "\\\\heerasoftware0.sharepoint.com@SSL\\DavWWWRoot\\sites\\HSPL_Testing_Team\\Shared Documents\\HSPL_Testing_Team\\Common\\Ankush Gharsele\\Automation Test Reports Result";
        String copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);

        // Step 4: Public OneDrive link
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/:f:/r/sites/HSPL_Testing_Team/Shared%20Documents/HSPL_Testing_Team/Common/Ankush%20Gharsele/Automation%20Test%20Reports%20Result?csf=1&web=1&e=AcjdO1";

        // Step 5: Compose email
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.office365.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "L^281715140902ab"));
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
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetPath = Paths.get(sharedDrivePath, sourceFile.getName());

        try {
            Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Report copied to OneDrive shared folder: " + targetPath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy to shared folder: " + e.getMessage());
            throw e;
        }

        return targetPath.toString();
    }
}
