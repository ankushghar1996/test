package HO_Portal_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OutletMaster_ApprovalPage {

	

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Master']")
    private WebElement Master_Menu;
	
	
	public WebElement getMaster_Menu() {
		return Master_Menu;
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Outlet Master']")
    private WebElement Outlet_Master_Menu;
	
	
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


	public WebElement getProceedForApproval_btn() {
		return ProceedForApproval_btn;
	}


	public WebElement getReject_btn() {
		return Reject_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


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
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnProceedForApproval']")
    private WebElement ProceedForApproval_btn;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnProceedForApproval']")
    private WebElement ProceedForReject_btn;
	
	@FindBy(how=How.XPATH,using="//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_Arrow']")
    private WebElement Reject_Reason_Dropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnRejectYes']")
    private WebElement Reject_Yes_Button;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_Button1']")
    private WebElement Reject_NO_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='rcbSlide']//ul//li[text()='Wrong PI Information']")
    private WebElement Reject_Reason_Dropdown_Value;
	
	//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_Arrow']
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnReject']")
    private WebElement Reject_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
    private WebElement Close_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
    private WebElement No_btn;
	
	
	public WebElement getNo_btn() {
		return No_btn;
	}


	public WebElement getYes_btn() {
		return Yes_btn;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
    private WebElement Yes_btn;


	public WebElement getProceedForReject_btn() {
		return ProceedForReject_btn;
	}


	public WebElement getProceedForReject() {
		return Reject_Reason_Dropdown;
	}


	public WebElement getReject_Reason_Dropdown() {
		return Reject_Reason_Dropdown;
	}


	public WebElement getReject_Reason_Dropdown_Value() {
		return Reject_Reason_Dropdown_Value;
	}


	public WebElement getReject_Yes_Button() {
		return Reject_Yes_Button;
	}


	public WebElement getReject_NO_Button() {
		return Reject_NO_Button;
	}
	
	
	
	
}
