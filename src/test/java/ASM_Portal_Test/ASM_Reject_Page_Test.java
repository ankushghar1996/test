package ASM_Portal_Test;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import ASM_Portal.ASM_Approval_Page;
import ASM_Portal.ASM_Reject_Page;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
 
public class ASM_Reject_Page_Test extends BaseClass_ASM {
 
	@Test
	public void View_Page() throws Exception {
		
		
    ASM_Reject_Page ASM = PageFactory.initElements(driver,ASM_Reject_Page.class);
    
    
	Liabrary.custom_click(ASM.getMaster(), "Click on Master");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getApproval_Page_Button(), "Click on Approval Button");
	Thread.sleep(1000);
	
	
	WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getReject_Button(), "Click on Reject Button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getSelect_Dropdown(), "Select Dropdown Button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getSelect_Dropdown_Value(), "Select Dropdown Button value");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getNo_Button(), "Click On No Button");
	Thread.sleep(1000);
	
	
	
	
	
	
}
}