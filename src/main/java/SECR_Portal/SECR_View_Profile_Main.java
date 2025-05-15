package SECR_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SECR_View_Profile_Main {

	
	WebDriver driver ;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSECR_Menu() {
		return SECR_Menu;
	}

	public WebElement getView_Profile() {
		return View_Profile;
	}

	public WebElement getReset_Button() {
		return Reset_Button;
	}

	public WebElement getOld_Password() {
		return Old_Password;
	}

	public WebElement getNew_Password() {
		return New_Password;
	}

	public WebElement getRe_Enter_New_Password() {
		return Re_Enter_New_Password;
	}

	public WebElement getReset_Password_Button() {
		return Reset_Password_Button;
	}

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	private WebElement SECR_Menu;
	
	
	@FindBy(how=How.XPATH,using = "//a[normalize-space()='View Profile']")
    private WebElement View_Profile ;
	
	@FindBy(how=How.XPATH,using = "//*[@routerlink='/reset-password']")
    private WebElement Reset_Button ;
	
	@FindBy(how=How.XPATH,using = "//input[@placeholder='Enter Old Password']")
    private WebElement Old_Password ;
	
	@FindBy(how=How.XPATH,using = "//input[@placeholder='Enter Mobile Number']")
    private WebElement New_Password ;
	
	@FindBy(how=How.XPATH,using = "//input[@placeholder='Re-Enter New Password']")
    private WebElement Re_Enter_New_Password ;
	
	@FindBy(how=How.XPATH,using = "//button[normalize-space()='RESET PASSWORD']")
    private WebElement Reset_Password_Button ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
