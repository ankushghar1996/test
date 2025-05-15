package FSG_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_Notification_Main;
 
public class FSG_Notification_Test extends BaseClass_FSG_Portal {
 
	@Test
	public void Notification () throws Exception{
		
	FSG_Notification_Main FSG = PageFactory.initElements(driver,FSG_Notification_Main.class);

	Liabrary.custom_click(FSG.getNotification(), "Click on Notification Icon");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button");
	Thread.sleep(1000);




	}
}