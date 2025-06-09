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
import HO_Master.AM_SiteMaster;
import HO_Master.AM_SiteMasterViewPage;

public class AccM_SiteMasterViewPage extends BaseClass{

	
	
	@Test
	public void Contractor_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_SiteMasterViewPage SMV = PageFactory.initElements(driver, AM_SiteMasterViewPage.class);
		AM_SiteMaster SM = PageFactory.initElements(driver, AM_SiteMaster.class);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC01", "Click Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC02", "Click on Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC03", "Click on Site_Master", () -> {
		Liabrary.custom_click(SM.getSite_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC04", "Verify Site Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Site Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC05", " Click on Site Grida Data Table", () -> {
		Liabrary.custom_click(SMV.getSite_GridaDataTable(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC06", " Click on View Button", () -> {
		Liabrary.custom_click(SMV.getView_btn(), "click on view button");});
		Thread.sleep(1000);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
