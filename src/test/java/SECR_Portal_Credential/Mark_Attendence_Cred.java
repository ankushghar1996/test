package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.Mark_Attendance;

public class Mark_Attendence_Cred extends BaseClass_SECR_Portal{

	
	
	
	@Test
	public void SECR_AttendenceMark() throws Exception {
		
		Mark_Attendance AM = PageFactory.initElements(driver, Mark_Attendance.class);
	
	
		Liabrary.custom_click(AM.getMARK_ATTENDANCE(), null);
		Thread.sleep(1000);
	
	
	
	
	}
	
}
