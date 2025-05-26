package Distributor_Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Outlet_Approval_1st {

	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Master']")
	private WebElement Master ;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Outlet Master']")
	private WebElement Outlet_Master ;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Outlet Approval (1st)']")
	private WebElement Outlet_Approval_1st ;
	
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailer1stApproval']//table//tr)[4]")
	private WebElement Grid_Data ;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Approval_Page_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnApprove']")
	private WebElement Approve_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement No_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	

	public WebElement getMaster() {
		return Master;
	}

	public WebElement getOutlet_Master() {
		return Outlet_Master;
	}

	public WebElement getOutlet_Approval_1st() {
		return Outlet_Approval_1st;
	}

	public WebElement getGrid_Data() {
		return Grid_Data;
	}


	public WebElement getClose_Button() {
		return Close_Button;
	}

	public WebElement getApproval_Page_Button() {
		return Approval_Page_Button;
	}

	public WebElement getApprove_Button() {
		return Approve_Button;
	}

	public WebElement getYes_Button() {
		return Yes_Button;
	}

	public WebElement getNo_Button() {
		return No_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
