package FSG_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FSG_Login {

	
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='User Name']")
	private WebElement UserName;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_Btn() {
		return Login_Btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary w-100']")
	private WebElement Login_Btn;
	
	
	
	
	
	
	
	
	
	
}
