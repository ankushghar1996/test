package FSG_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_PJP_Main;
 
public class FSG_PJP_Test extends BaseClass_FSG_Portal {
@Test
public void FSG_PJP () throws Exception {

	FSG_PJP_Main FSG = PageFactory.initElements(driver, FSG_PJP_Main.class);

	Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG menu");
	Thread.sleep(1000);
	
	Liabrary.custom_click(FSG.getPJP_Submenu(), "Click On PJP Submenu");
	Thread.sleep(1000);
	
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button");
	Thread.sleep(1000);








}
}
