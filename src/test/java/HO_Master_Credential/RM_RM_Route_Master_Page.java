package HO_Master_Credential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.RM_Route_Master;

public class RM_RM_Route_Master_Page extends BaseClass{

	
	@Test		
	public void Route_Master_Page() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	RM_Route_Master RM1 = PageFactory.initElements(driver,RM_Route_Master.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Route Master sub menu.")
		Liabrary.custom_click(hp.getRouteMaster_SubMenu(),"Select Route Master Submenu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Route Master Page.");	
		Liabrary.custom_click(RM1.getRoute_Master_Menu_Btn(),"Select Route Master Page");
		Thread.sleep(1000);
		
		
	   //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Route Master Header Text.");
		WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("//h4[text()='Route Master']"));
		String Actual_Text= PJP_Master_Header_Text.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Route Master";
		Assert.assertEquals(Expected_Text,Actual_Text);	

		
	 //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be select Channel Type Dropdown");	
		Liabrary.custom_click(RM1.getChannel_Type_Dropdown(),"Select Channel Type Dropdown");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be select Channel Type Dropdown Value");	
		Liabrary.custom_click(RM1.getChannel_Type_Dropdown_Value(),"Select Channel Type Dropdown value");
		Thread.sleep(1000);	
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be select Distributor Dropdown");	
		Liabrary.custom_click(RM1.getDistributor_Dropdown(),"Select Distributor Dropdown");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be select Distributor Dropdown Value");	
		Liabrary.custom_click(RM1.getDistributor_Dropdown_Value(),"Select Distributor Dropdown value");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be click on search Button");	
		Liabrary.custom_click(RM1.getSearch_Button(),"Click On Search Button");
		Thread.sleep(1000);
		
		
	/*   List<WebElement> listPrint = driver.findElements(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster']"));
		int Print_Grid_Data = listPrint.size();
		System.out.println("Total rows in the grid: " +Print_Grid_Data);
		// Find all the rows in the grid (excluding header rows, if applicable)
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster']"));
	    for (WebElement row : rows) {
	    row.getSize();
		System.out.println(row.getText() + " with Colomn "); // Print the cell text with a separator    
		 } 
    */
		
		
		// Find all the rows in the grid (excluding header rows, if applicable)
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster']//tr"));
 
		if (rows.size() > 0) {
		    // Iterate over each row
		    for (WebElement row : rows) {
		        // Find all cells in the row (these are typically <td> elements)
		        List<WebElement> cells = row.findElements(By.tagName("td"));
		        // Check if there are any cells in the row (avoid empty rows or header row)
		        if (cells.size() > 0) {
		            // Iterate over each cell in the row and print its text
		            for (WebElement cell : cells) {
		                System.out.print(cell.getText() + " | "); // Print the cell text with a separator
		            }
		            System.out.println(); // Move to the next line after printing all cells in the row
		        }
		    }
		}
		else {
		    System.out.println("No rows found in the grid.");
		}
		Liabrary.compare_value(RM1.getVerify_Text(),"Giri Nagar");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
