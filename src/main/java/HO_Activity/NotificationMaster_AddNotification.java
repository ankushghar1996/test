package HO_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NotificationMaster_AddNotification {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='nav-link'])[9]")
	private WebElement NotificationSetting_Menu;

	@FindBy(how = How.XPATH, using = "//*[@id='btnadd']")
	private WebElement AddBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement AddNewNotification_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddltynotification_Input']")
	private WebElement TypeOfNotification_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement User_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Input']")
	private WebElement Division_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']")
	private WebElement ClusterType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_Input']")
	private WebElement Cluster_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtNotificationTile']")
	private WebElement Notification_Title_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_dateInput']")
	private WebElement Date_Calender;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtTime']")
	private WebElement Sent_Time;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='ParentMasterContentPlaceHolder1_txtNotification']")
	private WebElement Notification_Text_Textbox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='ParentMasterContentPlaceHolder1_Image1']")
	private WebElement Add_Image;
	
	@FindBy(how = How.XPATH, using = "//input[@id='chkAccordionToggle']")
	private WebElement Recurrence_Pattern_Checkbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Savebtn']")
	private WebElement Sent_Notification_Btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement CloseBtn;
	
	
	
	
	public WebElement getNotificationSetting_Menu() {
		return NotificationSetting_Menu;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getAddNewNotification_Header() {
		return AddNewNotification_Header;
	}

	public WebElement getTypeOfNotification_Dropdown() {
		return TypeOfNotification_Dropdown;
	}

	public WebElement getUser_Dropdown() {
		return User_Dropdown;
	}

	public WebElement getDivision_Dropdown() {
		return Division_Dropdown;
	}

	public WebElement getClusterType_Dropdown() {
		return ClusterType_Dropdown;
	}

	public WebElement getCluster_Dropdown() {
		return Cluster_Dropdown;
	}

	public WebElement getNotification_Title_Textbox() {
		return Notification_Title_Textbox;
	}

	public WebElement getDate_Calender() {
		return Date_Calender;
	}

	public WebElement getSent_Time() {
		return Sent_Time;
	}

	public WebElement getNotification_Text_Textbox() {
		return Notification_Text_Textbox;
	}

	public WebElement getAdd_Image() {
		return Add_Image;
	}

	public WebElement getRecurrence_Pattern_Checkbox() {
		return Recurrence_Pattern_Checkbox;
	}

	public WebElement getSent_Notification_Btn() {
		return Sent_Notification_Btn;
	}

	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddltynotification_DropDown']//li[text()='App Notification']")
	private WebElement SelectValue_TypeOfNotification_Dropdown;
	
	public WebElement getSelectValue_TypeOfNotification_Dropdown() {
		return SelectValue_TypeOfNotification_Dropdown;
	}

	public WebElement getSelectValue_User_CheckBox() {
		return SelectValue_User_CheckBox;
	}

	public WebElement getSelectValue_Division_CheckBox() {
		return SelectValue_Division_CheckBox;
	}

	public WebElement getSelectValue_ClusterType_Dropdown() {
		return SelectValue_ClusterType_Dropdown;
	}

	public WebElement getSelectValue_Cluster_Dropdown() {
		return SelectValue_Cluster_Dropdown;
	}



	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
	private WebElement SelectValue_User_CheckBox;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='BS']")
	private WebElement SelectValue_Division_CheckBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//li[text()='RSM']")
	private WebElement SelectValue_ClusterType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='South 1']")
	private WebElement SelectValue_Cluster_Dropdown;
	
	
	
	
	
	
	
	
	
	
	
	
}
