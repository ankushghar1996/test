package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Leave_Approval_Main;

public class SECR_Leave_Approval_Test extends BaseClass_SECR_Portal {

    @Test
    public void Leave_Approval() throws Exception {

        SECR_Leave_Approval_Main SECR = PageFactory.initElements(driver, SECR_Leave_Approval_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC01", "Verify that user should be click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC02", "Verify that user should be click on Pending Approved Button", () -> {
            Liabrary.custom_click(SECR.getApproval_Button(), "Click Pending Approved Button");
        });
        Thread.sleep(1000);


        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC03", "Verify that user should be click on Leave Approved Button", () -> {
            Liabrary.custom_click(SECR.getLeave_APPROVAL_Button(), "Click Leave Approved Button");
        });
        Thread.sleep(1000);


        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC04", "Verify that user should be click on Leave Approved Pending", () -> {
            Liabrary.custom_click(SECR.getLeave_APPROVAL_Pending(), "Click Leave Approved Pending");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=1)
    public void Leave_Approval_NS01() throws Exception {

        SECR_Leave_Approval_Main SECR = PageFactory.initElements(driver, SECR_Leave_Approval_Main.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Clicking Leave Approved Button");

      /*  ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC01", "Verify that user should be click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
*/
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC02", "Verify that user should be click on Pending Approved Button", () -> {
            Liabrary.custom_click(SECR.getApproval_Button(), "Click Pending Approved Button");
        });
        Thread.sleep(1000);


//        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC03", "Verify that user should be click on Leave Approved Button", () -> {
//            Liabrary.custom_click(SECR.getLeave_APPROVAL_Button(), "Click Leave Approved Button");
//        });
//        Thread.sleep(1000);


        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC04", "Verify that user should be click on Leave Approved Pending", () -> {
            Liabrary.custom_click(SECR.getLeave_APPROVAL_Pending(), "Click Leave Approved Pending");
        });
        Thread.sleep(1000);
}
    @Test(priority=2)
    public void Leave_Approval_NS02() throws Exception {

        SECR_Leave_Approval_Main SECR = PageFactory.initElements(driver, SECR_Leave_Approval_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking Pending Approved Button");
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC01", "Verify that user should be click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC02", "Verify that user should be click on Pending Approved Button", () -> {
//            Liabrary.custom_click(SECR.getApproval_Button(), "Click Pending Approved Button");
//        });
//        Thread.sleep(1000);


        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC03", "Verify that user should be click on Leave Approved Button", () -> {
            Liabrary.custom_click(SECR.getLeave_APPROVAL_Button(), "Click Leave Approved Button");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Leave_Approval_TC04", "Verify that user should be click on Leave Approved Pending", () -> {
            Liabrary.custom_click(SECR.getLeave_APPROVAL_Pending(), "Click Leave Approved Pending");
        });
        Thread.sleep(1000);
}
    
    
}