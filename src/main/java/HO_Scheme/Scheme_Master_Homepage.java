package HO_Scheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Scheme_Master_Homepage {

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Scheme Master']")
	private WebElement Scheme_Master_Menu;
	
	public WebElement getScheme_Master_Menu() {
		return Scheme_Master_Menu;
	}

	public WebElement getSearch_btn() {
		return Search_btn;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnSearch']")
	private WebElement Search_btn;
	
	
	
	
	
	
	
	
	
}
