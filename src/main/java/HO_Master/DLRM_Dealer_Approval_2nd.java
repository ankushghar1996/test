package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Approval_2nd {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[normalize-space()='Retailer Approval (2nd)']")
	private WebElement Retailer_Approval_2nd_Header_Text;
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Outlet Approval (2nd)']")
	private WebElement Retailer_Approval_2nd_Menu;
	 
	
	public WebElement getRetailer_Approval_2nd_Header_Text() {
		return Retailer_Approval_2nd_Header_Text;
	}
	 
	public WebElement getRetailer_Approval_2nd_Menu() {
		return Retailer_Approval_2nd_Menu;
	}
	
	
	
	
	
	
	
}
