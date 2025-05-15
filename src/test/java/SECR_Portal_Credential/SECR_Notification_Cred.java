package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Notification_Main;

public class SECR_Notification_Cred extends BaseClass_SECR_Portal{

	
	
	@Test
	public void Logout () throws Exception  {
		
		SECR_Notification_Main note = PageFactory.initElements(driver,SECR_Notification_Main.class);
	
	
		Liabrary.custom_click(note.getNotification(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(note.getClose_Button(), null);
		Thread.sleep(1000);
		
		
		
		
	}
}
