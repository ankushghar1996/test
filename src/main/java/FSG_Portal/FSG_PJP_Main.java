package FSG_Portal;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class FSG_PJP_Main {
	
	
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	private WebElement FSG_Menu;
	
	@FindBy(how=How.XPATH,using ="//span[@class='ms-4']//b[text()='PJP']")
	private WebElement PJP_Submenu ;
	
	
	@FindBy(how=How.XPATH,using ="//button[text()='CLOSE']")
	private WebElement Close_Button ;
	
 
 
	public WebElement getFSG_Menu() {
		return FSG_Menu;
	}
 
 
	public WebElement getPJP_Submenu() {
		return PJP_Submenu;
	}
 
 
	public WebElement getClose_Button() {
		return Close_Button;
	}



}