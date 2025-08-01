package SEBS_Distributor_Activity_Non_PJP_Hierarchy_2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ViewPage;

public class Distributor_Activity_Non_PJP_SFA_Dist_Approval1st_View_Cred_2nd extends BaseClass_SFA {


    @Test
    public void Distributor_View() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_4", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
        
        
        
    }
    
    @Test(priority=1)
    public void Distributor_View_NS1() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select grid List Value");
        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_4", "Verify that user should be able to select a value from the grid", () -> {
//            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
        
        
        
    }
    
    @Test(priority=2)
    public void Distributor_View_NS2() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click Distributor Approval Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_03", "Verify that user should be able to click on Distributor Approval menu", () -> {
//            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_4", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBSNonPJP_SFA_1st_Approval_View_Test_05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
        
        
        
    }

}
