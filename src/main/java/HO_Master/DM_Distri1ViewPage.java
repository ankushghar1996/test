package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_Distri1ViewPage {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Approval (1st)']")
	private WebElement Distributor_Approval;
	
	public WebElement getDistributor_Approval() {
		return Distributor_Approval;
	}

	public WebElement getDistributor_Approval_Header() {
		return Distributor_Approval_Header;
	}

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval (1st)']")
	private WebElement Distributor_Approval_Header;
	
	// View btn Xpath written in Common Data.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
