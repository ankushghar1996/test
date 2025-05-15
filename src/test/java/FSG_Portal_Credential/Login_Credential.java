package FSG_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_Login;

public class Login_Credential extends BaseClass_FSG_Portal{

	
	@Test
	public void testloginpage() throws Exception {
		
		FSG_Login login = PageFactory.initElements(driver, FSG_Login.class);
		Thread.sleep(1000);
		
		Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata("Sheet1", 2, 0), "UserName Field");
		Thread.sleep(1000);
		
		Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata("Sheet1", 2, 1), "Passwod Field");
		Thread.sleep(1000);
		
		Liabrary.custom_click(login.getLogin_Btn(), "Login Btn");
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
