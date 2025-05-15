package SECR_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Leave_Approval_Main;
import SECR_Portal.SECR_MTD_Working_Main;
 
public class SECR_MTD_Working_Test_DB extends BaseClass_SECR_Portal{
 
	
	@Test
	  public void MTD_Working () throws Exception {
		
	  SECR_MTD_Working_Main SECR = PageFactory.initElements(driver,SECR_MTD_Working_Main.class);
	  
	  WebElement Scroll1 = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
	  JavascriptExecutor JSE1= (JavascriptExecutor)driver;
	  JSE1.executeScript("arguments[0].scrollIntoView(true);", Scroll1);
	  Thread.sleep(1000);
	  
	  
		Liabrary.custom_click(SECR.getMTD_Working(), "Click MTD Working");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SECR.getArrow_Button(), "Click Arrow Button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SECR.getMTD_Retailer(), "Click MTD Retailer");
		Thread.sleep(1000);
		
		
		WebElement Scroll = driver.findElement(By.xpath("(//div[@class='col-10 col-lg-10']//span[text()='Download'])[2]"));
		JavascriptExecutor JSE2 = (JavascriptExecutor) driver;		
	    JSE1.executeScript("arguments[0].scrollIntoView(true);", Scroll);
	    Thread.sleep(1000);
	    
	    
	    Liabrary.custom_click(SECR.getDownload_Button1(), "Click on Download Button 1");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SECR.getDownload_Button2(), "Click on Download Button 2");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SECR.getDownload_Button1(), "Click on Download Button 3");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SECR.getClose_Button(), "Click on Close Button");
		Thread.sleep(1000);

		
		


	}
}