package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class RE_My_Order {
	
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;
 
	@FindBy(how=How.XPATH,using="//div[@class='padding-20']//span[text()='My Orders']")
	private WebElement My_Order;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-12 b-bottom pb-3 pt-3'])[2]")
	private WebElement  Order_Select;
	
	@FindBy(how=How.XPATH,using="//div[@class='footer']//button[text()='BACK']")
	private WebElement Back_Button;
	
 
	public WebElement getMy_Order() {
		return My_Order;
	}
 
	public WebElement getOrder_Select() {
		return Order_Select;
	}
 
	public WebElement getBack_Button() {
		return Back_Button;
	}
 
	public WebElement getMenu() {
		return Menu;
	}







}