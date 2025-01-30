package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_SiteMasterViewPage {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Site Master']")
	private WebElement Site_Master;

	
	public WebElement getSite_Master() {
		return Site_Master;
	}

	

	public WebElement getView_site_Master_Header() {
		return View_site_Master_Header;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSiteManagement_GridData']/table/tbody/tr/td[normalize-space()='10032']")
	private WebElement Site_GridaDataTable;
	
	// View & Close btn Xpath written in Common Data
	
	public WebElement getSite_GridaDataTable() {
		return Site_GridaDataTable;
	}

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement View_site_Master_Header;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnEdit']")
	private WebElement View_btn;


	public WebElement getView_btn() {
		return View_btn;
	}
	
	
	
	
	
	
	
	
	
}
