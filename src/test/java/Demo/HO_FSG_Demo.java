package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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

public class HO_FSG_Demo extends BaseClass{
	
	
	
	@Test(priority = 0)
	public void FSG_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be select Master Menu.", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		});
		Thread.sleep(1000);
		   
		
		ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should be select FSG Master sub menu.", () -> {
		    Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should be select FSG Master menu.", () -> {
		    Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
		});
		Thread.sleep(1000);

		

		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should be click on Add btn.", () -> {
		    Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should be click on Channeltype dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should be click on ChannelTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should be click on FSGType Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should be click on FSGTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGTypeValue_Dropdown(), "FSGTypeValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should be click on Distributor Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should be click on DistributorValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should be send Employee Code Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 13", "Verify that user should be send FSG Name Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 14", "Verify that user should be send Address1 Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 15", "Verify that user should be select State Dropdown.", () -> {
		    Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 16", "Verify that user should be select StateValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 17", "Verify that user should be select Town Dropdown.", () -> {
		    Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 18", "Verify that user should be select TownValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should be send Email ID Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 20", "Verify that user should be send PinCode Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 21", "Verify that user should be send MobileNo Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 22", "Verify that user should be send PanNo Textbox.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
		});
		Thread.sleep(3000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 23", "Verify that user should be click on Close btn.", () -> {
		    Liabrary.custom_click(FA.getClose_btn(), "Close btn");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 24", "Click on Options icon.", () -> {
		    driver.findElement(By.xpath("(//span[@class='t-font-icon rgIcon rgOptionsIcon'])[9]")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 25", "Click on Filter dropdown input.", () -> {
		    driver.findElement(By.xpath("(//input[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRCMBFirstCond_Input'])[1]")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 26", "Select 'Contains' from filter condition.", () -> {
		    driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRCMBFirstCond_DropDown']//li[text()='Contains']")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 27", "Enter Mobile Number for filter.", () -> {
		    driver.findElement(By.xpath("(//input[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_rghcMenu_i10_HCFMRTBFirstCond'])[1]")).sendKeys("9986434699");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 28", "Click on Filter button.", () -> {
		    driver.findElement(By.xpath("//span[normalize-space()='Filter']")).click();
		});
		Thread.sleep(1000);

				/*
			
//			ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
			String month= "November 2024";
		    String date = "28";
		    
			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_popupButton']")).click();
		    
			while(true)
			{
			String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_calendar_Title']")).getText();
			
			if(text.equals(month))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
			}
			Thread.sleep(1000);	
			}

		
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_calendar']//table//tbody//tr//td//a[text()='28']"));
			
			for(WebElement element : ele) {
				
				String date1 = element.getText();
				
				if(date1.equals(date)) {
				
					element.click();
					
					break;
					
			}
			
			}
		
		*/
		
			// Find all the rows in the grid (excluding header rows, if applicable)
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData']"));
		    System.out.println("");
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
				else 
				{
				    System.out.println("No rows found in the grid.");
				}
			
			
		
			Thread.sleep(2000);
	
	
	}
	
	
	@Test(priority = 1)
	  public void RM_PJPmaster() throws Exception {
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		RM_PJPMaster PM1 = PageFactory.initElements(driver,RM_PJPMaster.class);
		RM_PJPMaster_ViewPage PM2= PageFactory.initElements(driver,RM_PJPMaster_ViewPage.class);
		Common_Data CD = PageFactory.initElements(driver,Common_Data.class);

		
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be select Master Menu.", () -> {
		    Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should be select Route Master sub menu.", () -> {
		    Liabrary.custom_click(hp.getRouteMaster_SubMenu(), "Select Route Master Submenu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should be select PJP Master Page.", () -> {
		    Liabrary.custom_click(PM1.getPJP_Master_Menu(), "Select PJP Master Page");
		});
		Thread.sleep(1000);

		WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("(//*[text()='PJP Master'])[2]"));
		String Actual_Text = PJP_Master_Header_Text.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "PJP Master";
		ObjectRepo.AssertTextAndLog(Actual_Text, Expected_Text);
		Thread.sleep(2000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 4", "Verify that user should be Select Division Dropdown.", () -> {
		    Liabrary.custom_click(PM1.getSelect_Division_Dropdown(), "Select Division From dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should be Select Division Dropdown Value.", () -> {
		    Liabrary.custom_click(PM1.getSelect_Division_Dropdown_Value(), "Select Division From dropdown Value");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should be Select Channel Type Dropdown.", () -> {
		    Liabrary.custom_click(PM1.getChanel_Type_Dropdown(), "Select Channel Type dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should be Select Channel Type Dropdown Value.", () -> {
		    Liabrary.custom_click(PM1.getChanel_Type_Dropdown_Value(), "Select Channel Type dropdown Value");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should be Select Distributor Dropdown.", () -> {
		    Liabrary.custom_click(PM1.getDistributor_Name_Dropdown(), "Select Distributor dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should be Select Distributor Name Dropdown Value.", () -> {
		    Liabrary.custom_click(PM1.getDistributor_Name_Dropdown_Value(), "Select Distributor Name dropdown Value");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should be Select FSG Name Dropdown.", () -> {
		    Liabrary.custom_click(PM1.getFSG_Name_Dropdown(), "Select FSG Name dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should be Select FSG Name Dropdown Value.", () -> {
		    Liabrary.custom_click(PM1.getFSG_Name_Dropdown_Value(), "Select FSG Name dropdown Value");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should be click on View btn.", () -> {
		    Liabrary.custom_click(CD.getView_Btn(), "Click on View Button");
		});
		Thread.sleep(1000);

	
	
	}
	
	
	
	
	@Test(priority = 2)
	public void FSG_MasterHomepage1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should select Master Menu.", () -> {
		    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should select FSG Master sub menu.", () -> {
		    Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should select FSG Master menu.", () -> {
		    Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
		});
		Thread.sleep(1000);

		

		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should click on Add button.", () -> {
		    Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should click on Channel Type dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should select Channel Type value.", () -> {
		    Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should click on FSG Type dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should select FSG Type value.", () -> {
		    Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should click on Distributor dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should select Distributor value.", () -> {
		    Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should enter Employee Code.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 13", "Verify that user should enter FSG Name.", () -> {
		    Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 14", "Verify that user should enter Address1.", () -> {
		    Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 15", "Verify that user should select State.", () -> {
		    Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 16", "Verify that user should select State value.", () -> {
		    Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 17", "Verify that user should select Town.", () -> {
		    Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 18", "Verify that user should select Town value.", () -> {
		    Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should enter Email ID.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 20", "Verify that user should enter Pin Code.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 21", "Verify that user should enter Mobile Number.", () -> {
		    Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("Test Case 22", "Verify that user should enter PAN Number.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
		});
		Thread.sleep(3000);

	
	
	}
	
	
	@Test(priority = 3)
	public void FSG_EnterEmailID() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should select Master Menu.", () -> {
		    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should select FSG Master sub menu.", () -> {
		    Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should select FSG Master menu.", () -> {
		    Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
		});

		

		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should click on Add btn.", () -> {
		    Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should click on Channeltype dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should click on ChannelTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should click on FSGType Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should click on FSGTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should click on Distributor Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should click on DistributorValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should send Employee Code.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 13", "Verify that user should send FSG Name.", () -> {
		    Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 14", "Verify that user should send Address1.", () -> {
		    Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 15", "Verify that user should select State.", () -> {
		    Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 16", "Verify that user should select StateValue.", () -> {
		    Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 17", "Verify that user should select Town.", () -> {
		    Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 18", "Verify that user should select TownValue.", () -> {
		    Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
		});

		/*
		ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should send Email ID.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
		});
		*/

		ObjectRepo.startTestAndLog_1_SS("Test Case 20", "Verify that user should send PinCode.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 21", "Verify that user should send MobileNo.", () -> {
		    Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 5), "MobileNo Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 22", "Verify that user should send PanNo.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 23", "Verify that user should click on Save button.", () -> {
		    Liabrary.custom_click(FA.getSave_btn(), "Save btn");
		});

			
			ObjectRepo.Print_Dynamic_Error_Massage(driver, "//span[contains(text(), 'Enter')]", "Test Case 24");
			Thread.sleep(1000);
		
		
	
	}

	
	
	@Test(priority = 4)
	public void FSG_EnterMobileNumber() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_AddFSGMaster FA = PageFactory.initElements(driver, FSG_AddFSGMaster.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should select Master Menu.", () -> {
		    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 2", "Verify that user should select FSG Master sub menu.", () -> {
		    Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "select FSG Master sub menu");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 3", "Verify that user should select FSG Master menu.", () -> {
		    Liabrary.custom_click(FSG.getFSG_Master(), "FSG Master menu");
		});

		

		ObjectRepo.startTestAndLog_1_SS("Test Case 5", "Verify that user should click on Add btn.", () -> {
		    Liabrary.custom_click(FA.getAdd_btn(), "Add btn");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 6", "Verify that user should click on Channeltype dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelType_Dropdown(), "Channeltype dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 7", "Verify that user should click on ChannelTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getChannelTypeValue_Dropdown(), "ChannelTypeValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 8", "Verify that user should click on FSGType Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGType_Dropdown(), "FSGType Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 9", "Verify that user should click on FSGTypeValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getFSGTypeValue1_Dropdown(), "FSGTypeValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 10", "Verify that user should click on Distributor Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributor_Dropdown(), "Distributor Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 11", "Verify that user should click on DistributorValue Dropdown.", () -> {
		    Liabrary.custom_click(FA.getDistributorValue_Dropdown(), "DistributorValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 12", "Verify that user should send Employee Code.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmployee_Code_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 0), "Employee Code Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 13", "Verify that user should send FSG Name.", () -> {
		    Liabrary.custom_Sendkeys(FA.getFSG_Name_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 1), "FSG Name Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 14", "Verify that user should send Address1.", () -> {
		    Liabrary.custom_Sendkeys(FA.getAddress1_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 2), "Address1 Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 15", "Verify that user should select State.", () -> {
		    Liabrary.custom_click(FA.getState_Dropdown(), "State Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 16", "Verify that user should select StateValue.", () -> {
		    Liabrary.custom_click(FA.getStateValue_Dropdown(), "StateValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 17", "Verify that user should select Town.", () -> {
		    Liabrary.custom_click(FA.getTown_Dropdown(), "Town Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 18", "Verify that user should select TownValue.", () -> {
		    Liabrary.custom_click(FA.getTownValue_Dropdown(), "TownValue Dropdown");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 19", "Verify that user should send Email ID.", () -> {
		    Liabrary.custom_Sendkeys(FA.getEmail_ID_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 3), "Email ID Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 20", "Verify that user should send PinCode.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPinCode_Textbox(), excel.getNumericdata("HO_ADD_FSG", 1, 4), "PinCode Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 21", "Verify that user should send MobileNo.", () -> {
		    Liabrary.custom_Sendkeys(FA.getMobileNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 3, 5), "MobileNo Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 22", "Verify that user should send PanNo.", () -> {
		    Liabrary.custom_Sendkeys(FA.getPanNo_Textbox(), excel.getStringdata("HO_ADD_FSG", 1, 6), "PanNo Textbox");
		});

		ObjectRepo.startTestAndLog_1_SS("Test Case 23", "Verify that user should click on Save btn.", () -> {
		    Liabrary.custom_click(FA.getSave_btn(), "Save btn");
		});

			
			ObjectRepo.Print_Dynamic_Error_Massage(driver, "//span[contains(text(), 'Enter')]", "Test Case 24");
			Thread.sleep(1000);
		
		
	
	}
	
	
		

}
