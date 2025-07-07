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
import SEBS_Portal.SEBS_New_Contractors;

public class SEBS_New_Contractors_Test extends BaseClass_SEBS_Portal {
	
	    @Test(priority=0)
        public void New_Contractors() throws Exception {
		
        SEBS_New_Contractors SEBS = PageFactory.initElements(driver, SEBS_New_Contractors.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(SEBS.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC02", "Click on New Contractor Creation", () -> {
            Liabrary.custom_click(SEBS.getNew_Contractor_Creation(), "New Contractor Creation");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC03", "Click on Creation Button", () -> {
            Liabrary.custom_click(SEBS.getCreation_Button(), "Creation Button");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC04", "Click on Add Button", () -> {
        driver.findElement(By.xpath("(//div[@class='circle-add'])[1]")).click();
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "enter mobile number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9547821425");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC04", "Click on CONTINUE Button", () -> {
        driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "Click on Distributor Dropdown", () -> {
            Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown(), "Distributor Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "Select Distributor Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown_Value(), "Distributor Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC06", "Click on Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown(), "Sales Engineer Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC07", "Select Sales Engineer Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown_Value(), "Sales Engineer Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC08", "Click on Route Dropdown", () -> {
            Liabrary.custom_click(SEBS.getRoute(), "Route Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC09", "Select Route Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getRoute_Value(), "Route Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC10", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("akash jha");
        });
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12 mb-3']//select[@aria-label='Default select example']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC11", "Click on Contractor Type Dropdown", () -> {
            Liabrary.custom_click(SEBS.getContractor_Type(), "Contractor Type Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC12", "Select Contractor Type Value", () -> {
            Liabrary.custom_click(SEBS.getContractor_Type_Value(), "Contractor Type Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC13", "Enter Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contact Number']")).sendKeys("9547821989");
        });
        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC14", "Enter Email Address", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("HSPL@Test.com");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC15", "Enter Address Line 1", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("Navle Bridge");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC16", "Enter Address Line 2", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Narhe");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC17", "Click on State Dropdown", () -> {
            Liabrary.custom_click(SEBS.getState_Dropdown(), "State Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC18", "Select State Value", () -> {
            Liabrary.custom_click(SEBS.getState_Dropdown_Value(), "State Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC19", "Click on City Dropdown", () -> {
            Liabrary.custom_click(SEBS.getCity_Dropdown(), "City Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC20", "Select City Value", () -> {
            Liabrary.custom_click(SEBS.getCity_Dropdown_Value(), "City Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC21", "Enter Pincode", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC22", "Enter Aadhaar Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("803756789012");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC23", "Enter PAN Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("AZVPK2525M");
        });
        Thread.sleep(1000);

        WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC24", "Enter GST Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27AAAPA1234A1Z5");
        });
        Thread.sleep(1000);

        /* Camera Clicks
        for (int i = 1; i <= 2; i++) {
            final int index = i;
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC2" + (4 + i), "Capture Document Image " + index, () -> {
                driver.findElement(By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[" + index + "]")).click();
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                try {
                    WebElement switchCamBtn = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]")));
                    switchCamBtn.click();
                    System.out.println("Switch Camera button clicked.");
                } catch (TimeoutException e) {
                    System.out.println("Switch Camera button not found or not clickable.");
                }
                try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                try {
                    WebElement captureBtn = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[@class='capture-button'])[3]")));
                    captureBtn.click();
                    System.out.println("Capture button clicked.");
                } catch (TimeoutException e) {
                    System.out.println("Capture button not found or not clickable.");
                }
            });
            Thread.sleep(1000);
        }

*/

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_033", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
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
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_035", "Select camera  and capture", ()-> { 
	        	
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
        
        
        
	        ObjectRepo.startTestAndLog_1_SS("SEBSNew_Contractors_Test_033", "Click on camera button", ()-> {  
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
	        

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC28", "Click on SAVE button", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void New_Contractors_NS01() throws Exception {
        SEBS_New_Contractors SEBS = PageFactory.initElements(driver, SEBS_New_Contractors.class);

        //Without Click on Continue Button
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(SEBS.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC02", "Click on New Contractor Creation", () -> {
            Liabrary.custom_click(SEBS.getNew_Contractor_Creation(), "New Contractor Creation");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC03", "Click on Creation Button", () -> {
            Liabrary.custom_click(SEBS.getCreation_Button(), "Creation Button");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC04", "Click on Add Button", () -> {
        driver.findElement(By.xpath("(//div[@class='circle-add'])[1]")).click();
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "enter mobile number", () -> {
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9547821425");
        });
        Thread.sleep(1000);
        
        
//        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC04", "Click on CONTINUE Button", () -> {
//        driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "Click on Distributor Dropdown", () -> {
            Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown(), "Distributor Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC05", "Select Distributor Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getSelect_Distributor_Dropdown_Value(), "Distributor Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC06", "Click on Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown(), "Sales Engineer Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC07", "Select Sales Engineer Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getSales_Engineer_Dropdown_Value(), "Sales Engineer Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC08", "Click on Route Dropdown", () -> {
            Liabrary.custom_click(SEBS.getRoute(), "Route Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC09", "Select Route Dropdown Value", () -> {
            Liabrary.custom_click(SEBS.getRoute_Value(), "Route Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC10", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("akash jha");
        });
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("//div[@class='col-12 mb-3']//select[@aria-label='Default select example']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC11", "Click on Contractor Type Dropdown", () -> {
            Liabrary.custom_click(SEBS.getContractor_Type(), "Contractor Type Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC12", "Select Contractor Type Value", () -> {
            Liabrary.custom_click(SEBS.getContractor_Type_Value(), "Contractor Type Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC13", "Enter Contact Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contact Number']")).sendKeys("9547821989");
        });
        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC14", "Enter Email Address", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("HSPL@Test.com");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC15", "Enter Address Line 1", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 1']")).sendKeys("Navle Bridge");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC16", "Enter Address Line 2", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Address Line 2']")).sendKeys("Narhe");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC17", "Click on State Dropdown", () -> {
            Liabrary.custom_click(SEBS.getState_Dropdown(), "State Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC18", "Select State Value", () -> {
            Liabrary.custom_click(SEBS.getState_Dropdown_Value(), "State Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC19", "Click on City Dropdown", () -> {
            Liabrary.custom_click(SEBS.getCity_Dropdown(), "City Dropdown");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC20", "Select City Value", () -> {
            Liabrary.custom_click(SEBS.getCity_Dropdown_Value(), "City Dropdown Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC21", "Enter Pincode", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Pin Code']")).sendKeys("411041");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC22", "Enter Aadhaar Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("803756789012");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC23", "Enter PAN Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("AZVPK2525M");
        });
        Thread.sleep(1000);

        WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC24", "Enter GST Number", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27AAAPA1234A1Z5");
        });
        Thread.sleep(1000);

        /* Camera Clicks
        for (int i = 1; i <= 2; i++) {
            final int index = i;
            ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC2" + (4 + i), "Capture Document Image " + index, () -> {
                driver.findElement(By.xpath("(//div[@class='upload-documents-container']//span[@class='circle-camera'])[" + index + "]")).click();
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                try {
                    WebElement switchCamBtn = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//div[@class='col-2 col-lg-1']//span[@data-bs-target='#camera'])[1]")));
                    switchCamBtn.click();
                    System.out.println("Switch Camera button clicked.");
                } catch (TimeoutException e) {
                    System.out.println("Switch Camera button not found or not clickable.");
                }
                try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                try {
                    WebElement captureBtn = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[@class='capture-button'])[3]")));
                    captureBtn.click();
                    System.out.println("Capture button clicked.");
                } catch (TimeoutException e) {
                    System.out.println("Capture button not found or not clickable.");
                }
            });
            Thread.sleep(1000);
        }

*/
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_033", "Click on camera button", ()-> {  
	        driver.findElement(By.xpath("(//div[@class='upload-documents-container']//child::div//child::div//child::span[@class='circle-camera'])[1]")).click();});
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
	        
	        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC_035", "Select camera  and capture", ()-> { 
	        	
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
           
	        ObjectRepo.startTestAndLog_1_SS("SEBSNew_Contractors_Test_033", "Click on camera button", ()-> {  
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
	        
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Contractors_Test_TC28", "Click on SAVE button", () -> {
            driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
        });
        Thread.sleep(1000);
    }
}
