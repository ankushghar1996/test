package HO_Portal_Main;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class HO_Distributor_Approval_View_Main {
 
	
WebDriver driver;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval;

	 //  (//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRLADistributors_GridData']//table//tr)[2]
			//table[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRLADistributors_ctl00']//tr//td[text()='Chiranth Agencies']
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRLADistributors_GridData']//table//tr)[2]")
	private WebElement Distributor_Approval_Grid_Page;
	
	
	@FindBy(how = How.XPATH, using = "//p[text()='Distributor Master']")
	private WebElement Distributor_Master;
	
	
	@FindBy(how = How.XPATH, using = "//p[text()='Master']")
	private WebElement Master;
 
	
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval_Header;

	
	// View, Close btn Xpath written in Common Data
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Approval']")
	private WebElement Distributor_Approval_Header_Text;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	
	//Distributor Details
	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Details']")
	private WebElement Distributor_Details_Header_Text;
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='ParentMasterContentPlaceHolder1_documentLink1']")
	private WebElement Document_1;
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='ParentMasterContentPlaceHolder1_documentLink2']")
	private WebElement Document_2;
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='ParentMasterContentPlaceHolder1_documentLink3']")
	private WebElement Document_3;
	
	
	public WebElement getView_btn() {
		return View_btn;
	}
 
	
	public WebElement getApproval_btn() {
		return Approval_btn;
	}
	
	
 
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Approval_btn;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	//*[@id='ParentMasterContentPlaceHolder1_btnClose']

	
	public WebElement getDistributor_Approval() {
		return Distributor_Approval;
	}
 
	
	public WebElement getDistributor_Approval_Header() {
		return Distributor_Approval_Header;
	}
 
 
	public WebElement getDistributor_Master() {
		return Distributor_Master;
	}
 
	public WebElement getMaster() {
		return Master;
	}
 
	public WebElement getDistributor_Approval_Grid_Page() {
		return Distributor_Approval_Grid_Page;
	}
 
	public WebElement getDistributor_Approval_Header_Text() {
		return Distributor_Approval_Header_Text;
	}
 
	public WebElement getDistributor_Details_Header_Text() {
		return Distributor_Details_Header_Text;
	}
 
	public WebElement getDocument_1() {
		return Document_1;
	}
 
	public WebElement getDocument_2() {
		return Document_2;
	}
 
	public WebElement getDocument_3() {
		return Document_3;
	}
 
	public WebElement getClose_btn() {
		return Close_btn;
	}








}