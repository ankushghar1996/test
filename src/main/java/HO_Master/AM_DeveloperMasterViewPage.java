package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_DeveloperMasterViewPage {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Developer Master']")
	private WebElement Developer_Master;
	
	public WebElement getDeveloper_Master() {
		return Developer_Master;
	}

	public WebElement getDeveloper_GridaDataTable() {
		return Developer_GridaDataTable;
	}

	public WebElement getView_Developer_Account_Header() {
		return View_Developer_Account_Header;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridDeveloperMaster_GridData']/table/tbody/tr/td[normalize-space()='10001']")
	private WebElement Developer_GridaDataTable;
	
	// View & Close btn Xpath written in Common Data	
	
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='View Developer Account']")
	private WebElement View_Developer_Account_Header;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnEdit']")
	private WebElement View_btn;

	public WebElement getView_btn() {
		return View_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
