package SECR_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Approval;
 
public class SECR_Approval_Test extends  BaseClass_SECR_Portal {
	
	
   @Test 
    public void Retailer_KYC_Approval () throws Exception  {
	   
	   
	SECR_Approval SECR = PageFactory.initElements(driver,SECR_Approval.class);
	
	ObjectRepo.startTestAndLog_1_SS("SECR_Approval_Test_TC_01", "Click on SECR Menu", () -> {
	Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu"); });
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SECR.getApproval_Button(), "Click Approved Button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
	Thread.sleep(1000);	
	
	
	Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
	Thread.sleep(1000);	
	
	
	WebElement scroll = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
	 JavascriptExecutor jse1= (JavascriptExecutor)driver;
	 jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
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