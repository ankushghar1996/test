package Com_Utility;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
 
import Com_PageObjectModel.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseClass_ASM {
 
    public static WebDriver driver;
    public static Confiq_Data_Provider confiq;
    public static Excel_Data_Provider excel;
 
    @BeforeSuite
    public void setUpDataProviders() throws Exception {
        confiq = new Confiq_Data_Provider();
        excel = new Excel_Data_Provider();
 
        // Optional: Initialize Extent Report here
         ObjectRepo.initializeReport();
    }
 
    @BeforeMethod
    public void launchBrowserAndLogin() throws Exception {
    	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://fosrocuatlocal.hspldms.com");
        //initilize Driver 
        ObjectRepo.driver = driver;	
 
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
 
        Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata("Sheet1", 6, 0), "Username Field");
        
        
        Liabrary.custom_Sendkeys(login.getPassword(),excel.getStringdata("Sheet1", 6, 1), "Password Field");
        
        
        Liabrary.custom_click(login.getLogin_Btn(), "Login Button");
       
        // Optional: Wait for dashboard/home page validation
        Thread.sleep(1000); // Consider using WebDriverWait instead
        
        
    }
 
    @AfterMethod
    public void tearDown() {
    	
        if (driver != null) {
            driver.quit();
            
            
        }
    }
 
    
    
    @AfterSuite
    public void generateReport() {
        // Optional: Finalize Extent Report
        ObjectRepo.finalizeReport();
    	
    	
    }
}