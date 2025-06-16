package Com_Utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail {

    public static void main(String[] args) throws Exception {
        sendReportEmail();
    }

    public static void sendReportEmail() throws Exception {

        System.out.println("======= Sending Email with Extent Report ZIP Attachment =======");

        // Path to the HTML report
        String reportPath = "C:\\COde\\test\\test-output\\Extent_Reports\\TestReport.html";

        // Zip the HTML report
        String zipPath = zipReport(reportPath);

        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(zipPath);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Automation Test Extent Report (Zipped)");
        attachment.setName("Extent_Test_Report.zip");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.office365.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "L^281715140902ab"));
        email.setStartTLSEnabled(true);
        email.setStartTLSRequired(true);
        email.setSSLOnConnect(false);

        email.setFrom("qaautomation@heerasoftware.com");
        email.setSubject("Automation Test Execution Report (Zipped)");
        email.setMsg("Please find the attached ZIPPED Automation Test Execution Report.");
        email.addTo("aniket.jadhav@heerasoftware.com");
        email.addTo("ankush.gharsele@heerasoftware.com");
       
       
        
        // Attach the zipped report
        email.attach(attachment);

        // Send the email
        email.send();

        System.out.println("✅ Email sent successfully with zipped report!");
    }

    // Utility method to zip the report
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

        return zipFilePath;
    }
}
