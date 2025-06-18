package SEBS_Distributor_Activity_Non_PJP_Hierarchy_2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ApprovalPage;

public class Distributor_Activity_Non_PJP_SFA_Dist_Reject1st_ApprovalPage_Cred_2nd extends BaseClass_SFA {

	
	
	@Test
	public void Dist_ApprovePage() throws Exception {
		
		ObjectRepo.driver = driver;
		
		Distributor_Approval1st_ApprovalPage view = PageFactory.initElements(driver, Distributor_Approval1st_ApprovalPage.class);
	
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_01", "Verify that user should be click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click on SFA_Portal Master Menu");
		});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_02", "Verify that user should click on SFA_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click on SFA_Portal Distributor Menu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_03", "Verify that user should click on SFA_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click on SFA_Portal Distributor Approval Menu");
		});
		Thread.sleep(1000);

		
		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_04", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_05", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_06", "Verify that user should click on Reject button.", () -> {
		    Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		});
		Thread.sleep(1000);

		// Optional No button step, uncomment if needed:
		 ObjectRepo.startTestAndLog_1_SS("SEBS_SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on No button.", () -> {
		     Liabrary.custom_click(view.getNo_btn(), "Click No btn");
	 });

//		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on Yes button.", () -> {
//		    Liabrary.custom_click(view.getYes_btn(), "Click Yes btn");
//		});
	
	
	
	
	}
	
	
}
