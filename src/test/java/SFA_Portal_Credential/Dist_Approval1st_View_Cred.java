package SFA_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ViewPage;

public class Dist_Approval1st_View_Cred extends BaseClass_SFA{

	
	
	@Test
	public void Distributor_View() throws Exception {
		
		Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);
	
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Card_01", "click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Card_02", "click on SFA_Portal Distributor Master menu.", () -> {
		Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Card_03", "click on SFA_Portal Distributor Approval menu.", () -> {
		Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Card_04", "Select Grid List Value", () -> {
		Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Card_05", "click on View Button", () -> {
		Liabrary.custom_click(view.getView_btn(), "Click View Btn");});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
	
	
	}
	
}
