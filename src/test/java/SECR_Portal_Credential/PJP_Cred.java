package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.PJP;

public class PJP_Cred extends BaseClass_SECR_Portal{

	
	
	@Test
	public void PJP_Setting() throws Exception {
		
		PJP pjp = PageFactory.initElements(driver, PJP.class);
	
		
		Liabrary.custom_click(pjp.getSECR_Menu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(pjp.getPJP_SubMenu(), null);
		Thread.sleep(3000);
	
	
		Liabrary.custom_click(pjp.getCLOSE_btn(), null);
		Thread.sleep(2000);
		
	
	
	
	
	
	}
	
	
}
