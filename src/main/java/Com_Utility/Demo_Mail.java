package Com_Utility;
 
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.Test;
 
public class Demo_Mail {
 
	public static void main(String[] args) throws Exception {
		
		sendReportEmail();
		
	}

	
    public static void sendReportEmail() throws Exception {
 
       
            System.out.println("======= Sending Email with Extent Report Attachment =======");
            
            String Report_Path = "C:\\COde\\test\\test-output\\Extent_Reports\\TestReport.html";
 
            // Create the attachment
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(Report_Path);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Automation Test Extent Report");
            attachment.setName("Extent_Test_Report.html");
 
            // Create the email message
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");  //  Correct SMTP server for Office 365
            email.setSmtpPort(587);  //  Use port 587 for STARTTLS
 
            // Use your Office 365 email & App Password
            email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "L^281715140902ab"));
 
            //  Fix STARTTLS issue by forcing it explicitly
            email.setStartTLSEnabled(true);  
            email.setStartTLSRequired(true);  
            email.setSSLOnConnect(false);  
 
            email.setFrom("qaautomation@heerasoftware.com");
            email.setSubject("Automation Test Execution Report");
            email.setMsg("Please find the attached Automation Test Execution Report.");
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
           
            
            
            // Attach the report with Extent html
            email.attach(attachment);
 
            // Send the email
            email.send();
 
            System.out.println(" Email sent successfully with the report attached!");
 
    }
        
    }
