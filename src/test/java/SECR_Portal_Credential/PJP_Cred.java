package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.PJP;

public class PJP_Cred extends BaseClass_SECR_Portal{

	
	
	@Test
	public void PJP_Setting() throws Exception {
		
		PJP pjp = PageFactory.initElements(driver, PJP.class);
	
		ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC_01", "Click on SECR Menu", () -> {
		Liabrary.custom_click(pjp.getSECR_Menu(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC_02", "Click on PJP subMenu", () -> {
		Liabrary.custom_click(pjp.getPJP_SubMenu(), null);});
		Thread.sleep(3000);
	
		ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC_03", "Click on Close Button", () -> {
		Liabrary.custom_click(pjp.getCLOSE_btn(), null);});
		Thread.sleep(2000);
		
	
	
	
	
	
	}
	
	
}
