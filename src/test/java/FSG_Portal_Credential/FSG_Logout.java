package FSG_Portal_Credential;
 
import java.time.Duration;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_Logout_Main;
 
public class FSG_Logout extends BaseClass_FSG_Portal{
 
	
	@Test
	public void Logout () throws Exception  {
		
		FSG_Logout_Main  FSG = PageFactory.initElements(driver,FSG_Logout_Main.class);
		
		Liabrary.custom_click(FSG.getFSG_Menu(), "Click On FSG Menu");
		Thread.sleep(1000);			
		
	    Liabrary.custom_click(FSG.getLogout_Button(), "Click on Logout Button");
	    Thread.sleep(1000);
	    
	    WebElement yes_Button = driver.findElement(By.xpath("//div[@class='col-6 p-0']//button[text()='Yes']"));
	    yes_Button.click();






	}	
}