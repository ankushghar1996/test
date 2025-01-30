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
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_EditSFADistributor;

public class DistM_EditSFADistributor extends BaseClass {

	
	
	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_ADDSFADistributor AD = PageFactory.initElements(driver, DM_ADDSFADistributor.class);
		DM_EditSFADistributor AE = PageFactory.initElements(driver, DM_EditSFADistributor.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AD.getSFADistributor_Master(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AE.getChannelType_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AE.getChannelTypeValue1_Dropdown(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AE.getSearch_btn(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AE.getSFADistributor_Master_GridData(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AE.getEdit_btn(), null);
		Thread.sleep(1000);
	
	
		WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="SFA/Distributor EDIT";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
		
		
		Liabrary.custom_click(AE.getClass_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AE.getClassSelect_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AE.getClose_btn(), null);
		Thread.sleep(1000);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
