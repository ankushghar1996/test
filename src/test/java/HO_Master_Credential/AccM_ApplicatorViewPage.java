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

public class AccM_ApplicatorViewPage extends BaseClass{

	
	@Test(priority=0)
	public void Distributor_Transfer1() throws Exception {
		
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatorViewPage APV = PageFactory.initElements(driver, AM_ApplicatorViewPage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page _ TC01", "Click On select Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC02", "Click On select Account Master sub menu", () -> {
		Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC03", "Click On Applicator Master", () -> {
		Liabrary.custom_click(AP.getApplicator_Master(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_PageTC04", "Verify header text Applicator Master", () -> {
		WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text=" Applicator Master";
		Assert.assertEquals(Expected_Text, Actual_Text);});
		Thread.sleep(2000);
	
	
    ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC05", "Click on Applicator Grid Data Table", () -> {
	Liabrary.custom_click(APV.getApplicator_GridaDataTable(), null);});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC06", "Click on View Button", () -> {
	Liabrary.custom_click(APV.getView_Btn(), null);});
	Thread.sleep(1000);
	
	}
	
	@Test(priority=1)
	public void Distributor_Transfer_NS1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatorViewPage APV = PageFactory.initElements(driver, AM_ApplicatorViewPage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on Applicator Master");
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page _ TC01", "Click On select Master Menu", () -> {
			Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
			Thread.sleep(1000);
			   
				
			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC02", "Click On select Account Master sub menu", () -> {
			Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
			Thread.sleep(1000);
		
//			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC03", "Click On Applicator Master", () -> {
//			Liabrary.custom_click(AP.getApplicator_Master(), null);});
//			Thread.sleep(1000);
		
		
			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_PageTC04", "Verify header text Applicator Master", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Applicator Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
		
	    ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC05", "Click on Applicator Grid Data Table", () -> {
		Liabrary.custom_click(APV.getApplicator_GridaDataTable(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC06", "Click on View Button", () -> {
		Liabrary.custom_click(APV.getView_Btn(), null);});
		Thread.sleep(1000);
		
		}
	@Test(priority=2)
	public void Distributor_Transfer_NS2() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AM_ApplicatorViewPage APV = PageFactory.initElements(driver, AM_ApplicatorViewPage.class);
		AM_ApplicatiorMaster AP = PageFactory.initElements(driver, AM_ApplicatiorMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on Account master Submenu");
	
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page _ TC01", "Click On select Master Menu", () -> {
			Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
			Thread.sleep(1000);
			   
				
//			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC02", "Click On select Account Master sub menu", () -> {
//			Liabrary.custom_click(hp.getAccountMaster_SubMenu(), "select Account Master sub menu");});
//			Thread.sleep(1000);
		
			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC03", "Click On Applicator Master", () -> {
			Liabrary.custom_click(AP.getApplicator_Master(), null);});
			Thread.sleep(1000);
		
		
			ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_PageTC04", "Verify header text Applicator Master", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text=" Applicator Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
		
	    ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC05", "Click on Applicator Grid Data Table", () -> {
		Liabrary.custom_click(APV.getApplicator_GridaDataTable(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Applicator_Master_View_Page_TC06", "Click on View Button", () -> {
		Liabrary.custom_click(APV.getView_Btn(), null);});
		Thread.sleep(1000);
		
		}
	
	
	
	}
	

