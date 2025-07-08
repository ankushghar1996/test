package FSG_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_PJP_Main;
 
public class FSG_PJP_Test extends BaseClass_FSG_Portal {
@Test(priority=0)
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
@Test(priority=1)
public void FSG_PJP_NS01() throws Exception {

	FSG_PJP_Main FSG = PageFactory.initElements(driver, FSG_PJP_Main.class);
	
	//Without Click on Close Button

	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC01", "Verify that user clicks on FSG menu", () -> {
	Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG menu"); });
	Thread.sleep(1000); 
	
	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC02", "Verify that user Click On PJP Submenu", () -> {
	Liabrary.custom_click(FSG.getPJP_Submenu(), "Click On PJP Submenu"); });
	Thread.sleep(1000);
	
//	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC03", "Verify that user Click On Close Button", () -> {
//	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button");});
//	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC04", "Verify Pending Orders Text", () -> {
        WebElement FSG_Master_Header_TXT = driver.findElement(By.xpath("//b[text()='Pending Orders']"));
        String Actual_Text = FSG_Master_Header_TXT.getText();
        System.out.println(Actual_Text);
        String Expected_Text = "Pending Orders";
        Assert.assertEquals(Expected_Text, Actual_Text);
	});
}
@Test(priority=2)
public void FSG_PJP_NS02() throws Exception {

	FSG_PJP_Main FSG = PageFactory.initElements(driver, FSG_PJP_Main.class);
	
	//Without Click on PJP Submenu

	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC01", "Verify that user clicks on FSG menu", () -> {
	Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG menu"); });
	Thread.sleep(1000); 
	
//	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC02", "Verify that user Click On PJP Submenu", () -> {
//	Liabrary.custom_click(FSG.getPJP_Submenu(), "Click On PJP Submenu"); });
//	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("FSG_PJP_TC03", "Verify that user Click On Close Button", () -> {
	Liabrary.custom_click(FSG.getClose_Button(), "Click On Close Button");});
	Thread.sleep(1000);
}

}