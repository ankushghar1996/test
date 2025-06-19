package Com_Utility;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
 
import Com_PageObjectModel.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
 
 
public class BaseClass {
 
    public static WebDriver driver;
    public static Confiq_Data_Provider confiq;
    public static Excel_Data_Provider excel;
 
    // BeforeSuite to initialize the ExtentReports
    @BeforeSuite
    public void Data_Provider() throws Exception {
        // Initialize the data providers
        confiq = new Confiq_Data_Provider();
        excel = new Excel_Data_Provider();
 
        // Initialize Extent Reports
        ObjectRepo.initializeReport();
    }
  
    // BeforeMethod to open the browser and run the login process
    @BeforeMethod
    public void openbrowser() throws Exception {
        // Automatically download and set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver for Chrome browser
        driver = new ChromeDriver();
        driver.get("https://fosrocuatlocal.hspldms.com");
        driver.manage().window().maximize();
        
        ObjectRepo.driver = driver;
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        // Initialize the LoginPage object using PageFactory
        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);
 
        // Use custom methods to send keys and clicks, replace Liabrary with Library
        Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 9, 0), "UserName Field");
        Thread.sleep(1000);
        Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 9, 1), "Password Field");
        Thread.sleep(3000);
        Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
        Thread.sleep(3000);
    }
// AfterMethod to close the browser after each test
    @AfterMethod
    public void close() {
        // Quit the driver after the test
        if (driver != null) {
            driver.quit();
        }
    }
 
    // AfterSuite to finalize the ExtentReports and generate the final report after all tests are executed
    @AfterSuite
    public void afterSuite() {
        // Finalize the report after all tests are executed
        ObjectRepo.finalizeReport();
    }
}


    /*
    // AfterMethod to close the browser after each test
    @AfterMethod
    public void close() {
        // Quit the driver after the test
        driver.quit();
        // Finalize the report (e.g., for ExtentReports)
    }
 
    // AfterSuite to finalize the ExtentReports and generate the final report after all tests are executed
    @AfterSuite
    public void afterSuite() {
        // Finalize the report after all tests are executed
        ObjectRepo.finalizeReport();
    }
}
*/
 
/*	
Admin_LoginPage loginelements=PageFactory.initElements(driver, Admin_LoginPage.class);
Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
Thread.sleep(1000);
Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Passwod Field");
Thread.sleep(3000);
Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
Thread.sleep(3000);
*/	


	/*	
		Login_Page_POM loginelements=PageFactory.initElements(driver, Login_Page_POM.class);
			Liabrary.custom_Sendkeys(loginelements.get_dbcode(), excel.getStringdata("Sheet2", 1, 0),"DBCode Field");
			Liabrary.custom_Sendkeys(loginelements.get_username(), excel.getStringdata("Sheet2", 1, 1),"User ID Field");
			Liabrary.custom_Sendkeys(loginelements.get_password(), excel.getStringdata("Sheet2", 1, 3),"Password Field");
			Liabrary.custom_Sendkeys(loginelements.get_pin(), excel.getNumericdata("Sheet2", 1, 2),"PinCode Field");
			Thread.sleep(7000);
			Liabrary.custom_click(loginelements.get_loginbutton(),"Login button");
			Thread.sleep(3000);
		*/
//		Login_Page_POM loginelements=PageFactory.initElements(driver, Login_Page_POM.class);
//		Liabrary.custom_Sendkeys(loginelements.get_dbcode(), excel.getStringdata("Sheet1", 1, 0));
//		Liabrary.custom_Sendkeys(loginelements.get_username(), excel.getStringdata("Sheet1", 1, 1));
//		Liabrary.custom_Sendkeys(loginelements.get_password(), excel.getStringdata("Sheet1", 1, 3));
//		Liabrary.custom_Sendkeys(loginelements.get_pin(), excel.getNumericdata("Sheet1", 1, 2));
//		Thread.sleep(9000);
//		Liabrary.custom_click(loginelements.get_loginbutton());
