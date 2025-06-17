package SECR_Retailer_Activity_Non_PJP_Hierarchy2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Com_Utility.Base_Class_Distributor;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Distributor_Portal.Outlet_Approval_1st_View;

public class Retailer_Non_PJP_Distributor_Outlet_Approval_1st_View_Test_2nd extends Base_Class_Distributor {

    @Test
    public void Outlet_View() throws Exception {

        Outlet_Approval_1st_View DIST = PageFactory.initElements(driver, Outlet_Approval_1st_View.class);

     // Package name + login name + class name + test case nmbr
        
        
        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_01", "Click on DIST_Portal Master menu", () -> {
            Liabrary.custom_click(DIST.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_02", "Click on Outlet Master", () -> {
            Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_03", "Click on Outlet Approval 1st", () -> {
            Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_05", "Click on View Button", () -> {
            Liabrary.custom_click(DIST.getView_Button(), "Click on View Button");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_06", "Scroll to the Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_DB_Activity_Non_PJP_Outlet_Approval_1st_View_Test_TC_07", "Click on Close Button", () -> {
            Liabrary.custom_click(DIST.getClose_Button(), "Click on Close Button");
        });
    }
}
