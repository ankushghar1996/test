package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.AM_ContractorMaster;
import HO_Master.AM_ContractorViewPage;

public class AccM_ContractorViewPage extends BaseClass{

	
	@Test
	public void Contractor_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ContractorViewPage CMV = PageFactory.initElements(driver, AM_ContractorViewPage.class);
		AM_ContractorMaster CM = PageFactory.initElements(driver, AM_ContractorMaster.class);
		
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(CM.getContractor_Master(), null);
		Thread.sleep(1000);
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_HeaderTaag']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Contractor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
	
	
		
		Liabrary.custom_click(CMV.getContractor_GridaDataTable(), Expected_Text);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(CMV.getView_btn(), Expected_Text);
		Thread.sleep(1000);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
