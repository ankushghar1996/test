package SEBS_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class New_Site_Creation {

	
	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSEBS_Menu() {
		return SEBS_Menu;
	}


	public WebElement getSite_Creation_SubMenu() {
		return Site_Creation_SubMenu;
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


	public WebElement getSelect_sales_Engineer_dropdown() {
		return select_sales_Engineer_dropdown;
	}


	public WebElement getSelect_sales_Engineer() {
		return select_sales_Engineer;
	}


	public WebElement getSelect_Location_dropdown() {
		return select_Location_dropdown;
	}


	public WebElement getSelect_Location() {
		return select_Location;
	}


	public WebElement getSelect_developer_Name_dropdown() {
		return select_developer_Name_dropdown;
	}


	public WebElement getSelect_developer_Name() {
		return select_developer_Name;
	}


	public WebElement getEnter_Site_Name() {
		return Enter_Site_Name;
	}


	public WebElement getChcekbox_flexCheckDefault() {
		return chcekbox_flexCheckDefault;
	}


	public WebElement getDropdownMenuButton() {
		return dropdownMenuButton;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getEnter_Contractor_Name() {
		return Enter_Contractor_Name;
	}


	public WebElement getEnter_Contractor_ContactName() {
		return Enter_Contractor_ContactName;
	}


	public WebElement getSAVE_Button() {
		return SAVE_Button;
	}


	public WebElement getCANCEL_Button() {
		return CANCEL_Button;
	}


	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-bars'])[1]")
    private WebElement SEBS_Menu;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='New Site Creation']")
    private WebElement Site_Creation_SubMenu;
	
	
	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-plus'])[1]")
    private WebElement Add_Menu;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[1]")
    private WebElement Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="(//span[normalize-space()='Bluehost DB [10145]'])[1]")
    private WebElement Select_Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[2]")
    private WebElement select_sales_Engineer_dropdown;
	
//	(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]
	//div[@class='ng-option ng-option-selected ng-option-marked']//span[normalize-space()='Nageshwar']
	
	@FindBy(how=How.XPATH,using="(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]")
    private WebElement select_sales_Engineer;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[3]")
    private WebElement select_Location_dropdown;
	
//	(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]
	@FindBy(how=How.XPATH,using="(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]")
    private WebElement select_Location;
	

	@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[4]")
	private WebElement select_developer_Name_dropdown;
	
//	(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-top']//child::div//child::span[contains(@class,'ng-option')])[1]
	@FindBy(how=How.XPATH,using="(//span[@class='ng-option-label'][normalize-space()='Ahuja Developer'])[1]")
	private WebElement select_developer_Name;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Site Name']")
	private WebElement Enter_Site_Name;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='flexCheckDefault']")
	private WebElement chcekbox_flexCheckDefault;
	
	
	
	@FindBy(how=How.XPATH,using="(//button[normalize-space()='Select Influencer'])[1]")
    private WebElement dropdownMenuButton;
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[2]")
    private WebElement checkbox;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Contractor Name']")
	private WebElement Enter_Contractor_Name;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Contractor Contact Number.']")
	private WebElement Enter_Contractor_ContactName;
	
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='SAVE']")
    private WebElement SAVE_Button;
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='CANCEL']")
    private WebElement CANCEL_Button;
	
	
	
	
	@FindBy(how=How.XPATH,using="(//div[@routerlink='/activity'])[1]")
    private WebElement Activity_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Project Funnel (lakhs) of Site']")
	private WebElement Enter_Project_Funnel_lakhs_of_Site;
	
	
	public WebElement getEnter_Project_Funnel_lakhs_of_Site() {
		return Enter_Project_Funnel_lakhs_of_Site;
	}


	public WebElement getEnter_Sales_Funnel_lakhs_of_Site() {
		return Enter_Sales_Funnel_lakhs_of_Site;
	}


	public WebElement getEnter_Fosroc_Expected_sales_in_2025() {
		return Enter_Fosroc_Expected_sales_in_2025;
	}


	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter Sales Funnel (lakhs) of Site'])[1]")
	private WebElement Enter_Sales_Funnel_lakhs_of_Site;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Fosroc Expected sales in 2025']")
	private WebElement Enter_Fosroc_Expected_sales_in_2025;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter YTD Sales (lakhs)']")
	private WebElement Enter_YTD_Sales;

	
	
	public WebElement getEnter_YTD_Sales() {
		return Enter_YTD_Sales;
	}


	public WebElement getActivity_Button() {
		return Activity_Button;
	}




	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-plus'])[1]")
    private WebElement Add1_Button;
	
	
	public WebElement getAdd1_Button() {
		return Add1_Button;
	}


	@FindBy(how=How.XPATH,using="//span[normalize-space()='Non PJP Sites']")
    private WebElement Non_PJP_Button;


	public WebElement getNon_PJP_Button() {
		return Non_PJP_Button;
	}
	
	@FindBy (how=How.XPATH,using = "(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[4]")
	private WebElement State_Dropdown;
	 
	@FindBy (how=How.XPATH,using = "//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Maharashtra']")
	private WebElement State_Dropdown_Value;
	 
	@FindBy (how=How.XPATH,using = "(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[5]")
	private WebElement City_Dropdown ;
	 
	@FindBy (how=How.XPATH,using = "//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Ahmednagar']")
	private WebElement City_Dropdown_Value ;
	
	
	
	
	
	
}
