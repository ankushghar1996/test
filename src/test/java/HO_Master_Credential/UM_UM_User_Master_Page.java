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

public class UM_UM_User_Master_Page extends BaseClass{

	
	@Test
	   public void UM_User_Master_Page() throws Exception{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);   
		Common_Data CD = PageFactory.initElements(driver,Common_Data.class);  
		UM_User_Master  UM1 = PageFactory.initElements(driver,UM_User_Master.class); 

		//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
			Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
			Thread.sleep(1000);
			
			
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select User Master sub menu.")
			Liabrary.custom_click(hp.getUserMaster_SubMenu(),"Select User Master Submenu");
			Thread.sleep(1000);
	 
			
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select User Master Page.");	
			Liabrary.custom_click(UM1.getUser_Master_Menu(),"Select User Master Page");
			Thread.sleep(1000);
			
			
	    //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that User Master Header Text.");
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("(//*[text()='User Master'])[3]"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "User Master";
			Assert.assertEquals(Expected_Text,Actual_Text);
			Thread.sleep(1000);










	   }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
