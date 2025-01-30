package HO_Reports_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Reports.ODR_Order_Summary_Report_Main;

public class ODR_Order_Summary_Report extends BaseClass{

	
	
	@Test
		public void Order_Detailes_Reports () throws Exception {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ODR_Order_Summary_Report_Main OSR = PageFactory.initElements(driver,ODR_Order_Summary_Report_Main.class);	

	 
		//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be click on Report Menu");	
		  Liabrary.custom_click(hp.getReports_Menu(),"Click On Reports menu");
			Thread.sleep(1000);
			
			
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Click On Order_Report_SubMenu");	
			Liabrary.custom_click(hp.getOrder_Report_SubMenu(),"Click On Order_Report_SubMenu");
			Thread.sleep(1000);
			
			
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Click on Order_Detailes_Reports Menu");	
			Liabrary.custom_click(OSR.getOrder_Summary_Report_Menu(),"Click On Order_Detailes_Reports Menu");
			Thread.sleep(1000);
			
			
			//header text
			WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_PageHeader']"));
			String Actual_Text = Header_Text.getText();
			System.out.println(Actual_Text);
			String Expected_Text = "Order Summary Report";
			Assert.assertEquals(Expected_Text,Actual_Text);
			
			
			//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Click On Select_Type_Master Dropdown ");	
			Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown(),"Click On Select_Type_Master_Dropdown");
			Thread.sleep(1000);
			
			
			//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select_Type Master Dropdown value ");	
			Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown_Value(),"Select Type Master Dropdown Value");
			Thread.sleep(1000);
			
			
			//Test Case 6:
			driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/10/2024");
			Thread.sleep(1000);
			
			
			//Test Case 7:
			driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("29/11/2024");
			Thread.sleep(1000);

	 
		    //ObjectRepo.test.log(Status.INFO, "Test Case 8: Verify that user should be Click on View Button");	
		     Liabrary.custom_click(OSR.getView_Button(),"Click on View Button");
		     Thread.sleep(1000);
		     
		     
		     //ObjectRepo.test.log(Status.INFO, "Test Case 9: Verify that user should be Click on Download button");	
		     Liabrary.custom_click(OSR.getDownload_Button(),"Click on Download button");
		     Thread.sleep(1000);



			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
