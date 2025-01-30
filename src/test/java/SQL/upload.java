package SQL;



	
	
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Reports.ODR_Order_Detailes_Reports_Main;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

	public class upload extends BaseClass{
		
		@Test	
		public void Order_Detailes_Reports () throws Exception {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
			
		
		
		Liabrary.custom_click(hp.getMaster_Menu(), null);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[normalize-space()='Product Management']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[normalize-space()='Product Image Upload']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_Input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_BtnView']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_btnUpload']")).click();
		Thread.sleep(1000);

		/*
		 WebElement uploadInput = driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']"));
		 Thread.sleep(1000);
         // Use JavaScript to make the input element visible (if it's hidden)
         JavascriptExecutor js = (JavascriptExecutor) driver;
         Thread.sleep(1000);
         js.executeScript("arguments[0].style.display='block';", uploadInput);
         Thread.sleep(1000);
         // Set the file path using JavaScript
         String filePath = "C:\\Users\\10277\\Pictures\\cb\\Sample.jpg";
         js.executeScript("arguments[0].value = arguments[1];", uploadInput, filePath);
		
		*/
		
		
		  // Click the upload button to open the file upload dialog
        WebElement uploadButton = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_btnUpload']"));
        uploadButton.click();

        // Use Robot to handle the file upload dialog
        String filePath = "C:\\Users\\10277\\Pictures\\cb\\Sample.jpg";
        Robot robot = new Robot();

        // Copy the file path to the clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate Ctrl+V and Enter
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Add any necessary validations
        System.out.println("File uploaded successfully!");

		
		
		
		
		
		
	//	driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
		Thread.sleep(1000);
		
	            // Locate the file input element
	    //        driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).sendKeys("C:\\Users\\10277\\Pictures\\cb\\Screenshot (346).png");
//C:\\path\\to\\your\\file.jpg    C:\Users\10277\Pictures\cb\Screenshot (346)
	            // Provide the path to the file to be uploaded
	    //        String filePath = "C:\\Users\\10277\\Pictures\\cb\\Screenshot (346)";
	            
	            // Upload the file using sendKeys
	    //        uploadInput.sendKeys(filePath);
/*
	            // Click on the "Save" button (if needed)
	            WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
	            saveButton.click();

	            // Add any necessary validations or assertions here
	            System.out.println("File uploaded successfully!");
*/
	       
	}

	}
	
	
	

