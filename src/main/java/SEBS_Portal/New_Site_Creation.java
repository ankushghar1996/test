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
	
	
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'ng-select-container ng-has-value')])[1]")
    private WebElement Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="(//span[normalize-space()='Chiranth Agencies [10001]'])[1]")
    private WebElement Select_Distributor_Mapped;
	
	
	@FindBy(how=How.XPATH,using="//ng-select[contains(@class, 'ng-select') and @formcontrolname='FSG']")
    private WebElement select_sales_Engineer_dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-option ng-option-marked']//span[normalize-space()='Rohit BS']")
    private WebElement select_sales_Engineer;
	
	
	@FindBy(how=How.XPATH,using="(//input[contains(@type,'text')])[3]")
    private WebElement select_Location_dropdown;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Navle road']")
    private WebElement select_Location;
	

	@FindBy(how=How.XPATH,using="(//input[@type='text'])[4]")
	private WebElement select_developer_Name_dropdown;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Akash Dev']")
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
	
	//  deluxe sea view room 

	
	
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
	
	
	
	
	
	
	
	
}
