package HO_LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;

public class Login_Credential extends BaseClass{

	
	@Test
	public void testloginpage() throws Exception {
		LoginPage loginelements=PageFactory.initElements(driver, LoginPage.class);
	
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be send username.");
		Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be send password.");
		Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Passwod Field");
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("Test Case 1", "Verify that user should be click on Login button.");
		Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
		Thread.sleep(1000);
		
		
		
		
		
		
	
	
	}
	
}
