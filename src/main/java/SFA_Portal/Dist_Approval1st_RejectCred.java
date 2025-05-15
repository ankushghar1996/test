package SFA_Portal;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;

public class Dist_Approval1st_RejectCred extends BaseClass_SFA {

	
	@Test
	public void Dist_RejectPage() throws Exception {
		
		Distributor_Approval1st_RejectPage view = PageFactory.initElements(driver, Distributor_Approval1st_RejectPage.class);
	
	
		Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
		Thread.sleep(1000);
	
		
		Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getSelect_Reason_Dropdown(), "Click Reason dropdown");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getSelect_Reason(), "Select Reason");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getNo_btn(), "Click No Btn");
		Thread.sleep(1000);
	
	
	//	Liabrary.custom_click(view.getYes_btn(), "Click Yes Btn");
	
	
		
		
	}
	
}
