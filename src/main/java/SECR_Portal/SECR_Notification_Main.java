package SECR_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SECR_Notification_Main {

	WebDriver driver ;
	
	@FindBy(how=How.XPATH,using="//span[@class='navbar-bell']//img")
	private WebElement Notification_Icon;

	
	
	@FindBy(how=How.XPATH,using="//div[@class='common-footer']//button[text()='CLOSE']")
	private WebElement Close_Button;
 
 
	public WebElement getNotification() {
		return Notification_Icon;
	}
 
 
	public WebElement getClose_Button() {
		return Close_Button;
	}
	
	
	
	
	
	
	
}
