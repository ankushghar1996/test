package ASM_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class ASM_Approval_Page {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Master']")
	private WebElement Master ;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Distributor Master']")
	private WebElement Distributor_Master ;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Distributor Approval (2nd)']")
	private WebElement Distributor_Approval_2nd ;
	
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGrid2ndApprovalList_GridData']//table//tr)[2]")
	private WebElement Grid_Data ;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Approval_Page_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnApprove']")
	private WebElement Approve_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement No_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	
	
 
	public WebElement getMaster() {
		return Master;
	}
 
	public WebElement getDistributor_Master() {
		return Distributor_Master;
	}
 
	public WebElement getDistributor_Approval_2nd() {
		return Distributor_Approval_2nd;
	}
 
	public WebElement getGrid_Data() {
		return Grid_Data;
	}
 
	public WebElement getApproval_Page_Button() {
		return Approval_Page_Button;
	}
 
	public WebElement getApprove_Button() {
		return Approve_Button;
	}
 
	public WebElement getYes_Button() {
		return Yes_Button;
	}
 
	public WebElement getNo_Button() {
		return No_Button;
	}
 
	public WebElement getClose_Button() {
		return Close_Button;
	}





}