package FSG_Portal_Credential;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Com_Utility.ObjectRepo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Retailer_cred_OTP {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        
    	WebDriverManager.chromedriver().setup();
    	
    //	System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testOtpFlowAndRetailerInfo() throws Exception {
        String mobileNumber = "9145854556";

        // Login
        driver.get("https://fosrocfsguat.hspldms.com");
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_01", "Verify that user should be send FSG User Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("FSG-756");
        });
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_02", "Verify that user should be send FSG Password.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
        });
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_03", "Verify that user should be click on Login Button.", () -> {
        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
        });
        Thread.sleep(1000);

        // Navigate
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_04", "Verify that user should be click on Option Menu Tab.", () -> {
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_05", "Verify that user should be click on New Retailer Status Menu.", () -> {
        driver.findElement(By.xpath("//b[normalize-space()='New Retailer Status']")).click();
        });
        Thread.sleep(1000);

        
        // Retailer Add
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_06", "Verify that user should be click on Add button.", () -> {
        driver.findElement(By.xpath("//img[@src='../../../../../assets/icons/common-icons/retailer-add.svg']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_07", "Verify that user should be send Mobile Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_08", "Verify that user should be click on Send OTP Button.", () -> {
        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();
        });

        Thread.sleep(3000);
        String otp = getOtpFromDb(mobileNumber);

        if (otp != null) {
            System.out.println("OTP fetched: " + otp);
            
            
            ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_09", "Verify that user should be send OTP.", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
            });
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_10", "Verify that user should be click on Continue Button.", () -> {
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
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_11", "Verify that user should be Enter Retailer Firm Name/Outlet Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Retailer Firm Name/Outlet Name']")).sendKeys("Vinay Paints and Hardware");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_12", "Verify that user should be click on Retailer Category dropdown.", () -> {
        driver.findElement(By.xpath("//div[@class='ng-input']/input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_13", "Verify that user should be select Retailer in Retailer Category dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Paint']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_14", "Verify that user should be click on Route dropdown.", () -> {
        driver.findElement(By.xpath("//label[contains(text(),'Route')]/following::div[contains(@class,'ng-input')][1]/input")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_15", "Verify that user should be select Route in Route dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Karve Nagar']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_16", "Verify that user should be Enter Contact Person Name.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("vinay the don");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_17", "Verify that user should be Enter Email Address.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinat123@gmail.com");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_18", "Verify that user should be Enter Address Line 1.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_19", "Verify that user should be click on City dropdown.", () -> {
        driver.findElement(By.xpath("//ng-select[@bindvalue='TownId']//input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_20", "Verify that user should be select city in City dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Amravati']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_21", "Verify that user should be Enter Pin Code.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("441601");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_22", "Verify that user should be Enter PAN Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("DARDH4445K");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_23", "Verify that user should be Enter GST Number.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_24", "Verify that user should be Enter Total Business In CC.", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC']")).sendKeys("123456");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_25", "Verify that user should be click on Retailer class dropdown.", () -> {
        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_26", "Verify that user should be select Retailer class in Retailer class dropdown.", () -> {
        driver.findElement(By.xpath("//span[normalize-space()='Silver']")).click();
        });
        Thread.sleep(1000);
        
        
        
   //     driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_New_Retailer_cred_OTP_TC_27", "Verify that user should be click on Cancel button.", () -> {
        driver.findElement(By.xpath("//button[normalize-space()='CANCEL']")).click();
        });
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

            String query = "select * from RegistrationPendingMaster where MobileNo=9145854556";
            
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
