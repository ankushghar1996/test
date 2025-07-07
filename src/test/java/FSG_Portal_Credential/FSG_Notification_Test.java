package FSG_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_Notification_Main;
 
public class FSG_Notification_Test extends BaseClass_FSG_Portal {
 
	@Test(priority=0)
	public void Notification () throws Exception{
		
	FSG_Notification_Main FSG = PageFactory.initElements(driver,FSG_Notification_Main.class);

	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC01", "Verify that user clicks on Notification Icon", () -> {
	Liabrary.custom_click(FSG.getNotification(), "Click on Notification Icon");
	  });
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC02", "Verify that user Click On Close Button", () -> {
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button"); });
	Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void Notification_NS1() throws Exception{
		
	FSG_Notification_Main FSG = PageFactory.initElements(driver,FSG_Notification_Main.class);
	
	//Without Click on Notification ICON

//	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC01", "Verify that user clicks on Notification Icon", () -> {
//	Liabrary.custom_click(FSG.getNotification(), "Click on Notification Icon");
//	  });
//	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC02", "Verify that user Click On Close Button", () -> {
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button"); });
	Thread.sleep(1000);

}
	@Test(priority=2)
	public void Notification_NS2() throws Exception{
		
	FSG_Notification_Main FSG = PageFactory.initElements(driver,FSG_Notification_Main.class);
	
	//Without Click on Close Button

	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC01", "Verify that user clicks on Notification Icon", () -> {
	Liabrary.custom_click(FSG.getNotification(), "Click on Notification Icon");
	  });
	Thread.sleep(1000);
	
//	ObjectRepo.startTestAndLog_1_SS("FSG_Notification_TC02", "Verify that user Click On Close Button", () -> {
//	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button"); });
//	Thread.sleep(1000);
	
}
}