package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.AM_ContractorMaster;
import HO_Master.AM_ContractorViewPage;

public class AccM_ContractorViewPage extends BaseClass{

	
	@Test
	public void Contractor_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ContractorViewPage CMV = PageFactory.initElements(driver, AM_ContractorViewPage.class);
		AM_ContractorMaster CM = PageFactory.initElements(driver, AM_ContractorMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC03", "Click On Contractor Master", () -> {
		Liabrary.custom_click(CM.getContractor_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC04", "Verify Contractor Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_HeaderTaag']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Contractor Master";
			Assert.assertEquals(Expected_Text, Actual_Text); });
			Thread.sleep(2000);
	
	
	    ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC05", "Click On Contractor Master Grid Data Table", () -> {
		Liabrary.custom_click(CMV.getContractor_GridaDataTable(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_M_ViewPage_TC06", "Click On View Button", () -> {
		Liabrary.custom_click(CMV.getView_btn(), null);});
		Thread.sleep(1000);
		
	
	
	
	}
	
	
}
