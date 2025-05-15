package SEBS_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class New_Developer_Creation {

	
	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSEBS_Menu() {
		return SEBS_Menu;
	}


	
	public WebElement getDeveloper_Creation_SubMenu() {
		return Developer_Creation_SubMenu;
	}


	public WebElement getAdd_Menu() {
		return Add_Menu;
	}


	public WebElement getDistributor_Mapped() {
		return Distributor_Mapped;
	}


	public WebElement getSelect_Distributor_Mapped() {
		return Select_Distributor_Mapped;
	}


	public WebElement getEnter_Developer_Name() {
		return Enter_Developer_Name;
	}


	public WebElement getEnter_Contact_Number() {
		return Enter_Contact_Number;
	}


	public WebElement getEnter_Email_Address() {
		return Enter_Email_Address;
	}


	public WebElement getEnter_Address_Line_1() {
		return Enter_Address_Line_1;
	}


	public WebElement getState_Dropdown() {
		return State_Dropdown;
	}


	public WebElement getSelect_State() {
		return Select_State;
	}


	public WebElement getCity_Dropdown() {
		return City_Dropdown;
	}


	public WebElement getSelect_City() {
		return Select_City;
	}


	public WebElement getEnter_Pin_Code() {
		return Enter_Pin_Code;
	}


	public WebElement getEnter_GST_Number() {
		return Enter_GST_Number;
	}


	public WebElement getEnter_Project_Funnel_lakhs_of_Developer() {
		return Enter_Project_Funnel_lakhs_of_Developer;
	}


	public WebElement getSalesFunnelFordeveloper() {
		return salesFunnelFordeveloper;
	}


	public WebElement getEnter_Fosroc_Expected_sales_in_2025() {
		return Enter_Fosroc_Expected_sales_in_2025;
	}


	public WebElement getYTDsales() {
		return YTDsales;
	}


	public WebElement getDropdownMenuButton() {
		return dropdownMenuButton;
	}


	public WebElement getCheckbox_EmailId() {
		return checkbox_EmailId;
	}


	public WebElement getCheckbox_contactnumber() {
		return checkbox_contactnumber;
	}


	public WebElement getSAVE_Button() {
		return SAVE_Button;
	}


	public WebElement getCANCEL_Button() {
		return CANCEL_Button;
	}


	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-bars'])[1]")
    private WebElement SEBS_Menu;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='New Developers Creation']")
    private WebElement Developer_Creation_SubMenu;
	
	
	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-plus'])[1]")
    private WebElement Add_Menu;
	
	
	@FindBy(how=How.XPATH,using="(//ng-select[contains(@bindvalue,'DistributorCode')])[1]")
    private WebElement Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="(//span[normalize-space()='Chiranth Agencies [10001]'])[1]")
    private WebElement Select_Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Developer Name']")
    private WebElement Enter_Developer_Name;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Contact Number']")
    private WebElement Enter_Contact_Number;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Email Address']")
    private WebElement Enter_Email_Address;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Address Line 1']")
    private WebElement Enter_Address_Line_1;
	
	
	@FindBy(how=How.XPATH,using="//ng-select[@class='gray-background-removed ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-valid']//input[@type='text']")
    private WebElement State_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//span[@class='ng-option-label'][normalize-space()='Maharashtra']")
    private WebElement Select_State;
	
	
	@FindBy(how=How.XPATH,using="//ng-select[@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']//input[@type='text']")
    private WebElement City_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Ahmednagar']")
    private WebElement Select_City;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Pin Code']")
    private WebElement Enter_Pin_Code;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter GST Number']")
    private WebElement Enter_GST_Number;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Project Funnel (lakhs) of Developer']")
    private WebElement Enter_Project_Funnel_lakhs_of_Developer;
	
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='salesFunnelFordeveloper']")
    private WebElement salesFunnelFordeveloper;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Fosroc Expected sales in 2025']")
    private WebElement Enter_Fosroc_Expected_sales_in_2025;
	
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='YTDsales']")
    private WebElement YTDsales;
	
	
	@FindBy(how=How.XPATH,using="//button[@id='dropdownMenuButton']")
    private WebElement dropdownMenuButton;
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[2]")
    private WebElement checkbox;
	
	
	public WebElement getCheckbox() {
		return checkbox;
	}


	@FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Email ID.')]")
    private WebElement checkbox_EmailId;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-untouched ng-pristine ng-valid']//div[3]//input[1]")
    private WebElement checkbox_contactnumber;
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='SAVE']")
    private WebElement SAVE_Button;
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='CANCEL']")
    private WebElement CANCEL_Button;
	
	      
	
	
	
	
	
	
	
	
	
	
	
}
