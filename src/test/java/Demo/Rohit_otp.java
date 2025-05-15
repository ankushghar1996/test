package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Rohit_otp {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testOtpFlowAndRetailerInfo() throws Exception {
        String mobileNumber = "9145854515";

        // Login
        driver.get("https://fosrocfsguat.hspldms.com");
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("FSG-756");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
        Thread.sleep(1000);

        // Navigate
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//b[normalize-space()='New Retailer Status']")).click();
        Thread.sleep(1000);

        // Retailer Add
        driver.findElement(By.xpath("//img[@src='../../../../../assets/icons/common-icons/retailer-add.svg']")).click();
        Thread.sleep(1000);
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
            enterRetailerInfo();
        } else {
            System.out.println("❌ OTP not found.");
        }
    }

    // ✅ New method for entering Retailer Info
    private void enterRetailerInfo() throws InterruptedException {
    	
        System.out.println("Entering Retailer Info...");
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Retailer Firm Name/Outlet Name']")).sendKeys("abc");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//div[@class='ng-input']/input[@type='text']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//span[normalize-space()='Paint']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//label[contains(text(),'Route')]/following::div[contains(@class,'ng-input')][1]/input")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//span[normalize-space()='Karve Nagar']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("xyz");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("pqr");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("tuv");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//ng-select[@bindvalue='TownId']//input[@type='text']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//span[normalize-space()='Amravati']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("441601");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("4416015645646");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("tuv");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']")).sendKeys("tuv");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//span[normalize-space()='Silver']")).click();
        Thread.sleep(1000);
        
        
   //     driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
        Thread.sleep(1000);
        
        
        
        
        
        
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

            String query = "select * from RegistrationPendingMaster where MobileNo=9145854515";
            
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
