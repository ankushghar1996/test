package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Master {

	WebDriver driver;
	
	
	
	@FindBy (how=How.XPATH,using = "(//p[text()='Outlet Master'])[2]")
	private WebElement Dealer_Master_Menu;
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Outlet Master List']")
	  private WebElement Dealer_Master_Header_Text;
	
	
	@FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailerMaster_ctl00__0']//td[text()='Asian Enterprises']")
	private WebElement Select_Outlet_Name;
	
	
 
	public WebElement getDealer_Master_Header_Text() {
		return Dealer_Master_Header_Text;
	}
 
	public WebElement getSelect_Outlet_Name() {
		return Select_Outlet_Name;
	}
 
	public WebElement getDealer_Master_Menu() {
		return Dealer_Master_Menu;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
