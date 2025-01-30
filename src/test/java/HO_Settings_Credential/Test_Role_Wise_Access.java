package HO_Settings_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Settings.Role_Wise_Access;

public class Test_Role_Wise_Access extends BaseClass{

	
	
	@Test
	public void Role_Wise_Access () throws Exception{
	HomePage hp =PageFactory.initElements(driver,HomePage.class);	
	Role_Wise_Access RWA = PageFactory.initElements(driver,Role_Wise_Access.class); 	

	
   //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Setting Menu.")
	Liabrary.custom_click(hp.getSettings_Menu(),"Select Setting menu");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Configurations Sub menu.")
	Liabrary.custom_click(hp.getConfigurations_SubMenu(),"Select Configurations Sub menu");
	Thread.sleep(1000);
 
 
   //ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Select Role Wise Access Page.");	
	Liabrary.custom_click(RWA.getRole_Wise_Access_Menu(),"Select Role Wise Access Page");
	Thread.sleep(1000);
	
	
  //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Role Wise Access Header Text.");
	WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//h4[normalize-space()='Role Wise Access']"));
	String Actual_Text = User_Master_Header_TXT.getText();
	System.out.println(Actual_Text);
	String Expected_Text= "Role Wise Access";
	Assert.assertEquals(Expected_Text,Actual_Text);
	Thread.sleep(1000);
	
	
  //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select Role Wise Access Page.");	
	Liabrary.custom_click(RWA.getType_Dropdown(),"Select Type Dropdown");
	Thread.sleep(1000);	
	
	
  //ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Select Type Dropdown Value");	
	Liabrary.custom_click(RWA.getType_Dropdown_Value(),"Select Type Dropdown Value");
	Thread.sleep(1000);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be Click on View Button");	
    Liabrary.custom_click(RWA.getView_Button(),"Click on View Button");
	Thread.sleep(1000);






	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
