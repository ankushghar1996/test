package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

    WebDriver driver;

    // Test Data
    String mobileNumber = "9678412542";
    String distributorName = "vinay enterprises";
    String pinCode = "411041";
    String panNumber = "DAQUS4445J";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-device-for-media-stream");
        options.addArguments("--use-fake-ui-for-media-stream");
        options.addArguments("--use-file-for-fake-video-capture=C:\\test\\sample-video.y4m");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testOtpFlowAndRetailerInfoWithDbValidation() throws Exception {
        // Step 1: OTP + Form Fill
        driver.get("https://fosrocsecruat.hspldms.com/");
        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SECR-008");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//i[@class='fa fa-bars'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='New Distributor Appointment'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='common-footer-text']")).click();
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

            // Fill Form
            fillDistributorForm();

            // ✅ Optional: SAVE the form if needed
            // driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
            // Thread.sleep(2000);

            // Step 2: Verify saved data in DB
            verifyDistributorDataInDb(distributorName, pinCode, panNumber);
        } else {
            System.out.println("❌ OTP not found.");
        }
    }

    private void fillDistributorForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//ng-select[@bindvalue='DistributorCode']//input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'New Annapurna')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ng-select[@bindvalue='BeatCode']//input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ng-select[@bindvalue='AreaId']//input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Enter Distributor Firm Name*']")).sendKeys(distributorName);
        Thread.sleep(1000);

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@formcontrolname='DistributorCategory']")));
        Select select = new Select(dropdown);
        select.selectByVisibleText("None");

        driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Name']")).sendKeys("Vinay Thakur");
        
        WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Contact Number']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("vinay1234@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("civil lines");

        driver.findElement(By.xpath("//ng-select[@bindlabel='StateName']//input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Maharashtra']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@class, 'ng-option') and @role='option']//span[contains(@class, 'ng-option-label ng-star-inserted') and normalize-space()='Ahmednagar']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys(pinCode);
        driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys(panNumber);
        driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("29AAACC1206D2ZB");

        
        WebElement scroll1 = driver.findElement(By.xpath("//*[normalize-space(text())='Total Business In Construction Chemicals (In lakhs)']"));
    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
        
        
//        WebElement scroll = driver.findElement(By.xpath("//*[normalize-space(text())='Total Business In Construction Chemicals (In lakhs)']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
//        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Enter Total Business In CC (In lakhs)']")).sendKeys("123456");

        driver.findElement(By.xpath("//select[@formcontrolname='DistributorClass']")).click();
        driver.findElement(By.xpath("//option[text()='Silver ']")).click();

        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[1]")).click();

        try {
            WebElement switchCamBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]")));
            switchCamBtn.click();
            System.out.println("Switch Camera button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Switch Camera button not found.");
        }

        try {
            WebElement captureBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]")));
            captureBtn.click();
            System.out.println("Capture button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Capture button not found.");
        }
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        
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

            String query = "SELECT otp FROM RegistrationPendingMaster WHERE MobileNo = 9678412542";
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

    private void verifyDistributorDataInDb(String name, String pincode, String pan) {
        String url = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "Test_Team";
        String password = "Pass@2025";

        boolean matchFound = false;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM DistributorMaster WHERE DistributorFirmName = 'vinay enterprises'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String dbPin = rs.getString("PinCode");
                String dbPan = rs.getString("PANNo");

                if (pincode.equals(dbPin) && pan.equals(dbPan)) {
                    System.out.println("✅ DB Verification Passed: Data matched.");
                    matchFound = true;
                    break;
                }
            }

            if (!matchFound) {
                System.out.println("❌ DB Verification Failed: No matching data found.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
