package HO_Portal_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OutletMaster_EditApprovalPage {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Master']")
    private WebElement Master_Menu;
	
	
	public WebElement getMaster_Menu() {
		return Master_Menu;
	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOutlet_Master_Menu() {
		return Outlet_Master_Menu;
	}


	public WebElement getOutlet_Approval_SubMenu() {
		return Outlet_Approval_SubMenu;
	}


	public WebElement getOutlet_Approval_Text() {
		return Outlet_Approval_Text;
	}


	public WebElement getOutlet_Name_Common_Value() {
		return Outlet_Name_Common_Value;
	}


	public WebElement getOutlet_Name_Grid_Value() {
		return Outlet_Name_Grid_Value;
	}


	public WebElement getApproval_btn() {
		return Approval_btn;
	}


	public WebElement getOutlet_Details_Text() {
		return Outlet_Details_Text;
	}


	public WebElement getEdit_btn() {
		return Edit_btn;
	}


	public WebElement getDistributor_Input() {
		return Distributor_Input;
	}


	public WebElement getSelect_Distributor_Input() {
		return Select_Distributor_Input;
	}


	public WebElement getFSG_Input() {
		return FSG_Input;
	}


	public WebElement getSelect_FSG_Input() {
		return Select_FSG_Input;
	}


	public WebElement getRoute_Input() {
		return Route_Input;
	}


	public WebElement getSelect_Route_Input() {
		return Select_Route_Input;
	}


	public WebElement getRetailerFirmName() {
		return RetailerFirmName;
	}


	public WebElement getRetailerClass_Input() {
		return RetailerClass_Input;
	}


	public WebElement getSelect_RetailerClass_Input() {
		return Select_RetailerClass_Input;
	}


	public WebElement getRetailerCategory_Input() {
		return RetailerCategory_Input;
	}


	public WebElement getSelect_RetailerCategory_Input() {
		return Select_RetailerCategory_Input;
	}


	public WebElement getTxtAddressLine1() {
		return txtAddressLine1;
	}


	public WebElement getState_Input() {
		return State_Input;
	}

	

	public WebElement getSelect_State_Input() {
		return Select_State_Input;
	}


	public WebElement getCity_Input() {
		return City_Input;
	}


	public WebElement getSelect_City_Input() {
		return Select_City_Input;
	}


	public WebElement getTxtPinCode() {
		return txtPinCode;
	}


	public WebElement getTxtContactPersonName() {
		return txtContactPersonName;
	}


	public WebElement getTxtPANNo() {
		return txtPANNo;
	}


	public WebElement getTxtTotlBusinessInConstructionChemicals() {
		return txtTotlBusinessInConstructionChemicals;
	}


	public WebElement getProceedForApproval_btn() {
		return ProceedForApproval_btn;
	}


	public WebElement getReject_btn() {
		return Reject_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	@FindBy(how=How.XPATH,using="//p[normalize-space()='Outlet Master']")
    private WebElement Outlet_Master_Menu;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Outlet Approval']")
	private WebElement Outlet_Approval_SubMenu;
	
	
	@FindBy(how=How.XPATH,using="//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']")
	private WebElement Outlet_Approval_Text;
	
	
	
	@FindBy (how=How.XPATH,using="(//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridOutletKYCApproval_GridData']//table//tbody//tr)[1]")
    private WebElement Outlet_Name_Common_Value;
	
	
	
	@FindBy (how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridOutletKYCApproval_ctl00']//tr//td[text()='Dreams Retailers']")
    private WebElement Outlet_Name_Grid_Value;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
    private WebElement Approval_btn;
	
	
	@FindBy(how=How.XPATH,using="//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']")
	private WebElement Outlet_Details_Text;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnEdit']")
    private WebElement Edit_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_Input']")
    private WebElement Distributor_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li[text()='Chiranth Agencies']")
    private WebElement Select_Distributor_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSG_Input']")
    private WebElement FSG_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSG_DropDown']//ul//li[text()='Roshan']")
    private WebElement Select_FSG_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRoute_Input']")
    private WebElement Route_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRoute_DropDown']//ul//li[text()='Navle IT park']")
    private WebElement Select_Route_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtRetailerFirmName']")
    private WebElement RetailerFirmName;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerClass_Input']")
    private WebElement RetailerClass_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerClass_DropDown']//ul//li[text()='Silver']")
    private WebElement Select_RetailerClass_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerCategory_Input']")
    private WebElement RetailerCategory_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerCategory_DropDown']//ul//li[text()='Paint']")
    private WebElement Select_RetailerCategory_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtAddressLine1']")
    private WebElement txtAddressLine1;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_Input']")
    private WebElement State_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[text()='Karnataka']")
    private WebElement Select_State_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_Input']")
    private WebElement City_Input;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[text()='Bangalore']")
    private WebElement Select_City_Input;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
    private WebElement txtPinCode;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtContactPersonName']")
    private WebElement txtContactPersonName;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtPANNo']")
    private WebElement txtPANNo;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtTotlBusinessInConstructionChemicals']")
    private WebElement txtTotlBusinessInConstructionChemicals;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnProceedForApproval']")
    private WebElement ProceedForApproval_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnReject']")
    private WebElement Reject_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
    private WebElement Close_btn;
	
	
	
	
	
	
	
	
	
	
	
	
}
