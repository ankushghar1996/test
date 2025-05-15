package Com_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import FSG_Portal.FSG_Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_FSG_Portal {

	
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
    
        //	ObjectRepo.initializeReport();
        	
        	
    }
    
    
	
	@BeforeMethod
	public void openbrowser() throws Exception {
	   // System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
	    
		 WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver(); 

	    driver.get("https://fosrocfsguat.hspldms.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    FSG_Login login = PageFactory.initElements(driver, FSG_Login.class);

		
		Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Sheet1", 2, 0), "UserName Field");
		
		Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata2("Sheet1", 2, 1), "Passwod Field");
	
		Liabrary.custom_click(login.getLogin_Btn(), "Login Btn");
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
   
    //	ObjectRepo.finalizeReport();
        
        
    }

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
