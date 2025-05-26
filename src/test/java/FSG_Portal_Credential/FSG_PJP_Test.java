package FSG_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_PJP_Main;
 
public class FSG_PJP_Test extends BaseClass_FSG_Portal {
@Test
public void FSG_PJP () throws Exception {

	FSG_PJP_Main FSG = PageFactory.initElements(driver, FSG_PJP_Main.class);

	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC01", "Verify that user clicks on FSG menu", () -> {
	Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG menu"); });
	Thread.sleep(1000); 
	
	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC02", "Verify that user Click On PJP Submenu", () -> {
	Liabrary.custom_click(FSG.getPJP_Submenu(), "Click On PJP Submenu"); });
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC03", "Verify that user Click On Close Button", () -> {
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button");});
	Thread.sleep(1000);








}
}
