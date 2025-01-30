package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.AM_SiteMaster;
import HO_Master.FSG_FSGMaster;

public class FSG_MasterHomePage extends BaseClass{

	
	@Test
	public void FSG_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select FSG Master sub menu.");
		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select Account Master sub menu");
		Thread.sleep(1000);
	
	
		
		Liabrary.custom_click(FSG.getFSG_Master(), null);
		Thread.sleep(1000);
	
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Site Master Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="FSG Master";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
