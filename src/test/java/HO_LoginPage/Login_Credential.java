package HO_LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass;
import Com_Utility.Liabrary;

public class Login_Credential extends BaseClass{

	
	@Test
	public void testloginpage() throws Exception {
		LoginPage loginelements=PageFactory.initElements(driver, LoginPage.class);
	
		Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
		
		Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Passwod Field");
		
		Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
		
		
		
		
		
		
		
	
	
	}
	
}
