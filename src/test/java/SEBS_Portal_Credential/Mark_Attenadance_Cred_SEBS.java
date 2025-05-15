package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SEBS_Portal.Mark_Attendance_SEBS;

public class Mark_Attenadance_Cred_SEBS extends BaseClass_SEBS_Portal{

	
	
	@Test
	public void SECR_AttendenceMark() throws Exception {
		
		Mark_Attendance_SEBS AM = PageFactory.initElements(driver, Mark_Attendance_SEBS.class);
	
	
		Liabrary.custom_click(AM.getMark_Attendance_btn(), null);
		Thread.sleep(1000);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
