package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Pending_Approval_DB;

public class SECR_Pending_Approval_DB_Test extends BaseClass_SECR_Portal {

    @Test 
    public void Pending_Approval_DB() throws Exception {

        SECR_Pending_Approval_DB SECR = PageFactory.initElements(driver, SECR_Pending_Approval_DB.class);

        WebElement scroll = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC01", "Verify that user should be able to click on Pending Approval button", () -> {
            Liabrary.custom_click(SECR.getPending_Approval(), "Click Pending Approval DB");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC02", "Verify that user should be able to click on Retailer KYC Approval", () -> {
            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC03", "Verify that user should be able to click on Retailer name", () -> {
            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
        });
        Thread.sleep(1000);

        
        WebElement scroll2 = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC04", "Verify that user should be able to click on Aadhar Card download", () -> {
            Liabrary.custom_click(SECR.getAadhar_Card_Download(), "Click Download Button 1");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC05", "Verify that user should be able to click on PAN Card download", () -> {
            Liabrary.custom_click(SECR.getPAN_Card(), "Click Download Button 2");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC06", "Verify that user should be able to click on Shop Registration download", () -> {
            Liabrary.custom_click(SECR.getShop_Registration(), "Click Download Button 3");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC07", "Verify that user should be able to click on Shop Registration again", () -> {
            Liabrary.custom_click(SECR.getShop_Registration(), "Click Download Button 3");
        });
        Thread.sleep(1000);
        
        
    }
    
    
    @Test (priority = 1)
    public void Pending_Approval_DB_NS01() throws Exception {

        SECR_Pending_Approval_DB SECR = PageFactory.initElements(driver, SECR_Pending_Approval_DB.class);
        
        //Without Click Retailer Name
        ObjectRepo.startTestAndLog_1_NS("Without Click Retailer KYC Approval");

        WebElement scroll = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC01", "Verify that user should be able to click on Pending Approval button", () -> {
            Liabrary.custom_click(SECR.getPending_Approval(), "Click Pending Approval DB");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC02", "Verify that user should be able to click on Retailer KYC Approval", () -> {
//            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC03", "Verify that user should be able to click on Retailer name", () -> {
            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
        });
        Thread.sleep(1000);

        
        WebElement scroll2 = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC04", "Verify that user should be able to click on Aadhar Card download", () -> {
            Liabrary.custom_click(SECR.getAadhar_Card_Download(), "Click Download Button 1");
        });
        Thread.sleep(1000);

   
}

    @Test (priority = 2)
    public void Pending_Approval_DB_NS02() throws Exception {

        SECR_Pending_Approval_DB SECR = PageFactory.initElements(driver, SECR_Pending_Approval_DB.class);
        
        //Without Click Retailer KYC Approval
        ObjectRepo.startTestAndLog_1_NS("Without Click Retailer KYC Approval");

        WebElement scroll = driver.findElement(By.xpath("//div[@class='pending-retailer']//span[normalize-space()='New Retailer Created']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC01", "Verify that user should be able to click on Pending Approval button", () -> {
            Liabrary.custom_click(SECR.getPending_Approval(), "Click Pending Approval DB");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC02", "Verify that user should be able to click on Retailer KYC Approval", () -> {
//            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Pending_Approval_DB_Test_TC03", "Verify that user should be able to click on Retailer name", () -> {
            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
        });
        Thread.sleep(1000);

        
        WebElement scroll2 = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);

       
}
}