package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.SEBS_Login;

public class SEBS_Login_Cred extends BaseClass_SEBS_Portal{

	
	@Test
	public void SEBS_Login() throws Exception {
		
		SEBS_Login login = PageFactory.initElements(driver, SEBS_Login.class);
	

		 ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Login_TC01", "Verify that user should be able to enter SEBS User Name", () -> {

		Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Sheet1", 4, 0), "UserName Field");
		 });
		Thread.sleep(1000);
		

		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Login_TC02", "Verify that user should be able to enter SEBS Password", () -> {

		Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata2("Sheet1", 4, 1), "Passwod Field");
		});
		Thread.sleep(1000);
		

		
		ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Login_TC03", "Verify that user should be able to click on Login button", () -> {

		Liabrary.custom_click(login.getLogin_btn(), "Login Btn");
		});
		Thread.sleep(1000);
	

	}
	
	
}
