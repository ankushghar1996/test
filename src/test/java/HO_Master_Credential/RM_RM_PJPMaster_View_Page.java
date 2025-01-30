package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.RM_PJPMaster;
import HO_Master.RM_PJPMaster_ViewPage;

public class RM_RM_PJPMaster_View_Page extends BaseClass{

	
	
	
	@Test
	  public void RM_PJPmaster() throws Exception {
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		RM_PJPMaster PM1 = PageFactory.initElements(driver,RM_PJPMaster.class);
		RM_PJPMaster_ViewPage PM2= PageFactory.initElements(driver,RM_PJPMaster_ViewPage.class);
		Common_Data CD = PageFactory.initElements(driver,Common_Data.class);

		//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Route Master sub menu.")
		Liabrary.custom_click(hp.getRouteMaster_SubMenu(),"Select Route Master Submenu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select PJP Master Page.");	
		Liabrary.custom_click(PM1.getPJP_Master_Menu(),"Select PJP Master Page");
		Thread.sleep(1000);
		
		
	   //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that PJP Master Header Text.");
		WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("(//*[text()='PJP Master'])[2]"));
		String Actual_Text= PJP_Master_Header_Text.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "PJP Master";
		Assert.assertEquals(Expected_Text,Actual_Text);
		
		
	   //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select Division Dropdown .");
		Liabrary.custom_click(PM1.getSelect_Division_Dropdown(), "select Division From dropdown");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Select Division Dropdown Value.");
	  	Liabrary.custom_click(PM1.getSelect_Division_Dropdown_Value(), "select Division From dropdown Value");
	    Thread.sleep(1000);
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 7: Verify that user should be Select Channel Type Dropdown .");
	  	Liabrary.custom_click(PM1.getChanel_Type_Dropdown(), "select Channel Type dropdown ");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 8: Verify that user should be Select Channel Type Dropdown Value.");
	  	Liabrary.custom_click(PM1.getChanel_Type_Dropdown_Value(), "select channel Type dropdown Value");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 9: Verify that user should be Select Distributor Dropdown .");
	  	Liabrary.custom_click(PM1.getDistributor_Name_Dropdown(), "select Distributor dropdown");
	    Thread.sleep(1000);
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be Select Distributor Name Dropdown Value.");
	  	Liabrary.custom_click(PM1.getDistributor_Name_Dropdown_Value(), "select Distributor Name dropdown Value");
	    Thread.sleep(1000);
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 11 : Verify that user should be Select FSG Name Dropdown .");
	  	Liabrary.custom_click(PM1.getFSG_Name_Dropdown(), "select FSG Name dropdown");
	    Thread.sleep(1000);
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Select Distributor Name Dropdown Value.");
	  	Liabrary.custom_click(PM1.getFSG_Name_Dropdown_Value(), "select FSG Name dropdown Value");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 13 : Verify that user is able to click View Button");	
	    Liabrary.custom_click(CD.getView_Btn(),"Click on View Button");
	    Thread.sleep(1000);	
	 
	  //FOR CASE1
	   // Alternate days Value
	  //ObjectRepo.test.log(Status.INFO, "Test Case 14 : Verify that user is able to Select Row1 Checkbox");	
	    Liabrary.custom_click(PM2.getSelect_Row1_Checkbox(),"Select Row1 Checkbox ");
	    Thread.sleep(1000);	 
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 15 : Verify that user is able to Click Visit_Frequency1 Dropdown Case1");	
	    Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Select_Case1(),"Click Visit_Frequency1 Dropdown Case1");
	    Thread.sleep(1000);	
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 16 : Verify that user is able to Select Visit_Frequency1 Dropdown Value(Alternate days) Case1");	
	    Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Value_Select_Case1(),"Click Visit_Frequency1 Dropdown Value Select(Alternate days) Case1");
	    Thread.sleep(1000);	  
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user is able to Select WeekDay1 Dropdown Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Select_Case1(),"Select WeekDay1 Dropdown Case1");
	    Thread.sleep(1000);	
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 18 : Verify that user is able to Select Day in WeekDay1 Dropdown  Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Day_Select_Case1(),"WeekDay1 Dropdown Day Select Case1");
	    Thread.sleep(1000);	 
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 19 : Verify that user is able to Select WeekDay2 Dropdown Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay2_Dropdown_Select_Case1(),"Select WeekDay2 Dropdown Case1");
	    Thread.sleep(1000);	   
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 20 : Verify that user is able to Select Day in WeekDay2 Dropdown  Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay2_Dropdown_Day_Select_Case1(),"WeekDay2 Dropdown Day Select Case1");
	    Thread.sleep(1000);	 
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 21 : Verify that user is able to Select WeekDay3 Dropdown Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay3_Dropdown_Select_Case1(),"Select WeekDay3 Dropdown Case1");
	    Thread.sleep(1000);	  
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 22 : Verify that user is able to Select Day in WeekDay3 Dropdown  Case1");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay3_Dropdown_Day_Select_Case1(),"WeekDay3 Dropdown Day Select Case1");
	    Thread.sleep(1000);	 
	    
	    
	    //Case2
	    //Fortnightly Value 
	  //ObjectRepo.test.log(Status.INFO, "Test Case 23 : Verify that user is able to Click Visit_Frequency1 Dropdown Case2");	
	    Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Select_Case2(),"Click Visit_Frequency1 Dropdown Case2");
	    Thread.sleep(1000);	
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 24 : Verify that user is able to Select Visit_Frequency1 Dropdown Value(Fortnightly) Case2");	
	    Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Value_Select_Case2(),"Click Visit_Frequency1 Dropdown Value Select (Fortnightly) Case2");
	    Thread.sleep(1000);
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 25 : Verify that user is able to Select WeekDay1 Dropdown Case2");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Select_Case2(),"Select WeekDay1 Dropdown Case2");
	    Thread.sleep(1000);	    
	    
	    
	    //ObjectRepo.test.log(Status.INFO, "Test Case 26 : Verify that user is able to Select Day in WeekDay1 Dropdown  Case2");	
	    Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Value_Select_Case2(),"WeekDay1 Dropdown Day Select Case2");
	    Thread.sleep(1000);	 
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 27 : Verify that user is able to Select Frequency Details Dropdown Case2");	
	    Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Select_Case2(),"Select Frequency Details Dropdown Case2");
	    Thread.sleep(1000);	 
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 28 : Verify that user is able to Select Frequency Details Dropdown Value (Second & Forth Week) Case2");	
	    Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Value_Select_Case2(),"Select Frequency Details Dropdown Value(Second & Forth Week) Case2");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 29 : Verify that user is able to click Save Button");	
	    Liabrary.custom_click(CD.getSave_Btn(),"Click on Save Button");
	    Thread.sleep(1000);
	    
	    
	  //ObjectRepo.test.log(Status.INFO, "Test Case 30 : Verify that user is able to click close Button");	
	    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
	    Thread.sleep(1000);


	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
