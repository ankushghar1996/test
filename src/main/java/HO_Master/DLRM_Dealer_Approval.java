package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Approval {

	WebDriver driver;
	
	

	@FindBy (how=How.XPATH,using="//p[text()='Outlet Approval']")
	private WebElement Dealer_Approval_Menu;
	

	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_headingAreaReport'][text()='Dealer Approval']")
	private WebElement Dealer_Approval_Header_Text;

 
	public WebElement getDealer_Approval_Header_Text() {
		return Dealer_Approval_Header_Text;
	}
 
 
	public WebElement getDealer_Approval_Menu() {
		return Dealer_Approval_Menu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
