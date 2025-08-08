package ASM_Portal_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ASM_Portal.ASM_Approval_View;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;

public class ASM_Approval_View_Test extends BaseClass_ASM {

    @Test(priority = 0)
    public void Approval_View_Page() throws Exception {

        ASM_Approval_View ASM = PageFactory.initElements(driver, ASM_Approval_View.class);

        ObjectRepo.startTestAndLog_1_SS("ASM_View_01", "Click on ASM_Portal Master menu", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_02", "Click on Distributor Master", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_03", "Click on Distributor Approval 2nd", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_05", "Click on View Button", () -> {
            Liabrary.custom_click(ASM.getView_Button(), "Click on View Button");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_06", "Scroll to the Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_07", "Download Document 1", () -> {
            Liabrary.custom_click(ASM.getDownload1_Button(), "Click on Download 1");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_08", "Download Document 2", () -> {
            Liabrary.custom_click(ASM.getDownload2_Button(), "Click on Download 2");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_09", "Download Document 3", () -> {
            Liabrary.custom_click(ASM.getDownload3_Button(), "Click on Download 3");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_10", "Click on Close Button", () -> {
            Liabrary.custom_click(ASM.getClose_Button(), "Click on Close Button");
        });
    }
    
    
    
    @Test(priority = 1)
    public void View_Page_NS_01() throws Exception {

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
    public void View_Page_NS_02() throws Exception {

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
    public void View_Page_NS_03() throws Exception {

        ASM_Approval_View ASM = PageFactory.initElements(driver, ASM_Approval_View.class);

     // Without Click on View Button
		ObjectRepo.startTestAndLog_1_NS("Without click View btn");
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_01", "Click on ASM_Portal Master menu", () -> {
            Liabrary.custom_click(ASM.getMaster(), "Click on Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_02", "Click on Distributor Master", () -> {
            Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_03", "Click on Distributor Approval 2nd", () -> {
            Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
        });

        ObjectRepo.startTestAndLog_1_SS("ASM_View_04", "Select Grid Data From Grid Table", () -> {
            Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
        });

        
        /*
        ObjectRepo.startTestAndLog_1_SS("ASM_View_05", "Click on View Button", () -> {
            Liabrary.custom_click(ASM.getView_Button(), "Click on View Button");
        });
	*/
        
        
        ObjectRepo.startTestAndLog_1_SS("ASM_View_06", "Scroll to the Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
    
    }
    
    
    
}
