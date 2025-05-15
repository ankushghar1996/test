package HO_Portal_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OutletMaster_ViewPage {

	
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


	public WebElement getView_btn() {
		return View_btn;
	}


	public WebElement getOutlet_Details_Text() {
		return Outlet_Details_Text;
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
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
    private WebElement View_btn;
	
	
	@FindBy(how=How.XPATH,using="//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']")
	private WebElement Outlet_Details_Text;
	
	
	//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']
	
	@FindBy(how=How.XPATH,using="//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']")
    private WebElement Close_btn;
	
	
	
	
	
	
}
