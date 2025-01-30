package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Approval_1st {

	
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//p[text()='Outlet Approval (1st)']")
	private WebElement Dealer_Approval_1st_Menu;
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Retailer Approval (1st) ']")
	  private WebElement Retailer_Approval_1st_Header_Text;
	
	
	 
	public WebElement getRetailer_Approval_1st_Header_Text() {
		return Retailer_Approval_1st_Header_Text;
	}
	 
	public WebElement getDealer_Approval_1st_Menu() {
		return Dealer_Approval_1st_Menu;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
