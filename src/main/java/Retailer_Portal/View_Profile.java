package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class View_Profile {
 
	@FindBy(how=How.XPATH,using="//div[@class='offcanvas-body p-0']//span[text()='View Profile ']")
	private WebElement  View_Profile ;
	
	@FindBy(how=How.XPATH,using="//div[@class='footer']//button[text()='BACK']")
	private WebElement  Back_Button ;
	
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;	
	
 
	public WebElement getView_Profile() {
		return View_Profile;
	}
 
	public WebElement getClose_Button() {
		return Back_Button;
	}
 
	public WebElement getMenu() {
		return Menu;
	}









}