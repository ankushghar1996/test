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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity_PJP_New_Retailer_Cred {

	
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        
	    	WebDriverManager.chromedriver().setup();
	    	
	    	
	   	 ChromeOptions options = new ChromeOptions();
	   	    options.addArguments("--use-fake-device-for-media-stream");
	   	    options.addArguments("--use-fake-ui-for-media-stream");
	   	    options.addArguments("--use-file-for-fake-video-capture=C:\\test\\sample-video.y4m"); // 👈 provide a real path

	   	    driver = new ChromeDriver(options);
	   	    driver.manage().window().maximize();
	   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	    
	   	    
	   	    
	    }

	    @Test
	    public void testOtpFlowAndRetailerInfo() throws Exception {
	        String mobileNumber = "8245854511";

	        // Login
	        driver.get("https://fosrocsecruat.hspldms.com/");
	        
	        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SECR-008");
	        
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
	        
	        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	        Thread.sleep(1000);

	        // Navigate
	        driver.findElement(By.xpath("//div[@routerlink='/activity']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@class='circle-add']")).click();
	        Thread.sleep(1000);

	        // Retailer Add
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
	        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();

	        Thread.sleep(3000);
	        String otp = getOtpFromDb(mobileNumber);

	        if (otp != null) {
	            System.out.println("OTP fetched: " + otp);
	            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
	            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
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
	        
	        
	        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Chiranth Agencies [10001]']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//span[normalize-space()='Aniket J']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//span[normalize-space()='Karve Nagar']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Retailer Firm Name/Outlet Name']")).sendKeys("Vinay Paints");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//select[@formcontrolname='RetailerCategory']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//option[text()='Hardware ']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("vinay shelke");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinay123@gmail.com");
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll = driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']"));
	    	JavascriptExecutor jse= (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(1000);
	        
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//ng-select[@class='gray-background-y ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-valid']//input[@type='text']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Maharashtra']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//span[normalize-space()='Ahmednagar']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411057");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DARDH4445K");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll1 = driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']"));
	    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']")).sendKeys("123456");
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("(//select[@formcontrolname='RetailerClass'])[1]")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//select[@formcontrolname='RetailerClass']/option[text()='Platinum ']")).click();
	        Thread.sleep(1000);
	        
	  
	        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();
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

	        Thread.sleep(5000);
	        // Wait for the Capture button and click it
	        try {
	            WebElement captureBtn = wait1.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//button[@class='capture-button'])[3]")));
	            captureBtn.click();
	            System.out.println("Capture button clicked.");
	        } catch (TimeoutException e) {
	            System.out.println("Capture button not found or not clickable.");
	        }

	        
	        
	        Thread.sleep(5000);
	        
	        
	        
	        //     driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
	         //    Thread.sleep(1000);
	             
	             
	       //      driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
	        //      Thread.sleep(1000);
	             
	        
	        
	        
	        
	        
	        // You can add more fields here as needed
	    }

	    
	    
	    private static String getOtpFromDb(String mobileNumber) {
	    	
	        String otp = null;

	        String url = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
	        String username = "Test_Team";
	        String password = "Pass@2025";

	        try {
	        	
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection conn = DriverManager.getConnection(url, username, password);
	            Statement stmt = conn.createStatement();

	            String query = "select * from RegistrationPendingMaster where MobileNo=8245854511";
	            
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
	
	
	
	
}
