package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_ApprovalView_Page {

	WebDriver driver;
	
	
	@FindBy (how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridOutletKYCApproval_ctl00']//tr//td[text()='CASH Counter Sales']")
    private WebElement Dealer_Name_Grid_Value;//CASH Counter Sales
	
	
    @FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_BtnView']")
    private WebElement Dealer_Details_View_Page;
    

	@FindBy(how=How.XPATH,using="//*[text()='Dealer Details']")
	private WebElement Dealer_Details_Header_Text;
	
	
	//*[text()='Documents'] for scrolling
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

	public WebElement getDealer_Name_Grid_Value() {
		return Dealer_Name_Grid_Value;
	}

	public WebElement getDealer_Details_View_Page() {
		return Dealer_Details_View_Page;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
