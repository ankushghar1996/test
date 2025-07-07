package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Product_Wise_Purchase {
 
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;
	
	@FindBy(how=How.XPATH,using="//div[@class='offcanvas-options pt-2']//span[text()='Product Wise Purchase']")
	private WebElement Product_Wise_Purchase;
	
	@FindBy(how=How.XPATH,using="//img[contains(@src,'arrow.svg')]")
	private WebElement Product_Wise_Purchase_Back_Button;
	@FindBy(xpath = "//h1[contains(text(), 'Product Wise Purchase')]")
	private WebElement productWisePurchaseTitle;

	public WebElement getProduct_Wise_Purchase_Title() {
	    return productWisePurchaseTitle;
	}

	
 
	public WebElement getProduct_Wise_Purchase() {
		return Product_Wise_Purchase;
	}
 
	public WebElement getProduct_Wise_Purchase_Back_Button() {
		return Product_Wise_Purchase_Back_Button;
	}
 
	public WebElement getMenu() {
		return Menu;
	}



	public WebElement getProductWisePurchaseTitle() {
		return productWisePurchaseTitle;
	}



}