package SCER_Web_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SECR_Login_main {

	
WebDriver driver;
	
	public WebElement getUserName() {
	return UserName;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getLogin_Btn() {
	return Login_Btn;
}

	@FindBy(how = How.XPATH, using = "//input[@id='txtusername']")
	private WebElement UserName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtpassword']")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
	private WebElement Login_Btn;
	
	
	
	
	
	
	
}
