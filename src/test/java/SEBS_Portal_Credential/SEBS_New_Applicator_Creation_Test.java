package SEBS_Portal_Credential;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
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
import SEBS_Portal.SEBS_New_Applicator_Creation;
 
public class SEBS_New_Applicator_Creation_Test extends BaseClass_SEBS_Portal {
	
	@Test(priority = 0)
	public void Applicator_creation () throws Exception {
		
		     SEBS_New_Applicator_Creation SEBS = PageFactory.initElements(driver, SEBS_New_Applicator_Creation.class);

		  
		     
		     ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC01", "Click on Menu Button", () -> {
		     Liabrary.custom_click(SEBS.getMenu(), "Click on Menu Button");});
		   
		
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC02", "Click on new Applicator Creation", () -> {
	     	Liabrary.custom_click(SEBS.getNew_Applicator_Creation(), "Click on new Applicator Creation"); });
	    	
		
	   
	    	
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC03", "Click on new Contractor Creation Button", () -> {
		    Liabrary.custom_click(SEBS.getCreation_Button(), "Click on new Contractor Creation Button"); });
		    
		
	    	
		    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC04", "Enter Mobile Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9658741309");
		    });
		   
		    	    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC05", "Click on Continue Button", () -> {
		    driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
		    });
		  
		      
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC06", "Click On Distributor Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown(), "Click On Distributor Dropdown"); });
		    
		

		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC07", "Click On Distributor Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown_Value(), "Click On Distributor Dropdown Value");});
		    
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC08", "Click on Sales_Engineer_Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown(), "Click on Sales_Engineer_Dropdown");});
		  
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC09", "Click on Sales_Engineer_Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown_Value(), "Click on Sales_Engineer_Dropdown Value");});
		  
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC10", "Click on Route Button", () -> {
		    Liabrary.custom_click(SEBS.getRoute(), "Click on Route Button");});
		  
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC11", "Click on Route Button Value", () -> {
		    Liabrary.custom_click(SEBS.getRoute_Value(), "Click on Route Button Value");});
		   
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC12", "Enter Applicator Name", () -> {
		    driver.findElement(By.xpath("//div[@class='col-12 mb-3']//input[@formcontrolname='ApplicatorName']")).sendKeys("raju jadhav");});
		    
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC13", "Scroll to Applicator Type", () -> {
		    WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12 mb-3']//select[@aria-label='Default select example']"));
		    JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
		    JSE1.executeScript("arguments[0].scrollIntoView(true);", element1); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC14", "Click on Applicator Type", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type(), "Click on Applicator Type"); });
		    
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC15", "Click on Applicator Type Value", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type_Value(), "Click on Applicator Type Value"); });
		    
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC16", "Enter Contact Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Contact Number']")).sendKeys("9658799696");});
		    Thread.sleep(1000);
	

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC17", "Scroll to Email Address", () -> {
		    WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
		    JavascriptExecutor JSE2 = (JavascriptExecutor) driver;
		    JSE2.executeScript("arguments[0].scrollIntoView(true);", element2);
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC18", "Enter Email", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("HSPL@Test.com");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC19", "Enter Address Line 1", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("Navle Bridge");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC20", "Enter Address Line 2", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Narhe");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC21", "Click on State Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown(), "Click on State Drpopdown");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC22", "Click on State Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown_Value(), "Click on State Drpopdown Value");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC23", "Click on City Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown(), "Click on City Dropdown");
		});
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC24", "Click on City Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown_Value(), "Click on City Dropdown Value");
		});
	
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC25", "Enter Pin Code", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
		});
		
		
		// Calendar code – Skipped if not present in original
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/05/1998");
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC26", "Enter Aadhar Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("803756789012");
		   
		});
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC27", "Enter PAN Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("AZVPK2525M");
		    
		});

		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_28", "Scroll to Camera Icon", () -> {
		    WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]"));
		    JavascriptExecutor JSE3 = (JavascriptExecutor) driver;
		    JSE3.executeScript("arguments[0].scrollIntoView(true);", element3);
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_29", "Enter GST Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27AAAPA1234A1Z5");
		});
		
		  
		  
		 // ✅ Camera 1
        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_33", "Verify that user should be click on Camera 1.", () -> {
            By cam1 = By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[1]");
            WebElement camera1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cam1));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera1);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // Optional wait
            try {
                camera1.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("⚠️ Camera 1 click intercepted, trying JS click...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", camera1);
            }
        });
        Thread.sleep(1000); // Optional

        // ✅ Switch & Capture Camera 1
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]"))).click();
            System.out.println("Switch Camera button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Switch Camera button not clickable.");
        }
        Thread.sleep(2000);
        try {
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]"))).click();
            System.out.println("Capture button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Capture button not clickable.");
        }
        Thread.sleep(1000);
	        
        // ✅ Camera 2
        WebElement scroll3 = driver.findElement(By.xpath("//span[normalize-space()='Upload Document 2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll3);
        Thread.sleep(1000); // Optional

        //Click cam 2
        ObjectRepo.startTestAndLog_1_SS("SECR_New_Distributor_Cred_TC_34", "Verify that user should be click on Camera 2.", () -> {
            By cam2 = By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[2]");
            WebElement camera2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cam2));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera2);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // Optional
            try {
                camera2.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("⚠️ Camera 2 click intercepted, trying JS click...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", camera2);
            }
        });
        Thread.sleep(1000);

        // ✅ Switch & Capture Camera 2
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='switch-cam']//button[1]"))).click();
            System.out.println("Switch Camera button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Switch Camera button not clickable.");
        }
        Thread.sleep(2000);
        try {
            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='capture-button'])[3]"))).click();
            System.out.println("Capture button clicked.");
        } catch (TimeoutException e) {
            System.out.println("Capture button not clickable.");
        }
        Thread.sleep(1000);
		        
	       ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_35", "Click on save button", () -> {
	       driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click(); });
	       Thread.sleep(1000);       
	}
	
	
	
	@Test(priority = 01)
	public void Applicator_creation_NS01() throws Exception {
		
		SEBS_New_Applicator_Creation SEBS = PageFactory.initElements(driver, SEBS_New_Applicator_Creation.class);

		 //Without click on new Contractor Creation Button
  		ObjectRepo.startTestAndLog_1_NS("Without click on new Contractor Creation Button");
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC01", "Click on Menu Button", () -> {
		Liabrary.custom_click(SEBS.getMenu(), "Click on Menu Button");});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC02", "Click on new Applicator Creation", () -> {
		Liabrary.custom_click(SEBS.getNew_Applicator_Creation(), "Click on new Applicator Creation"); });
		Thread.sleep(1000);
		

		/*
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC03", "Click on new Contractor Creation Button", () -> {
		    Liabrary.custom_click(SEBS.getCreation_Button(), "Click on new Contractor Creation Button"); });
		    Thread.sleep(1000);
	*/
		
		    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC04", "Enter Mobile Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9658741208");
		    });
		    Thread.sleep(1000);
		    
		    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC05", "Click on Continue Button", () -> {
		    driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
		    });
		    Thread.sleep(1000);
		    
		    
		    
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC06", "Click On Distributor Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown(), "Click On Distributor Dropdown"); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC07", "Click On Distributor Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown_Value(), "Click On Distributor Dropdown Value");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC08", "Click on Sales_Engineer_Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown(), "Click on Sales_Engineer_Dropdown");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC09", "Click on Sales_Engineer_Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown_Value(), "Click on Sales_Engineer_Dropdown Value");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC10", "Click on Route Button", () -> {
		    Liabrary.custom_click(SEBS.getRoute(), "Click on Route Button");});
		    Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC11", "Click on Route Button Value", () -> {
		    Liabrary.custom_click(SEBS.getRoute_Value(), "Click on Route Button Value");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC12", "Enter Applicator Name", () -> {
		    driver.findElement(By.xpath("//div[@class='col-12 mb-3']//input[@formcontrolname='ApplicatorName']")).sendKeys("vishal khanna");});
		    Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC13", "Scroll to Applicator Type", () -> {
		    WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12 mb-3']//select[@aria-label='Default select example']"));
		    JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
		    JSE1.executeScript("arguments[0].scrollIntoView(true);", element1); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC14", "Click on Applicator Type", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type(), "Click on Applicator Type"); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC15", "Click on Applicator Type Value", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type_Value(), "Click on Applicator Type Value"); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC16", "Enter Contact Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Contact Number']")).sendKeys("9658799696");});
		    Thread.sleep(1000);
	

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC17", "Scroll to Email Address", () -> {
		    WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
		    JavascriptExecutor JSE2 = (JavascriptExecutor) driver;
		    JSE2.executeScript("arguments[0].scrollIntoView(true);", element2);
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC18", "Enter Email", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("HSPL@Test.com");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC19", "Enter Address Line 1", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("Navle Bridge");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC20", "Enter Address Line 2", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Narhe");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC21", "Click on State Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown(), "Click on State Drpopdown");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC22", "Click on State Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown_Value(), "Click on State Drpopdown Value");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC23", "Click on City Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown(), "Click on City Dropdown");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC24", "Click on City Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown_Value(), "Click on City Dropdown Value");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC25", "Enter Pin Code", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
		});
		Thread.sleep(1000);
		
		// Calendar code – Skipped if not present in original
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/05/1998");
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC26", "Enter Aadhar Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("803756789012");
		   
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC27", "Enter PAN Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("AZVPK2525M");
		    
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC28", "Scroll to Camera Icon", () -> {
		    WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]"));
		    JavascriptExecutor JSE3 = (JavascriptExecutor) driver;
		    JSE3.executeScript("arguments[0].scrollIntoView(true);", element3);
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC29", "Enter GST Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27AAAPA1234A1Z5");
		});
		Thread.sleep(1000);
		  
		  
		  //Camera Click
		 ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_30", "Click on camera button", ()-> {  
		        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
		        Thread.sleep(1000);

		        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_31", "Select camera  and capture", ()-> {  
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

		        Thread.sleep(2000);
		        
		        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_32", "Select camera  and capture", ()-> { 
		        	
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
	        
		        ObjectRepo.startTestAndLog_1_SS("SEBSNew_Contractors_Test_33", "Click on camera button", ()-> {  
			        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[2]")).click();});
			        Thread.sleep(1000);
        
			        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_34", "Select camera  and capture", ()-> {  
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

			        Thread.sleep(2000);
			        
			        ObjectRepo.startTestAndLog_1_SS("SEBS_New_New_Contractors_Test_TC_35", "Select camera  and capture", ()-> { 
			        	
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
		        
	       ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_36", "Click on save button", () -> {
	       driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click(); });
	       Thread.sleep(1000);       
	}
	
	
	
	@Test(priority = 2)
	public void Applicator_creation_NS_02() throws Exception {
		
		     SEBS_New_Applicator_Creation SEBS = PageFactory.initElements(driver, SEBS_New_Applicator_Creation.class);

		  
		     
		     ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC01", "Click on Menu Button", () -> {
		     Liabrary.custom_click(SEBS.getMenu(), "Click on Menu Button");});
		     Thread.sleep(1000);
		
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC02", "Click on new Applicator Creation", () -> {
	     	Liabrary.custom_click(SEBS.getNew_Applicator_Creation(), "Click on new Applicator Creation"); });
	    	Thread.sleep(1000);
		
	    	
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC03", "Click on new Contractor Creation Button", () -> {
		    Liabrary.custom_click(SEBS.getCreation_Button(), "Click on new Contractor Creation Button"); });
		    Thread.sleep(1000);
		
	    	
		    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC04", "Enter Mobile Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9658741208");
		    });
		    Thread.sleep(1000);
		    	    
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC05", "Click on Continue Button", () -> {
		    driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
		    });
		    Thread.sleep(1000);
		      
		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC06", "Click On Distributor Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown(), "Click On Distributor Dropdown"); });
		    Thread.sleep(1000);
		

		    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC07", "Click On Distributor Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown_Value(), "Click On Distributor Dropdown Value");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC08", "Click on Sales_Engineer_Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown(), "Click on Sales_Engineer_Dropdown");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC09", "Click on Sales_Engineer_Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown_Value(), "Click on Sales_Engineer_Dropdown Value");});
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC10", "Click on Route Button", () -> {
		    Liabrary.custom_click(SEBS.getRoute(), "Click on Route Button");});
		    Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC11", "Click on Route Button Value", () -> {
		    Liabrary.custom_click(SEBS.getRoute_Value(), "Click on Route Button Value");});
		    Thread.sleep(1000);
		
		    /*
		    
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC12", "Enter Applicator Name", () -> {
		    driver.findElement(By.xpath("//div[@class='col-12 mb-3']//input[@formcontrolname='ApplicatorName']")).sendKeys("vishal khanna");});
		    Thread.sleep(1000);
		*/
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC13", "Scroll to Applicator Type", () -> {
		    WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12 mb-3']//select[@aria-label='Default select example']"));
		    JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
		    JSE1.executeScript("arguments[0].scrollIntoView(true);", element1); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC14", "Click on Applicator Type", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type(), "Click on Applicator Type"); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC15", "Click on Applicator Type Value", () -> {
		    Liabrary.custom_click(SEBS.getApplicator_Type_Value(), "Click on Applicator Type Value"); });
		    Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC16", "Enter Contact Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Contact Number']")).sendKeys("9658799696");});
		    Thread.sleep(1000);
	

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC17", "Scroll to Email Address", () -> {
		    WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
		    JavascriptExecutor JSE2 = (JavascriptExecutor) driver;
		    JSE2.executeScript("arguments[0].scrollIntoView(true);", element2);
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC18", "Enter Email", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("HSPL@Test.com");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC19", "Enter Address Line 1", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("Navle Bridge");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC20", "Enter Address Line 2", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Narhe");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC21", "Click on State Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown(), "Click on State Drpopdown");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC22", "Click on State Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getState_Dropdown_Value(), "Click on State Drpopdown Value");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC23", "Click on City Dropdown", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown(), "Click on City Dropdown");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC24", "Click on City Dropdown Value", () -> {
		    Liabrary.custom_click(SEBS.getCity_Dropdown_Value(), "Click on City Dropdown Value");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC25", "Enter Pin Code", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
		});
		Thread.sleep(1000);
		
		// Calendar code – Skipped if not present in original
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/05/1998");
		
/*
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC26", "Enter Aadhar Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("803756789012");
		   
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC27", "Enter PAN Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("AZVPK2525M");
		    
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_28", "Scroll to Camera Icon", () -> {
		    WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]"));
		    JavascriptExecutor JSE3 = (JavascriptExecutor) driver;
		    JSE3.executeScript("arguments[0].scrollIntoView(true);", element3);
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_29", "Enter GST Number", () -> {
		    driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27AAAPA1234A1Z5");
		});
		Thread.sleep(1000);
		  
		  */
		  
		  
		  //Camera Click
		 ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_30", "Click on camera button", ()-> {  
		        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
		        Thread.sleep(1000);

		        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_31", "Select camera  and capture", ()-> {  
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

		        Thread.sleep(2000);
		        
		        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_32", "Select camera  and capture", ()-> { 
		        	
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
	        
		        ObjectRepo.startTestAndLog_1_SS("SEBSNew_Contractors_Test_33", "Click on camera button", ()-> {  
			        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[2]")).click();});
			        Thread.sleep(1000);
        
			        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_034", "Select camera  and capture", ()-> {  
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

			        Thread.sleep(2000);
			        
			        ObjectRepo.startTestAndLog_1_SS("SEBS_New_New_Contractors_Test_TC_035", "Select camera  and capture", ()-> { 
			        	
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
		        
	       ObjectRepo.startTestAndLog_1_SS("SEBS_New_Applicator_Creat TC_35", "Click on save button", () -> {
	       driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click(); });
	       Thread.sleep(1000);
	       
	       
	}
	
	
	
	
	
	
}