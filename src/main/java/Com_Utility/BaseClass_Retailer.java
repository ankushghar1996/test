package Com_Utility;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
 
public class BaseClass_Retailer {
 
    protected WebDriver driver;
    protected String mobileNumber = "7984984654";
    @BeforeSuite
    public void setUpExtentReport() {
        ObjectRepo.initializeReport();
    }
 
 
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://fosrocretaileruat.hspldms.com");
       // ObjectRepo.driver = driver;
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Get Started']")).click();
        Thread.sleep(1000);
 
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys(mobileNumber);
        Thread.sleep(1000);
 
        driver.findElement(By.xpath("//div[@class='text-center']//button[text()='CONTINUE ']")).click();
        Thread.sleep(1000);
 
        String otp = fetchOtpFromDB();
 
        if (otp != null) {
            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@id='otpOffcanvas']//button[text()='LOGIN ']")).click();
            Thread.sleep(2000);
        } else {
            System.out.println("OTP not found in DB.");
        }
    }
 
    public String fetchOtpFromDB() {
        String otp = null;
        try {
            String url = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
            String username = "Test_Team";
            String password = "Pass@2025";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT otp FROM RegistrationPendingMaster WHERE MobileNo = '" + mobileNumber + "'";
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
        public void tearDownExtentReport() {
            ObjectRepo.finalizeReport();
        }
 
    
}