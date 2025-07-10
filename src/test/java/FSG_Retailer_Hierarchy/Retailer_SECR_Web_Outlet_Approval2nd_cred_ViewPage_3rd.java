package FSG_Retailer_Hierarchy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_WebPortal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SCER_Web_Portal.OM_Outlet_Approval2nd_View;

public class Retailer_SECR_Web_Outlet_Approval2nd_cred_ViewPage_3rd extends BaseClass_SECR_WebPortal{

	
	@Test(priority=0)
    public void Outlet_Approval() throws Exception {

		OM_Outlet_Approval2nd_View SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_View.class);
	
		// Package name + login name + class name + test case nmbr
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });
        Thread.sleep(1000);
	
	
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_05", "Verify that user should be click on view btn", () -> {
        Liabrary.custom_click(SECR.getView_btn(), "click view btn");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_06", "Verify that user should be click on close btn", () -> {
        Liabrary.custom_click(SECR.getClose_btn(), "click close btn");
        });
        Thread.sleep(1000);
	
	
	
	}
	
	@Test(priority=1)
    public void Outlet_Approval_NS1() throws Exception {

		OM_Outlet_Approval2nd_View SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_View.class);
	
		// Package name + login name + class name + test case nmbr
		ObjectRepo.startTestAndLog_1_NS("Without click on grid data");
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        
//        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_04", "Verify that user should be click Grid data", () -> {
//            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
//        });
//        Thread.sleep(1000);
	
	
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_05", "Verify that user should be click on view btn", () -> {
        Liabrary.custom_click(SECR.getView_btn(), "click view btn");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_06", "Verify that user should be click on close btn", () -> {
        Liabrary.custom_click(SECR.getClose_btn(), "click close btn");
        });
        Thread.sleep(1000);
	
	
	
	}
	
	@Test(priority=2)
    public void Outlet_Approval_NS2() throws Exception {

		OM_Outlet_Approval2nd_View SECR = PageFactory.initElements(driver, OM_Outlet_Approval2nd_View.class);
	
		// Package name + login name + class name + test case nmbr
		ObjectRepo.startTestAndLog_1_NS("Without click on View Button");
		
		ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_01", "Verify that user should be click on master Menu", () -> {
            Liabrary.custom_click(SECR.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_02", "Verify that user should be click on Outlet master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Master_SubMenu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_03", "Verify that user should be click on Outlet Approval master Menu", () -> {
            Liabrary.custom_click(SECR.getOutlet_Approval_SubMenu(), "Click Outlet Approval Menu");
        });
        Thread.sleep(1000);
        
        
        
       ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_04", "Verify that user should be click Grid data", () -> {
            Liabrary.custom_click(SECR.getDistributor_Approval_Grid_Page(), "click Grid data");
        });
        Thread.sleep(1000);
	
	
//        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_05", "Verify that user should be click on view btn", () -> {
//        Liabrary.custom_click(SECR.getView_btn(), "click view btn");
//        });
//        Thread.sleep(1000);
//        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_SECR_Web_OM_Outlet_Approval2nd_cred_ViewPage_TC_06", "Verify that user should be click on close btn", () -> {
        Liabrary.custom_click(SECR.getClose_btn(), "click close btn");
        });
        Thread.sleep(1000);
	
	
	
	}
	
}
