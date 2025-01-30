package HO_Login_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass_For_LoginTest;
import Com_Utility.Liabrary;

public class Without_Click_LoginBtn extends BaseClass_For_LoginTest {

	
	
	@Test
		public void testloginpage() throws Exception {
			LoginPage loginelements=PageFactory.initElements(driver, LoginPage.class);
			Thread.sleep(1000);
			
			Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
			Thread.sleep(1000);
			
			Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Passwod Field");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='btnLogi']")).click();
			Thread.sleep(1000);
			
			//incorrect Login button XPATH
			driver.findElement(By.xpath("//p[text()='Dashboard']")).click();
			Thread.sleep(1000);


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
