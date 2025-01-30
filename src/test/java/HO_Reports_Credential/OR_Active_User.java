package HO_Reports_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Reports.OR_Active_User_Main;

public class OR_Active_User extends BaseClass{

	
	
	@Test	
	public void _Active_User_Reports () throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	OR_Active_User_Main AU = PageFactory.initElements(driver,OR_Active_User_Main.class);	

 
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be click on Report Menu");	
	  Liabrary.custom_click(hp.getReports_Menu(),"Click On Reports menu");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Click On Other_Report_SubMenu");	
		Liabrary.custom_click(hp.getOther_Report_SubMenu(),"Click On Other_Report_SubMenu");
		Thread.sleep(1000);

		
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Click on Active_User_Report Menu");	
		Liabrary.custom_click(AU.getActive_User_Report_Menu(),"Click On Active_User_Report Menu");
		Thread.sleep(1000);
		
		
	//header text
		WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text = Header_Text.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Active Users Reports";
		Assert.assertEquals(Expected_Text,Actual_Text);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Select_User_Type_Dropdown");	
		Liabrary.custom_click(AU.getSelect_User_Type_Dropdown(),"Select_User_Type_Dropdown");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select_User_Type_Dropdown Value ");	
		Liabrary.custom_click(AU.getSelect_User_Type_Dropdown_Value(),"Select_User_Type_Dropdown Value");
		Thread.sleep(1000);
 
		
    //ObjectRepo.test.log(Status.INFO, "Test Case 6: Verify that user should be Click on View Button");	
	     Liabrary.custom_click(AU.getView_Button(),"Click on View Button");
	     Thread.sleep(1000);
	     
	     
     //ObjectRepo.test.log(Status.INFO, "Test Case 7: Verify that user should be Click on Download button");	
	     Liabrary.custom_click(AU.getDownload_Button(),"Click on Download button");
	     Thread.sleep(1000);


	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
