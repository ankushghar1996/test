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

public class New_Site_Cred extends BaseClass_SEBS_Portal{

	
	@Test
	public void SEBS_New_Site_Cred() throws Exception {
		
		New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);
	
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_01", "Click on SEBS Menu", () ->{
		Liabrary.custom_click(view.getSEBS_Menu(), "Click on SEBS Menu");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_02", "Click on Site Creation Menu", () ->{
		Liabrary.custom_click(view.getSite_Creation_SubMenu(), "Click on Site Creation Menu");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_03", "Click on Add Menu", () ->{
		Liabrary.custom_click(view.getAdd_Menu(), "Click on Add Menu");});
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("98541602014");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_04", "Click on Distributor_Mapped", () ->{
		Liabrary.custom_click(view.getDistributor_Mapped(), "Click on Distributor_Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_05", "Click on Select_Distributor_Mapped", () ->{
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), "Click on Select_Distributor_Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_06", "Click Select_sales_Engineer_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), "Click Select_sales_Engineer_dropdown");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_07", "Click Select_sales_Engineer", () ->{
		Liabrary.custom_click(view.getSelect_sales_Engineer(), "Click Select_sales_Engineer");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_08", "Click on Select_Location_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_Location_dropdown(), "Click on Select_Location_dropdown");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_09", "Click on Select_Location", () ->{
		Liabrary.custom_click(view.getSelect_Location(), "Click on Select_Location");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_10", "Click on Select_developer_Name_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), "Click on Select_developer_Name_dropdown");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_11", "Click on Select_developer_Name", () ->{
		Liabrary.custom_click(view.getSelect_developer_Name(), "Click on Select_developer_Name");});
		Thread.sleep(1000);
		
		
		WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
    	JavascriptExecutor jse= (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);
		
		
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_12", "Send Site Name", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("sunil kumar");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_13", "Click on Chcekbox_flexCheckDefault", () ->{
		Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), "Click on Chcekbox_flexCheckDefault");});
		Thread.sleep(1000);
	
		

		WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
		
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Project Funnel (lakhs) of Site']")).sendKeys("40");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("(//input[@placeholder='Enter Sales Funnel (lakhs) of Site'])[1]")).sendKeys("521");
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter Fosroc Expected sales in 2025']")).sendKeys("5142");
        Thread.sleep(1000);
        
        WebElement scroll3 = driver.findElement(By.xpath("//label[normalize-space()='YTD Sales (lakhs)']"));
    	JavascriptExecutor jse3= (JavascriptExecutor)driver;
    	jse3.executeScript("arguments[0].scrollIntoView(true);", scroll3);
        Thread.sleep(1000);
        
        
        driver.findElement(By.xpath("//input[@placeholder='Enter YTD Sales (lakhs)']")).sendKeys("3214");
        Thread.sleep(1000);
        
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_14", "Click on Dropdown Menu Button", () ->{
        Liabrary.custom_click(view.getDropdownMenuButton(), "Click on Dropdown Menu Button");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_15", "Click on Checkbox", () ->{
		Liabrary.custom_click(view.getCheckbox(), "Click on Checkbox");});
		Thread.sleep(4000);
		
		
		WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_16", "Enter Contractor Name", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("sahil");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_17", "Enter Contractor Contact Number", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120165");});
		Thread.sleep(1000);
		
		
		 ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_39", "Click on camera button", ()-> {  
		 driver.findElement(By.xpath("(//div[@class='new-retailer-container o-hidden']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
		 Thread.sleep(1000);

		        
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_40", "Select camera  and capture", ()-> {  
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
		        
		        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_41", "Select camera  and capture", ()-> { 
		        	
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
		
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_18", "Click on Save_Button", () ->{
		Liabrary.custom_click(view.getSAVE_Button(), "Save Button");
		});
		Thread.sleep(8000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_19", "Click on Okay Button", () ->{
		driver.findElement(By.xpath("//button[normalize-space()='OKAY']")).click();		
	     });
		Thread.sleep(4000);
		
//		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_18", "Click on CANCEL_Button", () ->{
//		Liabrary.custom_click(view.getCANCEL_Button(), null);});
//		
		
	
	}
	
}
