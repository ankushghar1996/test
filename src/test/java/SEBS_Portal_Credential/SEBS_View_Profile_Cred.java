package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.SEBS_View_Profile_Main;

public class SEBS_View_Profile_Cred extends BaseClass_SEBS_Portal {

	@Test(priority = 0)
    public void SECR_ViewProfile() throws Exception {

        SEBS_View_Profile_Main view = PageFactory.initElements(driver, SEBS_View_Profile_Main.class);
        
       

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC01", "Click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), "Click on SECR Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC02", "Click on View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), "Click on View Profile");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC03", "Click on Reset Button", () -> {
            Liabrary.custom_click(view.getReset_Button(), "Click on Reset Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC05", "Enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC06", "Re-enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);

        // Uncomment this block if you want to click on Reset Password as well
        /*
        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC07", "Click on Reset Password Button", () -> {
            Liabrary.custom_click(view.getReset_Password_Button(), "Click on Reset Password Button");
        });
        Thread.sleep(1000);
        */
    }
	
	
    @Test(priority = 1)
    public void SECR_ViewProfile_NS01() throws Exception {

        SEBS_View_Profile_Main view = PageFactory.initElements(driver, SEBS_View_Profile_Main.class);
        
        //Without Click On Reset Button

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC01", "Click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), "Click on SECR Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC02", "Click on View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), "Click on View Profile");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC03", "Click on Reset Button", () -> {
//            Liabrary.custom_click(view.getReset_Button(), "Click on Reset Button");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC05", "Enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC06", "Re-enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);

        // Uncomment this block if you want to click on Reset Password as well
        /*
        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC07", "Click on Reset Password Button", () -> {
            Liabrary.custom_click(view.getReset_Password_Button(), "Click on Reset Password Button");
        });
        Thread.sleep(1000);
        */
    }
    
    
    @Test(priority = 2)
    public void SECR_ViewProfile_NS02() throws Exception {

        SEBS_View_Profile_Main view = PageFactory.initElements(driver, SEBS_View_Profile_Main.class);
        
        //Without Re Enter New Password

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC01", "Click on SECR Menu", () -> {
            Liabrary.custom_click(view.getSECR_Menu(), "Click on SECR Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC02", "Click on View Profile", () -> {
            Liabrary.custom_click(view.getView_Profile(), "Click on View Profile");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC03", "Click on Reset Button", () -> {
            Liabrary.custom_click(view.getReset_Button(), "Click on Reset Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC04", "Enter Old Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC05", "Enter New Password", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC06", "Re-enter New Password", () -> {
//            driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
//        });
//        Thread.sleep(1000);

        // Uncomment this block if you want to click on Reset Password as well
        /*
        ObjectRepo.startTestAndLog_1_SS("SEBS_View_Profile_Cred_TC07", "Click on Reset Password Button", () -> {
            Liabrary.custom_click(view.getReset_Password_Button(), "Click on Reset Password Button");
        });
        Thread.sleep(1000);
        */
    }
}
