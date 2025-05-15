package SEBS_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PJP_SEBS {

	
	WebDriver driver;
	

	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSEBS_Menu() {
		return SEBS_Menu;
	}


	public WebElement getPJP_SubMenu() {
		return PJP_SubMenu;
	}


	public WebElement getCLOSE_btn() {
		return CLOSE_btn;
	}


	@FindBy(how=How.XPATH,using="(//i[@class='fa fa-bars'])[1]")
    private WebElement SEBS_Menu;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='PJP']")
    private WebElement PJP_SubMenu;
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='CLOSE']")
    private WebElement CLOSE_btn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
