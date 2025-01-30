package HO_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NotificationMaster_NotificationSetting {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='nav-link'])[9]")
	private WebElement NotificationSetting_Menu;

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement NotificationSetting_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType_Input']")
	private WebElement Type_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType_DropDown']//li[text()='App Notification']")
	private WebElement SelectValueType_Dropdown;
	
	public WebElement getSelectValueType_Dropdown() {
		return SelectValueType_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_btnView']")
	private WebElement ViewBtn;
	
	
	
	public WebElement getNotificationSetting_Menu() {
		return NotificationSetting_Menu;
	}

	public WebElement getNotificationSetting_Header() {
		return NotificationSetting_Header;
	}

	public WebElement getType_Dropdown() {
		return Type_Dropdown;
	}

	public WebElement getViewBtn() {
		return ViewBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
