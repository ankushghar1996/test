package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_DistApp_ViewPage {

	
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval;
	
	public WebElement getDistributor_Approval() {
		return Distributor_Approval;
	}

	public WebElement getDistributor_Approval_Header() {
		return Distributor_Approval_Header;
	}

	public WebElement getDistributor_GridaDataTable() {
		return Distributor_GridaDataTable;
	}

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval_Header;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRLADistributors_GridData']/table/tbody/tr/td[normalize-space()='Sree Vinayaka Agencies']")
	private WebElement Distributor_GridaDataTable;
	
	// View, Close btn Xpath written in Common Data.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
