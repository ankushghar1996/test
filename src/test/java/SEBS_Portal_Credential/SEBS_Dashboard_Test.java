package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.SEBS_DashBoard;

public class SEBS_Dashboard_Test extends BaseClass_SEBS_Portal {

    @Test
    public void Dashboard() throws Exception {

        SEBS_DashBoard SEBS = PageFactory.initElements(driver, SEBS_DashBoard.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Dashboard_TC_01", "Click on MTD Capsule", () -> {
            Liabrary.custom_click(SEBS.getMTD_Capsule(), "Click on MTD Capsule");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Dashboard_TC_02", "Scroll to 'New Developers Created'", () -> {
            WebElement Scroll = driver.findElement(By.xpath("//div[@class='col-12 mt-0']//span[text()=' New Developers Created']"));
            JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
            JSE1.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Dashboard_TC_03", "Click on Arrow Button", () -> {
            Liabrary.custom_click(SEBS.getArrow_Button(), "Click on Arrow Button ");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Dashboard_TC_04", "Click on YTD Button", () -> {
            Liabrary.custom_click(SEBS.getYTD_Button(), "Click on YTD Button");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Dashboard_TC_05", "Click on Close Button", () -> {
            Liabrary.custom_click(SEBS.getClose(), "Click on Close Button");
        });
    }
}
