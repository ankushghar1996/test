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
import Com_Utility.ObjectRepo;
import HO_Master.FSG_AddFSGMaster;
import HO_Master.FSG_FSGMaster;
import HO_Master.RM_PJPMaster;
import HO_Master.RM_PJPMaster_ViewPage;

public class FSG_FSGMaster_AddPage extends BaseClass{

	@Test(priority = 0)
	public void FSG_Master_Add_Page() throws Exception {

	    HomePage hp = PageFactory.initElements(driver, HomePage.class);
	    FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
	    FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC01", "Click Master Menu", () -> {
	        Liabrary.custom_click(hp.getMaster_Menu(), " Master Menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC02", "Click On FSG Master SubMenu", () -> {
	        Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC03", "Click on FSG Master", () -> {
	        Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC04", "Verify FSG Master header Text", () -> {
	        WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
	        String Actual_Text = UploadText.getText();
	        System.out.println(Actual_Text);
	        String Expected_Text = "FSG Master";
	        Assert.assertEquals(Expected_Text, Actual_Text);
	    });
	    Thread.sleep(2000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC05", "Click Add button", () -> {
	        Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC06", "Click Channel Type Dropdown", () -> {
	        Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC07", "Select Channel Type Value", () -> {
	        Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC08", "Click FSG Type Dropdown", () -> {
	        Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC09", "Select FSG Type Value", () -> {
	        Liabrary.custom_click(FA.getFSGTypeValue_Dropdown(), "FSGTypeValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC10", "Click Distributor Dropdown", () -> {
	        Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC11", "Select Distributor Value", () -> {
	        Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC12", "Enter Employee Code", () -> {
	        Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC13", "Enter FSG Name", () -> {
	        Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC14", "Enter Address 1", () -> {
	        Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC15", "Click State Dropdown", () -> {
	        Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC16", "Select State Value", () -> {
	        Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC17", "Click Town Dropdown", () -> {
	        Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC18", "Select Town Value", () -> {
	        Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC19", "Enter Email ID", () -> {
	        Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC20", "Enter Pin Code", () -> {
	        Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC21", "Enter Mobile Number", () -> {
	        Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC22", "Enter PAN Number", () -> {
	        Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
	    });
	    Thread.sleep(3000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC23", "Click Close Button", () -> {
	        Liabrary.custom_click(FA.getClose_btn(), "Close btn");
	    });
	    Thread.sleep(1000);
	}
	
	@Test(priority = 1)
	public void FSG_Master_Add_Page_NS01() throws Exception {

	    HomePage hp = PageFactory.initElements(driver, HomePage.class);
	    FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
	    FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
	    
	    ObjectRepo.startTestAndLog_1_NS("Without click on add Button");

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC01", "Click Master Menu", () -> {
	        Liabrary.custom_click(hp.getMaster_Menu(), " Master Menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC02", "Click On FSG Master SubMenu", () -> {
	        Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC03", "Click on FSG Master", () -> {
	        Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC04", "Verify FSG Master header Text", () -> {
	        WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
	        String Actual_Text = UploadText.getText();
	        System.out.println(Actual_Text);
	        String Expected_Text = "FSG Master";
	        Assert.assertEquals(Expected_Text, Actual_Text);
	    });
	    Thread.sleep(2000);

//	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC05", "Click Add button", () -> {
//	        Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
//	    });
//	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC06", "Click Channel Type Dropdown", () -> {
	        Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC07", "Select Channel Type Value", () -> {
	        Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC08", "Click FSG Type Dropdown", () -> {
	        Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC09", "Select FSG Type Value", () -> {
	        Liabrary.custom_click(FA.getFSGTypeValue_Dropdown(), "FSGTypeValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC10", "Click Distributor Dropdown", () -> {
	        Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC11", "Select Distributor Value", () -> {
	        Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC12", "Enter Employee Code", () -> {
	        Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC13", "Enter FSG Name", () -> {
	        Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC14", "Enter Address 1", () -> {
	        Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC15", "Click State Dropdown", () -> {
	        Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC16", "Select State Value", () -> {
	        Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC17", "Click Town Dropdown", () -> {
	        Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC18", "Select Town Value", () -> {
	        Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC19", "Enter Email ID", () -> {
	        Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC20", "Enter Pin Code", () -> {
	        Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC21", "Enter Mobile Number", () -> {
	        Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC22", "Enter PAN Number", () -> {
	        Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
	    });
	    Thread.sleep(3000);

	    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_AddPage_TC23", "Click Close Button", () -> {
	        Liabrary.custom_click(FA.getClose_btn(), "Close btn");
	    });
	    Thread.sleep(1000);
	}
}

			
			
//			driver.findElement(By.xpath("(//span[@class='t-font-icon rgIcon rgOptionsIcon'])[9]")).click();
//			Thread.sleep(1000);
//			
//			
//			driver.findElement(By.xpath("(//input[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRCMBFirstCond_Input'])[1]")).click();
//			Thread.sleep(1000);
//			
//			
//			driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRCMBFirstCond_DropDown']//li[text()='Contains']")).click();
//			Thread.sleep(1000);
//			
//			
//			driver.findElement(By.xpath("(//input[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRTBFirstCond'])[1]")).sendKeys("9986434699");
//			Thread.sleep(1000);
//			
//			
//			driver.findElement(By.xpath("//span[normalize-space()='Filter']")).click();
//			Thread.sleep(1000);
//			
//				/*
//			
////			ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
//			String month= "November 2024";
//		    String date = "28";
//		    
//			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_popupButton']")).click();
//		    
//			while(true)
//			{
//			String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_calendar_Title']")).getText();
//			
//			if(text.equals(month))
//			{
//				break;
//			}
//			else
//			{
//			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
//			}
//			Thread.sleep(1000);	
//			}
//
//		
//			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_calendar']//table//tbody//tr//td//a[text()='28']"));
//			
//			for(WebElement element : ele) {
//				
//				String date1 = element.getText();
//				
//				if(date1.equals(date)) {
//				
//					element.click();
//					
//					break;
//					
//			}
//			
//			}
//		
//		*/
//		
//			// Find all the rows in the grid (excluding header rows, if applicable)
//			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData']"));
//		    System.out.println("");
//				if (rows.size() > 0) {
//				    // Iterate over each row
//				    for (WebElement row : rows) {
//				        // Find all cells in the row (these are typically <td> elements)
//				        List<WebElement> cells = row.findElements(By.tagName("td"));
//				        // Check if there are any cells in the row (avoid empty rows or header row)
//				        if (cells.size() > 0) {
//				            // Iterate over each cell in the row and print its text
//				            for (WebElement cell : cells) {
//				                System.out.print(cell.getText() + " | "); // Print the cell text with a separator
//				            }
//				            System.out.println(); // Move to the next line after printing all cells in the row
//				        }
//				    }
//				}
//				else 
//				{
//				    System.out.println("No rows found in the grid.");
//				}
//			
//			Thread.sleep(2000);
	
	
//	}
//	
//	
//	@Test(priority = 1)
//	  public void RM_PJPmaster() throws Exception {
//		HomePage hp = PageFactory.initElements(driver,HomePage.class);
//		RM_PJPMaster PM1 = PageFactory.initElements(driver,RM_PJPMaster.class);
//		RM_PJPMaster_ViewPage PM2= PageFactory.initElements(driver,RM_PJPMaster_ViewPage.class);
//		Common_Data CD = PageFactory.initElements(driver,Common_Data.class);
//		
//		
//		Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(hp.getRouteMaster_SubMenu(),"Select Route Master Submenu");
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(PM1.getPJP_Master_Menu(),"Select PJP Master Page");
//		Thread.sleep(1000);
//		
//		
//		WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("(//*[text()='PJP Master'])[2]"));
//		String Actual_Text= PJP_Master_Header_Text.getText();
//		System.out.println(Actual_Text);
//		String Expected_Text= "PJP Master";
//		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);
//		Thread.sleep(2000);
//		
//		
//		Liabrary.custom_click(PM1.getSelect_Division_Dropdown(), "select Division From dropdown");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getSelect_Division_Dropdown_Value(), "select Division From dropdown Value");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getChanel_Type_Dropdown(), "select Channel Type dropdown ");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getChanel_Type_Dropdown_Value(), "select channel Type dropdown Value");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getDistributor_Name_Dropdown(), "select Distributor dropdown");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getDistributor_Name_Dropdown_Value(), "select Distributor Name dropdown Value");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getFSG_Name_Dropdown(), "select FSG Name dropdown");
//	    Thread.sleep(1000);
//	    
//	    
//	  	Liabrary.custom_click(PM1.getFSG_Name_Dropdown_Value(), "select FSG Name dropdown Value");
//	    Thread.sleep(1000);
//	    
//	    
//	    Liabrary.custom_click(CD.getView_Btn(),"Click on View Button");
//	    Thread.sleep(1000);
//	
//	
//	}
//	
//	
//		@Test(priority = 2)
//		public void FSG_MasterHomepage1() throws Exception {
//		
//		
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
//		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
//		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
//		
//	
//		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
//		Thread.sleep(1000);
//		   
//		
//		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
//		Thread.sleep(1000);
//	
//		Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
//		Thread.sleep(1000);
//	
//	
//		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
//		String Actual_Text=UploadText.getText();
//		System.out.println(Actual_Text);
//		String Expected_Text="FSG Master";
//		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);
//		Thread.sleep(2000);
//	
//			Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
//			Thread.sleep(1000);
//			
//			Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
//			Thread.sleep(1000);
//			
//			Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
//			Thread.sleep(3000);
//		
//	
//	
//	}
//	
//	
//		@Test(priority = 3)
//		public void FSG_EnterEmailID() throws Exception {
//		
//		
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
//		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
//		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
//		
//	
//		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
//		Thread.sleep(1000);
//		   
//		
//		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
//		Thread.sleep(1000);
//	
//		Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
//		Thread.sleep(1000);
//	
//	
//		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
//		String Actual_Text=UploadText.getText();
//		System.out.println(Actual_Text);
//		String Expected_Text="FSG Master";
//		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);
//		Thread.sleep(2000);
//	
//			Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
//			Thread.sleep(1000);
//			
//			Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
//			Thread.sleep(1000);
//			
//			Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
//			Thread.sleep(1000);
//			
//		/*	
//			ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should be send Email ID Textbox.");
//			Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
//			Thread.sleep(1000);
//		*/	
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
//			Thread.sleep(3000);
//			
//			
//			Liabrary.custom_click(FA.getSave_btn(), "save btn");
//			Thread.sleep(1000);
//			
//			ObjectRepo.Print_Dynamic_Flash_Massage(driver, "//span[contains(text(), 'Enter')]", "Test Case 24");
//			Thread.sleep(1000);
//		
//		
//	
//	}
//
//	
//	
//	@Test(priority = 4)
//	public void FSG_EnterMobileNumber() throws Exception {
//		
//		
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
//		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
//		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
//		
//	
//		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
//		Thread.sleep(1000);
//		   
//		
//		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
//		Thread.sleep(1000);
//	
//		Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
//		Thread.sleep(1000);
//		
//		
//		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
//		String Actual_Text=UploadText.getText();
//		System.out.println(Actual_Text);
//		String Expected_Text="FSG Master";
//		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);
//		Thread.sleep(2000);
//	
//		Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
//		Thread.sleep(1000);
//			
//			Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
//			Thread.sleep(1000);
//		
//			
//			Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
//			Thread.sleep(1000);
//			
//	
//			Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
//			Thread.sleep(1000);
//			
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 3, 5), "MobileNo Textbox");
//			Thread.sleep(1000);
//			
//			
//			Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
//			Thread.sleep(3000);
//			
//			
//			Liabrary.custom_click(FA.getSave_btn(), "save btn");
//			Thread.sleep(1000);
//			
//			ObjectRepo.Print_Dynamic_Flash_Massage(driver, "//span[contains(text(), 'Enter')]", "Test Case 24");
//			Thread.sleep(1000);
//			
//	
//	}
//	
//	
//		
//
//}
