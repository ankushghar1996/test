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
import HO_Master.UM_User_Master_View_Page;

public class UM_UM_User_Master_View_Page extends BaseClass{

	
	
	@Test
		public void UM_User_Master_View() throws Exception{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
		UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 
		UM_User_Master_View_Page UM2 = PageFactory.initElements(driver,UM_User_Master_View_Page.class); 
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC01", "Click on Master Menu", () -> {
		 Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");
		});
			Thread.sleep(1000);
			
			
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC02", "Click on User Master SubMenu", () -> {
		 Liabrary.custom_click(hp.getUserMaster_SubMenu(),"User Master Submenu");
		});
		    Thread.sleep(1000);
		    
	 
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC03", "Click on User Master Menu", () -> {	
	     Liabrary.custom_click(UM1.getUser_Master_Menu(),"User Master Page");
		});
			Thread.sleep(1000);	
			
			
	    ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC04", "Click on User Type Dropdown", () -> {	
		Liabrary.custom_click(UM1.getUser_Type_Dropdown(),"Select user type Dropdown");
	    });
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC05", "Select User Type Dropdown Value", () -> {	
		Liabrary.custom_click(UM1.getUser_Type_Dropdown_Value(),"Select User Type Dropdown Value");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC06", "Select Division Retailer Dropdown", () -> {	
		Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown(),"Select Division Retailer Dropdown");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC07", "Select Division Retailer Dropdown Value", () -> {		
		Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown_Value(),"Select Division Retailer Dropdown Value");
			});
			Thread.sleep(1000);			
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC08", "Click on Search Button", () -> {	
		Liabrary.custom_click(UM1.getSearch_Button(),"Click on Search Button");
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC09", "Click on User Master Grid Line1", () -> {	
		Liabrary.custom_click(UM2.getUserMasterGridLine1(),"user Master From Grid List");//Grid Line 1
			});
			Thread.sleep(1000);	
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC10", "Click on User Type Dropdown", () -> {		
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_BtnView']")).click();
			});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC11", "Verify User Details Header Text ", () -> {	
			WebElement UM_User_Details_Header_Text = driver.findElement(By.xpath("//*[text()='User Details']"));
			String Actual_Text= UM_User_Details_Header_Text.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "User Details";
			Assert.assertEquals(Expected_Text,Actual_Text);});
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_View_Page_TC12", "Click on Close Button", () -> {		
		Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");//
			});
			Thread.sleep(1000);			




		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
