package SFA_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Distributor_Approval1st_RejectPage {

	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMaster_Menu() {
		return Master_Menu;
	}


	public WebElement getDistributor_Master_Menu() {
		return Distributor_Master_Menu;
	}


	public WebElement getDistributor_Approval_Menu() {
		return Distributor_Approval_Menu;
	}


	public WebElement getDistributor_Approval_GridPage() {
		return Distributor_Approval_GridPage;
	}


	public WebElement getDistributor_View_Table() {
		return Distributor_View_Table;
	}


	public WebElement getApproval_btn() {
		return Approval_btn;
	}


	public WebElement getReject_btn() {
		return Reject_btn;
	}


	public WebElement getSelect_Reason_Dropdown() {
		return Select_Reason_Dropdown;
	}


	public WebElement getSelect_Reason() {
		return Select_Reason;
	}


	public WebElement getYes_btn() {
		return Yes_btn;
	}


	public WebElement getNo_btn() {
		return No_btn;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master']")
	private WebElement Master_Menu;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Master']")
	private WebElement Distributor_Master_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Approval (1st)']")
	private WebElement Distributor_Approval_Menu;
	
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval (1st)']")
	private WebElement Distributor_Approval_GridPage;
	

	// seprate distributor name 
	//table[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSFAApprovalList_ctl00']//tr//td[text()='Vansh Thakur']
	
	
	
	@FindBy(how = How.XPATH, using = "(//table[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSFAApprovalList_ctl00']//tr//td)[1]")
	private WebElement Distributor_View_Table;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Approval_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnReject']")
	private WebElement Reject_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_Input']")
	private WebElement Select_Reason_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Wrong PI Information']")
	private WebElement Select_Reason;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRejectYes']")
	private WebElement Yes_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement No_btn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
