package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Logout_Main {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;	
	
	@FindBy(how=How.XPATH,using="//img[contains(@img,'logout.png')]")
	private WebElement Logout ;
	
	//div[@class='modal-content']//button[text()='Yes']
	@FindBy(how=How.XPATH,using="//div[@class='modal-content']//button[text()='Yes']")
	private WebElement Logout_Yes;
	
 
	public WebElement getMenu() {
		return Menu;
	}
 
	public WebElement getLogout() {
		return Logout;
	}
 
	public WebElement getLogout_Yes() {
		return Logout_Yes;
	}





}