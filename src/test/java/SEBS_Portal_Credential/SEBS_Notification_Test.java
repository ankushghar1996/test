package SEBS_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SEBS_Portal.SEBS_New_Contractors;
import SEBS_Portal.SEBS_Notification;
 
public class SEBS_Notification_Test extends BaseClass_SEBS_Portal{
 
	@Test
	public void New_Notification() throws Exception {
		
	SEBS_Notification SEBS = PageFactory.initElements(driver,SEBS_Notification.class);
	Thread.sleep(2000);
	
	Liabrary.custom_click(SEBS.getNotification_Button(),"Click on Notification Button");
	Thread.sleep(1000);
	
	Liabrary.custom_click(SEBS.getClose_Button(),"Click on Close Button");
	Thread.sleep(1000);





	 }
}