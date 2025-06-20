package HO_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Portal_Main.HO_Distributor_Approval_RejectPage;

public class HO_Distributor_Reject_Cred extends BaseClass_HO_Portal {

	@Test(priority=0)
    public void DistM_DistributorApprov() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Distributor Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC06", "Click Approval Button", () -> {
            Liabrary.custom_click(APP.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC09", "Select Reject Reason", () -> {
            Liabrary.custom_click(APP.getRejectReason(), null);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC10", "Click Yes Button", () -> {
//            Liabrary.custom_click(APP.getYes_btn(), null);
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC11", "Click No Button", () -> {
            Liabrary.custom_click(APP.getNo_btn(), null);
        });
        Thread.sleep(1000);
       
    }

    @Test(priority=01)
    public void DistM_DistributorApprov_NS01() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);

        ObjectRepo.startTestAndLog_1_NS("Proceed click View button without Selecting Grid Data");
        
        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Distributor Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
//            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC06", "Click Approval Button", () -> {
            Liabrary.custom_click(APP.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC09", "Select Reject Reason", () -> {
            Liabrary.custom_click(APP.getRejectReason(), null);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC10", "Click Yes Button", () -> {
//            Liabrary.custom_click(APP.getYes_btn(), null);
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC11", "Click No Button", () -> {
            Liabrary.custom_click(APP.getNo_btn(), null);
        });
        Thread.sleep(1000);
}
    @Test(priority=02)
    public void DistM_DistributorApprov_NS02() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);

        ObjectRepo.startTestAndLog_1_NS("Header Text Change As Outlet Approval");
        
        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC06", "Click Approval Button", () -> {
            Liabrary.custom_click(APP.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC09", "Select Reject Reason", () -> {
            Liabrary.custom_click(APP.getRejectReason(), null);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC10", "Click Yes Button", () -> {
//            Liabrary.custom_click(APP.getYes_btn(), null);
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HO_DR_TC11", "Click No Button", () -> {
            Liabrary.custom_click(APP.getNo_btn(), null);
        });
        Thread.sleep(1000);
}
}
    
