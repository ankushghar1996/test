package SEBS_Portal_Credential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.New_Site_Creation;

public class New_Activity_NonPJPSite_Cred extends BaseClass_SEBS_Portal {

    @Test
    public void SEBS_New_Activity_PJP_Cred() throws Exception {

        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC02", "Click on Non-PJP Button", () -> {
            Liabrary.custom_click(view.getNon_PJP_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC03", "Click on Add1 Button", () -> {
            Liabrary.custom_click(view.getAdd1_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC04", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC05", "Select Distributor Mapped", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC06", "Click Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC07", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC08", "Click Location Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC09", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC10", "Click Developer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC11", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC12", "Scroll to Site Name", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC13", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("mrunal shende");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC14", "Click Checkbox", () -> {
            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC15", "Scroll to State", () -> {
            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC16", "Click DropdownMenuButton", () -> {
            Liabrary.custom_click(view.getDropdownMenuButton(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC17", "Click State Checkbox", () -> {
            Liabrary.custom_click(view.getCheckbox(), null);
        });
        Thread.sleep(4000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC18", "Scroll to Contractor Name", () -> {
            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC19", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("shital");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC20", "Enter Contractor Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120130");
        });
        Thread.sleep(1000);
        
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC21", "Camera click and enter number", () -> {
//            WebElement cameraBtn = driver.findElement(By.xpath("//div[@class='row hr upload-documents-details']//span[@data-bs-target='#camera']"));
//            cameraBtn.click(); // Click the camera icon
//        });
//        Thread.sleep(1000);
        
        //camera 1
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_21", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
	        Thread.sleep(1000);

	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_22", "Select camera  and capture", ()-> {  
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	        
	        // Wait for the Switch Camera button and click it
	        try {
	            WebElement switchCamBtn = wait1.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//div[@class='switch-cam']//button[1]")));
	            switchCamBtn.click();
	            System.out.println("Switch Camera button clicked.");
	        } catch (TimeoutException e) {
	            System.out.println("Switch Camera button not found or not clickable.");
	        } });

	        Thread.sleep(5000);
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_23", "Select camera  and capture", ()-> { 
	        	
	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        // Wait for the Capture button and click it
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
	
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Click on Save_Button", () ->{
	Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
	});
	Thread.sleep(8000);
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_25", "Click on Okay Button", () ->{
	driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
});
	Thread.sleep(4000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC25", "Click CANCEL Button", () -> {
//            Liabrary.custom_click(view.getSAVE_Button(), null);
//        });
//        Thread.sleep(1000);
        
        
    }
    
    //Negetive Senario 1 = Skip click on Site photo - Camera Capture Button , Click on save button .
//    
//    @Test (priority = 1)
//    public void SEBS_New_Activity_PJP_Cred_01() throws Exception {
//
//        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC01", "Click on Activity Button", () -> {
//            Liabrary.custom_click(view.getActivity_Button(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC02", "Click on Non-PJP Button", () -> {
//            Liabrary.custom_click(view.getNon_PJP_Button(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC03", "Click on Add1 Button", () -> {
//            Liabrary.custom_click(view.getAdd1_Button(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC04", "Click on Distributor Mapped", () -> {
//            Liabrary.custom_click(view.getDistributor_Mapped(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC05", "Select Distributor Mapped", () -> {
//            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC06", "Click Sales Engineer Dropdown", () -> {
//            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC07", "Select Sales Engineer", () -> {
//            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC08", "Click Location Dropdown", () -> {
//            Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC09", "Select Location", () -> {
//            Liabrary.custom_click(view.getSelect_Location(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC10", "Click Developer Dropdown", () -> {
//            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC11", "Select Developer Name", () -> {
//            Liabrary.custom_click(view.getSelect_developer_Name(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC12", "Scroll to Site Name", () -> {
//            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
//            JavascriptExecutor jse = (JavascriptExecutor) driver;
//            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC13", "Enter Site Name", () -> {
//            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("mukeshdelhi");
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC14", "Click Checkbox", () -> {
//            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC15", "Scroll to State", () -> {
//            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
//            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC16", "Click DropdownMenuButton", () -> {
//            Liabrary.custom_click(view.getDropdownMenuButton(), null);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC17", "Click State Checkbox", () -> {
//            Liabrary.custom_click(view.getCheckbox(), null);
//        });
//        Thread.sleep(4000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC18", "Scroll to Contractor Name", () -> {
//            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
//            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC19", "Enter Contractor Name", () -> {
//            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("raj");
//        });
//        Thread.sleep(1000);
//
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC20", "Enter Contractor Contact Number", () -> {
//            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120142");
//        });
//        Thread.sleep(1000);
//        
////        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC21", "Camera click and enter number", () -> {
////            WebElement cameraBtn = driver.findElement(By.xpath("//div[@class='row hr upload-documents-details']//span[@data-bs-target='#camera']"));
////            cameraBtn.click(); // Click the camera icon
////        });
////        Thread.sleep(1000);
//        
//        //camera 1
//        
////        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC21", "Click on camera button", ()-> { 
////            driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
////            Thread.sleep(1000);
////        
////        Thread.sleep(1000);
////        
////        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC22", "Select camera  and capture", ()-> {  
////	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
////
////	        
////	        // Wait for the Switch Camera button and click it
////	        try {
////	            WebElement switchCamBtn = wait1.until(ExpectedConditions.elementToBeClickable(
////	                By.xpath("//div[@class='switch-cam']//button[1]")));
////	            switchCamBtn.click();
////	            System.out.println("Switch Camera button clicked.");
////	        } catch (TimeoutException e) {
////	            System.out.println("Switch Camera button not found or not clickable.");
////	        } });
////
////	        Thread.sleep(2000);
////	        
////	        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC23", "Select camera  and capture", ()-> { 
////	        	
////	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
////	        // Wait for the Capture button and click it
////	        try {
////	            WebElement captureBtn = wait2.until(ExpectedConditions.elementToBeClickable(
////	                By.xpath("(//button[@class='capture-button'])[3]")));
////	            captureBtn.click();
////	            System.out.println("Capture button clicked.");
////	        } catch (TimeoutException e) {
////	            System.out.println("Capture button not found or not clickable.");
////	        }
////	        });
////	        Thread.sleep(2000);
//        
////
////        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC24", "Click CANCEL Button", () -> {
////            Liabrary.custom_click(view.getCANCEL_Button(), null);
////        });
////        Thread.sleep(1000);
//        
//        ObjectRepo.startTestAndLog_1_SS("SEBS_NonPJP_TC25", "Click Save Button", () -> {
//            Liabrary.custom_click(view.getSAVE_Button(), null);
//        });
//        //ObjectRepo.Print_Dynamic_Flash_Massage(driver,"//div[@id='toast-container']", "Flash Error Massage Printed");
//        Thread.sleep(1000);
//}
}