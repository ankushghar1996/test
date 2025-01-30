package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Approval_2nd_Approval_Page {

	
	WebDriver driver;
	
	
	    @FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink1']")
		private WebElement Document_1;
	
	
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink2']")
		private WebElement Document_2;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_documentLink3']")
		private WebElement Document_3;
		
		
	 
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
