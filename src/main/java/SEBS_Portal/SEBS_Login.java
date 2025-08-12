package SEBS_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SEBS_Login {

	
	
	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUserName() {
		return UserName;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLogin_btn() {
		return Login_btn;
	}


	@FindBy(how = How.XPATH, using = "//input[@placeholder='User Name']")
	private WebElement UserName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private WebElement Password;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='login-main-container w-100 p-0']//child::div/child::span[contains(@class,'login-text')]")
	private WebElement Login_btn;
	
	
	
	
	
	
	
	
}
