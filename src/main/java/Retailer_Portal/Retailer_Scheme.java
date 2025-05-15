package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Retailer_Scheme {
 
 
	
	@FindBy(how=How.XPATH,using="//img[contains(@src,'scheme.svg')]")
	private WebElement My_Scheme ;
	
	
	@FindBy(how=How.XPATH,using="//img[contains(@src,'long.svg')]")
	private WebElement Scheme_Banner;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='btn-group']//button[text()='+'])[1]")
	private WebElement Add_to_cart ;
	
	
	@FindBy(how=How.XPATH,using="//img[contains(@src,'cart.svg')]")
	private WebElement Cart_Button ;
	
 
	public WebElement getMy_Scheme() {
		return My_Scheme;
	}
 
	public WebElement getScheme_Banner() {
		return Scheme_Banner;
	}
 
	public WebElement getAdd_to_cart() {
		return Add_to_cart;
	}
 
	public WebElement getCart_Button() {
		return Cart_Button;
	}





}