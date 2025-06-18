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
import HO_Master.AM_ApplicatiorMaster;
import HO_Master.AM_ApplicatorViewPage;
import HO_Master.AM_ContractorMaster;

public class AccM_ContractorMaster extends BaseClass{

	
	@Test
	public void Contractor_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ContractorMaster CM = PageFactory.initElements(driver, AM_ContractorMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_Master_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_Master_TC02", "Click on Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu"); });
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_Master_TC03", "Click on Contractor Master", () -> {
		Liabrary.custom_click(CM.getContractor_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Contractor_Master_TC04", "Verify Contractor Master header text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_HeaderTaag']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Contractor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
	
	
	}
	
	
}
