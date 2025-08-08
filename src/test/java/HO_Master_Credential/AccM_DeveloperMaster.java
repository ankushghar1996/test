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
import HO_Master.AM_DeveloperMaster;
import HO_Master.AM_SiteMaster;

public class AccM_DeveloperMaster extends BaseClass{

	@Test(priority=0)
	public void Developer_Master() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_DeveloperMaster DM = PageFactory.initElements(driver, AM_DeveloperMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC01", "Click On select Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu"); });
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC02", "Click On Account Master_SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC03", "Click On Developer Master", () -> {
		Liabrary.custom_click(DM.getDeveloper_Master(), null); });
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC04", "Verify Developer Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Developer Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	

	}
	
	@Test(priority=01)
	public void Developer_Master_NS01() throws Exception {
		
		//Without Click Developer Master  
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_DeveloperMaster DM = PageFactory.initElements(driver, AM_DeveloperMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click On Developer Master");
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC01", "Click On select Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu"); });
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC02", "Click On Account Master_SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC03", "Click On Developer Master", () -> {
//		Liabrary.custom_click(DM.getDeveloper_Master(), null); });
//		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC04", "Verify Developer Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Developer Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);

	
	}
	@Test(priority=02)
	public void Developer_Master_NS02() throws Exception {
		
		//Without Click on Account Master sub menu
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_DeveloperMaster DM = PageFactory.initElements(driver, AM_DeveloperMaster.class);
		
	    ObjectRepo.startTestAndLog_1_NS("Without select Account Master sub menu");
	    
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC01", "Click On select Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu"); });
		Thread.sleep(1000);
		   
			
//		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC02", "Click On Account Master_SubMenu", () -> {
//		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
//		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC03", "Click On Developer Master", () -> {
		Liabrary.custom_click(DM.getDeveloper_Master(), null); });
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Developer_Master_TC04", "Verify Developer Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Developer Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);

	
	}
	
	
	
}
