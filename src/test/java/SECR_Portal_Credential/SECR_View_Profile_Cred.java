package SECR_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_View_Profile_Main;

public class SECR_View_Profile_Cred extends BaseClass_SECR_Portal{

	
	@Test
	public void SECR_ViewProfile() throws Exception {
		
		SECR_View_Profile_Main view = PageFactory.initElements(driver, SECR_View_Profile_Main.class);
	
	
		Liabrary.custom_click(view.getSECR_Menu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getView_Profile(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getReset_Button(), null);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("vinay@1234");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("Vinay@2025");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("Vinay@2025");
		Thread.sleep(1000);
		
		
	//	Liabrary.custom_click(view.getReset_Password_Button(), null);
	//	Thread.sleep(1000);
	
	
	}
	
}
