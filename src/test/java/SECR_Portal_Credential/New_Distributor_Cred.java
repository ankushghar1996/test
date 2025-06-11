package SECR_Portal_Credential;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Distributor_Cred {

	
	
	 	WebDriver driver;

	 	
	 	@BeforeSuite
	     public void setupSuite() {
	 		
	         ObjectRepo.initializeReport();  // Important: Initializes the Extent report
	         
	         
	     }
	 	
	 	
	 	
	 	
	 	@BeforeMethod
	    public void setUp() {
	        
	    	WebDriverManager.chromedriver().setup();
	    	
	    	
	    	 ChromeOptions options = new ChromeOptions();
	    	    options.addArguments("--use-fake-device-for-media-stream");
	    	    options.addArguments("--use-fake-ui-for-media-stream");
	    	    options.addArguments("--use-file-for-fake-video-capture=C:\\test\\sample-video.y4m"); // 👈 provide a real path

	    	    driver = new ChromeDriver(options);
	    	    driver.manage().window().maximize();
	    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	    // Login
		        driver.get("https://fosrocsecruat.hspldms.com/");
		        
	    	    ObjectRepo.driver = driver;
	    	   
	        
	    }
	    

	 	@Test
	 	public void testOtpFlowAndRetailerInfo() throws Exception {
	 	    
	 	    String mobileNumber = "8678412403";
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_01", "Verify that user should be send SECR User Name.", () -> {
	 	        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SECR-008");
	 	    });
	 	    Thread.sleep(1000);
	 	  
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_02", "Verify that user should be SECR send Password.", () -> {
	 	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_03", "Verify that user should be click on Continue Button.", () -> {
	 	        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_04", "Verify that user should be select Options Menu.", () -> {
	 	        driver.findElement(By.xpath("(//i[@class='fa fa-bars'])[1]")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_05", "Verify that user should be select New Distributor Appointment Menu.", () -> {
	 	        driver.findElement(By.xpath("//span[@class='canvas-title ms-4 fs-16'][normalize-space()='New Distributor Appointment']")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_06", "Verify that user should be click on Add Distributor button.", () -> {
	 	        driver.findElement(By.xpath("//span[@class='common-footer-text']")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_07", "Verify that user should be send Mobile Number.", () -> {
	 	        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_08", "Verify that user should be click on Send OTP Button.", () -> {
	 	        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();
	 	    });
	 	    Thread.sleep(3000);
	 	    
	 	    
	 	    String otp = getOtpFromDb(mobileNumber);

	 	    if (otp != null) {
	 	        System.out.println("OTP fetched: " + otp);
	 	        
	 	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_09", "Verify that user should be send OTP.", () -> {
	 	            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
	 	        });
	 	        Thread.sleep(1000);
	 	        
	 	        
	 	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_10", "Verify that user should be click on Continue Button.", () -> {
	 	            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
	 	        });
	 	        Thread.sleep(2000);

	 	        
	 	        // Call Retailer Info method
	 	        AddDistributorInfo();
	 	    } else {
	 	        System.out.println("❌ OTP not found.");
	 	    }
	 	}

	 // New method for entering Retailer Info, fully wrapped in ObjectRepo calls

	 	private void AddDistributorInfo() throws InterruptedException {
	 		
	 	    System.out.println("Add Distributor Info...");

	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_11", "Verify that user should be click on SFA dropdown.", () -> {
	 	        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']//input[@type='text']")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_12", "Verify that user should be select SFA in SFA dropdown.", () -> {
	 	        driver.findElement(By.xpath("//span[contains(text(),'New Annapurna')]")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_13", "Verify that user should be click on SFA Area dropdown.", () -> {
	 	        driver.findElement(By.xpath("//ng-select[@bindvalue='BeatCode']//input[@type='text']")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_14", "Verify that user should be select SFA Area in SFA Area dropdown.", () -> {
	 	        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_15", "Verify that user should be click on SE Area dropdown.", () -> {
	 	        driver.findElement(By.xpath("//ng-select[@bindvalue='AreaId']//input[@type='text']")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_16", "Verify that user should be select SE in SE Area dropdown.", () -> {
	 	        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_17", "Verify that user should be send Distributor Firm Name.", () -> {
	 	        driver.findElement(By.xpath("//input[@placeholder='Enter Distributor Firm Name*']")).sendKeys("vansh Thakur Enterprises and sons");
	 	    });
	 	    Thread.sleep(1000);
	        
	 	    
	       /* 
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']/option[contains(text(), 'None']")).click();
	        Thread.sleep(1000);
	       */
	        
	        
	 	   ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_18", "Verify that user should be click on Distributor Category in Distributor Category dropdown.", () -> {
	 	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@formcontrolname='DistributorCategory']")));
	 	        dropdown.click();
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_19", "Verify that user should be select Distributor Category.", () -> {
	 	        Select select = new Select(driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']")));
	 	        select.selectByVisibleText("None");
	 	    });
	 	    Thread.sleep(1000);
	 	    
	 	    
	 	    ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_20", "Verify that user should be send Contact Person Name.", () -> {
	 	        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("Pratik Thakur");
	 	    });
	 	    Thread.sleep(1000);
	        
	        
	        WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Contact Number']"));
	    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_21", "Verify that user should be send Email Address.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("rahul1234@gmail.com");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_22", "Verify that user should be send Address Line 1.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_23", "Verify that user should be click on State in State dropdown.", () -> {
	            driver.findElement(By.xpath("//ng-select[@class='gray-background-y ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-valid']//input[@type='text']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_24", "Verify that user should be select State.", () -> {
	            driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Maharashtra']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	       
	     // Step 1: Click to open the dropdown
	     /*
	        WebElement dropdown1 = driver.findElement(By.xpath("//ng-select[@bindlabel='StateName']"));
	        dropdown1.click();

	        // Step 2: Wait until the desired option is visible (e.g., "Maharashtra")
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement option1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//span[contains(text(), 'Maharashtra')]")
	        ));

	        // Step 3: Click on the option
	        option1.click();

	        */
	       
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_25", "Verify that user should be click on City in City dropdown.", () -> {
	            driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_26", "Verify that user should be select City.", () -> {
	            driver.findElement(By.xpath("//div[contains(@class, 'ng-option') and @role='option']//span[contains(@class, 'ng-option-label ng-star-inserted') and normalize-space()='Ahmednagar']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_27", "Verify that user should be send Pin Code.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_28", "Verify that user should be send PAN Number.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DAQUS4445J");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_29", "Verify that user should be send GST Number.", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("23AABCD1234E1Z5");
	        });
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll1 = driver.findElement(By.xpath("//*[normalize-space(text())='Total Business In Construction Chemicals (In lakhs)']"));
	    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
	    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll1);
	        Thread.sleep(1000);
	        
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_30", "Verify that user should be send Total Business In CC (In lakhs).", () -> {
	            driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC (In lakhs)']")).sendKeys("123456");
	        });
	        Thread.sleep(1000);

	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_31", "Verify that user should be click on DistributorClass in DistributorClass dropdown.", () -> {
	            driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']")).click();
	        });
	        Thread.sleep(1000);

	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_32", "Verify that user should be select DistributorClass.", () -> {
	            driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']//option[text()='Silver ']")).click();
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_33", "Verify that user should be click on Camera 1.", () -> {
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
	        
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll3 = driver.findElement(By.xpath("//span[normalize-space()='Upload Document 2']"));
	    	JavascriptExecutor jse3= (JavascriptExecutor)driver;
	    	jse3.executeScript("arguments[0].scrollIntoView(true);", scroll3);
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_34", "Verify that user should be click on Camera 2.", () -> {
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
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_35", "Verify that user should be click on Camera 3.", () -> {
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

	        Thread.sleep(5000);
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
	    
	        
	        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_36", "Verify that user should be click on Save Button.", () -> {
	            driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
	        });
	  
	        
	//        driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
	   //     Thread.sleep(1000);
	        
	        
	        
	        
	        
	        
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

	            String query = "select * from RegistrationPendingMaster where MobileNo=8678412403";
	            
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

	    @AfterMethod
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
