package SEBS_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SEBS_Notification {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='navbar-notification']//i[@aria-hidden='true']")
	private WebElement Notification_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='close-btn W-100']")
	private WebElement Close_Button;
	
 
	public WebElement getNotification_Button() {
		return Notification_Button;
	}
 
	public WebElement getClose_Button() {
		return Close_Button;
	}








}