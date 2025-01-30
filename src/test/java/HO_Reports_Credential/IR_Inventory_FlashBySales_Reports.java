package HO_Reports_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Reports.IR_Inventory_FlashBy_Product_Report_Main;

public class IR_Inventory_FlashBySales_Reports extends BaseClass {

	
	@Test

	public void Inventory_FlashBySales_Reports () throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);
	IR_Inventory_FlashBy_Product_Report_Main IFBSR = PageFactory.initElements(driver,IR_Inventory_FlashBy_Product_Report_Main.class);
	
	
   //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be click on Report Menu");	
	Liabrary.custom_click(hp.getReports_Menu(),"Click On Reports menu");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Click On Inventory_Report_SubMenu");	
	Liabrary.custom_click(hp.getInventory_Report_SubMenu(),"Click On Inventory_Report_SubMenu");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Click on Inventory Flash By Sales Hierarchy Report Menu");	
	Liabrary.custom_click(IFBSR.getInventory_FlashBy_Product_Report_Menu(),"Click On Inventory Flash By Sales Hierarchy Report Menu");
	Thread.sleep(1000);
	
	
	WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
	String Actual_Text = Dealer_Details_Approval.getText();
	System.out.println(Actual_Text);
	String Expected_Text = "Inventory Flash By Sales Hierarchy Report";
	Assert.assertEquals(Expected_Text, Actual_Text);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Click On Product Dropdown ");	
	Liabrary.custom_click(IFBSR.getProduct_Dropdown(),"Click On Product Dropdown");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select Product Dropdown value ");	
	Liabrary.custom_click(IFBSR.getProduct_Dropdown_Value(),"Select Product Dropdown Value");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Click On Sales Hierarchy Dropdown ");	
	Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown(),"Click On Sales Hierarchy Dropdown");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be Select Sales Hierarchy Dropdown Value");	
	Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown_Value(),"Select Sales Hierarchy Dropdown Value");
	Thread.sleep(1000);
	
	
	//Geography Hierarchy
	//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be Click On Geography Hierarchy Dropdown ");	
	Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown(),"select Geography Hierarchy Dropdown ");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be Select Sales Hierarchy Dropdown Value");	
	Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown_Value(),"select Geography Hierarchy Dropdown Value");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be Click On For Year Dropdown ");	
	Liabrary.custom_click(IFBSR.getFor_Year_Dropdown(),"select For Year Dropdown ");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 11 : Verify that user should be select For Year Dropdown Value");	
	Liabrary.custom_click(IFBSR.getFor_Year_Dropdown_Value(),"select For Year Dropdown Value");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 12: Verify that user should be Click On For Month Dropdown ");	
	Liabrary.custom_click(IFBSR.getFor_Month_Dropdown(),"select For Month Dropdown ");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 13 : Verify that user should be Select For Month Dropdown Value");	
	Liabrary.custom_click(IFBSR.getFor_Month_Dropdown_Value(),"select For Month Dropdown Value");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 14 : Verify that user should be select Report Level Dropdown ");	
	Liabrary.custom_click(IFBSR.getReport_Level_Dropdown(),"select Report Level Dropdown");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 15 : Verify that user should be select Report Level Dropdown Value");	
	Liabrary.custom_click(IFBSR.getReport_Level_Dropdown_Value(),"select Report Level Dropdown Value");
	Thread.sleep(1000);
	
	
    //ObjectRepo.test.log(Status.INFO, "Test Case 16: Verify that user should be Click on View Button");	
     Liabrary.custom_click(IFBSR.getView_Button(),"Click on View Button");
     Thread.sleep(1000);
     
     
     //ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be Select Grid Data Value");	
     Liabrary.custom_click(IFBSR.getGrid_Button_Value(),"Select Grid Data value");
     Thread.sleep(1000);
     
     
   //ObjectRepo.test.log(Status.INFO, "Test Case 18 : Verify that user should be Click on Download button");	
     Liabrary.custom_click(IFBSR.getDownload_Button(),"Click on Download button");
     Thread.sleep(1000);

 
		

	}
	
	
	
}
