package SEBS_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.SEBS_New_Contractors;
import SEBS_Portal.SEBS_Notification;
 
public class SEBS_Notification_Test extends BaseClass_SEBS_Portal{
 
	@Test(priority=0)
	public void New_Notification() throws Exception {
		
	SEBS_Notification SEBS = PageFactory.initElements(driver,SEBS_Notification.class);
	Thread.sleep(2000);
	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Notification_Test_TC01", "Verify that user should be able to click on Notification Button", () -> {
	Liabrary.custom_click(SEBS.getNotification_Button(),"Click on Notification Button");
	 });
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SEBS_Notification_Test_TC02", "Verify that user should be able to click on Close Button", () -> {
	Liabrary.custom_click(SEBS.getClose_Button(),"Click on Close Button");                                                                                           

	});
	Thread.sleep(1000);

	 }
	
	
	@Test(priority = 1)
	public void New_Notification_NS01() throws Exception {
		
	SEBS_Notification SEBS = PageFactory.initElements(driver,SEBS_Notification.class);
	Thread.sleep(2000);
	
	ObjectRepo.startTestAndLog_1_NS("Without Click on Close Button");
	
	 ObjectRepo.startTestAndLog_1_SS("SEBS_Notification_Test_TC01", "Verify that user should be able to click on Notification Button", () -> {
	Liabrary.custom_click(SEBS.getNotification_Button(),"Click on Notification Button");
	 });
	Thread.sleep(1000);
	
//	ObjectRepo.startTestAndLog_1_SS("SEBS_Notification_Test_TC02", "Verify that user should be able to click on Close Button", () -> {
//	Liabrary.custom_click(SEBS.getClose_Button(),"Click on Close Button");                                                                                           
//
//	});
//	Thread.sleep(1000);

	 }
	
}