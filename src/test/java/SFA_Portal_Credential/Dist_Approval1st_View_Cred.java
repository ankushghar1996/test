package SFA_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.Distributor_Approval1st_ViewPage;

public class Dist_Approval1st_View_Cred extends BaseClass_SFA {


    @Test(priority = 0)
    public void Distributor_View() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC04", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(2000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC05", "Verify that user should be able to click the Close button", () -> {
        Liabrary.custom_click(view.getClose_btn(), "Click Close Btn");});
        
    }
    
    
    @Test(priority = 1)
    public void Distributor_View_NS_01() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

     // Without Click Outlet Approval Menu
     		ObjectRepo.startTestAndLog_1_NS("Without Click Distributor Approval Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

        /*
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);
*/
        
        
        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC04", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
             
    }
       
    @Test(priority = 2)
    public void Distributor_View_NS_02() throws Exception {

        Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);

    	// Without selecting Grid Data
		ObjectRepo.startTestAndLog_1_NS("Without selecting Grid Data");
        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC01", "Verify that user should be able to click on Master menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC02", "Verify that user should be able to click on Distributor Master menu", () -> {
            Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
        });
        Thread.sleep(1000);

     
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC03", "Verify that user should be able to click on Distributor Approval menu", () -> {
            Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
        });
        Thread.sleep(1000);

        
        
        /*
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC04", "Verify that user should be able to select a value from the grid", () -> {
            Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
        });
        Thread.sleep(1000);
*/
        
        
        ObjectRepo.startTestAndLog_1_SS("SFA_Dist_Approval1st_View_Cred_TC05", "Verify that user should be able to click the View button", () -> {
            Liabrary.custom_click(view.getView_btn(), "Click View Btn");
        });
        Thread.sleep(1000);
        
        
        
    }
    
    
    

}
