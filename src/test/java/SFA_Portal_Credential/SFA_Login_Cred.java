package SFA_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SFA_Portal.SFA_Login;

public class SFA_Login_Cred extends BaseClass_SFA{

	
	@Test
	public void testloginpage() throws Exception {
		
		SFA_Login log = PageFactory.initElements(driver, SFA_Login.class);
	
		ObjectRepo.startTestAndLog_1_SS("SFA_Login_01", "enter username.", () -> {
		Liabrary.custom_Sendkeys(log.getUserName(), excel.getStringdata("Sheet1", 7, 0), "UserName Field");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Login_02", "enter Password", () -> {
		Liabrary.custom_Sendkeys(log.getPassword(), excel.getStringdata("Sheet1", 7, 1), "Passwod Field");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SFA_Login_02", "Click On login Button", () -> {
		Liabrary.custom_click(log.getLogin_Btn(), "Login Btn");});
		Thread.sleep(1000);
	
	
	
	
	
	}
	
	
}
