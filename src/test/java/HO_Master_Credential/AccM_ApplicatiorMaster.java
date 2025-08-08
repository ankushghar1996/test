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
import HO_Master.DM_DistributorTransfer;

public class AccM_ApplicatiorMaster extends BaseClass{
	@Test(priority=0)
	public void Applicator_Master() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC03", "Click On Applicator Master", () -> {
		Liabrary.custom_click(AP.getApplicator_Master(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC04", "Click On Applicator Master", () -> {
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Applicator Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);		
	}
	
	@Test(priority=1)
	public void  Applicator_Master_NS01() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click On Applicator Master");
		
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC02", "Click On Account Master SubMenu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC03", "Click On Applicator Master", () -> {
//		Liabrary.custom_click(AP.getApplicator_Master(), null);});
//		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC04", "Click On Applicator Master", () -> {
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Applicator Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
			
	}

	@Test(priority=2)
	public void  Applicator_Master_NS02() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without select Account Master sub menu");
		
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
			
//		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC02", "Click On Account Master SubMenu", () -> {
//		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
//		Thread.sleep(1000);
//	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC03", "Click On Applicator Master", () -> {
		Liabrary.custom_click(AP.getApplicator_Master(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master TC04", "Click On Applicator Master", () -> {
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Applicator Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
	
	
	
	}
	
}
