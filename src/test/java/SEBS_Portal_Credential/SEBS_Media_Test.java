package SEBS_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Media_Main;
 
public class SEBS_Media_Test extends BaseClass_SEBS_Portal {
 
	@Test
	 public void Media() throws Exception {
		
	 SECR_Media_Main SECR = PageFactory.initElements(driver,SECR_Media_Main.class);
	 
	 Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
	 Thread.sleep(1000);
	 
	 
	 Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
	 Thread.sleep(1000);
	 
	 
	 Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
	 Thread.sleep(1000);
	 
	 
}
	
}
