package Distributor_Portal_Credential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility.Base_Class_Distributor;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Distributor_Portal.PO_Creation;

public class PO_Creation_Test extends Base_Class_Distributor {

    @Test
    public void PO_Creation() throws Exception {

        PO_Creation DIST = PageFactory.initElements(driver, PO_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_01", "Click on Purchase Order", () -> {
            Liabrary.custom_click(DIST.getPurchase_Order(), " Purchase Order");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_02", "Click on PO Generation", () -> {
            Liabrary.custom_click(DIST.getPO_Generation(), "Click on PO Generation");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_03", "Click on PO Creation", () -> {
            Liabrary.custom_click(DIST.getPO_Creation(), "Click on PO Creation");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_04", "Click on Distributor dropdown", () -> {
            Liabrary.custom_click(DIST.getDistributor_Dropdown(), "Click on Distributor dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_05", "Select distributor from dropdown", () -> {
            Liabrary.custom_click(DIST.getDistributor_Dropdown_Value(), "Select distributor value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_06", "Click on Pricing Type dropdown", () -> {
            Liabrary.custom_click(DIST.getPricing_Type_Dropdown(), "Click on Pricing Type dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_07", "Select Pricing Type value", () -> {
            Liabrary.custom_click(DIST.getPricing_Type_Dropdown_Value(), "Select Pricing Type value");
        });
        Thread.sleep(1000);
        
        WebElement fileInput1 = driver.findElement(By.id("ParentMasterContentPlaceHolder1_schemeBannerFileUpload"));
        fileInput1.sendKeys("C:\\COde\\test-new\\test\\test-output\\Upload_Image\\sample_640×426.jpeg");

        Thread.sleep(1000);

        WebElement fileInput2 = driver.findElement(By.id("ParentMasterContentPlaceHolder1_schemeBannerFileUpload2"));
        fileInput2.sendKeys("C:\\COde\\test-new\\test\\test-output\\Upload_Image\\sample_640×426.jpeg");

        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_08", "Click on Product dropdown", () -> {
            Liabrary.custom_click(DIST.getSelect_Product_Dropdown(), "Click on Product dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_09", "Select Product value", () -> {
            Liabrary.custom_click(DIST.getSelect_Product_Dropdown_Value(), "Select Product value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_10", "Click on Add button", () -> {
            Liabrary.custom_click(DIST.getAdd_Button(), "Click on Add button");
        });
        Thread.sleep(1000);
        
        WebElement ele =driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGridPOGeneration_GridData']"));
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].scrollIntoView(true);", ele);
       
        Thread.sleep(2000);
        
     // Step 3: Interact with Quantity Field Safely
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement qtyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGridPOGeneration_ctl00_ctl04_txtQty']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].focus(); arguments[0].value='';", qtyField);
        Thread.sleep(500); // Let the field stabilize
        qtyField.sendKeys("01");
        Thread.sleep(500);
        qtyField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        
//        Quantityfild.sendKeys("01");
//        Thread.sleep(2000);
//        Quantityfild.sendKeys(Keys.ENTER);
//        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_13", "Click on Calculate button", () -> {
            Liabrary.custom_click(DIST.getCalculate_Button(), "Click on Calculate button");
            });
            Thread.sleep(3000);
            
        ObjectRepo.startTestAndLog_1_SS("DB_PO_Creation_TC_14", "Click on Save and clear button", () -> {
            Liabrary.custom_click(DIST.getSave_Button(), "Save and clear button");
            ObjectRepo.Print_Dynamic_Flash_Massage(driver,"//div[contains(@class,'toast-message') and contains(text(),'PO created successfully')]","DB_PO_Creation_TC_15" );
             });
            Thread.sleep(1000);   
 
        
        
    }
}
