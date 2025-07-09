package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.AM_ContractorMaster;
import HO_Master.AM_SiteMaster;

public class AccM_SiteMaster extends BaseClass{

	
	@Test(priority=0)
	public void Site_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_SiteMaster SM = PageFactory.initElements(driver, AM_SiteMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC03", "Click On Site Master", () -> {
		Liabrary.custom_click(SM.getSite_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC04", "Verify Site Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Site Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	

	}
	
	@Test(priority=1)
	public void Site_MasterHomepage_NS1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_SiteMaster SM = PageFactory.initElements(driver, AM_SiteMaster.class);
		
	    ObjectRepo.startTestAndLog_1_NS("Without Click on Site Master");
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC03", "Click On Site Master", () -> {
//		Liabrary.custom_click(SM.getSite_Master(), null);});
//		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC04", "Verify Site Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Site Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
	
}
	
	@Test(priority=1)
	public void Site_MasterHomepage_NS2() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_SiteMaster SM = PageFactory.initElements(driver, AM_SiteMaster.class);
		
	    ObjectRepo.startTestAndLog_1_NS("Verify Site master header text");
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC03", "Click On Site Master", () -> {
		Liabrary.custom_click(SM.getSite_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_SiteMaster_TC04", "Verify Site Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Site Master ";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
	
}
}