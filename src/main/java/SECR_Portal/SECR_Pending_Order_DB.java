package SECR_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SECR_Pending_Order_DB {
 
	@FindBy(how=How.XPATH,using= "//div[@class='col-12 order-states-text']//b[text()='Pending Orders']")
	private WebElement Pending_Order ;
 
	public WebElement getPending_Order() {
		return Pending_Order;

	}



}