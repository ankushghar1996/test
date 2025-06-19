package SEBS_Distributor_Hierarchy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ViewPage;

public class Distributor_Creation_SFA_Dist_Approval1st_View_Cred_2nd extends BaseClass_SFA {


    @Test
    public void Distributor_View() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_ASM_1stApproval_View_Test_01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_ASM_1stApproval_View_Test_02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_ASM_1stApproval_View_Test_03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_ASM_1stApproval_View_Test_04", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_ASM_1stApproval_View_Test_05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
        
        
        
    }

}
