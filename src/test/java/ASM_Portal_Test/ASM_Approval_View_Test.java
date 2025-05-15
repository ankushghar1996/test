package ASM_Portal_Test;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import ASM_Portal.ASM_Approval_View;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
 
public class ASM_Approval_View_Test extends BaseClass_ASM {
	
	
	@Test
	public void View_Page() throws Exception {
		
		
	ASM_Approval_View ASM = PageFactory.initElements(driver,ASM_Approval_View.class);
	
	
	Liabrary.custom_click(ASM.getMaster(), "Click on Master");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getView_Button(), "Click on View Button");
	Thread.sleep(1000);
	
	
	WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
	   JavascriptExecutor jse1= (JavascriptExecutor)driver;
	   jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	   Thread.sleep(1000);
	   
	   
	Liabrary.custom_click(ASM.getDownload1_Button(), "Click on Download 1");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDownload2_Button(), "Click on Download 2");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getDownload3_Button(), "Click on Download 3");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(ASM.getClose_Button(), "Click on Close Button");
	Thread.sleep(1000);









	}	
}