package HO_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import HO_Portal_Main.HO_Distributor_Approval_RejectPage;

public class HO_Distributor_Reject_Cred extends BaseClass_HO_Portal {

	
	
	@Test
	public void DistM_DistributorApprov() throws Exception {
		
		HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(APP.getMaster(), "select Master Menu");
		Thread.sleep(1000);
		
		
		
		Liabrary.custom_click(APP.getDistributor_Master(), "select Distributor Master sub menu");
		Thread.sleep(1000);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(APP.getDistributor_Approval(), "select Distributor Approval sub menu");
		Thread.sleep(1000);
 
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
			
			
			Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
			Thread.sleep(1000);
			
			
				
			Liabrary.custom_click(APP.getApproval_btn(), null);
			Thread.sleep(1000);
	
	
			Liabrary.custom_click(APP.getReject_btn(), null);
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(APP.getRejectReason(), null);
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(APP.getYes_btn(), null);
			Thread.sleep(1000);
			
			
//			Liabrary.custom_click(APP.getNo_btn(), null);
//			Thread.sleep(1000);
		
			
			
			
			
			
			
			
			
			
			
	
	
	
	}
	
}
