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
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_EditSFADistributor;

public class DistM_EditSFADistributor extends BaseClass {

	
	
	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_ADDSFADistributor AD = PageFactory.initElements(driver, DM_ADDSFADistributor.class);
		DM_EditSFADistributor AE = PageFactory.initElements(driver, DM_EditSFADistributor.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Edit_SFA_Distributor_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_Edit_SFA_Distributor_TC02", "Click on Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC03", "Click On SFA Distributor Master", () -> {	
		Liabrary.custom_click(AD.getSFADistributor_Master(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC04", "Click On Channel Type Dropdown", () -> {	
		Liabrary.custom_click(AE.getChannelType_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC05", "Select Channel Type Dropdown value", () -> {
		Liabrary.custom_click(AE.getChannelTypeValue1_Dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC06", "Click on Search Button", () -> {
		Liabrary.custom_click(AE.getSearch_btn(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC07", "Click on SFA Distributor_Master_GridData", () -> {
		Liabrary.custom_click(AE.getSFADistributor_Master_GridData(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC08", "Click on Edit Button", () -> {
		Liabrary.custom_click(AE.getEdit_btn(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC09", "Verify SFA/Distributor EDIT Header Text", () -> {
		WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="SFA/Distributor EDIT";
		Assert.assertEquals(Expected_Text, Actual_Text);});
		Thread.sleep(2000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC10", "Click on Class Dropdown", () -> {
		Liabrary.custom_click(AE.getClass_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC11", "Select Class Dropdown Value", () -> {
		Liabrary.custom_click(AE.getClassSelect_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC12", "Click on Close Button", () -> {
		Liabrary.custom_click(AE.getClose_btn(), null);});
		Thread.sleep(1000);

		
	
	
	
	}
	
}
