package SEBS_Distributor_Activity_Non_PJP_Hierarchy_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Portal_Main.HO_Distributor_Approval_RejectPage;

public class Distributor_Activity_Non_PJP_HO_Distributor_Reject_Cred_1st extends BaseClass_HO_Portal {

    @Test
    public void DistM_DistributorReject() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Distributor Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC06", "Click Approval Button", () -> {
            Liabrary.custom_click(APP.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC09", "Select Reject Reason", () -> {
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
    
    @Test(priority=1)
    public void DistM_DistributorReject_NS1() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);
          
        ObjectRepo.startTestAndLog_1_NS("Without Click on Approval button");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Distributor Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC06", "Click Approval Button", () -> {
//            Liabrary.custom_click(APP.getApproval_btn(), null);
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC09", "Select Reject Reason", () -> {
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
    
   
    
    @Test(priority=2)
    public void DistM_DistributorReject_NS2() throws Exception {

        HO_Distributor_Approval_RejectPage APP = PageFactory.initElements(driver, HO_Distributor_Approval_RejectPage.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select Distributor Approval Grid Page");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(APP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Master(), "Select Distributor Master Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(APP.getDistributor_Approval(), "Select Distributor Approval Sub Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC04", "Verify Header Text 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String Actual_Text = UploadText.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Distributor Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC05", "Select Distributor Approval Grid Page", () -> {
//            Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC06", "Click Approval Button", () -> {
            Liabrary.custom_click(APP.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC07", "Click Reject Button", () -> {
            Liabrary.custom_click(APP.getReject_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC08", "Click Reject Reason Dropdown", () -> {
            Liabrary.custom_click(APP.getRejectReason_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_HO_DR_TC09", "Select Reject Reason", () -> {
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
