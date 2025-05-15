package SECR_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Pending_Approval_DB;
 
public class SECR_Pending_Approval_DB_Test extends BaseClass_SECR_Portal {
 
	@Test 
    public void Pending_Approval_DB() throws Exception  {
		
		
	SECR_Pending_Approval_DB SECR = PageFactory.initElements(driver,SECR_Pending_Approval_DB.class);
	
	
	WebElement scroll = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
    Thread.sleep(1000);
    

	Liabrary.custom_click(SECR.getPending_Approval(), "Click Pending Approval DB");
	Thread.sleep(1000);	
	
	
	Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
	Thread.sleep(1000);	
	
	
	Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
	Thread.sleep(1000);	
	
	
	WebElement scroll2 = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
	JavascriptExecutor jse2= (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll2);
    Thread.sleep(1000);
    
    
    Liabrary.custom_click(SECR.getAadhar_Card_Download(), "Click Download Button 1");
	Thread.sleep(1000);		
	
	
	Liabrary.custom_click(SECR.getPAN_Card(), "Click Download Button 2");
	Thread.sleep(1000);		
	
	
	Liabrary.custom_click(SECR.getShop_Registration(), "Click Download Button 3");
	Thread.sleep(1000);		
	
	
	Liabrary.custom_click(SECR.getShop_Registration(), "Click Download Button 3");
	Thread.sleep(1000);	


	
	
 
	

	}
}