package FSG_Portal;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FSG_Leave_Application_Main {
 
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	private WebElement FSG_Menu;
	@FindBy (how=How.XPATH,using="//b[text()='Leave Application']")
	private WebElement Leave_Application ;
	@FindBy (how=How.XPATH,using="//button[text()='Apply Leave']")
	private WebElement Apply_Leave ;
	@FindBy (how=How.XPATH,using="//select[@formcontrolname='LeaveType']")
	private WebElement Leave_Type ;
	@FindBy (how=How.XPATH,using="//select//option[text()='Sick Leaves']")
	private WebElement Leave_Type_Value ;
	@FindBy (how=How.XPATH,using="//*[@class='form-control form-textarea ng-pristine ng-invalid ng-touched']")
	private WebElement Reason_Textbox ;
	@FindBy (how=How.XPATH,using="//button[@class='common-footer-button']")
	private WebElement Apply_Button ;
	@FindBy (how=How.XPATH,using=" //b[normalize-space()='Cancel Leave']")
	private WebElement Cancled_Leave ;
	@FindBy (how=How.XPATH,using="")
	private WebElement Filter_Button ;
 
	public WebElement getFSG_Menu() {
		return FSG_Menu;
	}
 
	public WebElement getLeave_Application() {
		return Leave_Application;
	}
 
	public WebElement getApply_Leave() {
		return Apply_Leave;
	}
 
	public WebElement getLeave_Type() {
		return Leave_Type;
	}
 
	public WebElement getLeave_Type_Value() {
		return Leave_Type_Value;
	}
 
	public WebElement getReason_Textbox() {
		return Reason_Textbox;
	}
 
	public WebElement getApply_Button() {
		return Apply_Button;
	}
 
	public WebElement getCancled_Leave() {
		return Cancled_Leave;
	}
 
	public WebElement getFilter_Button() {
		return Filter_Button;
	}
}