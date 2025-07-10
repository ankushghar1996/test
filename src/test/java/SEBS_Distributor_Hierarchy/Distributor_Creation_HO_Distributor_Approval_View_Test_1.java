package SEBS_Distributor_Hierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Portal_Main.HO_Distributor_Approval_View_Main;

public class Distributor_Creation_HO_Distributor_Approval_View_Test_1 extends BaseClass_HO_Portal {

    @Test
    public void DistM_DistributorApprov_View() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Distributor Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);

        WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void DistM_DistributorApprov_View_NS1() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select Distributor Approval sub menu");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_03", "Select Distributor Approval Sub Menu", () -> {
//            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Distributor Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);

        WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=2)
    public void DistM_DistributorApprov_View_NS2() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select Distributor Approval Grid Page");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Distributor Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_05", "Select Distributor Approval Grid Page", () -> {
//            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);

        WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_View_Test_10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
}
