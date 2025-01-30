package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DM_DistributorApprovl;

public class DistM_DistApp_ViewPage extends BaseClass{

	
	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprovl AP = PageFactory.initElements(driver, DM_DistributorApprovl.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AP.getDistributor_Approval(), null);
		Thread.sleep(1000);
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
	
	
		Liabrary.custom_click(AP.getDistributor_GridaDataTable(), Expected_Text);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AP.getView_btn(), Expected_Text);
		Thread.sleep(3000);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
