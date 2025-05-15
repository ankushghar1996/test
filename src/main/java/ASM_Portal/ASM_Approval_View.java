package ASM_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class ASM_Approval_View {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Master']")
	private WebElement Master ;

	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Distributor Master']")
	private WebElement Distributor_Master ;

	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Distributor Approval (2nd)']")
	private WebElement Distributor_Approval_2nd ;
	
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGrid2ndApprovalList_GridData']//table//tr)[2]")
	private WebElement Grid_Data ;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
 
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink1']")
	private WebElement Download1_Button;
	
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink2']")
	private WebElement Download2_Button;
	
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink3']")
	private WebElement Download3_Button;
	
	
 
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
 
	public WebElement getView_Button() {
		return View_Button;
	}
 
	public WebElement getClose_Button() {
		return Close_Button;
	}
 
	public WebElement getDownload1_Button() {
		return Download1_Button;
	}
 
	public WebElement getDownload2_Button() {
		return Download2_Button;
	}
 
	public WebElement getDownload3_Button() {
		return Download3_Button;
	}

}