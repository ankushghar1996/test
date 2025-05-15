package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class RE_New_Order {
 
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;
	
	@FindBy(how=How.XPATH,using="//div[@class='padding-20']//span[text()='New Order']")
	private WebElement New_Order;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-slider']//img[@src='../../../../../assets/images/development/no-image.jpg']")
	private WebElement Waterproofing;
	
	@FindBy(how=How.XPATH,using="(//div[@class='qty-capsule']//button[text()='+'])[2]")
	private WebElement Product_Add_Cart;

	@FindBy(how=How.XPATH,using="//div[@class='row mx-auto cart-container']//span[text()='VIEW CART']")
	private WebElement Product_View_Cart;
	
	@FindBy(how=How.XPATH,using="//div[@class='row submit-order']//button[text()=' Submit ']")
	private WebElement Submit_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='modal-content align-items-center']//button[text()='Continue to New Order']")
	private WebElement Points_New_Order;
	
	@FindBy(how=How.XPATH,using="//div[@class='modal-content align-items-center']//button[@type='button']")
	private WebElement Okay_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-6 p-0']//button[text()='CANCEL']")
	private WebElement NO_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-6 p-0']//button[text()='YES ']")
	private WebElement Yes_Button;
	
 
	public WebElement getMenu() {
		return Menu;
	}
 
	public WebElement getNew_Order() {
		return New_Order;
	}
 
	public WebElement getWaterproofing() {
		return Waterproofing;
	}
 
	public WebElement getProduct_Add_Cart() {
		return Product_Add_Cart;
	}
 
	public WebElement getProduct_View_Cart() {
		return Product_View_Cart;
	}
 
	public WebElement getSubmit_Button() {
		return Submit_Button;
	}
 
	public WebElement getNO_Button() {
		return NO_Button;
	}
 
	public WebElement getYes_Button() {
		return Yes_Button;
	}
 
	public WebElement getOkay_Button() {
		return Okay_Button;
	}
 
	public WebElement getPoints_New_Order() {
		return Points_New_Order;
	}




}