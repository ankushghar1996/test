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
import HO_Master.DM_DistributorApprove1;
import HO_Master.DM_SFAViewPage;

public class DistM_SFAViewPage extends BaseClass{

	@Test(priority=0)
	public void SFAViewPage() throws Exception {
				
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_SFAViewPage SFA = PageFactory.initElements(driver, DM_SFAViewPage.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on SFA Distributor Master");
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");});
		Thread.sleep(1000);
		   
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC02", "Click on Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC03", "Click on SFA Distributor Master", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master(), null);});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC04", "Verify SFA Distributor Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="SFA/Distributor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC05", "Click on Channel Type Dropdown", () -> {
		Liabrary.custom_click(SFA.getChannelType_Dropdown(), null);
		});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC06", " Select Channel Type Dropdown Value", () -> {
		Liabrary.custom_click(SFA.getChannelTypeValue_Dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC07", "Click on Search Button", () -> {
		Liabrary.custom_click(CD.getSearch_Btn(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC08", "Click on SFA Distributor Master GridData", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master_GridData(), null);
		});
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC09", "Click on View Button", () -> {
		Liabrary.custom_click(SFA.getView_btn(), null);
		});
		Thread.sleep(3000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC10", "Click on Close Button", () -> {
		Liabrary.custom_click(SFA.getClose_btn(), null);
		});
		Thread.sleep(4000);	
	}
	
	@Test(priority=1)
	public void SFAViewPage_NS1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_SFAViewPage SFA = PageFactory.initElements(driver, DM_SFAViewPage.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on Search Button");
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");});
		Thread.sleep(1000);
		   
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC02", "Click on Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC03", "Click on SFA Distributor Master", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master(), null);});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC04", "Verify SFA Distributor Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="SFA/Distributor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC05", "Click on Channel Type Dropdown", () -> {
		Liabrary.custom_click(SFA.getChannelType_Dropdown(), null);
		});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC06", " Select Channel Type Dropdown Value", () -> {
		Liabrary.custom_click(SFA.getChannelTypeValue_Dropdown(), null);});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC07", "Click on Search Button", () -> {
//		Liabrary.custom_click(CD.getSearch_Btn(), null);});
//		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC08", "Click on SFA Distributor Master GridData", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master_GridData(), null);
		});
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC09", "Click on View Button", () -> {
		Liabrary.custom_click(SFA.getView_btn(), null);
		});
		Thread.sleep(3000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC10", "Click on Close Button", () -> {
		Liabrary.custom_click(SFA.getClose_btn(), null);
		});
		Thread.sleep(4000);
	
}
	
	@Test(priority=2)
	public void SFAViewPage_NS2() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_SFAViewPage SFA = PageFactory.initElements(driver, DM_SFAViewPage.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on View Button");
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");});
		Thread.sleep(1000);
		   
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC02", "Click on Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC03", "Click on SFA Distributor Master", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master(), null);});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC04", "Verify SFA Distributor Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="SFA/Distributor Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC05", "Click on Channel Type Dropdown", () -> {
		Liabrary.custom_click(SFA.getChannelType_Dropdown(), null);
		});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC06", " Select Channel Type Dropdown Value", () -> {
		Liabrary.custom_click(SFA.getChannelTypeValue_Dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC07", "Click on Search Button", () -> {
		Liabrary.custom_click(CD.getSearch_Btn(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC08", "Click on SFA Distributor Master GridData", () -> {
		Liabrary.custom_click(SFA.getSFADistributor_Master_GridData(), null);
		});
		Thread.sleep(1000);
		
	
//		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC09", "Click on View Button", () -> {
//		Liabrary.custom_click(SFA.getView_btn(), null);
//		});
//		Thread.sleep(3000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_SFAViewPage_TC10", "Click on Close Button", () -> {
		Liabrary.custom_click(SFA.getClose_btn(), null);
		});
		Thread.sleep(4000);
	
}
}