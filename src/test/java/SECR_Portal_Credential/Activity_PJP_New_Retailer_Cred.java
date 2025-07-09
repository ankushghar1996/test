package SECR_Portal_Credential;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity_PJP_New_Retailer_Cred {

	
	 WebDriver driver;

	 
	 @BeforeSuite
     public void setupSuite() {
 		
         ObjectRepo.initializeReport();  // Important: Initializes the Extent report
         
         
     }
	 
	 
	 
	    @BeforeClass
	    public void setUp() {
	        
	    	WebDriverManager.chromedriver().setup();
	    	
	    	
	   	 ChromeOptions options = new ChromeOptions();
	   	    options.addArguments("--use-fake-device-for-media-stream");
	   	    options.addArguments("--use-fake-ui-for-media-stream");
	   	    options.addArguments("--use-file-for-fake-video-capture=C:\\test\\sample-video.y4m"); // 👈 provide a real path

	   	    driver = new ChromeDriver(options);
	   	    driver.manage().window().maximize();
	   	    
	   	 ObjectRepo.driver = driver;
	   	    
	   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	    
	   	    
	   	    
	    }

	    @Test
	    public void testOtpFlowAndRetailerInfo() throws Exception {
	        String mobileNumber = "8245854468";

	        // Login
	        driver.get("https://fosrocsecruat.hspldms.com/");
	        ObjectRepo.driver = driver;
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_01", "Verify that user should be send SECR User Name.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SECR-008");
	        });
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_02", "Verify that user should be SECR send Password.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
	        });
	        
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_03", "Verify that user should be click on Continue Button.", () -> {
	        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	        });
	        Thread.sleep(1000);

	        // Navigate
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_04", "Verify that user should be click on Activity Menu Tab.", () -> {
	        driver.findElement(By.xpath("//div[@routerlink='/activity']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_05", "Verify that user should be click on Activity Add Button.", () -> {
	        driver.findElement(By.xpath("//div[@class='circle-add']")).click();
	        });
	        Thread.sleep(1000);

	        
	        // Retailer Add
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_06", "Verify that user should be send Mobile Number.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
	        });
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_07", "Verify that user should be click on Send OTP Button.", () -> {
	        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();
	        });
	        

	        Thread.sleep(3000);
	        String otp = getOtpFromDb(mobileNumber);

	        if (otp != null) {
	            System.out.println("OTP fetched: " + otp);
	            
	            ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_08", "Verify that user should be send OTP.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
	            });
	            
	            
	            ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_09", "Verify that user should be click on Continue Button.", () -> {
	            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
	            });
	            Thread.sleep(2000);

	            // ✅ Call Retailer Info method
	            NewRetailerInfo();
	        } else {
	            System.out.println("❌ OTP not found.");
	        }
	    }

	    // ✅ New method for entering Retailer Info
	    private void NewRetailerInfo() throws InterruptedException {
	    	
	        System.out.println("Entering New Retailer Info...");
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_11", "Verify that user should be click on Distributor dropdown.", () -> {
	        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_12", "Verify that user should be select Distributor in Distributordropdown.", () -> { 
	        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Chiranth Agencies [10001]']")).click();
	    });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_13", "Verify that user should be click on FSG Name dropdown.", () -> {
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_14", "Verify that user should be select FSG in FSG Name dropdown.", () -> { 
	        driver.findElement(By.xpath("//span[normalize-space()='Aniket J']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_15", "Verify that user should be click on Route dropdown.", () -> {
	        driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_16", "Verify that user should be select Route in Route dropdown.", () -> {
	        driver.findElement(By.xpath("//span[normalize-space()='Karve Nagar']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_17", "Verify that user should be enter Firm Name.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Retailer Firm Name/Outlet Name']")).sendKeys("ramesh hardware");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_18", "Verify that user should be click on Retailer Category dropdown.", () -> {
	        driver.findElement(By.xpath("//select[@formcontrolname='RetailerCategory']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_19", "Verify that user should be select Retailer in Retailer Category dropdown.", () -> {
	        driver.findElement(By.xpath("//option[text()='Hardware ']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_20", "Verify that user should be enter Contact Person Name.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("Abhi shelke");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_21", "Verify that user should be enter Email Address.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinay123@gmail.com");
	        });
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll = driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']"));
	    	JavascriptExecutor jse= (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_22", "Verify that user should be enter Address Line 1.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_23", "Verify that user should be click on State dropdown.", () -> {
	        driver.findElement(By.xpath("//ng-select[@class='gray-background-y ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-valid']//input[@type='text']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_24", "Verify that user should be select State in State dropdown.", () -> {
	        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Maharashtra']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_25", "Verify that user should be click on City dropdown.", () -> {
	        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_26", "Verify that user should be select City in City dropdown.", () -> {
	        driver.findElement(By.xpath("//span[normalize-space()='Ahmednagar']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_27", "Verify that user should be enter Pin Code.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411057");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_28", "Verify that user should be enter PAN Number.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DARDH4445K");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_29", "Verify that user should be enter GST Number.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");
	        });
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll1 = driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']"));
	    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_30", "Verify that user should be enter Total Business In CC.", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']")).sendKeys("123456");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_31", "Verify that user should be click on RetailerClass dropdown.", () -> {
	        driver.findElement(By.xpath("(//select[@formcontrolname='RetailerClass'])[1]")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_32", "Verify that user should be select Retailer in RetailerClass dropdown.", () -> {
	        driver.findElement(By.xpath("//select[@formcontrolname='RetailerClass']/option[text()='Platinum ']")).click();
	        });
	        Thread.sleep(1000);
	        
	  
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_33", "Verify that user should be click on Camera 1 button.", () -> {
	        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();
	        });
	        Thread.sleep(1000);
	        


	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for the Switch Camera button and click it
	        try {
	            WebElement switchCamBtn = wait1.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//div[@class='switch-cam']//button[1]")));
	            switchCamBtn.click();
	            System.out.println("Switch Camera button clicked.");
	        } catch (TimeoutException e) {
	            System.out.println("Switch Camera button not found or not clickable.");
	        }

	        Thread.sleep(2000);
	        // Wait for the Capture button and click it
	        try {
	            WebElement captureBtn = wait1.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//button[@class='capture-button'])[3]")));
	            captureBtn.click();
	            System.out.println("Capture button clicked.");
	        } catch (TimeoutException e) {
	            System.out.println("Capture button not found or not clickable.");
	        }

	        
	        
	        Thread.sleep(4000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_34", "Verify that user should be click on Camera 1 button.", () -> {
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

		        
		        
		        Thread.sleep(4000);
		        
		        
		        
		        WebElement scroll2 = driver.findElement(By.xpath("//span[normalize-space()='Upload Shop Image']"));
		    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
		    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
		        Thread.sleep(1000);
		        
	        
	        
		        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_34", "Verify that user should be click on Camera 1 button.", () -> {
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

			        
			        
			        Thread.sleep(4000);
	        
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_Activity_PJP_New_Retailer_Cred_TC_34", "Verify that user should be click on yes btn.", () -> {
	            driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
	        });
	         //    Thread.sleep(1000);
	             
	             
	       //      driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
	        //      Thread.sleep(1000);
	             
	        
	        
	        
	        
	        
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
	 
	            String query = "select * from RegistrationPendingMaster where MobileNo='8585906050'";
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
