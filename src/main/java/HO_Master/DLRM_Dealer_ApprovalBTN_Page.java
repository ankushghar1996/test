package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_ApprovalBTN_Page {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Outlet Approval']")
	private WebElement OutletApproval_Menu;
	
	
	
	public WebElement getOutletApproval_Menu() {
		return OutletApproval_Menu;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Outlet_BtnApproval;
	
	
	public WebElement getOutlet_BtnApproval() {
		return Outlet_BtnApproval;
	}

	@FindBy(how=How.XPATH,using="//*[text()='Dealer Details']")
	private WebElement Dealer_Details_Header_Text;
	
	
	//Verify Dealer name and Approved Status According to data
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_lblApprovalStatus']")
	private WebElement Approvad_Status_header_text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink1']")
	private WebElement Document_1;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink2']")
	private WebElement Document_2;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink3']")
	private WebElement Document_3;
 
	public WebElement getDealer_Details_Header_Text() {
		return Dealer_Details_Header_Text;
	}
 
	public WebElement getApprovad_Status_header_text() {
		return Approvad_Status_header_text;
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
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
