package SEBS_Portal_Credential;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Distributor_Appointment {
	
	 	WebDriver driver;

	 	
	 	 @BeforeSuite
	     public void setupSuite() {
	 		
	         ObjectRepo.initializeReport();  // Important: Initializes the Extent report
	         
	         
	     }
	 	
	 	
	    @BeforeClass
	    public void setUp() {
	        
	    	WebDriverManager.chromedriver().setup();

	         ChromeOptions options = new ChromeOptions();
	         options.addArguments("--use-fake-ui-for-media-stream"); // ✅ use real camera, auto-accept permissions

	         // ❌ Do not use this if you want real webcam
	         // options.addArguments("--use-file-for-fake-video-capture=C:\\test\\sample-video.y4m");

	         options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	         options.setExperimentalOption("useAutomationExtension", false);
	         options.addArguments("start-maximized");

	         // ✅ FIX: Assign directly to the class-level driver
	         driver = new ChromeDriver(options);
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	         ObjectRepo.driver = driver; // Store driver in central repo
	        
	    }
	    

	    @Test
	    public void testOtpFlowAndRetailerInfo() throws Exception {
	    	
	        String mobileNumber = "9082956709";

	        // Login
	        
	        driver.get("https://fosrocsebsuatlocal.hspldms.com");
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC01", "Send Username", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SEBS-009");
	        });
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC02", "Send Password", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
	        });
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC03", "Click Submit Button", () -> {
	        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click(); });
	        Thread.sleep(1000);

	        // Navigate
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC04", "Click menu", () -> {
	        driver.findElement(By.xpath("(//i[@class='fa fa-bars'])[1]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC05", "Click New Distributor Appointment", () -> {
	        driver.findElement(By.xpath("//span[@class='canvas-title ms-4 fs-16'][normalize-space()='New Distributor Appointment']")).click();});
	        Thread.sleep(1000);

	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC06", "Click button", () -> {
	        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();});
	        Thread.sleep(1000);
	        
	        
	        // Retailer Add
	      
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC07", "Enter Mobile Number", () -> {
	            WebElement mobileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//input[@placeholder='Enter Mobile Number']")));
	            mobileInput.sendKeys(mobileNumber);
	        });

	        Thread.sleep(1000);
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC08", "Click SEND OTP button", () -> {
	        WebElement sendOtpBtn =   driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']"));
	        sendOtpBtn.click();
	        });

	        
	        // Small wait to allow backend to generate OTP
	        Thread.sleep(3000);  // You can later replace this with a polling mechanism

	        String otp = getOtpFromDb(mobileNumber);

	        if (otp != null) {
	            ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC09", "Enter OTP and click CONTINUE", () -> {
	                System.out.println("OTP fetched: " + otp);
	                
	                WebElement otpInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//input[@placeholder='Enter OTP']")));
	                otpInput.sendKeys(otp);

	                
	                WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath("//button[normalize-space()='CONTINUE']")));
	                continueBtn.click();
	            });

	            Thread.sleep(2000); // optional wait after navigation
	            AddDistributorInfo();

	        } else {
	            System.out.println("❌ OTP not found.");
	        }

	    }
	    
	    // ✅ New method for entering Retailer Info
	    
	    private void AddDistributorInfo() throws InterruptedException {
	    	
	        System.out.println("Add Distributor Info...");
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_010", "Click on Distributor Code", () -> {
	        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']//input[@type='text']")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_011", "Click on SFA Name ", () -> {
	        driver.findElement(By.xpath("//span[contains(text(),'New Annapurna')]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_012", "Click on Distributor Area ", () -> {
	        driver.findElement(By.xpath("//ng-select[@bindvalue='BeatCode']//input[@type='text']")).click(); });
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_013", "Click on Distributor Area Name", () -> {
	        driver.findElement(By.xpath("//span[contains(text(),'Koregaon Park')]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_014", "Click on SE Area ", () -> {
	        driver.findElement(By.xpath("//ng-select[@bindvalue='AreaId']//input[@type='text']")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_015", "Click on SE Area Name ", () -> {
	        driver.findElement(By.xpath("//span[contains(text(),'Pune')]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_016", "Send  Distributor Firm Name ", () -> {
	        driver.findElement(By.xpath("//input[@placeholder='Enter Distributor Firm Name']")).sendKeys("pranamaya enterprises");});
	        Thread.sleep(1000);
	        
	       /* 
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']")).click();
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']/option[contains(text(), 'None']")).click();
	        Thread.sleep(1000);
	       */
	        
	      ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_017", "Send  Distributor Category", ()-> {   
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@formcontrolname='DistributorCategory']")));
	        dropdown.click();

	        Select select = new Select(dropdown);
	        select.selectByVisibleText("None");});

	        
	      ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_018", "Enter Contact Person Name", ()-> {     
	        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("sahil Thakur");});
	        Thread.sleep(1000);
	        
	       ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_019", "Enter Contact Number", ()-> {  
	        WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Contact Number']"));
	    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll); });
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_020", "Enter Email Address", ()-> {   
	        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinay1234@gmail.com");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_021", "Enter Address Line1", ()-> {  
	        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_022", "Enter Address Line2", ()-> {  
	        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Mata Mandir Chowk");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_023", "Click on state Dropdown", ()-> {  
	        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_024", "Select state", ()-> {  
	        driver.findElement(By.xpath("(//span[contains(text(),'Maharashtra')])[2]")).click();});
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
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_025", "Click On city Dropdown", ()-> {  
	        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_026", "Select City From Dropdown", ()-> {  
	        driver.findElement(By.xpath("(//span[contains(text(),'Ahmednagar')])[1]")).click();});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_027", "Enter Pin Code", ()-> {  
	        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_028", "Enter Pan Number", ()-> {  
	        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DAQUS4445J");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_029", "Enter GST Number", ()-> {  
	        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");});
	        Thread.sleep(1000);
	        
	        
	        WebElement scroll1 = driver.findElement(By.xpath("//label[contains(text(),'Total Business In Construction Chemicals (In lakhs')]"));
	    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
	    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll1);
	        Thread.sleep(1000);
	        
	       
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_030", "Enter Total Business In CC (In lakhs)", ()-> {  
	        driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Total Business In CC (In lakhs)')]")).sendKeys("123456");});
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_031", "Click on Distributor class", ()-> {  
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']")).click(); });
	        Thread.sleep(1000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_032", "Select Distributor Class", ()-> {  
	        driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']//option[text()='Silver ']")).click();});
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

		        // ✅ Camera 2
		        WebElement scroll3 = driver.findElement(By.xpath("//span[normalize-space()='Upload Document 2']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll3);
		        Thread.sleep(1000); // Optional

		        //Click cam 2
		        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_34", "Verify that user should be click on Camera 2.", () -> {
		            By cam2 = By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[2]");
		            WebElement camera2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cam2));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera2);
		            try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // Optional
		            try {
		                camera2.click();
		            } catch (ElementClickInterceptedException e) {
		                System.out.println("⚠️ Camera 2 click intercepted, trying JS click...");
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", camera2);
		            }
		        });
		        Thread.sleep(1000);

		        // ✅ Switch & Capture Camera 2
		        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        try {
		            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]"))).click();
		            System.out.println("Switch Camera button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Switch Camera button not clickable.");
		        }
		        Thread.sleep(2000);
		        try {
		            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]"))).click();
		            System.out.println("Capture button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Capture button not clickable.");
		        }
		        Thread.sleep(1000);

		        // ✅ Camera 3
		        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_35", "Verify that user should be click on Camera 3.", () -> {
		            By cam3 = By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[3]");
		            WebElement camera3 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cam3));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera3);
		            try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // Optional
		            try {
		                camera3.click();
		            } catch (ElementClickInterceptedException e) {
		                System.out.println("⚠️ Camera 3 click intercepted, trying JS click...");
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", camera3);
		            }
		        });
		        Thread.sleep(1000);

		        // ✅ Switch & Capture Camera 3
		        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        try {
		            wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]"))).click();
		            System.out.println("Switch Camera button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Switch Camera button not clickable.");
		        }
		        Thread.sleep(2000);
		        try {
		            wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]"))).click();
		            System.out.println("Capture button clicked.");
		        } catch (TimeoutException e) {
		            System.out.println("Capture button not clickable.");
		        }

		        // ✅ SAVE BUTTON - Wait until modal disappears, then proceed
		        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_36", "Verify that user should be click on Save Button.", () -> {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		            int retries = 0;
		            while (retries < 10) {
		                try {
		                    // ✅ Check if modal disappeared
		                    if (driver.findElements(By.xpath("//div[contains(@class,'modal-body')]")).isEmpty()) break;
		                    if (wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'modal-body')]")))) break;
		                } catch (Exception e) {
		                    break; // Already gone
		                }
		                try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} // ⏳ Wait before rechecking
		                retries++;
		            }

		            // ✅ Proceed with SAVE
		            WebElement saveBtn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[normalize-space()='SAVE']")));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveBtn);
		            try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // Optional

		            try {
		                saveBtn.click();
		            } catch (ElementClickInterceptedException e) {
		                System.out.println("⚠️ Save button click intercepted, trying JS click...");
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
		            }
		        });

		        Thread.sleep(4000); // Final wait

	        
	        
	//        driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
	   //     Thread.sleep(1000);
	        
	        
	        
	        
	        
	        
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

	            String query = "select * from RegistrationPendingMaster where MobileNo='9082956709'";
	            
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
