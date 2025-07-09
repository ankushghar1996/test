package FSG_Portal_Credential;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_Logout_Main;

public class FSG_Logout extends BaseClass_FSG_Portal {

    @Test(priority=0)
    public void Logout () throws Exception {

        FSG_Logout_Main FSG = PageFactory.initElements(driver, FSG_Logout_Main.class);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC01", "Verify that user clicks on FSG Menu.", () -> {
            Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC02", "Verify that user clicks on Logout button.", () -> {
            Liabrary.custom_click(FSG.getLogout_Button(), "Click on Logout Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC03", "Verify that user clicks on Yes to confirm logout.", () -> {
            WebElement yes_Button = driver.findElement(By.xpath("//div[@class='col-6 p-0']//button[text()='Yes']"));
            yes_Button.click();
        });

    }
    
    @Test(priority=1)
    public void Logout_NS01() throws Exception {

        FSG_Logout_Main FSG = PageFactory.initElements(driver, FSG_Logout_Main.class);
        
        //Without Click on logout button

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC01", "Verify that user clicks on FSG Menu.", () -> {
        Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG Menu");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC02", "Verify that user clicks on Logout button.", () -> {
//            Liabrary.custom_click(FSG.getLogout_Button(), "Click on Logout Button");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC03", "Verify that user clicks on Yes to confirm logout.", () -> {
        WebElement yes_Button = driver.findElement(By.xpath("//div[@class='col-6 p-0']//button[text()='Yes']"));
        yes_Button.click();
        });

    }
    
    @Test(priority=2)
    public void Logout_NS02() throws Exception {

    FSG_Logout_Main FSG = PageFactory.initElements(driver, FSG_Logout_Main.class);
        
        //Without Click on FSG Menu

//        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC01", "Verify that user clicks on FSG Menu.", () -> {
//            Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG Menu");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC02", "Verify that user clicks on Logout button.", () -> {
        Liabrary.custom_click(FSG.getLogout_Button(), "Click on Logout Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Logout_TC03", "Verify that user clicks on Yes to confirm logout.", () -> {
        WebElement yes_Button = driver.findElement(By.xpath("//div[@class='col-6 p-0']//button[text()='Yes']"));
        yes_Button.click();
        });

    }
}
