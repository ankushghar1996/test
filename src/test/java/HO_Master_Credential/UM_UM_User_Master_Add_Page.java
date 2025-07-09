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
import Com_Utility.ObjectRepo;
import HO_Master.UM_User_Master;
import HO_Master.UM_User_Master_Add_Page;

public class UM_UM_User_Master_Add_Page extends BaseClass{

	
	@Test(priority=0)
	public void UM_User_Master_Add () throws Exception{
		
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
   	Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
   	UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 		
   	UM_User_Master_Add_Page UM3 = PageFactory.initElements(driver, UM_User_Master_Add_Page.class);	

	
   		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_01", "Verify click on Master Menu", () -> {
        Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
   		});
   		Thread.sleep(1000);
			
			
    		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_02", "Verify click on User Master Submenu", () -> {
			Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
    		});
			Thread.sleep(1000);
 
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_03", "Select User Master Page", () -> {
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			});
			Thread.sleep(1000);	
			
			
	
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_04", "click on Add btn", () -> {
			driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_BtnAdd']")).click();
			});
			Thread.sleep(1000);	
			

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_05", "Add Button Header Text", () -> {
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//*[text()='Add New User']"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "Add New User";
			Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);
			
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_06", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown(),"Click On User Type Dropdown");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_07", "Click On User Type Dropdown value", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown_Value(),"Click On User Type Dropdown value");
			});
			Thread.sleep(1000);	

	

		//UserID
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_08", "Enter User ID", () -> {
		Liabrary.custom_Sendkeys(UM3.getUser_ID_Textbox(), excel.getStringdata("ADD_User_Master", 1, 0), "User ID Text");
			});
		Thread.sleep(1000);
		
		
		//Name
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_09", "Enter User Name", () -> {
		Liabrary.custom_Sendkeys(UM3.getName_Textbox(), excel.getStringdata("ADD_User_Master", 1, 1), "Name ");
		});
		Thread.sleep(1000);
		
		
		//Email
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_10", "Enter User Email", () -> {
		Liabrary.custom_Sendkeys(UM3.getEmail_Textbox(), excel.getStringdata("ADD_User_Master", 1, 2), "email");
		});
		Thread.sleep(1000);	
		
		
		//Mobile
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_11", "Enter User Mobile number", () -> {
		Liabrary.custom_Sendkeys(UM3.getMobile_Textbox(), excel.getNumericdata("ADD_User_Master", 1, 3), "mobile");
		});
		Thread.sleep(1000);	

 
//		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on save btn", () -> {
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnSave']")).click();
//		});
//		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on Close btn", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnClose']")).click();
		});
		Thread.sleep(1000);	
		
		
		
	}
	
	@Test(priority=1)
	public void UM_User_Master_Add_NS01() throws Exception{
		
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
   	Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
   	UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 		
   	UM_User_Master_Add_Page UM3 = PageFactory.initElements(driver, UM_User_Master_Add_Page.class);	

   	
   	     ObjectRepo.startTestAndLog_1_NS("Without Click on Select User Master Page");
	
   		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_01", "Verify click on Master Menu", () -> {
        Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
   		});
   		Thread.sleep(1000);
			
			
    		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_02", "Verify click on User Master Submenu", () -> {
			Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
    		});
			Thread.sleep(1000);
 
			
//			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_03", "Select User Master Page", () -> {
//			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
//			});
//			Thread.sleep(1000);	
			
			
	
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_04", "click on Add btn", () -> {
			driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_BtnAdd']")).click();
			});
			Thread.sleep(1000);	
			

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_05", "Add Button Header Text", () -> {
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//*[text()='Add New User']"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "Add New User";
			Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);
			
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_06", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown(),"Click On User Type Dropdown");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_07", "Click On User Type Dropdown value", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown_Value(),"Click On User Type Dropdown value");
			});
			Thread.sleep(1000);	

	

		//UserID
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_08", "Enter User ID", () -> {
		Liabrary.custom_Sendkeys(UM3.getUser_ID_Textbox(), excel.getStringdata("ADD_User_Master", 1, 0), "User ID Text");
			});
		Thread.sleep(1000);
		
		
		//Name
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_09", "Enter User Name", () -> {
		Liabrary.custom_Sendkeys(UM3.getName_Textbox(), excel.getStringdata("ADD_User_Master", 1, 1), "Name ");
		});
		Thread.sleep(1000);
		
		
		//Email
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_10", "Enter User Email", () -> {
		Liabrary.custom_Sendkeys(UM3.getEmail_Textbox(), excel.getStringdata("ADD_User_Master", 1, 2), "email");
		});
		Thread.sleep(1000);	
		
		
		//Mobile
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_11", "Enter User Mobile number", () -> {
		Liabrary.custom_Sendkeys(UM3.getMobile_Textbox(), excel.getNumericdata("ADD_User_Master", 1, 3), "mobile");
		});
		Thread.sleep(1000);	

 
//		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on save btn", () -> {
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnSave']")).click();
//		});
//		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on Close btn", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnClose']")).click();
		});
		Thread.sleep(1000);	
		
		
		
	}
	
	@Test(priority=2)
	public void UM_User_Master_Add_NS02() throws Exception{
		
		ObjectRepo.startTestAndLog_1_NS("Without Click on Add Button");
		
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
   	Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
   	UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 		
   	UM_User_Master_Add_Page UM3 = PageFactory.initElements(driver, UM_User_Master_Add_Page.class);	

	
   		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_01", "Verify click on Master Menu", () -> {
        Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
   		});
   		Thread.sleep(1000);
			
			
    		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_02", "Verify click on User Master Submenu", () -> {
			Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
    		});
			Thread.sleep(1000);
 
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_03", "Select User Master Page", () -> {
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			});
			Thread.sleep(1000);	
			
			
	
//			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_04", "click on Add btn", () -> {
//			driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_BtnAdd']")).click();
//			});
//			Thread.sleep(1000);	
			

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_05", "Add Button Header Text", () -> {
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//*[text()='Add New User']"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "Add New User";
			Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);
			
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_06", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown(),"Click On User Type Dropdown");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_07", "Click On User Type Dropdown value", () -> {
			Liabrary.custom_click(UM3.getUser_Type_Dropdown_Value(),"Click On User Type Dropdown value");
			});
			Thread.sleep(1000);	

	

		//UserID
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_08", "Enter User ID", () -> {
		Liabrary.custom_Sendkeys(UM3.getUser_ID_Textbox(), excel.getStringdata("ADD_User_Master", 1, 0), "User ID Text");
			});
		Thread.sleep(1000);
		
		
		//Name
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_09", "Enter User Name", () -> {
		Liabrary.custom_Sendkeys(UM3.getName_Textbox(), excel.getStringdata("ADD_User_Master", 1, 1), "Name ");
		});
		Thread.sleep(1000);
		
		
		//Email
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_10", "Enter User Email", () -> {
		Liabrary.custom_Sendkeys(UM3.getEmail_Textbox(), excel.getStringdata("ADD_User_Master", 1, 2), "email");
		});
		Thread.sleep(1000);	
		
		
		//Mobile
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_11", "Enter User Mobile number", () -> {
		Liabrary.custom_Sendkeys(UM3.getMobile_Textbox(), excel.getNumericdata("ADD_User_Master", 1, 3), "mobile");
		});
		Thread.sleep(1000);	

 
//		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on save btn", () -> {
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnSave']")).click();
//		});
//		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Add_Page_TC_12", "click on Close btn", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnClose']")).click();
		});
		Thread.sleep(1000);

	
	}
}
