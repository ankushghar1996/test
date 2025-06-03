package SEBS_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Scheme_Main;
 
public class SEBS_Scheme_Test extends BaseClass_SEBS_Portal {
 
	
	@Test
	 public void Scheme() throws Exception {
		
	 SECR_Scheme_Main SECR = PageFactory.initElements(driver,SECR_Scheme_Main.class);
	 
	 Liabrary.custom_click(SECR.getScheme_Tab(), null);
	 Thread.sleep(1000);
	 
	 Liabrary.custom_click(SECR.getScheme_Name(), null);   
	 Thread.sleep(1000);
	 
	 Liabrary.custom_click(SECR.getScheme_Close(), null);
	 Thread.sleep(1000);
	 
	 
	 }
}