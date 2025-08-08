package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_LogOut_Main;

public class SECR_LogOut_Cred extends BaseClass_SECR_Portal {

    @Test
    public void Logout() throws Exception {

        SECR_LogOut_Main secr = PageFactory.initElements(driver, SECR_LogOut_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(secr.getSECR_Menu(), "Click SECR Menu");
        });
   

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC02", "Verify that user should be able to click on Logout Button", () -> {
            Liabrary.custom_click(secr.getLogout_Button(), "Click Logout Button");
        });
      
 Thread.sleep(1000);
 
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC03", "Verify that user should be able to confirm logout by clicking 'Yes'", () -> {
            WebElement yes_Button = driver.findElement(By.xpath("//button[normalize-space()='Yes']"));
            yes_Button.click();
        });
    }
    
    @Test
    public void Logout_NS01() throws Exception {

        SECR_LogOut_Main secr = PageFactory.initElements(driver, SECR_LogOut_Main.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without click on Logout Yes Button");

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(secr.getSECR_Menu(), "Click SECR Menu");
        });
   

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC02", "Verify that user should be able to click on Logout Button", () -> {
            Liabrary.custom_click(secr.getLogout_Button(), "Click Logout Button");
        });
      

//        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC03", "Verify that user should be able to confirm logout by clicking 'Yes'", () -> {
//            WebElement yes_Button = driver.findElement(By.xpath("//button[normalize-space()='Yes']"));
//            yes_Button.click();
//        });
        
}

}