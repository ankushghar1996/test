package FSG_Portal_Credential;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Market_PJP_New_Retailer_Creation {

	
	WebDriver driver;

	
	@BeforeSuite
    public void setupSuite() {
		
        ObjectRepo.initializeReport();  // Important: Initializes the Extent report
        
        
    }
	
	
	
    @BeforeClass
    public void setUp() {
        
    	WebDriverManager.chromedriver().setup();
    	
    //	System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ObjectRepo.driver = driver;
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testOtpFlowAndRetailerInfo() throws Exception {
        String mobileNumber = "9040526630";

        // Login
        driver.get("https://fosrocfsguat.hspldms.com");
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_01", "Verify that user should be send FSG User Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("FSG-756");
        });
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_OTP_TC_02", "Verify that user should be send FSG Password.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
        });
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_03", "Verify that user should be click on Login Button.", () -> {
        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
        });
        Thread.sleep(1000);

        // Navigate
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_04", "Verify that user should be click on  Market Tab.", () -> {
        driver.findElement(By.xpath("//div[@routerlink='/market']")).click();
        });
        Thread.sleep(1000);
            
            
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_05", "Verify that user should be click on  PJP Retailers  Menu.", () -> {
        driver.findElement(By.xpath("//div[@class='col-6 fw-bold opacity-75 text-center market-tabs active-tab']")).click();
        });
        Thread.sleep(1000);

            
            // Retailer Add
         ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_06", "Verify that user should be click on Add button.", () -> {
         driver.findElement(By.xpath("//img[@src='../../../../../assets/icons/common-icons/retailer-add.svg']")).click();
         });
         Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_07", "Verify that user should be send Mobile Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_08", "Verify that user should be click on Send OTP Button.", () -> {
        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();
        });

        Thread.sleep(3000);
        String otp = getOtpFromDb(mobileNumber);

        if (otp != null) {
            System.out.println("OTP fetched: " + otp);
            
            
            ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_09", "Verify that user should be send OTP.", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
            });
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_10", "Verify that user should be click on Continue Button.", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
            });
            Thread.sleep(2000);

            // ✅ Call Retailer Info method
            enterRetailerInfo();
        } else {
            System.out.println("❌ OTP not found.");
        }
    }

    // ✅ New method for entering Retailer Info
    private void enterRetailerInfo() throws InterruptedException {
    	
        System.out.println("Entering Retailer Info...");
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_11", "Verify that user should be Enter Retailer Firm Name/Outlet Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Retailer Firm Name/Outlet Name']")).sendKeys("yogi Hardware");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_12", "Verify that user should be click on Retailer Category dropdown.", () -> {
        driver.findElement(By.xpath("//div[@class='ng-input']/input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_13", "Verify that user should be select Retailer in Retailer Category dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Paint']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_14", "Verify that user should be click on Route dropdown.", () -> {
        driver.findElement(By.xpath("//label[contains(text(),'Route')]/following::div[contains(@class,'ng-input')][1]/input")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_15", "Verify that user should be select Route in Route dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Karve Nagar']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_16", "Verify that user should be Enter Contact Person Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("virat kohli");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_17", "Verify that user should be Enter Email Address.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("virat123@gmail.com");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_18", "Verify that user should be Enter Address Line 1.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_19", "Verify that user should be click on City dropdown.", () -> {
        driver.findElement(By.xpath("//ng-select[@bindvalue='TownId']//input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_20", "Verify that user should be select city in City dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Amravati']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_21", "Verify that user should be Enter Pin Code.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("441601");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_22", "Verify that user should be Enter PAN Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DARDH4445K");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_23", "Verify that user should be Enter GST Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_24", "Verify that user should be Enter Total Business In CC.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']")).sendKeys("123456");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_25", "Verify that user should be click on Retailer class dropdown.", () -> {
        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_26", "Verify that user should be select Retailer class in Retailer class dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Silver']")).click();
        });
        Thread.sleep(1000);
        
        
        WebElement scroll3 = driver.findElement(By.xpath("//span[normalize-space()='Upload Document 1']"));
    	JavascriptExecutor jse3= (JavascriptExecutor)driver;
    	jse3.executeScript("arguments[0].scrollIntoView(true);", scroll3);
        Thread.sleep(1000);
        
        
        // ✅ Camera 1
        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_33", "Verify that user should be click on Camera 1.", () -> {
            By cam1 = By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[1]");
            WebElement camera1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cam1));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera1);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // Optional wait
            try {
                camera1.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("⚠️ Camera 1 click intercepted, trying JS click...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", camera1);
            }
        });
        Thread.sleep(1000); // Optional

        // ✅ Switch & Capture Camera 1
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]"))).click();
            System.out.println("Switch Camera button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Switch Camera button not clickable.");
        }
        Thread.sleep(2000);
        try {
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]"))).click();
            System.out.println("Capture button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Capture button not clickable.");
        }
        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_28", "Verify that user should be click on Camera 1 button.", () -> {
		        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[2]")).click();
		        });
		        Thread.sleep(1000);
		        


		        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Wait for the Switch Camera button and click it
		        try {
		            WebElement switchCamBtn = wait2.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//div[@class='switch-cam']//button[1]")));
		            switchCamBtn.click();
		            System.out.println("Switch Camera button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Switch Camera button not found or not clickable.");
		        }

		        Thread.sleep(2000);
		        // Wait for the Capture button and click it
		        try {
		            WebElement captureBtn = wait2.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("(//button[@class='capture-button'])[3]")));
		            captureBtn.click();
		            System.out.println("Capture button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Capture button not found or not clickable.");
		        }

		        
		        
		        Thread.sleep(3000);
		        
		        
		        
		        WebElement scroll2 = driver.findElement(By.xpath("//span[normalize-space()='Upload Shop Image']"));
		    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
		    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
		        Thread.sleep(1000);
		        
	        
	        
		        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_29", "Verify that user should be click on Camera 1 button.", () -> {
			        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[3]")).click();
			        });
			        Thread.sleep(1000);
			        


			        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));

			        // Wait for the Switch Camera button and click it
			        try {
			            WebElement switchCamBtn = wait3.until(ExpectedConditions.elementToBeClickable(
			                By.xpath("//div[@class='switch-cam']//button[1]")));
			            switchCamBtn.click();
			            System.out.println("Switch Camera button clicked.");
			        } catch (TimeoutException e) {
			            System.out.println("Switch Camera button not found or not clickable.");
			        }

			        Thread.sleep(2000);
			        // Wait for the Capture button and click it
			        try {
			            WebElement captureBtn = wait3.until(ExpectedConditions.elementToBeClickable(
			                By.xpath("(//button[@class='capture-button'])[3]")));
			            captureBtn.click();
			            System.out.println("Capture button clicked.");
			        } catch (TimeoutException e) {
			            System.out.println("Capture button not found or not clickable.");
			        }

			        
			        
			        Thread.sleep(3000);
        
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_27", "Verify that user should be click on SAVE button.", () -> {
       driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        });
        Thread.sleep(1000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("FSG_Market_PJP_New_Retailer_Creation_TC_27", "Verify that user should be click on Cancel button.", () -> {
//        driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
//        });
//        Thread.sleep(1000);
        
        
        
        
        
        
        // You can add more fields here as needed
    }

    
    
 private static String getOtpFromDb(String mobileNumber) {
    	
        String otp = null;

        String url = "jdbc:sqlserver://192.168.2.206:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "sqlservices";
        String password = "Pass@2025";

        try {
        	
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String query = "select * from RegistrationPendingMaster where MobileNo='9040526630'";
            
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
            	
                otp = rs.getString("otp");
                
            }
            conn.close();
            
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        }

        return otp;
        
    }
        
    

    @AfterClass
    public void tearDown() {
    	
        if (driver != null) {
        	
            driver.quit();
            
        }
    }
	
	
	
	
    @AfterSuite
    public void tearDownSuite() {
    	
    	
        ObjectRepo.finalizeReport();  // Flushes the report
        
        
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
