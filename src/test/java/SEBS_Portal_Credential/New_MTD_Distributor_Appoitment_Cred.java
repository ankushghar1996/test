package SEBS_Portal_Credential;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_MTD_Distributor_Appoitment_Cred {

	
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
    	
        String mobileNumber = "7447852010";

        // Login
        driver.get("https://fosrocsebsuat.hspldms.com/");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_01", "Enter User Name", () -> {
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SEBS-009");});
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_02", "Enter Password", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");});
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_03", "Click on Login Button ", () -> {
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();});
        Thread.sleep(1000);

        // Navigate
//        driver.findElement(By.xpath("(//i[@class='fa fa-bars'])[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//span[@class='canvas-title ms-4 fs-16'][normalize-space()='New Distributor Appointment']")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
//        Thread.sleep(1000);
        
        
        // Retailer Add
      
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_04", "Click on MTD BUtton on dashboard ", () -> {
        driver.findElement(By.xpath("(//span[@class='stats-title-text fs-13 bg-gray toggle-bg-gray'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_05", "Click on New Distributor Appointment ", () -> {
        driver.findElement(By.xpath("(//i[@class='fa fa-chevron-right'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_06", "Click on Add Icon ", () -> {
        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_07", "Enter Mobile Number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_08", "SEND OTP ", () -> {
        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();});
        Thread.sleep(3000);
        
        String otp = getOtpFromDb(mobileNumber);

        if (otp != null) {
            System.out.println("OTP fetched: " + otp);
            ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_09", "Enter OTP ", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);});
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_10", "Click Continue Button", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();});
            Thread.sleep(2000);

            // ✅ Call Retailer Info method
            AddDistributorInfo();
        } else {
            System.out.println("❌ OTP not found.");
        }
    }

    // ✅ New method for entering Retailer Info
    private void AddDistributorInfo() throws InterruptedException {
    	
        System.out.println("Add Distributor Info...");
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_11", "Click on Distributor Code", () -> {
        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']//input[@type='text']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_12", "Click on SFA Name ", () -> {
        driver.findElement(By.xpath("//span[contains(text(),'New Annapurna')]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_13", "Click on Distributor Area ", () -> {
        driver.findElement(By.xpath("//ng-select[@bindvalue='BeatCode']//input[@type='text']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_14", "Click on Distributor Area Name", () -> {
        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_15", "Click on SE Area ", () -> {
        driver.findElement(By.xpath("//ng-select[@bindvalue='AreaId']//input[@type='text']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_16", "Click on SE Area Name ", () -> {
        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_17", "Send  Distributor Firm Name ", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Distributor Firm Name']")).sendKeys("vinay enterprises");});
        Thread.sleep(1000);
        
       /* 
        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//select[@formcontrolname='DistributorCategory']/option[contains(text(), 'None']")).click();
        Thread.sleep(1000);
       */
       
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_018", "Send  Distributor Category", ()-> {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@formcontrolname='DistributorCategory']")));
        dropdown.click();

        Select select = new Select(dropdown);
        select.selectByVisibleText("None"); });
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_019", "Enter Contact Person Name", ()-> { 
        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("Vinay Thakur");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_020", "Enter Contact Number", ()-> {  
        WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Contact Number']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_021", "Enter Email Address", ()-> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinay1234@gmail.com");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_022", "Enter Address Line1", ()-> { 
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_023", "Enter Address Line2", ()-> { 
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Mata Mandir Chowk");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_024", "Click on state Dropdown", ()-> {  
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_025", "Select state", ()-> { 
        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Maharashtra']")).click();});
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
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_026", "Click On city Dropdown", ()-> {
        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_027", "Select City From Dropdown", ()-> { 
        driver.findElement(By.xpath("//div[contains(@class, 'ng-option') and @role='option']//span[contains(@class, 'ng-option-label ng-star-inserted') and normalize-space()='Ahmednagar']")).click(); });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_028", "Enter Pin Code", ()-> { 
        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_029", "Enter Pan Number", ()-> {  
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DAQUS4445J");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_030", "Enter GST Number", ()-> {
        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");});
        Thread.sleep(1000);
        
        WebElement scroll1 = driver.findElement(By.xpath("//label[contains(text(),'Total Business In Construction Chemicals (In lakhs')]"));
    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_031", "Enter Total Business In CC (In lakhs)", ()-> {  
        driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Total Business In CC (In lakhs)')]")).sendKeys("123456");});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_032", "Click on Distributor class", ()-> { 
        driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_033", "Select Distributor Class", ()-> {
        driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']//option[text()='Silver ']")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_034", "Click on camera button", ()-> { 
        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_MTDAppointment_TC_035", "Select camera  and capture", ()-> {
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
        });

        Thread.sleep(5000);
        // Wait for the Capture button and click it
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_DIST_APPOINTMENT_TC_035", "Select camera  and capture", ()-> {
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            WebElement captureBtn = wait2.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//button[@class='capture-button'])[3]")));
            captureBtn.click();
            System.out.println("Capture button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Capture button not found or not clickable.");
        }
        });
        Thread.sleep(5000);
    
        
   //     driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
     //   Thread.sleep(1000);
        
        
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

            String query = "select * from RegistrationPendingMaster where MobileNo=7447852010";
            
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
