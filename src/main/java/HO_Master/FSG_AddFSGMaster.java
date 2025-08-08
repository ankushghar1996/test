package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FSG_AddFSGMaster {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//a[@href='../Master/Mst_SalesmanMaster.aspx']//p[contains(text(),'FSG Master')]")
	private WebElement FSG_Master;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	// Add btn Xpath written in Common Data
	
	public WebElement getClose_btn() {
		return Close_btn;
	}

	public WebElement getAdd_btn() {
		return Add_btn;
	}

	@FindBy(how = How.XPATH, using = "//span[@id='ParentMasterContentPlaceHolder1_lblHeader']")
	private WebElement Add_New_FSG_Header;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_Input']")
	private WebElement ChannelType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_DropDown']//ul//li[text()='SFA']")
	private WebElement ChannelTypeValue_Dropdown;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_Input']")
	private WebElement FSGType_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_DropDown']//ul//li[text()='Retail Channel']")
	private WebElement FSGTypeValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_DropDown']//ul//li[text()='Building Channel']")
	private WebElement FSGTypeValue1_Dropdown;
	
	
	public WebElement getFSGTypeValue1_Dropdown() {
		return FSGTypeValue1_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_Input']")
	private WebElement Distributor_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li[text()='New Annapurna  Associate [SFA-001]']")
	private WebElement DistributorValue_Dropdown;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmployeeCode']")
	private WebElement Employee_Code_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtSalesmanName']")
	private WebElement FSG_Name_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress1']")
	private WebElement Address1_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_Input']")
	private WebElement State_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[text()='Maharashtra']")
	private WebElement StateValue_Dropdown;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown_Input']")
	private WebElement Town_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown_DropDown']//ul//li[text()='Nagpur']")
	private WebElement TownValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmailId']")
	private WebElement Email_ID_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement PinCode_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtMobile']")
	private WebElement MobileNo_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPanNo']")
	private WebElement PanNo_Textbox;
	
	@FindBy(how = How.XPATH, using = "//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpJoiningDate_popupButton']")
	private WebElement Joining_popupButton_Textbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_btn;

	public WebElement getFSG_Master() {
		return FSG_Master;
	}

	public WebElement getAdd_New_FSG_Header() {
		return Add_New_FSG_Header;
	}

	public WebElement getChannelType_Dropdown() {
		return ChannelType_Dropdown;
	}

	public WebElement getChannelTypeValue_Dropdown() {
		return ChannelTypeValue_Dropdown;
	}

	public WebElement getFSGType_Dropdown() {
		return FSGType_Dropdown;
	}

	public WebElement getFSGTypeValue_Dropdown() {
		return FSGTypeValue_Dropdown;
	}

	public WebElement getDistributor_Dropdown() {
		return Distributor_Dropdown;
	}

	public WebElement getDistributorValue_Dropdown() {
		return DistributorValue_Dropdown;
	}

	public WebElement getEmployee_Code_Textbox() {
		return Employee_Code_Textbox;
	}

	public WebElement getFSG_Name_Textbox() {
		return FSG_Name_Textbox;
	}

	public WebElement getAddress1_Textbox() {
		return Address1_Textbox;
	}

	public WebElement getState_Dropdown() {
		return State_Dropdown;
	}

	public WebElement getStateValue_Dropdown() {
		return StateValue_Dropdown;
	}

	public WebElement getTown_Dropdown() {
		return Town_Dropdown;
	}

	public WebElement getTownValue_Dropdown() {
		return TownValue_Dropdown;
	}

	public WebElement getEmail_ID_Textbox() {
		return Email_ID_Textbox;
	}

	public WebElement getPinCode_Textbox() {
		return PinCode_Textbox;
	}

	public WebElement getMobileNo_Textbox() {
		return MobileNo_Textbox;
	}

	public WebElement getPanNo_Textbox() {
		return PanNo_Textbox;
	}

	public WebElement getJoining_popupButton_Textbox() {
		return Joining_popupButton_Textbox;
	}

	public WebElement getSave_btn() {
		return Save_btn;
	}

	public void setSave_btn(WebElement save_btn) {
		Save_btn = save_btn;
	}
	
	// Save & Close btn Xpath written in Common Data	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
