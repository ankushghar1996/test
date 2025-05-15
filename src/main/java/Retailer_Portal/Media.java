package Retailer_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Media{
 
	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
	private WebElement Menu ;	
	
	@FindBy(how=How.XPATH,using="//div[@class='offcanvas-options pt-2']//span[text()='Media']")
	private WebElement Media;
	
	@FindBy(how=How.XPATH,using="//div[@class='media-tab']//div[text()='Documents']")
	private WebElement Documents;
	
	@FindBy(how=How.XPATH,using="//img[contains(@src,'arrow.svg')]")
	private WebElement Back_Arrow_Button;
	
 
	public WebElement getMedia() {
		return Media;
	}
 
	public WebElement getDocuments() {
		return Documents;
	}
 
	public WebElement getBack_Arrow_Button() {
		return Back_Arrow_Button;
	}
 
	public WebElement getMenu() {
		return Menu;
	}




}