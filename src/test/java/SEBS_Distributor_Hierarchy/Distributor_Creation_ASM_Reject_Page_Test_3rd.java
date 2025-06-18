package SEBS_Distributor_Hierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ASM_Portal.ASM_Reject_Page;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;

public class Distributor_Creation_ASM_Reject_Page_Test_3rd extends BaseClass_ASM {

    @Test
    public void View_Page() throws Exception {

        ASM_Reject_Page ASM = PageFactory.initElements(driver, ASM_Reject_Page.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_01", "Verify that user can click on Master menu.", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_02", "Verify that user can click on Distributor Master.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_03", "Verify that user can click on Distributor Approval 2nd.", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_04", "Verify that user can select data from the grid table.", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_05", "Verify that user can click on Approval Button.", () -> {
            Liabrary.custom_click(ASM.getApproval_Page_Button(), "Click on Approval Button");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_06", "Scroll down to the 'Documents' section.", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_07", "Verify that user can click on Reject Button.", () -> {
            Liabrary.custom_click(ASM.getReject_Button(), "Click on Reject Button");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_08", "Verify that user can open rejection reason dropdown.", () -> {
            Liabrary.custom_click(ASM.getSelect_Dropdown(), "Select Dropdown Button");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_09", "Verify that user can select a value from the rejection dropdown.", () -> {
            Liabrary.custom_click(ASM.getSelect_Dropdown_Value(), "Select Dropdown Button value");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_ASM_Reject_Test_10", "Verify that user can click on No Button to cancel rejection.", () -> {
            Liabrary.custom_click(ASM.getNo_Button(), "Click On No Button");
        });
    }
}
