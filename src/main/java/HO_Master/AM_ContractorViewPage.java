package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_ContractorViewPage {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Contractor Master']")
	private WebElement Contractor_Master;

	
	public WebElement getContractor_Master() {
		return Contractor_Master;
	}


	public WebElement getContractor_GridaDataTable() {
		return Contractor_GridaDataTable;
	}


	public WebElement getView_Contractor_Master_Header() {
		return View_Contractor_Master_Header;
	}


	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridContractorMaster_GridData']/table/tbody/tr/td[normalize-space()='TATA']")
	private WebElement Contractor_GridaDataTable;
	
	
	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement View_Contractor_Master_Header;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnEdit']")
	private WebElement View_btn;


	public WebElement getView_btn() {
		return View_btn;
	}
	
	
	
	// View & Close btn Xpath written in Common Data
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
