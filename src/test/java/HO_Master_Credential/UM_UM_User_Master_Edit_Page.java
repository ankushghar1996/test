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
import HO_Master.UM_User_Master;
import HO_Master.UM_User_Master_EditPage;
import HO_Master.UM_User_Master_View_Page;

public class UM_UM_User_Master_Edit_Page extends BaseClass{

	
	@Test(priority=0)
	  public void User_Master_EditPage () throws Exception{
		  HomePage hp = PageFactory.initElements(driver,HomePage.class);
		  UM_User_Master_EditPage UM4 = PageFactory.initElements(driver,UM_User_Master_EditPage.class);	
		  UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 
		  UM_User_Master_View_Page UM2 = PageFactory.initElements(driver,UM_User_Master_View_Page.class);
		  Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		  
		  
		  ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_01", "Verify click on Master Menu", () -> {
		  Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
		  });
		  Thread.sleep(1000);
					
					
		   ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_02", "Verify click on User Master Submenu", () -> {
		   Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
		    });
			Thread.sleep(1000);
		 
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_03", "Select User Master Page", () -> {
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			});
			Thread.sleep(1000);	
				

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_04", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown(),"Select user type Dropdown");
			});
			Thread.sleep(1000);	
				
				
		
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_05", "Select User Type Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown_Value(),"Select User Type Dropdown Value");
			});
			Thread.sleep(1000);	
				
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_06", "Select Division Retailer Dropdown", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown(),"Select Division Retailer Dropdown");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_07", "Select Division Retailer Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown_Value(),"Select Division Retailer Dropdown Value");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_08", "Click on Search Button", () -> {
			Liabrary.custom_click(UM1.getSearch_Button(),"Click on Search Button");
			});
			Thread.sleep(1000);	
				
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_09", "Select user Master From Grid List", () -> {
			Liabrary.custom_click(UM2.getUserMasterGridLine1(),"Select user Master From Grid List");//Grid Line 1
			});
			Thread.sleep(1000);	
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_10", "Click on Edit Button", () -> {
			Liabrary.custom_click(UM4.getEdit_Button(),"Click on Edit Button");
			});
			Thread.sleep(1000);	
				
				
			//ObjectRepo.test.log(Status.INFO, "Test Case 11 :Verify that Edit User Header Text.");
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_11", "Verify that Edit User Header Text", () -> {
				WebElement UM_User_Details_Header_Text = driver.findElement(By.xpath("//*[text()='Edit User']"));
				String Actual_Text= UM_User_Details_Header_Text.getText();
				System.out.println(Actual_Text);
				String Expected_Text= "Edit User";
				Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);	
			
			

			/*date picker */
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_12", "select date", () -> {
			String month= "November 2024";
		    String date = "28";
			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_popupButton']")).click();
			while(true)
			{
			String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar_Title']")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//a[@class='t-button rcNext']")).click();
			}
			
			}
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//table//tbody//tr//td//a[text()='29']"));
			for(WebElement element : ele) {
				String date1 = element.getText();
				if(date1.equals(date)) {
					element.click();
					break;
			}
			}
			});

			Thread.sleep(1000);		
			/*//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Save Button");	
			Liabrary.custom_click(CD.getSave_Btn(),"Click on Save Button");//
			    Thread.sleep(1000);		*/	
			//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Close Button");	
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_13", "Click on Edit Button", () -> {
			Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
			});
			Thread.sleep(1000);		



			
		}
	
	  @Test(priority=1)
	  public void User_Master_EditPage_NS01() throws Exception{
		  HomePage hp = PageFactory.initElements(driver,HomePage.class);
		  UM_User_Master_EditPage UM4 = PageFactory.initElements(driver,UM_User_Master_EditPage.class);	
		  UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 
		  UM_User_Master_View_Page UM2 = PageFactory.initElements(driver,UM_User_Master_View_Page.class);
		  Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		  
		  ObjectRepo.startTestAndLog_1_NS("Without Select User Master From Grid List ");
		  
		  
		  ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_01", "Verify click on Master Menu", () -> {
		  Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
		  });
		  Thread.sleep(1000);
					
					
		   ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_02", "Verify click on User Master Submenu", () -> {
		   Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
		    });
			Thread.sleep(1000);
		 
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_03", "Select User Master Page", () -> {
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			});
			Thread.sleep(1000);	
				

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_04", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown(),"Select user type Dropdown");
			});
			Thread.sleep(1000);	
				
				
		
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_05", "Select User Type Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown_Value(),"Select User Type Dropdown Value");
			});
			Thread.sleep(1000);	
				
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_06", "Select Division Retailer Dropdown", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown(),"Select Division Retailer Dropdown");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_07", "Select Division Retailer Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown_Value(),"Select Division Retailer Dropdown Value");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_08", "Click on Search Button", () -> {
			Liabrary.custom_click(UM1.getSearch_Button(),"Click on Search Button");
			});
			Thread.sleep(1000);	
				
			
//			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_09", "Select user Master From Grid List", () -> {
//			Liabrary.custom_click(UM2.getUserMasterGridLine1(),"Select user Master From Grid List");//Grid Line 1
//			});
//			Thread.sleep(1000);	
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_10", "Click on Edit Button", () -> {
			Liabrary.custom_click(UM4.getEdit_Button(),"Click on Edit Button");
			});
			Thread.sleep(1000);	
				
				
			//ObjectRepo.test.log(Status.INFO, "Test Case 11 :Verify that Edit User Header Text.");
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_11", "Verify that Edit User Header Text", () -> {
				WebElement UM_User_Details_Header_Text = driver.findElement(By.xpath("//*[text()='Edit User']"));
				String Actual_Text= UM_User_Details_Header_Text.getText();
				System.out.println(Actual_Text);
				String Expected_Text= "Edit User";
				Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);	
			
			

			/*date picker */
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_12", "select date", () -> {
			String month= "November 2024";
		    String date = "28";
			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_popupButton']")).click();
			while(true)
			{
			String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar_Title']")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//a[@class='t-button rcNext']")).click();
			}
			
			}
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//table//tbody//tr//td//a[text()='29']"));
			for(WebElement element : ele) {
				String date1 = element.getText();
				if(date1.equals(date)) {
					element.click();
					break;
			}
			}
			});

			Thread.sleep(1000);		
			/*//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Save Button");	
			Liabrary.custom_click(CD.getSave_Btn(),"Click on Save Button");//
			    Thread.sleep(1000);		*/	
			//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Close Button");	
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_13", "Click on Edit Button", () -> {
			Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
			});
			Thread.sleep(1000);		



			
		}
	
	  @Test(priority=2)
	  public void User_Master_EditPage_NS02() throws Exception{
		  HomePage hp = PageFactory.initElements(driver,HomePage.class);
		  UM_User_Master_EditPage UM4 = PageFactory.initElements(driver,UM_User_Master_EditPage.class);	
		  UM_User_Master	UM1 = PageFactory.initElements(driver,UM_User_Master.class); 
		  UM_User_Master_View_Page UM2 = PageFactory.initElements(driver,UM_User_Master_View_Page.class);
		  Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		  
		  ObjectRepo.startTestAndLog_1_NS("Without click on Edit Button");
		  
		  ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_01", "Verify click on Master Menu", () -> {
		  Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
		  });
		  Thread.sleep(1000);
					
					
		   ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_02", "Verify click on User Master Submenu", () -> {
		   Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
		    });
			Thread.sleep(1000);
		 
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_03", "Select User Master Page", () -> {
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			});
			Thread.sleep(1000);	
				

			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_04", "Click On User Type Dropdown", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown(),"Select user type Dropdown");
			});
			Thread.sleep(1000);	
				
				
		
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_05", "Select User Type Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getUser_Type_Dropdown_Value(),"Select User Type Dropdown Value");
			});
			Thread.sleep(1000);	
				
					
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_06", "Select Division Retailer Dropdown", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown(),"Select Division Retailer Dropdown");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_07", "Select Division Retailer Dropdown Value", () -> {
			Liabrary.custom_click(UM1.getDivision_Retailer_Dropdown_Value(),"Select Division Retailer Dropdown Value");
			});
			Thread.sleep(1000);		
				
				
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_08", "Click on Search Button", () -> {
			Liabrary.custom_click(UM1.getSearch_Button(),"Click on Search Button");
			});
			Thread.sleep(1000);	
				
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_09", "Select user Master From Grid List", () -> {
			Liabrary.custom_click(UM2.getUserMasterGridLine1(),"Select user Master From Grid List");//Grid Line 1
			});
			Thread.sleep(1000);	
				
				
//			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_10", "Click on Edit Button", () -> {
//			Liabrary.custom_click(UM4.getEdit_Button(),"Click on Edit Button");
//			});
//			Thread.sleep(1000);	
				
				
			//ObjectRepo.test.log(Status.INFO, "Test Case 11 :Verify that Edit User Header Text.");
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_11", "Verify that Edit User Header Text", () -> {
				WebElement UM_User_Details_Header_Text = driver.findElement(By.xpath("//*[text()='Edit User']"));
				String Actual_Text= UM_User_Details_Header_Text.getText();
				System.out.println(Actual_Text);
				String Expected_Text= "Edit User";
				Assert.assertEquals(Expected_Text,Actual_Text);
			});
			Thread.sleep(1000);	
			
			

			/*date picker */
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_12", "select date", () -> {
			String month= "November 2024";
		    String date = "28";
			driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_popupButton']")).click();
			while(true)
			{
			String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar_Title']")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//a[@class='t-button rcNext']")).click();
			}
			
			}
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_calendar']//table//tbody//tr//td//a[text()='29']"));
			for(WebElement element : ele) {
				String date1 = element.getText();
				if(date1.equals(date)) {
					element.click();
					break;
			}
			}
			});

			Thread.sleep(1000);		
			/*//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Save Button");	
			Liabrary.custom_click(CD.getSave_Btn(),"Click on Save Button");//
			    Thread.sleep(1000);		*/	
			//ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be Click On Close Button");	
			
			ObjectRepo.startTestAndLog_1_SS("SA_UM_User_Master_Edit_Page_TC_13", "Click on Edit Button", () -> {
			Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
			});
			Thread.sleep(1000);		



	  }		

}
