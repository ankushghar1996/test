package SEBS_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.SEBS_DashBoard;
 
public class SEBS_Dashboard_Test extends BaseClass_SEBS_Portal {
 
	@Test
	public void Dashboard () throws Exception {
		
	SEBS_DashBoard SEBS = PageFactory.initElements(driver,SEBS_DashBoard.class);
	
	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Dashboard_Test_TC01", "Verify that user should be able to click on MTD Capsule", () -> {
	Liabrary.custom_click(SEBS.getMTD_Capsule(), "Click on MTD Capsule");
	 });
	Thread.sleep(1000);
	
	
	WebElement Scroll = driver.findElement(By.xpath("//div[@class='col-12 mt-0']//span[text()=' New Developers Created']"));
	JavascriptExecutor JSE1 =(JavascriptExecutor) driver;
	JSE1.executeScript("arguments[0].scrollIntoView(true);", Scroll);
	Thread.sleep(1000);
	

	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Dashboard_Test_TC02", "Verify that user should be able to click on Arrow Button", () -> {


	Liabrary.custom_click(SEBS.getArrow_Button(), "Click on Arrow Button ");
	 });
	Thread.sleep(1000);

	
	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Dashboard_Test_TC03", "Verify that user should be able to click on YTD Button", () -> {

	Liabrary.custom_click(SEBS.getYTD_Button(), "Click on YTD Button");
	 });
	Thread.sleep(1000);

	
	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Dashboard_Test_TC04", "Verify that user should be able to click on Close Button", () -> {

	Liabrary.custom_click(SEBS.getClose(), "Click on Close Button");
	 });
	Thread.sleep(1000);

	}	
}