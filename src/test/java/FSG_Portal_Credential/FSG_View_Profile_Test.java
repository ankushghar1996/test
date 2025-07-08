package FSG_Portal_Credential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_View_Profile_Main;

public class FSG_View_Profile_Test extends BaseClass_FSG_Portal {

    @Test(priority=0)
    public void FSG_View_Profile () throws Exception {

        FSG_View_Profile_Main FSG = PageFactory.initElements(driver, FSG_View_Profile_Main.class);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC01", "Verify that user clicks on FSG Menu", () -> {
        Liabrary.custom_click(FSG.getFSG_Menu(), "Click on FSG Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC02", "Verify that user clicks on View Profile", () -> {
        Liabrary.custom_click(FSG.getView_Profile(), "Click on View Profile");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC03", "Scroll to Reset Button", () -> {
        WebElement scroll = driver.findElement(By.xpath("//span[text()='Reset']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC04", "Verify that user clicks on Reset Button", () -> {
        Liabrary.custom_click(FSG.getReset_Button(), "Click on Reset Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC05", "Enter Old Password", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("Fosroc@123");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC06", "Enter Mobile Number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("12345FSG");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC07", "Enter Re-Enter New Password", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("12345@FSG");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC08", "Click on Reset Password Button", () -> {
        Liabrary.custom_click(FSG.getReset_Password(), "Click on Reset_Password_Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=01)
    public void FSG_View_Profile_NS01() throws Exception {

        FSG_View_Profile_Main FSG = PageFactory.initElements(driver, FSG_View_Profile_Main.class);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC01", "Verify that user clicks on FSG Menu", () -> {
        Liabrary.custom_click(FSG.getFSG_Menu(), "Click on FSG Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC02", "Verify that user clicks on View Profile", () -> {
        Liabrary.custom_click(FSG.getView_Profile(), "Click on View Profile");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC03", "Scroll to Reset Button", () -> {
        WebElement scroll = driver.findElement(By.xpath("//span[text()='Reset']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC04", "Verify that user clicks on Reset Button", () -> {
        Liabrary.custom_click(FSG.getReset_Button(), "Click on Reset Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC05", "Enter Old Password", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("Fosroc@123");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC06", "Enter Mobile Number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("12345FSG");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC07", "Enter Re-Enter New Password", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("12345@FSG");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_VP_TC08", "Click on Reset Password Button", () -> {
        Liabrary.custom_click(FSG.getReset_Password(), "Click on Reset_Password_Button");
        });
        Thread.sleep(1000);
}
}