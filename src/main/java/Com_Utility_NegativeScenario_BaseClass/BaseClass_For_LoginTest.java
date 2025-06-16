package Com_Utility_NegativeScenario_BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com_Utility.Confiq_Data_Provider;
import Com_Utility.Excel_Data_Provider;
import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_For_LoginTest {

	
	public static WebDriver driver;
	public static Confiq_Data_Provider confiq;
	public static Excel_Data_Provider excel;
	@BeforeSuite 
	public void Data_Provider() throws Exception {
		 confiq=new Confiq_Data_Provider();
		 excel=new Excel_Data_Provider();	   
	}
	
	
	@BeforeMethod
	public void openbrowser() throws Exception {
	
	//	System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
       	//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://fosrocfsguat.hspldms.com");
		
		driver.manage().window().maximize();
		ObjectRepo.driver = driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
