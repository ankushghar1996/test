package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_DeveloperMaster {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Developer Account Master']")
	private WebElement Developer_Master;

	public WebElement getDeveloper_Master() {
		return Developer_Master;
	}

	public WebElement getSite_Master_Header() {
		return site_Master_Header;
	}

	

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']")
	private WebElement site_Master_Header;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridContractorMaster_GridData']/table/tbody/tr/td[normalize-space()='TATA']")
	private WebElement Developer_GridaDataTable;

	public WebElement getDeveloper_GridaDataTable() {
		return Developer_GridaDataTable;
	}
	
	// View & Close btn Xpath written in Common Data	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
