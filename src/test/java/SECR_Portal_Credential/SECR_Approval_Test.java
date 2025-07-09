package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Approval;


public class SECR_Approval_Test extends BaseClass_SECR_Portal {

    @Test
    public void Retailer_KYC_Approval() throws Exception {

        SECR_Approval SECR = PageFactory.initElements(driver, SECR_Approval.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
      
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC02", "Verify that user should be able to click on Approved Button", () -> {
            Liabrary.custom_click(SECR.getApproval_Button(), "Click Approved Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC03", "Verify that user should be able to click on Retailer KYC Approval", () -> {
            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC04", "Verify that user should be able to click on Retailer Name", () -> {
            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC05", "Verify that page scrolls to Upload Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);
  
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC06", "Verify that user should be able to download Aadhar Card", () -> {
            Liabrary.custom_click(SECR.getAadhar_Card_Download(), "Adhar Card Download");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC07", "Verify that user should be able to download PAN Card", () -> {
            Liabrary.custom_click(SECR.getPAN_Card(), "Pan Card Download Button");
        });
        Thread.sleep(1000);


        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC08", "Verify that user should be able to download Shop Registration", () -> {
            Liabrary.custom_click(SECR.getShop_Registration(), "Click Shop Registration Download Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC09", "Verify that user should be able to click Close Button", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        });
        Thread.sleep(1000); 
        
    }
    
    @Test(priority=01)
    public void Retailer_KYC_Approval_NS01() throws Exception {

        SECR_Approval SECR = PageFactory.initElements(driver, SECR_Approval.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Clicking Retailer KYC Upload");

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
   
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC02", "Verify that user should be able to click on Approved Button", () -> {
            Liabrary.custom_click(SECR.getApproval_Button(), "Click Approved Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC03", "Verify that user should be able to click on Retailer KYC Approval", () -> {
//            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC04", "Verify that user should be able to click on Retailer Name", () -> {
            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC05", "Verify that page scrolls to Upload Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);
  
        
      
      
    }
    
    @Test(priority=02)
    public void Retailer_KYC_Approval_NS02() throws Exception {

        SECR_Approval SECR = PageFactory.initElements(driver, SECR_Approval.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Clicking Retailer Name");

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC02", "Verify that user should be able to click on Approved Button", () -> {
            Liabrary.custom_click(SECR.getApproval_Button(), "Click Approved Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC03", "Verify that user should be able to click on Retailer KYC Approval", () -> {
            Liabrary.custom_click(SECR.getRetailer_KYC_Approval(), "Click Retailer KYC Approval");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC04", "Verify that user should be able to click on Retailer Name", () -> {
//            Liabrary.custom_click(SECR.getRetailer_Name(), "Click Retailer name");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC05", "Verify that page scrolls to Upload Documents section", () -> {
            WebElement scroll = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);
  
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC06", "Verify that user should be able to download Aadhar Card", () -> {
            Liabrary.custom_click(SECR.getAadhar_Card_Download(), "Adhar Card Download");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC07", "Verify that user should be able to download PAN Card", () -> {
            Liabrary.custom_click(SECR.getPAN_Card(), "Pan Card Download Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC08", "Verify that user should be able to download Shop Registration", () -> {
            Liabrary.custom_click(SECR.getShop_Registration(), "Click Shop Registration Download Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Approval_TC09", "Verify that user should be able to click Close Button", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        });
        Thread.sleep(1000);
 
    }
    
}
