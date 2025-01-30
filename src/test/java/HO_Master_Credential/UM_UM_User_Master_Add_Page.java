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
import HO_Master.UM_User_Master;
import HO_Master.UM_User_Master_Add_Page;

public class UM_UM_User_Master_Add_Page extends BaseClass{

	
	@Test
	public void UM_User_Master_Add () throws Exception{
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
   	Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
   	UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 		
   	UM_User_Master_Add_Page UM3 = PageFactory.initElements(driver, UM_User_Master_Add_Page.class);	

	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
			Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
			Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select User Master sub menu.")
			Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
			Thread.sleep(1000);
 
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select User Master Page.");	
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			Thread.sleep(1000);	
			
			
	/*//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Click on Add Button.");	
			Liabrary.custom_click(CD.getAdd_Btn(),"Click on Add Button");
			Thread.sleep(1000);	*/
			
			
			driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_BtnAdd']")).click();
			
   //ObjectRepo.test.log(Status.INFO, "Test Case 5 :Verify that Add Button Header Text.");
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//*[text()='Add New User']"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "Add New User";
			Assert.assertEquals(Expected_Text,Actual_Text);
			Thread.sleep(1000);
			
			
    //ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be click on user type dropdown.");	
			Liabrary.custom_click(UM3.getUser_Type_Dropdown(),"Click On User Type Dropdown");
			Thread.sleep(1000);	
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be select value.");	
			Liabrary.custom_click(UM3.getUser_Type_Dropdown_Value(),"Click On User Type Dropdown value");
			Thread.sleep(1000);	

			
	/*//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be Click on division dropdown.");	
			Liabrary.custom_click(UM3.getDivision_Dropdown(),"Click On Division Dropdown");
			Thread.sleep(1000);	*/
	/*//ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be select division dropdown value.");	
			Liabrary.custom_click(UM3.getUser_Type_Dropdown(),"Click On Division Dropdown value");
			Thread.sleep(1000);	*/		

		//UserID
		Liabrary.custom_Sendkeys(UM3.getUser_ID_Textbox(), excel.getStringdata("ADD_User_Master", 1, 0), "User ID Text");
		Thread.sleep(1000);
		
		
		//Name
		Liabrary.custom_Sendkeys(UM3.getName_Textbox(), excel.getStringdata("ADD_User_Master", 1, 1), "Name ");
		Thread.sleep(1000);
		
		
		//Email
		Liabrary.custom_Sendkeys(UM3.getEmail_Textbox(), excel.getStringdata("ADD_User_Master", 1, 2), Expected_Text);
		Thread.sleep(2000);	
		
		
		//Mobile
		Liabrary.custom_Sendkeys(UM3.getMobile_Textbox(), excel.getNumericdata("ADD_User_Master", 1, 3), Expected_Text);
		Thread.sleep(1000);	

 
			
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
