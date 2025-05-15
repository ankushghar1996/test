package FSG_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FSG_Logout_Main {
 
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	private WebElement FSG_Menu;

	@FindBy(how=How.XPATH,using="//div[@class='p-3 opacity-75']//b[text()='Logout']")
	private WebElement Logout_Button ;
	
	
	
	
	
	
	
	
 
	public WebElement getLogout_Button() {
		return Logout_Button;
	}
 
	public WebElement getFSG_Menu() {
		return FSG_Menu;
	}




}