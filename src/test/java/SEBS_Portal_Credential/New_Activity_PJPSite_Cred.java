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

	@Test(priority = 0)
    public void SEBS_New_Activity_PJP_Cred() throws Exception {

        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), "Click on Activity Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_02", "Click on Add Button", () -> {
            Liabrary.custom_click(view.getAdd1_Button(), "Click on Add Button");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_03", "Enter Mobile Number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("98541602030");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_04", "Click on CONTINUE Button", () -> {
		driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();});
		Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_05", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), "Click on Distributor Mapped");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_06", "Select Distributor Mapped", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), "Select Distributor Mapped");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_07", "Select Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), "Select Sales Engineer Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_08", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), "Select Sales Engineer");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_09", "Select Location Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_Location_dropdown(), "Select Location Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_10", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), "Select Location");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_11", "Select Developer Name Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), "Select Developer Name Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_12", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), "Select Developer Name");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_13", "Scroll to Site Name field", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_14", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("Rinku");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_15", "Click on Chcekbox_flexCheckDefault", () ->{
    		Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), "Click on Chcekbox_flexCheckDefault");});
    		Thread.sleep(1000);
    		
    	
    		WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
        	JavascriptExecutor jse1= (JavascriptExecutor)driver;
        	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
            Thread.sleep(1000);
    		
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_16", "Enter Project Funnel (lakhs) of Site", () ->{
            driver.findElement(By.xpath("//input[@placeholder='Enter Project Funnel (lakhs) of Site']")).sendKeys("40");});
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_17", "Enter Sales Funnel (lakhs) of Site", () ->{
            driver.findElement(By.xpath("(//input[@placeholder='Enter Sales Funnel (lakhs) of Site'])[1]")).sendKeys("521");});
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_18", "Enter Fosroc Expected sales in 2025", () ->{
            driver.findElement(By.xpath("//input[@placeholder='Enter Fosroc Expected sales in 2025']")).sendKeys("5142");});
            Thread.sleep(1000);
            
            
            
            WebElement scroll3 = driver.findElement(By.xpath("//label[normalize-space()='YTD Sales (lakhs)']"));
        	JavascriptExecutor jse3= (JavascriptExecutor)driver;
        	jse3.executeScript("arguments[0].scrollIntoView(true);", scroll3);
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_19", "Enter YTD Sales (lakhs)", () ->{
            driver.findElement(By.xpath("//input[@placeholder='Enter YTD Sales (lakhs)']")).sendKeys("3214");});
            Thread.sleep(1000);
            
    		
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on Dropdown Menu Button", () ->{
            Liabrary.custom_click(view.getDropdownMenuButton(), "Click on Dropdown Menu Button");});
            Thread.sleep(1000);
            
    		
    		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_21", "Click on Checkbox", () ->{
    		Liabrary.custom_click(view.getCheckbox(), "Click on Checkbox");});
    		Thread.sleep(4000);
    		
    		
    		WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
        	JavascriptExecutor jse2= (JavascriptExecutor)driver;
        	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
            Thread.sleep(1000);
    		
    		
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_22", "Enter Contractor Name", () ->{
    		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("sahil");});
            Thread.sleep(1000);
            
            
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_23", "Click on Chcekbox_flexCheckDefault", () ->{
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Email ID.']")).sendKeys("sahil123@gmail.com");});
            Thread.sleep(1000);
            
    		
    		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Enter Contractor Contact Number", () ->{
    		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120165");});
    		  Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_25", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
	        Thread.sleep(1000);

	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_26", "Select camera  and capture", ()-> {  
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
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_27", "Select camera  and capture", ()-> { 
	        	
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
	        Thread.sleep(2000);
	
	
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_28", "Click on Save_Button", () ->{
	Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
	});
	Thread.sleep(4000);
	
	
//	ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_24", "Click on Okay Button", () ->{
//	driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
//      });
//	Thread.sleep(4000);
//        
        
        

//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_20", "Click on Cancel Button", () -> {
//            Liabrary.custom_click(view.getCANCEL_Button(), null);
//        });
        
        
    }

	
	
	
    @Test(priority = 1)
    public void SEBS_New_Activity_PJP_Cred_NS01() throws Exception {

    	//Without click on Add btn
  		ObjectRepo.startTestAndLog_1_NS("Without click on Add btn");
    	
        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_01", "Click on Activity Button", () -> {
            Liabrary.custom_click(view.getActivity_Button(), "Click on Activity Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_02", "Click on Add Button", () -> {
//            Liabrary.custom_click(view.getAdd1_Button(), null);
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Activity_PJP_TC_03", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), "Click on Distributor Mapped");
        });
        Thread.sleep(1000);

       
	
    }
    
    
    
    
    
    
    @Test(priority = 2)
    public void SEBS_New_Activity_PJP_Cred_NS02() throws Exception {

    	//Without Click on Distributor Mapped
    	ObjectRepo.startTestAndLog_1_NS("//Without Click on Distributor Mapped");
    	
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
    
    
    
    @Test(priority = 3)
    public void SEBS_New_Activity_PJP_Cred_NS03() throws Exception {

    	//Without Enter Mandatory Fields
  		ObjectRepo.startTestAndLog_1_NS("Without Enter Mandatory Fields");
    	
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

        
        /*
        
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

*/


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
        
        /*

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
	
	*/
	
	
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