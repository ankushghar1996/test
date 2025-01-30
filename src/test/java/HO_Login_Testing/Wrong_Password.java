package HO_Login_Testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass_For_LoginTest;
import Com_Utility.Liabrary;

public class Wrong_Password extends BaseClass_For_LoginTest {

	
	@Test
	public void testloginpage() throws Exception {
		LoginPage loginelements=PageFactory.initElements(driver, LoginPage.class);
		Thread.sleep(1000);
		
		Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 3, 0), "UserName Field");
		Thread.sleep(1000);
		
		Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 3, 1), "Passwod Field");
		Thread.sleep(1000);
		
		Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
		Thread.sleep(1000);
		
		//Print Error Massage
		Liabrary.checkErrorMessageChangable(driver,"print Error Massage");
		Thread.sleep(1000);	
 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
