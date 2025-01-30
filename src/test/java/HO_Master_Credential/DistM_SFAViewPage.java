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
import HO_Master.DM_DistributorApprove1;
import HO_Master.DM_SFAViewPage;

public class DistM_SFAViewPage extends BaseClass{

	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_SFAViewPage SFA = PageFactory.initElements(driver, DM_SFAViewPage.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
		Thread.sleep(1000);
	
		
		Liabrary.custom_click(SFA.getSFADistributor_Master(), null);
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="SFA/Distributor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
		
			
		Liabrary.custom_click(SFA.getChannelType_Dropdown(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(SFA.getChannelTypeValue_Dropdown(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(CD.getSearch_Btn(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(SFA.getSFADistributor_Master_GridData(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(SFA.getView_btn(), null);
		Thread.sleep(3000);
	
	
		Liabrary.custom_click(SFA.getClose_btn(), null);
		Thread.sleep(4000);
	
	
		
		
	}
	
}
