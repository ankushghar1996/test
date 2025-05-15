package FSG_Portal_Credential;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_Pending_Order_DB_Main;
import FSG_Portal.New_Retailer_MTD_YTD_Main;
 
public class New_Retailer_MTD_YTD_Test extends BaseClass_FSG_Portal {
 
	@Test
	public void FSG_YTD () throws Exception {
		
		
		 New_Retailer_MTD_YTD_Main FSG = PageFactory.initElements(driver , 	New_Retailer_MTD_YTD_Main.class);

		 WebElement scroll = driver.findElement(By.xpath("//div[@class='capsule']//span[text()='MTD Working']"));
	  	 JavascriptExecutor jse1= (JavascriptExecutor)driver;
		 jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	     Thread.sleep(1000);
	     
	     
		Liabrary.custom_click(FSG.getMTD_Working(), "Click On MTD working");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getNew_Retailer_Created_Arrow()," Click On New_Retailer Created_Arrow");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getYTD_Button()," Click On YTD Button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getRetailer_Selection()," Click On YTD Retailer Selection");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getMore_Info_Tab()," Click On More Info Button");
		Thread.sleep(1000);
		
		
		List<WebElement> Print_Retailer_Info = driver.findElements(By.xpath("//div[@class='offcanvas offcanvas-bottom show']"));
  		System.out.println(Print_Retailer_Info);
  		Thread.sleep(3000);
  		
  		
		WebElement scroll2 = driver.findElement(By.xpath("//div[text()='Shop Image']/parent::div"));
		Actions action = new Actions (driver);
		action.scrollToElement(scroll2).perform();
  		Thread.sleep(1000);
  		
  		
  		Liabrary.custom_click(FSG.getDownload1()," Click On Document 1 Download Button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getDownload2()," Click On Document 2 Download Button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(FSG.getDownload3()," Click On Document 3 Download Button");
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
	}




}