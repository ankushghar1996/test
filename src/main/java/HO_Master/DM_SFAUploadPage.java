package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_SFAUploadPage {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='SFA/Distributor Master']")
	private WebElement SFADistributor_Master;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_UploadUserControl_lblUploadHeaderText']")
	private WebElement UploadHeaderText;
	
	
	// Upload, Upload Now, Select to File, Download Template btn Xpath written in Common Data.
	
	public WebElement getSFADistributor_Master() {
		return SFADistributor_Master;
	}

	public WebElement getUploadHeaderText() {
		return UploadHeaderText;
	}

	
	
	
	
}
