package Demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	import Com_Utility.BaseClass;
	import Com_Utility.ObjectRepo;
	 
	import java.time.Duration;
	 

		public class Upload_File extends BaseClass{
			
			
			@Test	
			public void Order_Detailes_Reports () throws Exception {
				
				
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should Click on Master menu", () -> {
			driver.findElement(By.xpath("//*[text()=\"Master\"]")).click();
		    });
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should click on Product Management Submenu", () -> {
			    driver.findElement(By.xpath("//p[normalize-space()='Product Management']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should click on Product Image Upload menu", () -> {
			    driver.findElement(By.xpath("//p[normalize-space()='Product Image Upload']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 4", "Verify that user should click on Product Dropdown", () -> {
			    driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_Input']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should click on Checkbox value", () -> {
			    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should click on View Button", () -> {
			    driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_BtnView']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should click on Upload Button", () -> {
			    driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_btnUpload']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should click on select image", () -> {
			    driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
			});
			Thread.sleep(1000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should click on select image & Print Confirmation message", () -> {
			    WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
			    ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput);

			    String projectPath = System.getProperty("user.dir");
			    fileInput.sendKeys(projectPath + "\\test-output\\Upload_Image\\Sample.jpg");

			    System.out.println("Image selected successfully: " + projectPath + "\\test-output\\Upload_Image\\image.jpg");
			});
			Thread.sleep(3000);

			ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Print image upload successful message", () -> {
			    // You can add any additional code here if needed, or keep it empty
			});
			Thread.sleep(1000);

	        
	        
	 
			}
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
