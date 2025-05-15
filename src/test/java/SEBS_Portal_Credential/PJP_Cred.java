package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SEBS_Portal.PJP_SEBS;

public class PJP_Cred extends BaseClass_SEBS_Portal{

	
	@Test
	public void PJP_Setting() throws Exception {
		
		PJP_SEBS pj = PageFactory.initElements(driver, PJP_SEBS.class);
	
		
		Liabrary.custom_click(pj.getSEBS_Menu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(pj.getPJP_SubMenu(), null);
		Thread.sleep(3000);
	
	
		Liabrary.custom_click(pj.getCLOSE_btn(), null);
		Thread.sleep(2000);
		
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
