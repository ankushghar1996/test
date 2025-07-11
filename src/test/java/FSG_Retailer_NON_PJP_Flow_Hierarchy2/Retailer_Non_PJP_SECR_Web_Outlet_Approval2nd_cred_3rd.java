package FSG_Retailer_NON_PJP_Flow_Hierarchy2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_WebPortal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SCER_Web_Portal.OM_Outlet_Approval2nd_main;

public class Retailer_Non_PJP_SECR_Web_Outlet_Approval2nd_cred_3rd extends BaseClass_SECR_WebPortal{

	
	@Test(priority=0)
    public void Outlet_ApprovalTest() throws Exception {

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		 // Package name + login name + class name + test case nmbr
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SFSG_ECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Approve btn", () -> {
            Liabrary.custom_click(SECR.getApprove_btn(), "click Approve btn");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on Yes btn", () -> {
            Liabrary.custom_click(SECR.getYes_btn(), "click Yes btn");
        });
        Thread.sleep(1000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
//            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
//        });
//        Thread.sleep(1000);
          
	
	}
	
	@Test(priority=1)
    public void Outlet_ApprovalTest_NS1() throws Exception {

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		 // Package name + login name + class name + test case nmbr
		ObjectRepo.startTestAndLog_1_NS("Without click on grid data");
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        
//        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
//            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
//        });
//        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SFSG_ECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Approve btn", () -> {
            Liabrary.custom_click(SECR.getApprove_btn(), "click Approve btn");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on Yes btn", () -> {
            Liabrary.custom_click(SECR.getYes_btn(), "click Yes btn");
        });
        Thread.sleep(1000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
//            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
//        });
//        Thread.sleep(1000);
        
		
        
        
        
	
	}
	
	@Test(priority=2)
    public void Outlet_ApprovalTest_NS2() throws Exception {

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		 // Package name + login name + class name + test case nmbr
		ObjectRepo.startTestAndLog_1_NS("Without click on Approval button");
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });
        Thread.sleep(1000);
        
//        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
//            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
//        });
//        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SFSG_ECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Approve btn", () -> {
            Liabrary.custom_click(SECR.getApprove_btn(), "click Approve btn");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on Yes btn", () -> {
            Liabrary.custom_click(SECR.getYes_btn(), "click Yes btn");
        });
        Thread.sleep(1000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
//            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
//        });
//        Thread.sleep(1000);
        
		
        
        
        
	
	}
	
}
