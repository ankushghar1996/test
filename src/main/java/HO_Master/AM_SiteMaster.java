package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_SiteMaster {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Site Master']")
	private WebElement Site_Master;

	public WebElement getSite_Master() {
		return Site_Master;
	}

	public WebElement getSite_Master_Header() {
		return site_Master_Header;
	}

	public WebElement getContractor_GridaDataTable() {
		return Contractor_GridaDataTable;
	}

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']")
	private WebElement site_Master_Header;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridContractorMaster_GridData']/table/tbody/tr/td[normalize-space()='TATA']")
	private WebElement Contractor_GridaDataTable;
	
	// View & Close btn Xpath written in Common Data
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
