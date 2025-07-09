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
import Com_Utility.ObjectRepo;
import HO_Master.DM_DistributorApprovl;

public class DistM_DistApp_ViewPage extends BaseClass{

	
	@Test(priority=0)
	public void Dist_App_ViewPage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprovl AP = PageFactory.initElements(driver, DM_DistributorApprovl.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC01", "Click Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC02", " Click Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC03", " Click Distributor Approval", () -> {
		Liabrary.custom_click(AP.getDistributor_Approval(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC04", " Verify Distributor Approval Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC05", "Click On Distributor Grida Data Table", () -> {
		Liabrary.custom_click(AP.getDistributor_GridaDataTable(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC06", "Click On View Button", () -> {
		Liabrary.custom_click(AP.getView_btn(), null);});
		Thread.sleep(3000);
		
	
	
	}
	
	@Test(priority=1)
	public void Upload_media_NS01() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprovl AP = PageFactory.initElements(driver, DM_DistributorApprovl.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
	    ObjectRepo.startTestAndLog_1_NS("Without Click on Distributor Approval");
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC01", "Click Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC02", " Click Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC03", " Click Distributor Approval", () -> {
//		Liabrary.custom_click(AP.getDistributor_Approval(), null);});
//		Thread.sleep(1000);
//	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC04", " Verify Distributor Approval Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC05", "Click On Distributor Grida Data Table", () -> {
		Liabrary.custom_click(AP.getDistributor_GridaDataTable(), null);});
		Thread.sleep(1000);
	
}
	
	@Test(priority=2)
	public void Upload_media_NS02() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprovl AP = PageFactory.initElements(driver, DM_DistributorApprovl.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
	    ObjectRepo.startTestAndLog_1_NS("Without Click on Distributor Master Submenu");
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC01", "Click Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
//		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC02", " Click Distributor Master SubMenu", () -> {
//		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
//		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC03", " Click Distributor Approval", () -> {
		Liabrary.custom_click(AP.getDistributor_Approval(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC04", " Verify Distributor Approval Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistApp_ViewPage_TC05", "Click On Distributor Grida Data Table", () -> {
		Liabrary.custom_click(AP.getDistributor_GridaDataTable(), null);});
		Thread.sleep(1000);
}
}