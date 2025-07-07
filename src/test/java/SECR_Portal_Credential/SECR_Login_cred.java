package SECR_Portal_Credential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com_Utility.Excel_Data_Provider;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SECR_Login_cred {

    WebDriver driver;
    Excel_Data_Provider excel;

    @BeforeClass
    public void setup() throws Exception {
        WebDriverManager.chromedriver().setup(); // ✅ Auto-manage ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fosrocsecruat.hspldms.com");

        excel = new Excel_Data_Provider();
        ObjectRepo.initializeReport();
    }

    // ✅ Positive Test Case
    @Test(priority = 0)
    public void SECR_Login() throws Exception {
        SECR_Login login = PageFactory.initElements(driver, SECR_Login.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC01", "Enter valid SECR User Name", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Sheet1", 4, 0), "UserName Field");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC02", "Enter valid SECR Password", () -> {
            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata2("Sheet1", 4, 1), "Password Field");
        });

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC03", "Click on Login button", () -> {
            Liabrary.custom_click(login.getLogin_btn(), "Login Btn");
        });

        Thread.sleep(1000);
    }

    // ❌ Negative Test Case 1: Invalid Username
    @Test(priority = 1)
    public void SECR_Login_InvalidUsername() throws Exception {
        SECR_Login login = PageFactory.initElements(driver, SECR_Login.class);

        // Optional: handle "Mark Attendance" popup
        try {
            List<WebElement> popup = driver.findElements(By.xpath("//span[normalize-space(text())='MARK ATTENDANCE']"));
            if (!popup.isEmpty() && popup.get(0).isDisplayed()) {
                WebElement markAttendanceBtn = driver.findElement(By.xpath("//span[normalize-space(text())='MARK ATTENDANCE']"));
                Liabrary.custom_click(markAttendanceBtn, "Mark Attendance");
            }
        } catch (Exception e) {
            System.out.println("Popup handling exception: " + e.getMessage());
        }

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_NS01", "Enter invalid username and valid password", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Negative Login", 1, 0), "Invalid Username");
            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata2("Negative Login", 1, 1), "Valid Password");
            Liabrary.custom_click(login.getLogin_btn(), "Login Btn");
        });

        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_NS01", "Verify error message displayed for invalid username", () -> {
            Assert.assertTrue(login.getErrorMessage().isDisplayed(), "Error message not displayed for invalid username");
        });
    }

    // ❌ Negative Test Case 2: Invalid Password
    @Test(priority = 2)
    public void SECR_Login_InvalidPassword() throws Exception {
        SECR_Login login = PageFactory.initElements(driver, SECR_Login.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_NS02", "Enter valid username and invalid password", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Sheet1", 4, 0), "Valid Username");
            Liabrary.custom_Sendkeys(login.getPassword(), "wrong_password", "Invalid Password");
            Liabrary.custom_click(login.getLogin_btn(), "Login Btn");
        });

        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_NS02", "Verify error message displayed for invalid password", () -> {
            Assert.assertTrue(login.getErrorMessage().isDisplayed(), "Error message not displayed for invalid password");
        });
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            ObjectRepo.finalizeReport();
        }
    }
}
