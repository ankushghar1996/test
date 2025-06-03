package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.Mark_Attendance;

public class Mark_Attendence_Cred extends BaseClass_SECR_Portal{

	
	
	
	@Test
	public void SECR_AttendenceMark() throws Exception {
		
		Mark_Attendance AM = PageFactory.initElements(driver, Mark_Attendance.class);
	

		
		ObjectRepo.startTestAndLog_1_SS("SECR_MA_TC01", "Verify that user clicks on Mark Attendance Button", () -> {
		Liabrary.custom_click(AM.getMARK_ATTENDANCE(), null);
		});

		ObjectRepo.startTestAndLog_1_SS("SFA_Login_02", "enter Password", () -> {
		Liabrary.custom_click(AM.getMARK_ATTENDANCE(), null);});

		Thread.sleep(1000);
	
	
	
	
	}
	
}
