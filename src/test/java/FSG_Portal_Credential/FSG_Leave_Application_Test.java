package FSG_Portal_Credential;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_Leave_Application_Main;
 
public class FSG_Leave_Application_Test extends BaseClass_FSG_Portal {
 
	
	@Test
	public void FSG_leave () throws Exception {
		
		
	FSG_Leave_Application_Main FSG = PageFactory.initElements(driver , FSG_Leave_Application_Main.class);
	Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG Menu");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(FSG.getLeave_Application(), "Click On Leave Application");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(FSG.getApply_Leave(), "Click On Apply Leave");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("14-04-2025");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("(//input[@type='date'])[2]")).sendKeys("18-04-2025");
	Thread.sleep(1000);
 
	
	Liabrary.custom_click(FSG.getLeave_Type(), "Click On Leave type Dropdown");
    Thread.sleep(1000);
    
    
	Liabrary.custom_click(FSG.getLeave_Type_Value(), "Click On Leave Type value Dropdown");
    Thread.sleep(1000);
    
    
	driver.findElement(By.xpath("//*[@formcontrolname='Reason']")).sendKeys("i am feeling unwell and need to rest and recover.");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(FSG.getApply_Button(), "Click On Apply Button");
    Thread.sleep(1000);
    
    
    Liabrary.custom_click(FSG.getCancled_Leave(), "Click on cancle leave Button");
    Thread.sleep(1000);
    
    
}
}