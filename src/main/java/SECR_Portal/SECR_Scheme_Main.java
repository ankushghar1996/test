package SECR_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SECR_Scheme_Main {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='col-3 footer-option']//span[text()='Schemes']")
	private WebElement Scheme_Tab;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='row scheme-container-main']//h5[text()='Distributor Loyalty Scheme']")
	private WebElement Scheme_Name;
	
	
	@FindBy (how=How.XPATH,using="//div[@class='common-footer-btn']//span[text()='CLOSE']")
	private WebElement Scheme_Close;
	
	
 
	public WebElement getScheme_Tab() {
		return Scheme_Tab;
	}
 
	public WebElement getScheme_Name() {
		return Scheme_Name;
	}
 
	public WebElement getScheme_Close() {
		return Scheme_Close;
	}







}