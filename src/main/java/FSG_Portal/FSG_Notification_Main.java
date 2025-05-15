package FSG_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FSG_Notification_Main {
 
	
	@FindBy(how=How.XPATH,using="//i[@routerlink='/profile/notification']")
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