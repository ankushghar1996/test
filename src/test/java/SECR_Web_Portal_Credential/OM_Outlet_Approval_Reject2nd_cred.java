package SECR_Web_Portal_Credential;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_WebPortal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SCER_Web_Portal.OM_Outlet_Approval2nd_main;

public class OM_Outlet_Approval_Reject2nd_cred extends BaseClass_SECR_WebPortal{
	
	@Test(priority = 0)
    public void Outlet_Reject() throws Exception {

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Reject btn", () -> {
            Liabrary.custom_click(SECR.getReject_btn(), "click Reject btn");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
        });
        Thread.sleep(1000);
       
        /*
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC08", "Verify that user should be click on No btn", () -> {
            Liabrary.custom_click(SECR.getYes_btn(), "click No btn");
        });
        Thread.sleep(1000);
        */
 
        
	
	}
	
	
	
	
	@Test(priority = 1)
    public void Outlet_Reject_NS_01() throws Exception {
		
		// Without selecting Grid Data
		
		ObjectRepo.startTestAndLog_1_NS("Without selecting Grid Data");

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        /*
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });
        */

        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Reject btn", () -> {
            Liabrary.custom_click(SECR.getReject_btn(), "click Reject btn");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
        });
        Thread.sleep(1000);
        
 
	
	}
	
	
	@Test(priority = 2)
    public void Outlet_Reject_NS_02() throws Exception {

		OM_Outlet_Approval2nd_main SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_main.class);
	
		
		// Without clicking Reject btn
		ObjectRepo.startTestAndLog_1_NS("Without clicking Reject btn");
		
		ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });

        
       
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC05", "Verify that user should be click on Approval btn", () -> {
            Liabrary.custom_click(SECR.getApproval_btn(), "click Approval btn");
        });
        Thread.sleep(1000);
       
        
        
        /*
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC06", "Verify that user should be click on Reject btn", () -> {
            Liabrary.custom_click(SECR.getReject_btn(), "click Reject btn");
        });
        Thread.sleep(1000);
        */
		
		
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC07", "Verify that user should be click on No btn", () -> {
            Liabrary.custom_click(SECR.getNo_btn(), "click No btn");
        });
        Thread.sleep(1000);
       
        /*
        ObjectRepo.startTestAndLog_1_SS("SECR_Web_OM_Outlet_Approval2nd_cred_TC08", "Verify that user should be click on No btn", () -> {
            Liabrary.custom_click(SECR.getYes_btn(), "click Yes btn");
        });
        Thread.sleep(1000);
        */
 
        
	
	}
	
	
	
	
}


 

