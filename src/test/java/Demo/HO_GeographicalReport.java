package Demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Reports.IR_Geographical_Hierarchy_Report_Main;
 
 
public class HO_GeographicalReport extends BaseClass {

 
	@Test(priority = 0)
	public void Inventory_FlashBy_Product_Report () throws Exception {
	HomePage hp = PageFactory.initElements(driver,HomePage.class);
	IR_Geographical_Hierarchy_Report_Main GHR = PageFactory.initElements(driver,IR_Geographical_Hierarchy_Report_Main.class);
	
	
	ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be click on Report Menu", () -> {
	    Liabrary.custom_click(hp.getReports_Menu(), "Reports menu");
	    
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should be click on Inventory_Report_SubMenu", () -> {
	    Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Inventory_Report_SubMenu");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should be click on Geographical Hierarchy Report Menu", () -> {
	    Liabrary.custom_click(GHR.getGeographical_Hierarchy_Menu(), "Geographical Hierarchy Report Menu");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should be click on Product Dropdown", () -> {
	    Liabrary.custom_click(GHR.getProduct_Dropdown(), "Product Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should be Select Product Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getProduct_Dropdown_Value(), "Product Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should be Select Sales Hierarchy Dropdown", () -> {
	    Liabrary.custom_click(GHR.getSales_Hierarchy_Dropdown(), "Sales Hierarchy Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should be Select Sales Hierarchy Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should be select Geography Hierarchy Dropdown", () -> {
	    Liabrary.custom_click(GHR.getGeography_Hierarchy_Dropdown(), "select Geography Hierarchy Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should be select Geography Hierarchy Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getGeography_Hierarchy_Dropdown_Value(), "select Geography Hierarchy Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should be select For Year Dropdown", () -> {
	    Liabrary.custom_click(GHR.getFor_Year_Dropdown(), "select For Year Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should be select For Year Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getFor_Year_Dropdown_Value(), "select For Year Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 13", "Verify that user should be select For Month Dropdown", () -> {
	    Liabrary.custom_click(GHR.getFor_Month_Dropdown(), "For Month Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 14", "Verify that user should be select For Month Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getFor_Month_Dropdown_Value(), "select For Month Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 15", "Verify that user should be select Report Level Dropdown", () -> {
	    Liabrary.custom_click(GHR.getReport_Level_Dropdown(), "Report Level Dropdown");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 16", "Verify that user should be select Report Level Dropdown Value", () -> {
	    Liabrary.custom_click(GHR.getReport_Level_Dropdown_Value(), "Report Level Dropdown Value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 17", "Verify that user should be Click on View Button", () -> {
	    Liabrary.custom_click(GHR.getView_Button(), "View Button");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 18", "Verify that user should be Select Grid Data value", () -> {
	    Liabrary.custom_click(GHR.getGrid_Data_Value(), "Select Grid Data value");
	});
	Thread.sleep(1000);

	ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should be Click on Download button", () -> {
	    Liabrary.custom_click(GHR.getDownload_Button(), "Download button");
	});
	Thread.sleep(1000);

     
	}	

	
	@Test (priority = 1)
    public void Negative_Scenario_1() throws Exception{
    HomePage hp2 = PageFactory.initElements(driver,HomePage.class);
    IR_Geographical_Hierarchy_Report_Main GHR2 = PageFactory.initElements(driver,IR_Geographical_Hierarchy_Report_Main.class);
    
    
    ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be Click on Reports menu", () -> {
        Liabrary.custom_click(hp2.getReports_Menu(), "Reports menu");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should be Click On Inventory_Report_SubMenu", () -> {
        Liabrary.custom_click(hp2.getInventory_Report_SubMenu(), "Inventory_Report_SubMenu");
    });
    Thread.sleep(1000);

    ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should be Click On Geographical Hierarchy Report Menu", () -> {
        Liabrary.custom_click(GHR2.getGeographical_Hierarchy_Menu(), "Geographical Hierarchy Report Menu");
    });
    Thread.sleep(1000);

    WebElement Header_Text1 = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
    String Actual_Text1 = Header_Text1.getText();
    System.out.println(Actual_Text1);
    String Expected_Text1 = "Inventory Flash By Geographical Hierarchy";
    Assert.assertEquals(Expected_Text1, Actual_Text1);
    ObjectRepo.AssertTextAndLog(Actual_Text1, Expected_Text1);

    ObjectRepo.startTestAndLog_1_SS("Test Case 4", "Verify that user should be Click On View Button", () -> {
        Liabrary.custom_click(GHR2.getView_Button(), "View Button");
    });
    Thread.sleep(1000);

  		// Find all elements that contain the text 'required.' (error messages for "Dropdown")
    	 List<WebElement> errorMessage1 = driver.findElements(By.xpath("//span[contains(text(), 'required.')]"));
 
    	 // Check if any error message is displayed
          if (errorMessage1.size() > 0) {
    	     // Iterate over the list of error messages
    	     for (WebElement errorMessage : errorMessage1) {
    	         // Check if the error message is displayed
    	         if (errorMessage.isDisplayed()) {
    	        	 System.out.print("");
    	             System.out.println("Error Message For Test:1: " + errorMessage.getText());
    	             System.out.print("");
    	         }
    	     }
    	 } else {
    	     System.out.println("No error message displayed.");
    	 }	
          ObjectRepo.Print_Dynamic_Flash_Massage(driver,"//span[contains(text(), 'required.')]", "Test Case 5");
    }

	
	
   @Test (priority = 2)
   public void Negative_Scenario_2() throws Exception{
	   HomePage hp2 = PageFactory.initElements(driver,HomePage.class);
	    IR_Geographical_Hierarchy_Report_Main GHR2 = PageFactory.initElements(driver,IR_Geographical_Hierarchy_Report_Main.class);	
	    
	   
	    ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be Click On Reports menu", () -> {
	        Liabrary.custom_click(hp2.getReports_Menu(), "Reports menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should be Click On Inventory_Report_SubMenu", () -> {
	        Liabrary.custom_click(hp2.getInventory_Report_SubMenu(), "Inventory_Report_SubMenu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should be Click On Geographical Hierarchy Report Menu", () -> {
	        Liabrary.custom_click(GHR2.getGeographical_Hierarchy_Menu(), "Click On Geographical Hierarchy Report Menu");
	    });
	    Thread.sleep(1000);

	    WebElement Header_Text1 = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
	    String Actual_Text1 = Header_Text1.getText();
	    System.out.println(Actual_Text1);
	    String Expected_Text1 = "Inventory Flash By Geographical Hierarchy";
	    Assert.assertEquals(Expected_Text1, Actual_Text1);
	    ObjectRepo.AssertTextAndLog(Actual_Text1, Expected_Text1);

	    ObjectRepo.startTestAndLog_1_SS("Test Case 4", "Verify that user should be Click On Sales_Hierarchy_Dropdown", () -> {
	        Liabrary.custom_click(GHR2.getSales_Hierarchy_Dropdown(), "Click on Sales Hierarchy Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should be Click On Sales_Hierarchy_Dropdown_Value", () -> {
	        Liabrary.custom_click(GHR2.getSales_Hierarchy_Dropdown_Value(), "Click on Sales Hierarchy Dropdown Value");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should be Click On View btn.", () -> {
	        Liabrary.custom_click(GHR2.getView_Button(), "Click on View Button");
	    });
	    Thread.sleep(1000);

	  	 
	  	 
	  	//span[contains(text(), 'required.')]
	  	 ObjectRepo.Print_Dynamic_Flash_Massage(driver, "//span[contains(text(), 'required.')]", "test case ");
    	 Thread.sleep(1000);

   }

 
	
}
	
	
	
	
	
	
	

