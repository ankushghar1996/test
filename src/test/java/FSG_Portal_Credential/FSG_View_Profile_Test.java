package FSG_Portal_Credential;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import FSG_Portal.FSG_View_Profile_Main;
 
public class FSG_View_Profile_Test extends BaseClass_FSG_Portal {
 
	
@Test
public void FSG_View_Profile () throws Exception  {
	
	 FSG_View_Profile_Main FSG = PageFactory.initElements(driver, FSG_View_Profile_Main.class);
	 
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Liabrary.custom_click(FSG.getFSG_Menu(),"click on FSG Menu");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(FSG.getView_Profile(),"click on view profile");
	Thread.sleep(1000);

 
	WebElement scroll = driver.findElement(By.xpath("//span[text()='Reset']"));
	JavascriptExecutor jse1= (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
    Thread.sleep(1000);
    
    
	Liabrary.custom_click(FSG.getReset_Button(),"click on Reset Button");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Old Password']")).sendKeys("Fosroc@123");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("12345FSG");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("12345@FSG");
	Thread.sleep(1000);
	
	
    Liabrary.custom_click(FSG.getReset_Password(),"click on Reset_Password_Button");
    Thread.sleep(1000);
    
    
}	
}