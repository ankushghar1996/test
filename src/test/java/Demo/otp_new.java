package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class otp_new {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\COde\\test\\FOSROC_Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open site and login
        driver.get("https://fosrocfsguat.hspldms.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("FSG-756");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Fosroc@1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
        Thread.sleep(1000);

        // Navigate to New Retailer Status
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//b[normalize-space()='New Retailer Status']")).click();
        Thread.sleep(1000);

        // Start adding retailer
        driver.findElement(By.xpath("//img[@src='../../../../../assets/icons/common-icons/retailer-add.svg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9403582530");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='SEND OTP']")).click();

        // Wait for OTP generation
        Thread.sleep(3000);

        // Fetch OTP from DB
        String otp = getOtpFromDb("9403582530");

        // Enter OTP and continue
        if (otp != null) {
            System.out.println("OTP retrieved: " + otp);
            driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
        } else {
            System.out.println("OTP is null. Check DB or OTP generation.");
            driver.quit();
        }
    }

    // JDBC method to fetch OTP
    private static String getOtpFromDb(String mobileNumber) {
        String otp = null;

        String url = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "Test_Team";
        String password = "Pass@2025";

        try {
            // ✅ Use SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            // ✅ Use correct SQL Server syntax
            String query = "select * from RegistrationPendingMaster where MobileNo=9403582530";

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
    
  
    
    
}
