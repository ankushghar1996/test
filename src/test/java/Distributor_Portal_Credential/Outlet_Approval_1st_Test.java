package Distributor_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Com_Utility.Base_Class_Distributor;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Distributor_Portal.Outlet_Approval_1st;

public class Outlet_Approval_1st_Test extends Base_Class_Distributor {

    @Test(priority=0)
    public void Outlet_ApprovalTest() throws Exception {

        Outlet_Approval_1st DIST = PageFactory.initElements(driver, Outlet_Approval_1st.class);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_01", "Click on Master menu", () -> {
            Liabrary.custom_click(DIST.getMaster(), "Click on Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_02", "Click on Outlet Master", () -> {
            Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_03", "Click on Outlet Approval 1st", () -> {
            Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_05", "Click on Approval button", () -> {
            Liabrary.custom_click(DIST.getApproval_Page_Button(), "Click on Approval Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_06", "Scroll to Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_07", "Click on Approve button", () -> {
            Liabrary.custom_click(DIST.getApprove_Button(), "Click on Approve Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on Yes button", () -> {
            Liabrary.custom_click(DIST.getYes_Button(), "Click on Yes Btn");
        });
        
//        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on No button", () -> {
//            Liabrary.custom_click(DIST.getNo_Button(), "Click on No Btn");
//        });
        
        
    }
    
    @Test(priority=1)
    public void Outlet_Approval_1st_Test_NS1() throws Exception {

        Outlet_Approval_1st DIST = PageFactory.initElements(driver, Outlet_Approval_1st.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Select Grid Data From Grid Table");

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_01", "Click on Master menu", () -> {
            Liabrary.custom_click(DIST.getMaster(), "Click on Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_02", "Click on Outlet Master", () -> {
            Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_03", "Click on Outlet Approval 1st", () -> {
            Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_04", "Select Grid Data From Grid Table", () -> {
//            Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_05", "Click on Approval button", () -> {
            Liabrary.custom_click(DIST.getApproval_Page_Button(), "Click on Approval Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_06", "Scroll to Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_07", "Click on Approve button", () -> {
            Liabrary.custom_click(DIST.getApprove_Button(), "Click on Approve Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on Yes button", () -> {
            Liabrary.custom_click(DIST.getYes_Button(), "Click on Yes Btn");
        });
        
//        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on No button", () -> {
//            Liabrary.custom_click(DIST.getNo_Button(), "Click on No Btn");
//        });
        
        
    }
    
    @Test(priority=2)
    public void Outlet_Approval_1st_Test_NS2() throws Exception {

        Outlet_Approval_1st DIST = PageFactory.initElements(driver, Outlet_Approval_1st.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Select Grid Data From Grid Table");

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_01", "Click on Master menu", () -> {
            Liabrary.custom_click(DIST.getMaster(), "Click on Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_02", "Click on Outlet Master", () -> {
            Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_03", "Click on Outlet Approval 1st", () -> {
            Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_05", "Click on Approval button", () -> {
//            Liabrary.custom_click(DIST.getApproval_Page_Button(), "Click on Approval Button");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_06", "Scroll to Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_07", "Click on Approve button", () -> {
            Liabrary.custom_click(DIST.getApprove_Button(), "Click on Approve Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on Yes button", () -> {
            Liabrary.custom_click(DIST.getYes_Button(), "Click on Yes Btn");
        });
        
//        ObjectRepo.startTestAndLog_1_SS("DB_Outlet_Approval_TC_08", "Click on No button", () -> {
//            Liabrary.custom_click(DIST.getNo_Button(), "Click on No Btn");
//        });
        
        
    }
}
