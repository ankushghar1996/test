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

public class New_Activity_PJPSite_Cred extends BaseClass_SEBS_Portal {

	@Test(priority=0)
    public void SEBS_New_Activity_PJP_Cred() throws Exception {

        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_02", "Click on Add Button", () -> {
            Liabrary.custom_click(view.getAdd1_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_03", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_04", "Select Distributor Mapped", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_05", "Select Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_06", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_07", "Select Location Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_08", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_09", "Select Developer Name Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_10", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_11", "Scroll to Site Name field", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_12", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("kailash thakur");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_13", "Click on Flex Checkbox", () -> {
            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_14", "Scroll to State Dropdown", () -> {
            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_15", "Open State Dropdown", () -> {
            Liabrary.custom_click(view.getDropdownMenuButton(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_16", "Select State Checkbox", () -> {
            Liabrary.custom_click(view.getCheckbox(), null);
        });
        Thread.sleep(4000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_17", "Scroll to Contractor Name", () -> {
            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_18", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("komal");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_19", "Enter Contractor Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120143");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
	        Thread.sleep(1000);

	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_21", "Select camera  and capture", ()-> {  
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
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_22", "Select camera  and capture", ()-> { 
	        	
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
	
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_23", "Click on Save_Button", () ->{
	Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
	});
	Thread.sleep(8000);
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Click on Okay Button", () ->{
	driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
      });
	Thread.sleep(4000);
        
        
        

//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on Cancel Button", () -> {
//            Liabrary.custom_click(view.getCANCEL_Button(), null);
//        });
        
        
    }

    @Test(priority=1)
    public void SEBS_New_Activity_PJP_Cred_NS01() throws Exception {

    	//Without Click Add Button
    	
        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), null);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_02", "Click on Add Button", () -> {
//            Liabrary.custom_click(view.getAdd1_Button(), null);
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_03", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_04", "Select Distributor Mapped", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_05", "Select Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_06", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_07", "Select Location Dropdown", () -> {
        Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_08", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_09", "Select Developer Name Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_10", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_11", "Scroll to Site Name field", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_12", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("kailash thakur");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_13", "Click on Flex Checkbox", () -> {
            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_14", "Scroll to State Dropdown", () -> {
            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_15", "Open State Dropdown", () -> {
            Liabrary.custom_click(view.getDropdownMenuButton(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_16", "Select State Checkbox", () -> {
            Liabrary.custom_click(view.getCheckbox(), null);
        });
        Thread.sleep(4000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_17", "Scroll to Contractor Name", () -> {
            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_18", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("komal");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_19", "Enter Contractor Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120143");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
	        Thread.sleep(1000);

	        
	   ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_21", "Select camera  and capture", ()-> {  
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
	        
	     ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_22", "Select camera  and capture", ()-> { 
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
	
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_23", "Click on Save_Button", () ->{
	Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
	});
	Thread.sleep(8000);
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Click on Okay Button", () ->{
	driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
      });
	Thread.sleep(4000);
}
    @Test(priority=2)
    public void SEBS_New_Activity_PJP_Cred_NS02() throws Exception {

    	//Without Click on Distributor Mapped
    	
        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_02", "Click on Add Button", () -> {
            Liabrary.custom_click(view.getAdd1_Button(), null);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_03", "Click on Distributor Mapped", () -> {
//            Liabrary.custom_click(view.getDistributor_Mapped(), null);
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_04", "Select Distributor Mapped", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_05", "Select Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_06", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_07", "Select Location Dropdown", () -> {
        Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_08", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_09", "Select Developer Name Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_10", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_11", "Scroll to Site Name field", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_12", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("kailash thakur");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_13", "Click on Flex Checkbox", () -> {
            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_14", "Scroll to State Dropdown", () -> {
            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_15", "Open State Dropdown", () -> {
            Liabrary.custom_click(view.getDropdownMenuButton(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_16", "Select State Checkbox", () -> {
            Liabrary.custom_click(view.getCheckbox(), null);
        });
        Thread.sleep(4000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_17", "Scroll to Contractor Name", () -> {
            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_18", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("komal");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_19", "Enter Contractor Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120143");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
	        Thread.sleep(1000);

	        
	   ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_21", "Select camera  and capture", ()-> {  
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
	        
	     ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_22", "Select camera  and capture", ()-> { 
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
	
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_23", "Click on Save_Button", () ->{
	Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
	});
	Thread.sleep(8000);
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Click on Okay Button", () ->{
	driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
      });
	Thread.sleep(4000);
}
}