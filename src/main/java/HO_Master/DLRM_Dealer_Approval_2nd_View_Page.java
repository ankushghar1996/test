package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Approval_2nd_View_Page {

	
	WebDriver driver;
	
	@FindBy (how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailer2ndApproval_GridData']//tr//td[text()='Kalyani Water Proofing Retailer']")
	  private WebElement Dealer_Name_2nd_Grid_Value;//CASH Counter Sales
	
	
	  @FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_BtnView']")
		private WebElement  Dealer_Approval_2nd_View_Page;
	  
	  
	  @FindBy(how=How.XPATH,using="//*[text()='Retailer Details']")
		private WebElement  Retailer_Details_2nd_Header_Text;
	  
	  
	  @FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink1']")
		private WebElement Document_1;
	  
	  
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink2']")
		private WebElement Document_2;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink3']")
		private WebElement Document_3;
		
		

		public WebElement getDealer_Name_2nd_Grid_Value() {
			return Dealer_Name_2nd_Grid_Value;
		}

		public WebElement getDealer_Approval_2nd_View_Page() {
			return Dealer_Approval_2nd_View_Page;
		}

		public WebElement getRetailer_Details_2nd_Header_Text() {
			return Retailer_Details_2nd_Header_Text;
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
