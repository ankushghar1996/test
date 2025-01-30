package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AM_ApplicatorViewPage {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Applicator Master']")
	private WebElement Applicator_Master;
	
	public WebElement getApplicator_Master() {
		return Applicator_Master;
	}

	public WebElement getApplicator_GridaDataTable() {
		return Applicator_GridaDataTable;
	}

	public WebElement getApplicator_Master_Header() {
		return Applicator_Master_Header;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridApplicatorMaster_GridData']/table/tbody/tr/td[normalize-space()='Ali bhai']")
	private WebElement Applicator_GridaDataTable;
	
	// View & Close btn Xpath written in Common Data
	
	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement Applicator_Master_Header;
	
	
	public WebElement getView_Btn() {
		return View_Btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnEdit']")
	private WebElement View_Btn;
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
