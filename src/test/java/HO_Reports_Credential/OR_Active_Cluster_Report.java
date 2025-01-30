package HO_Reports_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Reports.OR_Active_Cluster_Report_Main;
 
public class OR_Active_Cluster_Report extends BaseClass {
 
	@Test	
	public void Order_Detailes_Reports () throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	OR_Active_Cluster_Report_Main ACR = PageFactory.initElements(driver,OR_Active_Cluster_Report_Main.class);	

 
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be click on Report Menu");
	 ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user Should be click Report menu");
	 Liabrary.custom_click(hp.getReports_Menu(),"Reports menu");
	 Thread.sleep(1000);
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Click On Order_Report_SubMenu");
	    ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user Should be Click On Order_Report_SubMenu");
		Liabrary.custom_click(hp.getOther_Report_SubMenu(),"Order_Report_SubMenu");
		Thread.sleep(1000);

	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Click on Active_Cluster_Report_Menu");
		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user Should be click On Active_Cluster_Report_Menu");
		Liabrary.custom_click(ACR.getActive_Cluster_Report_Menu(),"Active_Cluster_Report_Menu");
		Thread.sleep(1000);
		ObjectRepo.logTestWithScreenshot("");

		//header text
		WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
		String Actual_Text = Header_Text.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Active Cluster Report";
		Assert.assertEquals(Expected_Text,Actual_Text);
		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);

		//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Select Cluster_Type_Name_Dropdown ");
		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user Should be click On Cluster_Type_Name_Dropdown");
		Liabrary.custom_click(ACR.getSelect_Cluster_Type_Name_Dropdown(),"Cluster_Type_Name_Dropdown");
		Thread.sleep(1000);
		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user Should be click On Cluster_Type_Name_Dropdown Value");
		Liabrary.custom_click(ACR.getSelect_Cluster_Type_Name_Dropdown_Value(),"Cluster_Type_Name_Dropdown Value");
		Thread.sleep(1000);
 
		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user Should be click On View Button");
	     Liabrary.custom_click(ACR.getView_Button(),"View Button");
	     Thread.sleep(1000);
	     //ObjectRepo.test.log(Status.INFO, "Test Case 7: Verify that user should be Click on Download button");
	     ObjectRepo.startTestAndLog_1("Test Case 8", "Verify that user Should be click on Download button");
	     Liabrary.custom_click(ACR.getDownload_Button(),"Download button");
	     Thread.sleep(1000);
	   //  ObjectRepo.logTestWithScreenshot(null);
	}	
 
 
	@Test(priority = 1)
	public void Negative_Scenario1() throws Exception {

 
	    // Initialize the HomePage and Active Cluster Report page objects
	    HomePage hp = PageFactory.initElements(driver, HomePage.class);
	    OR_Active_Cluster_Report_Main ACR = PageFactory.initElements(driver, OR_Active_Cluster_Report_Main.class);
	    // Test Case 1: Click Reports menu
	    ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user Should be click Reports menu");
	    Liabrary.custom_click(hp.getReports_Menu(), "Reports menu");  // Automatically captures screenshot and logs the result
	    Thread.sleep(1000);
	    //ObjectRepo.logTestWithScreenshot(null);

	    // Start the test for the second action (e.g., clicking on Order Report SubMenu)
	    ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user Should be Click On Order_Report_SubMenu");
	    Liabrary.custom_click(hp.getOther_Report_SubMenu(), "Order_Report_SubMenu");
	    Thread.sleep(1000);
	  //  ObjectRepo.logTestWithScreenshot("");

	    ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user Should be click on Active Cluster Report menu");
	    Liabrary.custom_click(ACR.getActive_Cluster_Report_Menu(), "Active_Cluster_Report_Menu");
	    Thread.sleep(1000);
	   // ObjectRepo.logTestWithScreenshot("");

	 // Verify header text "Active Cluster Report"
	    WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
	    String Actual_Text = Header_Text.getText();
	    String Expected_Text_ = "Active Cluster Report";
	    ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text_);

       /* 
	    try {
	        // Assert that the actual text matches the expected text
	        Assert.assertEquals(Actual_Text, Expected_Text);
	        ObjectRepo.test.log(Status.PASS, "Header text is correct: " + Actual_Text);
	    } catch (AssertionError e) {
	        // If assertion fails, log the failure in ExtentReport
	        ObjectRepo.test.fail("Assertion failed for header text. Expected: " + Expected_Text + " but got: " + Actual_Text);
	        // Optionally take a screenshot and attach it to the report
	        String screenshotPath = ObjectRepo.takeScreenshot("Header_Text_Failure");
	        ObjectRepo.test.addScreenCaptureFromPath(screenshotPath);
	        // Rethrow the exception if you want the test to fail
	        throw e;  // Re-throw the AssertionError to mark the test as failed
	    }
*/

	    // Start the test for the download button action
	    ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user can click on Download Button");
	    Liabrary.custom_click(ACR.getDownload_Button(), "Download Button");
	    Thread.sleep(1000);

	    // Start the test for error message
	   // ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify the error message");
	    ObjectRepo.Print_Dynamic_Error_Massage(driver, "//span[contains(text(), 'Please')]", "Test_1");
	    Thread.sleep(1000);

	}
 
    
	@Test (priority = 2)//Check Error massage when click directly on View button & Also check without enter any date and input, report not view on grid list.
  	public void Negative_Scenario2() throws Exception{
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	OR_Active_Cluster_Report_Main ACR = PageFactory.initElements(driver,OR_Active_Cluster_Report_Main.class);	

 
		//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be click on Report Menu");
	   ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user can click on Reports menu");
		  Liabrary.custom_click(hp.getReports_Menu(),"Reports menu");
			Thread.sleep(1000);
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Click On Order_Report_SubMenu");	
			Liabrary.custom_click(hp.getOther_Report_SubMenu(),"Click On Order_Report_SubMenu");
			Thread.sleep(1000);
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Click on Active_Cluster_Report_Menu");	
			Liabrary.custom_click(ACR.getActive_Cluster_Report_Menu(),"Click On Active_Cluster_Report_Menu");
			Thread.sleep(1000);
			//header text
			WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
			String Actual_Text = Header_Text.getText();
			System.out.println(Actual_Text);
			String Expected_Text = "Active Cluster Report";
			Assert.assertEquals(Expected_Text,Actual_Text);
			ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text)	;

    ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify the error message"+ ""); 		
    Liabrary.custom_click(ACR.getView_Button(),"Click on View Button");
    Thread.sleep(1000);	 
    ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify the error message"+ ""); 
    ObjectRepo.Print_Dynamic_Error_Massage(driver," //span[contains(text(), 'Please')]", "Test Case 7");
    Thread.sleep(1000);
  //span[contains(text(), 'Please')]

  	 /*  
  		// Find all elements that contain the text 'required.' (error messages for "Dropdown")
    	 List<WebElement> errorMessage1 = driver.findElements(By.xpath("//span[contains(text(), 'Please')]"));
 
    	 // Check if any error message is displayed
    	 if (errorMessage1.size() > 0) {
    	     // Iterate over the list of error messages
    	     for (WebElement errorMessage : errorMessage1) {
    	         // Check if the error message is displayed
    	         if (errorMessage.isDisplayed()) {
    	             System.out.println("Error Message For Test:1: " + errorMessage.getText());
    	         }
    	     }
    	 } else {
    	     System.out.println("No error message displayed.");
    	 }	
	}
	*/
	}
	}
