package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_View_Profile_Main;

public class SECR_View_Profile_Cred extends BaseClass_SECR_Portal{

    @Test
    public void SECR_ViewProfile() throws Exception {

        SECR_View_Profile_Main view = PageFactory.initElements(driver, SECR_View_Profile_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC02", "Click View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC03", "Click Reset Button", () -> {
            Liabrary.custom_click(view.getReset_Button(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC05", "Enter Mobile Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC06", "Enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);
        

       
       

    }
    
    
    
    @Test(priority = 1)
    public void SECR_ViewProfile_NS01() throws Exception {

        SECR_View_Profile_Main view = PageFactory.initElements(driver, SECR_View_Profile_Main.class);
        
        //placed Wrong Mobile Number

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC02", "Click View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC03", "Click Reset Button", () -> {
            Liabrary.custom_click(view.getReset_Button(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC05", "Enter Mobile Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC06", "Enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);


    }
    
    
    
    @Test(priority = 2)
    public void SECR_ViewProfile_NS02() throws Exception {

        SECR_View_Profile_Main view = PageFactory.initElements(driver, SECR_View_Profile_Main.class);
        
        //Without Clicking Reset Button

        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC02", "Click View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), null);
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC03", "Click Reset Button", () -> {
//            Liabrary.custom_click(view.getReset_Button(), null);
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_LogOut_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);
        

      
        

       
       

    }
}
