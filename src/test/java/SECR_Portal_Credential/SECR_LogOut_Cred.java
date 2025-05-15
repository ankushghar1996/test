package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_LogOut_Main;

public class SECR_LogOut_Cred extends BaseClass_SECR_Portal{

	
	
	@Test
	public void Logout () throws Exception  {
		
		SECR_LogOut_Main  secr = PageFactory.initElements(driver,SECR_LogOut_Main.class);
	
	
		Liabrary.custom_click(secr.getSECR_Menu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(secr.getLogout_Button(), null);
		Thread.sleep(1000);
	
	
		 WebElement yes_Button = driver.findElement(By.xpath("//button[normalize-space()='Yes']"));
		 yes_Button.click();
	
	
	
	
	
	
	
	}
	
}
