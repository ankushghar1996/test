package HO_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ActivityMaster_TargetUpload {

WebDriver driver;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Target Upload']")
	private WebElement Target_Upload_Page;

	public WebElement getTarget_Upload_Page() {
		return Target_Upload_Page;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement UserType1_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserTypes_Input']")
	private WebElement UserTypes2_Dropdown;
	
	public WebElement getUserTypes2_Dropdown() {
		return UserTypes2_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_Input']")
	private WebElement SelectMonth_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYears_Input']")
	private WebElement SelectYear_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@class='download-pills w-auto']")
	private WebElement Download_Template;
	
	@FindBy(how = How.XPATH, using = "//*[@Class='btn-custom']")
	private WebElement Upload_Btn;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space()='Target Upload'])[4]")
	private WebElement TargetUpload_Header;
	
	
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space()='SE-CR'])[1]")
	private WebElement SelectUserType1;
	
	public WebElement getSelectUserType1() {
		return SelectUserType1;
	}


	public WebElement getSelectUserType2() {
		return SelectUserType2;
	}


	public WebElement getSelectMonth() {
		return SelectMonth;
	}


	

	@FindBy(how = How.XPATH, using = "(//li[normalize-space()='SE-CR'])[1]")
	private WebElement SelectUserType2;
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='December']")
	private WebElement SelectMonth;
	
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='2025']")
	private WebElement SelectYear;
	
	
	@FindBy(how = How.XPATH, using = "//*[@value=' +  Select File to upload']")
	private WebElement SelectFileToUpload_Btn;
	
	
	public WebElement getSelectFileToUpload_Btn() {
		return SelectFileToUpload_Btn;
	}


	public WebElement getUploadNow_btn() {
		return UploadNow_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_UploadUserControl_Button3']")
	private WebElement UploadNow_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getSelectYear() {
		return SelectYear;
	}


	public WebElement getUserType1_Dropdown() {
		return UserType1_Dropdown;
	}

	
	public WebElement getSelectMonth_Dropdown() {
		return SelectMonth_Dropdown;
	}

	public WebElement getSelectYear_Dropdown() {
		return SelectYear_Dropdown;
	}

	public WebElement getDownload_Template() {
		return Download_Template;
	}

	public WebElement getUpload_Btn() {
		return Upload_Btn;
	}

	public WebElement getTargetUpload_Header() {
		return TargetUpload_Header;
	}
	
	
	
	
	
	
	
	
	
	
}
