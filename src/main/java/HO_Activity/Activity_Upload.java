package HO_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Activity_Upload {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Activity Upload']")
	private WebElement Activity_Upload;
	

	public WebElement getActivity_Upload() {
		return Activity_Upload;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement UserType1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_DropDown']")
	private WebElement Division_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType1Master_Input']")
	private WebElement ActivityFor1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlActivityName_Input']")
	private WebElement ActivityType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@class='download-pills w-auto']")
	private WebElement Download_Template;
	
	@FindBy(how = How.XPATH, using = "//*[@Class='btn-custom']")
	private WebElement Upload_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@class=' mt-2 ml-2 text-bold']")
	private WebElement ActivityUpload_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonth_Input']")
	private WebElement SelectMonth1_Dropdown;
	
	public WebElement getSelectMonth1_Dropdown() {
		return SelectMonth1_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear_Input']")
	private WebElement SelectYear1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserTypes_Input']")
	private WebElement UserType2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType1Masters_Input']")
	private WebElement ActivityFor2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_Input']")
	private WebElement SelectMonth2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYears_Input']")
	private WebElement SelectYear2_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='SE']")
	private WebElement SelectUserType1_Dropdown;
	
	public WebElement getSelectUserType1_Dropdown() {
		return SelectUserType1_Dropdown;
	}

	public WebElement getSelectDivision_Dropdown() {
		return SelectDivision_Dropdown;
	}

	public WebElement getSelectActivityFor1_Dropdown() {
		return SelectActivityFor1_Dropdown;
	}

	public WebElement getSelectActivityType_Dropdown() {
		return SelectActivityType_Dropdown;
	}

	public WebElement getSelectValueMonth1_Dropdown() {
		return SelectValueMonth1_Dropdown;
	}

	public WebElement getSelectValueYear1_Dropdown() {
		return SelectValueYear1_Dropdown;
	}

	public WebElement getSelectUserType2_Dropdown() {
		return SelectUserType2_Dropdown;
	}

	public WebElement getSelectActivityFor2_Dropdown() {
		return SelectActivityFor2_Dropdown;
	}

	public WebElement getSelectValueMonth2_Dropdown() {
		return SelectValueMonth2_Dropdown;
	}

	public WebElement getSelectValueYear2_Dropdown() {
		return SelectValueYear2_Dropdown;
	}
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='SE']
	
	

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_DropDown']//ul//li[text()='BS']")
	private WebElement SelectDivision_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][normalize-space()='Retailer'][text()='Retailer']")
	private WebElement SelectActivityFor1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Umbrella Campaign']")
	private WebElement SelectActivityType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][normalize-space()='November']")
	private WebElement SelectValueMonth1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][normalize-space()='2025']")
	private WebElement SelectValueYear1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][text()='SE']")
	private WebElement SelectUserType2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][normalize-space()='Retailer']")
	private WebElement SelectActivityFor2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//li[@class='rcbHovered'][normalize-space()='November']")
	private WebElement SelectValueMonth2_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYears_DropDown']//li[@class='rcbHovered'][normalize-space()='2025']")
	private WebElement SelectValueYear2_Dropdown;
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getUserType1_Dropdown() {
		return UserType1_Dropdown;
	}

	public WebElement getDivision_Dropdown() {
		return Division_Dropdown;
	}

	public WebElement getActivityFor1_Dropdown() {
		return ActivityFor1_Dropdown;
	}

	public WebElement getActivityType_Dropdown() {
		return ActivityType_Dropdown;
	}

	public WebElement getDownload_Template() {
		return Download_Template;
	}

	public WebElement getUpload_Btn() {
		return Upload_Btn;
	}

	public WebElement getActivityUpload_Header() {
		return ActivityUpload_Header;
	}

	
	public WebElement getSelectYear1_Dropdown() {
		return SelectYear1_Dropdown;
	}

	public WebElement getUserType2_Dropdown() {
		return UserType2_Dropdown;
	}

	public WebElement getActivityFor2_Dropdown() {
		return ActivityFor2_Dropdown;
	}

	public WebElement getSelectMonth2_Dropdown() {
		return SelectMonth2_Dropdown;
	}

	public WebElement getSelectYear2_Dropdown() {
		return SelectYear2_Dropdown;
	}

	
	
	
	
	
	
	
	
}
