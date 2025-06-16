package SCER_Web_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OM_Outlet_Approval2nd_View {

	
WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master']")
	private WebElement Master_Menu;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMaster_Menu() {
		return Master_Menu;
	}


	public WebElement getOutlet_Master_SubMenu() {
		return Outlet_Master_SubMenu;
	}


	public WebElement getOutlet_Approval_SubMenu() {
		return Outlet_Approval_SubMenu;
	}


	public WebElement getDistributor_Approval_Grid_Page() {
		return Distributor_Approval_Grid_Page;
	}


	public WebElement getView_btn() {
		return View_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Outlet Master']")
	private WebElement Outlet_Master_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Outlet Approval (2nd)']")
	private WebElement Outlet_Approval_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailer2ndApproval_GridData']//table//tr)[2]")
	private WebElement Distributor_Approval_Grid_Page;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	
	
	
	
	
	
}
