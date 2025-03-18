package Com_Utility;
 
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
 
 
public class Demo_Mail {
    public static void main(String args[]) throws Exception{
        Send_Email_Method();
    }
 
    public static void Send_Email_Method() throws Exception { 
        System.out.println("=================== TEST Started ==============");
        SimpleEmail email = new SimpleEmail();
 
        
        email.setHostName("smtp.office365.com"); // Office 365 SMTP Server							
        email.setSmtpPort(587); // Correct port for TLS
        email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "L^281715140902ab"));
 
     //   email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "L^281715140902ab")); //L^281715140902ab
        email.setStartTLSRequired(true); // Enable STARTTLS
        email.setSSLOnConnect(false); 
        email.setFrom("qaautomation@heerasoftware.com"); // Sender
        email.setSubject("Test Email");
        email.setMsg("Hello, this is a test code."
        		+ " file:///C:/Users/10389/eclipse-workspace/FOSROC_Automation/test-output/Extent_Reports/TestReport.html");
        email.addTo("ankush.gharsele@heerasoftware.com"); // Receiver
        email.send();
 
        System.out.println("============== Email sent successfully! ===============");
    }
}