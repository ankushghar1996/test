package ASM_Portal_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ASM_Portal.ASM_Approval_View;
import ASM_Portal.ASM_Reject_Page;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;

public class ASM_Reject_Page_Test extends BaseClass_ASM {

    @Test(priority = 0)
    public void View_Page() throws Exception {

        ASM_Reject_Page ASM = PageFactory.initElements(driver, ASM_Reject_Page.class);

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_01", "Verify that user can click on Master menu.", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_02", "Verify that user can click on Distributor Master.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_03", "Verify that user can click on Distributor Approval 2nd.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_04", "Verify that user can select data from the grid table.", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_05", "Verify that user can click on Approval Button.", () -> {
            Liabrary.custom_click(ASM.getApproval_Page_Button(), "Click on Approval Button");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_06", "Scroll down to the 'Documents' section.", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_07", "Verify that user can click on Reject Button.", () -> {
            Liabrary.custom_click(ASM.getReject_Button(), "Click on Reject Button");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_08", "Verify that user can open rejection reason dropdown.", () -> {
            Liabrary.custom_click(ASM.getSelect_Dropdown(), "Select Dropdown Button");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_09", "Verify that user can select a value from the rejection dropdown.", () -> {
            Liabrary.custom_click(ASM.getSelect_Dropdown_Value(), "Select Dropdown Button value");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_10", "Verify that user can click on No Button to cancel rejection.", () -> {
            Liabrary.custom_click(ASM.getNo_Button(), "Click On No Button");
        });
    }
    
    
    
    @Test(priority = 1)
    public void Reject_Page_NS_01() throws Exception {

        ASM_Approval_View ASM = PageFactory.initElements(driver, ASM_Approval_View.class);

     // Without Click Outlet Approval Menu
      		ObjectRepo.startTestAndLog_1_NS("Without Click Distributor Approval 2nd Menu");
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_01", "Click on ASM_Portal Master menu", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_02", "Click on Distributor Master", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        
        /*
        ObjectRepo.startTestAndLog_1_SS("ASM_View_03", "Click on Distributor Approval 2nd", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });
*/
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });
    
    }
    
    
    
    @Test(priority = 2)
    public void Reject_Page_NS_02() throws Exception {

        ASM_Approval_View ASM = PageFactory.initElements(driver, ASM_Approval_View.class);

     // Without selecting Grid Data
		ObjectRepo.startTestAndLog_1_NS("Without selecting Grid Data");
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_01", "Click on ASM_Portal Master menu", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_02", "Click on Distributor Master", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_03", "Click on Distributor Approval 2nd", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        
        /*
        ObjectRepo.startTestAndLog_1_SS("ASM_View_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });
	*/
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_05", "Click on View Button", () -> {
            Liabrary.custom_click(ASM.getView_Button(), "Click on View Button");
        });
    
    }
    
    
    @Test(priority = 3)
    public void Reject_Page_NS_03() throws Exception {

        ASM_Reject_Page ASM = PageFactory.initElements(driver, ASM_Reject_Page.class);

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_01", "Verify that user can click on Master menu.", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_02", "Verify that user can click on Distributor Master.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_03", "Verify that user can click on Distributor Approval 2nd.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_04", "Verify that user can select data from the grid table.", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_05", "Verify that user can click on Approval Button.", () -> {
            Liabrary.custom_click(ASM.getApproval_Page_Button(), "Click on Approval Button");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_06", "Scroll down to the 'Documents' section.", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        
        /*
        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_07", "Verify that user can click on Reject Button.", () -> {
            Liabrary.custom_click(ASM.getReject_Button(), "Click on Reject Button");
        });
        */
        
        

        ObjectRepo.startTestAndLog_1_SS("ASM_Reject_Test_08", "Verify that user can open rejection reason dropdown.", () -> {
            Liabrary.custom_click(ASM.getSelect_Dropdown(), "Select Dropdown Button");
        });
    
    }
    
    
    
}
