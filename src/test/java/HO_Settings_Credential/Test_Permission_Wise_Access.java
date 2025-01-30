package HO_Settings_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Settings.Permission_Wise_Access;

public class Test_Permission_Wise_Access extends BaseClass{

	
	@Test
	public void Permission_Wise_Access () throws Exception {
    HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	Permission_Wise_Access PWA =PageFactory.initElements(driver,Permission_Wise_Access.class);

	   //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Setting Menu.")
		Liabrary.custom_click(hp.getSettings_Menu(),"Select Setting menu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Configurations Sub menu.")
		Liabrary.custom_click(hp.getConfigurations_SubMenu(),"Select Configurations Sub menu");
		Thread.sleep(1000);
 
 
	   //ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Select Permission_Wise_Access Page.");	
		Liabrary.custom_click(PWA.getPermission_Wise_Access_Menu(),"Select Permission_Wise_Access Page");
		Thread.sleep(1000);
		
		
	  //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Permission Wise Access Header Text.");
		WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//h4[text()='Permission Wise Access']"));
		String Actual_Text = User_Master_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Permission Wise Access";
		Assert.assertEquals(Expected_Text,Actual_Text);
		Thread.sleep(1000);
		
		
	  //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select User Dropdown.");	
		Liabrary.custom_click(PWA.getSelect_User_Dropdown(),"Select User Dropdown");
		Thread.sleep(1000);
		
		
	  //ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Select User Dropdown Value");	
		Liabrary.custom_click(PWA.getSelect_User_Dropdown_Value(),"Select User Dropdown Value");
		Thread.sleep(1000);	
 
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
