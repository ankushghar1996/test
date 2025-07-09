package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.DLRM_Dealer_Approval;
import HO_Master.DLRM_Dealer_ApprovalView_Page;

public class DLRM_DLRM_Dealer_ApprovalView_Page extends BaseClass {

    @Test(priority=0)
    public void Dealer_Approval_View() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver, DLRM_Dealer_ApprovalView_Page.class);
        DLRM_Dealer_Approval DA1 = PageFactory.initElements(driver, DLRM_Dealer_Approval.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC01", "Click On Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC02", "Click On Outlet Master SubMenu", () -> {
            Liabrary.custom_click(hp.getOutletMaster_SubMenu(), "Outlet Master Submenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC03", "Click Dealer Approval Menu", () -> {
            Liabrary.custom_click(DA1.getDealer_Approval_Menu(), "Dealer Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC04", "Click Grid Data From Table", () -> {
            Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(), "Select Grid Data From Table");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC05", "Click View Button", () -> {
            Liabrary.custom_click(DA2.getDealer_Details_View_Page(), "Click on View Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC06", "Verify Dealer Details Header", () -> {
            WebElement Dealer_Details = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
            String Actual_Text = Dealer_Details.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Details";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC07", "Scroll To Documents Section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC08", "Click Document 1 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_1(), "Download Document 1");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC09", "Click Document 2 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_2(), "Download Document 2");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC10", "Click Document 3 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_3(), "Download Document 3");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC11", "Click Close Button", () -> {
            Liabrary.custom_click(CD.getClose_Btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void Dealer_Approval_View_ns01() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver, DLRM_Dealer_ApprovalView_Page.class);
        DLRM_Dealer_Approval DA1 = PageFactory.initElements(driver, DLRM_Dealer_Approval.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click on view Button");
        
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC01", "Click On Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC02", "Click On Outlet Master SubMenu", () -> {
            Liabrary.custom_click(hp.getOutletMaster_SubMenu(), "Outlet Master Submenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC03", "Click Dealer Approval Menu", () -> {
            Liabrary.custom_click(DA1.getDealer_Approval_Menu(), "Dealer Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC04", "Click Grid Data From Table", () -> {
            Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(), "Select Grid Data From Table");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC05", "Click View Button", () -> {
//            Liabrary.custom_click(DA2.getDealer_Details_View_Page(), "Click on View Button");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC06", "Verify Dealer Details Header", () -> {
            WebElement Dealer_Details = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
            String Actual_Text = Dealer_Details.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Details";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC07", "Scroll To Documents Section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC08", "Click Document 1 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_1(), "Download Document 1");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC09", "Click Document 2 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_2(), "Download Document 2");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC10", "Click Document 3 Download", () -> {
            Liabrary.custom_click(DA2.getDocument_3(), "Download Document 3");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC11", "Click Close Button", () -> {
            Liabrary.custom_click(CD.getClose_Btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority=2)
    public void Dealer_Approval_View_ns02() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver, DLRM_Dealer_ApprovalView_Page.class);
        DLRM_Dealer_Approval DA1 = PageFactory.initElements(driver, DLRM_Dealer_Approval.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click on Grid data");
        
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC01", "Click On Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC02", "Click On Outlet Master SubMenu", () -> {
            Liabrary.custom_click(hp.getOutletMaster_SubMenu(), "Outlet Master Submenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC03", "Click Dealer Approval Menu", () -> {
            Liabrary.custom_click(DA1.getDealer_Approval_Menu(), "Dealer Approval");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC04", "Click Grid Data From Table", () -> {
//            Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(), "Select Grid Data From Table");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC05", "Click View Button", () -> {
            Liabrary.custom_click(DA2.getDealer_Details_View_Page(), "Click on View Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_ApprovalView_Page_TC06", "Verify Dealer Details Header", () -> {
            WebElement Dealer_Details = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
            String Actual_Text = Dealer_Details.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Details";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

}

}