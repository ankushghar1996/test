package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_DistributorApprovl {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval;

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval_Header;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRLADistributors_GridData']/table/tbody/tr/td[normalize-space()='Sree Vinayaka Agencies']")
	private WebElement Distributor_GridaDataTable;
	
	// View, Close btn Xpath written in Common Data
	
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Details']")
	private WebElement Distributor_ApprovalDetails_Header;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	public WebElement getView_btn() {
		return View_btn;
	}

	public WebElement getApproval_btn() {
		return Approval_btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Approval_btn;
	
	
	
	
	public WebElement getDistributor_Approval() {
		return Distributor_Approval;
	}

	public WebElement getDistributor_Approval_Header() {
		return Distributor_Approval_Header;
	}

	public WebElement getDistributor_GridaDataTable() {
		return Distributor_GridaDataTable;
	}

	public WebElement getDistributor_ApprovalDetails_Header() {
		return Distributor_ApprovalDetails_Header;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
