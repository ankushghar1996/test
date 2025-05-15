package FSG_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FSG_Pending_Order_DB_Main {
 
	
	//b[text()='Pending Orders']
	@FindBy (how=How.XPATH,using="//div[@class='pending-orders-container']//b[text()='Pending Orders']")
	private WebElement Pending_Order ;
	
	@FindBy (how=How.XPATH,using="//span[@data-bs-target='#sendReminder']")
	private WebElement Pending_Order_Reminder ;
	
	@FindBy (how=How.XPATH,using="//button[text()='SEND']")
	private WebElement Pending_Order_Reminder_Send_Button ;
 
	public WebElement getPending_Order() {
		return Pending_Order;
	}
 
	public WebElement getPending_Order_Reminder() {
		return Pending_Order_Reminder;
	}
 
	public WebElement getPending_Order_Reminder_Send_Button() {
		return Pending_Order_Reminder_Send_Button;
	}




}