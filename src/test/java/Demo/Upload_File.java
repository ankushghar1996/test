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
		    
		   
			driver.findElement(By.xpath("//*[text()=\"Master\"]")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should Click on Master menu");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//p[normalize-space()='Product Management']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should click on Product Management Submenu ");
			Thread.sleep(1000);

			
			driver.findElement(By.xpath("//p[normalize-space()='Product Image Upload']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should click on Product Image Upload menu");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_Input']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 4", "Verify that user should click on Product Dropdown");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should click on Checkbox value");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_BtnView']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should click on View Button");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_btnUpload']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should click on Upload Button");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
			ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should click on select image");
			Thread.sleep(1000);
			
			
			 // Locate the file input element (hidden input of type file) and upload the file
			ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should click on select image & Print Confirmation massage");
	        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
	        // Use JavaScript to make the file input visible if it's hidden
	        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput);
	 
	        // Get the project path dynamically (or specify a full path)
	        String projectPath = System.getProperty("user.dir");
	 
	        // Concatenate the relative file path to projectPath
	        fileInput.sendKeys(projectPath + "\\test-output\\Upload_Image\\Sample.jpg");
	        
	        
	        // Print a success message once the image has been selected
	       
	        System.out.println("Image selected successfully: " + projectPath + "\\test-output\\Upload_Image\\image.jpg");
	        ObjectRepo.startTestAndLog_1_SS("Test Case 10", "print image upload successfull massage");
	        Thread.sleep(3000);
	        
	        
	 
			}
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
