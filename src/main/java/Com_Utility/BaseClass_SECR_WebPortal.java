package Com_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com_PageObjectModel.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_SECR_WebPortal {

	
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
    
    
	
	@BeforeMethod
	public void openbrowser() throws Exception {
	 //   System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
	    
	    WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver(); // ✅ FIXED

	    driver.get("https://fosrocuat.hspldms.com");
	    driver.manage().window().maximize();
	    
	    ObjectRepo.driver = driver;
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	   
	    // Initialize the LoginPage object using PageFactory
        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);
 
        // Use custom methods to send keys and clicks, replace Liabrary with Library
        Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 10, 0), "UserName Field");
      
        Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 10, 1), "Password Field");
    
        Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
        Thread.sleep(1000);

	    
	   
	    
	    
	    
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
