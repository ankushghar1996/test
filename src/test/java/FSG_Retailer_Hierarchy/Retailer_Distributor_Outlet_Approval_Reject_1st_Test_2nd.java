package FSG_Retailer_Hierarchy;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Com_Utility.Base_Class_Distributor;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Distributor_Portal.Outlet_Approval_1st;
 
public class Retailer_Distributor_Outlet_Approval_Reject_1st_Test_2nd extends Base_Class_Distributor {
 
    @Test
    public void Outlet_Test() throws Exception {
 
        Outlet_Approval_1st DIST = PageFactory.initElements(driver, Outlet_Approval_1st.class);
        
        ObjectRepo.startTestAndLog_1_NS("without select grid data from table");
 
     // Package name + login name + class name + test case nmbr
        
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_01", "Click on Master menu", () -> {
            Liabrary.custom_click(DIST.getMaster(), "Click on Master");
        });
        Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_02", "Click on Outlet Master", () -> {
            Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
        });
        Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_03", "Click on Outlet Approval 1st", () -> {
            Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
        });
        Thread.sleep(1000);
 
//        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_04", "Select Grid Data From Grid Table", () -> {
//            Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
//        });
//        Thread.sleep(1000);
// 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_05", "Click on Approval button", () -> {
            Liabrary.custom_click(DIST.getApproval_Page_Button(), "Click on Approval Button");
        });
        Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_06", "Scroll to Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_07", "Click on Approve button", () -> {
            Liabrary.custom_click(DIST.getApprove_Button(), "Click on Approve Button");
        });
        Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_08", "Click on No button", () -> {
            Liabrary.custom_click(DIST.getNo_Button(), "Click on No Btn");
        });

    }
    
    
@Test
public void Outlet_Test_NS01() throws Exception {
	 
    Outlet_Approval_1st DIST = PageFactory.initElements(driver, Outlet_Approval_1st.class);
    
    ObjectRepo.startTestAndLog_1_NS("without Click on Approval Button");

 // Package name + login name + class name + test case nmbr
    
    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_01", "Click on Master menu", () -> {
        Liabrary.custom_click(DIST.getMaster(), "Click on Master");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_02", "Click on Outlet Master", () -> {
        Liabrary.custom_click(DIST.getOutlet_Master(), "Click on Outlet Master");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_03", "Click on Outlet Approval 1st", () -> {
        Liabrary.custom_click(DIST.getOutlet_Approval_1st(), "Click Outlet Approval 1st");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_04", "Select Grid Data From Grid Table", () -> {
        Liabrary.custom_click(DIST.getGrid_Data(), "Select Grid Data From Grid Table");
    });
    Thread.sleep(1000);
//
//    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_05", "Click on Approval button", () -> {
//        Liabrary.custom_click(DIST.getApproval_Page_Button(), "Click on Approval Button");
//    });
//    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_06", "Scroll to Documents section", () -> {
        WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_07", "Click on Approve button", () -> {
        Liabrary.custom_click(DIST.getApprove_Button(), "Click on Approve Button");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("FSG_DB_Outlet_Approval_TC_08", "Click on No button", () -> {
        Liabrary.custom_click(DIST.getNo_Button(), "Click on No Btn");
    });

}
}