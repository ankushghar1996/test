package SECR_Portal_Credential;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Pending_Approval_DB;
import SECR_Portal.SECR_Pending_Order_DB;
 
public class SECR_Pending_Order_DB_Test extends BaseClass_SECR_Portal {
 
	@Test 
   public void pending_order_DB() throws Exception  {
	SECR_Pending_Order_DB SECR = PageFactory.initElements(driver,SECR_Pending_Order_DB.class);
 
	WebElement scroll = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
    Thread.sleep(1000);
    
    
	Liabrary.custom_click(SECR.getPending_Order(), "Click On Pending Order");
	Thread.sleep(1000);	
	
	
	driver.findElement(By.xpath("//input[@placeholder='Search by order no']")).sendKeys("Pending Order");
	Thread.sleep(1000);
	
	



	}	
}