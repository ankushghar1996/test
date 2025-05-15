package SECR_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SECR_LogOut_Main {

	
	
	WebDriver driver ;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSECR_Menu() {
		return SECR_Menu;
	}


	public WebElement getLogout_Button() {
		return Logout_Button;
	}


	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	private WebElement SECR_Menu;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Log-Out']")
	private WebElement Logout_Button ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
