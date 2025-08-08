package HO_Portal_Credential;

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

public class HO_Distributor_Approval_View_Test extends BaseClass_HO_Portal {

    @Test(priority = 0)
    public void DistM_DistributorApprov_View() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);
        
        
        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Distributor Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC05", "Select Distributor Approval Grid Page", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);

        WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority = 01) //Without clicking Grid data click on View Button
    public void DistM_DistributorApprov_View_NS01() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Proceed click View button without Selecting Grid Data");
        
        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Distributor Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC05", "Select Distributor Approval Grid Page", () -> {
//            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);

        WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority = 02) //Header Text Change As Outlet Approval
    public void DistM_DistributorApprov_View_NS02() throws Exception {
        HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Header Text Change As Outlet Approval");
        
        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(AP.getMaster(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC02", "Select Distributor Master Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Master(), "Select Distributor Master sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC03", "Select Distributor Approval Sub Menu", () -> {
            Liabrary.custom_click(AP.getDistributor_Approval(), "Select Distributor Approval sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC04", "Verify Header Text is 'Distributor Approval'", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
            String actualText = UploadText.getText();
            System.out.println(actualText);
            String expectedText = "Outlet Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC05", "Select Distributor Approval Grid Page", () -> {
//            Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC06", "Click on View Button", () -> {
            Liabrary.custom_click(AP.getView_btn(), "Click on View Button");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC07", "Download Document 1", () -> {
            Liabrary.custom_click(AP.getDocument_1(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC08", "Download Document 2", () -> {
            Liabrary.custom_click(AP.getDocument_2(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC09", "Download Document 3", () -> {
            Liabrary.custom_click(AP.getDocument_3(), "Distributor Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_DAV_TC10", "Click on Close Button", () -> {
            Liabrary.custom_click(AP.getClose_btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
}

