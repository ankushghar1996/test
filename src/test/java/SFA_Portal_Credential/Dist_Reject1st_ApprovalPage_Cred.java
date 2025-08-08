package SFA_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ApprovalPage;
import SFA_Portal.Distributor_Approval1st_RejectPage;

public class Dist_Reject1st_ApprovalPage_Cred extends BaseClass_SFA {
	
	@Test(priority = 0)
	public void Dist_RejectPage() throws Exception {
		
		ObjectRepo.driver = driver;
		
		Distributor_Approval1st_ApprovalPage view = PageFactory.initElements(driver, Distributor_Approval1st_ApprovalPage.class);
		Distributor_Approval1st_RejectPage  reject = PageFactory.initElements(driver, Distributor_Approval1st_RejectPage.class);
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_01", "Verify that user should be click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click on SFA_Portal Master Menu");
		});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_02", "Verify that user should click on SFA_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click on SFA_Portal Distributor Menu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_03", "Verify that user should click on SFA_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click on SFA_Portal Distributor Approval Menu");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_04", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_05", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_06", "Verify that user should click on Reject button.", () -> {
		    Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_07", "Verify that user should click on Reject dropdown.", () -> {
		Liabrary.custom_click(reject.getSelect_Reason_Dropdown(), "Click Reject dropdown");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_08", "Verify that user should select reason.", () -> {
		Liabrary.custom_click(reject.getSelect_Reason(), "select reason");});
		Thread.sleep(1000);
		
		
		// Optional No button step, uncomment if needed:
		 ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Reject1st_ApprPage_Cred_09", "Verify that user should click on No button.", () -> {
		     Liabrary.custom_click(view.getNo_btn(), "Click No btn");});

//		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on Yes button.", () -> {
//		    Liabrary.custom_click(view.getYes_btn(), "Click Yes btn");
//		});
	
	}
	
	
	@Test(priority = 1)
	public void Dist_RejectPage_NS01() throws Exception {
		
		ObjectRepo.driver = driver;
		
		Distributor_Approval1st_ApprovalPage view = PageFactory.initElements(driver, Distributor_Approval1st_ApprovalPage.class);
	
		 // Without Click Outlet Approval Menu
 		ObjectRepo.startTestAndLog_1_NS("Without Click Distributor Approval Menu");
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_01", "Verify that user should be click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click on SFA_Portal Master Menu");
		});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_02", "Verify that user should click on SFA_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click on SFA_Portal Distributor Menu");
		});
		Thread.sleep(1000);
		

		/*
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_03", "Verify that user should click on SFA_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click on SFA_Portal Distributor Approval Menu");
		});
		Thread.sleep(1000);
*/
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_04", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_05", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_06", "Verify that user should click on Reject button.", () -> {
		    Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		});
		Thread.sleep(1000);

		// Optional No button step, uncomment if needed:
		 ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on No button.", () -> {
		     Liabrary.custom_click(view.getNo_btn(), "Click No btn");});

//		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on Yes button.", () -> {
//		    Liabrary.custom_click(view.getYes_btn(), "Click Yes btn");
//		});
	
	}
	
	
	@Test(priority = 2)
	public void Dist_RejectPage_NS02() throws Exception {
		
		ObjectRepo.driver = driver;
		
		Distributor_Approval1st_ApprovalPage view = PageFactory.initElements(driver, Distributor_Approval1st_ApprovalPage.class);
	
		// Without selecting Grid Data
				ObjectRepo.startTestAndLog_1_NS("Without selecting Grid Data");
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_01", "Verify that user should be click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click on SFA_Portal Master Menu");
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_02", "Verify that user should click on SFA_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click on SFA_Portal Distributor Menu");
		});
		Thread.sleep(1000);
		
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_03", "Verify that user should click on SFA_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click on SFA_Portal Distributor Approval Menu");
		});
		Thread.sleep(1000);
		
		
		/*
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_04", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		});
		Thread.sleep(1000);
		*/

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_05", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_06", "Verify that user should click on Reject button.", () -> {
		    Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		});
		Thread.sleep(1000);

		// Optional No button step, uncomment if needed:
		 ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on No button.", () -> {
		     Liabrary.custom_click(view.getNo_btn(), "Click No btn");});

//		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on Yes button.", () -> {
//		    Liabrary.custom_click(view.getYes_btn(), "Click Yes btn");
//		});
	
	}
	
	
	
	
	@Test(priority = 3)
	public void Dist_RejectPage_NS03() throws Exception {
		
		ObjectRepo.driver = driver;
		
		Distributor_Approval1st_ApprovalPage view = PageFactory.initElements(driver, Distributor_Approval1st_ApprovalPage.class);
	
		// Without selecting Grid Data
				ObjectRepo.startTestAndLog_1_NS("Without click Reject btn");
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_01", "Verify that user should be click on SFA_Portal Master menu.", () -> {
		Liabrary.custom_click(view.getMaster_Menu(), "Click on SFA_Portal Master Menu");
		});
		Thread.sleep(1000);
	
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_02", "Verify that user should click on SFA_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click on SFA_Portal Distributor Menu");
		});
		Thread.sleep(1000);
		

		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_03", "Verify that user should click on SFA_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click on SFA_Portal Distributor Approval Menu");
		});
		Thread.sleep(1000);

		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_04", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_05", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(view.getApproval_btn(), "Click Approval btn");
		});
		Thread.sleep(1000);
		
/*
		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_06", "Verify that user should click on Reject button.", () -> {
		    Liabrary.custom_click(view.getReject_btn(), "Click Reject btn");
		});
		Thread.sleep(1000);
		*/

		// Optional No button step, uncomment if needed:
		 ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on No button.", () -> {
		     Liabrary.custom_click(view.getNo_btn(), "Click No btn");});

//		ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_ApprPage_Cred_07", "Verify that user should click on Yes button.", () -> {
//		    Liabrary.custom_click(view.getYes_btn(), "Click Yes btn");
//		});
	
	}
	
	
	
	
	
	
	
	
	
}
	
	
	

	

