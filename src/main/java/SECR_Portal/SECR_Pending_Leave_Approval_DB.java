package SECR_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SECR_Pending_Leave_Approval_DB {
	
	
	@FindBy(how=How.XPATH,using = "//div[@class='navbar-title']//i[@aria-hidden='true']")
	private WebElement SECR_Menu;
	
	
	@FindBy(how=How.XPATH,using = "//img[@src='../../../../assets/icons/sidebar-options/Mask Group 10766.svg']")
	private WebElement Approval_Button;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='col-12 order-states-text']//b[text()='Pending Approval']")
	private WebElement Pending_Approval_DB;
	
	
	@FindBy(how=How.XPATH,using = "//div[@class='col-8 p-2']//span[normalize-space() ='Leave Approval']")
	private WebElement Leave_APPROVAL_Button;
	
	
	@FindBy(how=How.XPATH,using = "(//div[@class='col-10 p-2']//b[text()='Aniket J'])[1]")
	private WebElement Leave_APPROVAL_Pending;
	
	
 
	public WebElement getSECR_Menu() {
		return SECR_Menu;
	}
 
	public WebElement getApproval_Button() {
		return Approval_Button;
	}
 
	public WebElement getLeave_APPROVAL_Button() {
		return Leave_APPROVAL_Button;
	}
 
	public WebElement getLeave_APPROVAL_Pending() {
		return Leave_APPROVAL_Pending;
	}
 
	public WebElement getPending_Approval_DB() {
		return Pending_Approval_DB;
	}





}