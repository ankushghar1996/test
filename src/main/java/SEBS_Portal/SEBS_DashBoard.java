package SEBS_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SEBS_DashBoard {
 
@FindBy(how=How.XPATH,using="//span[contains(., 'MTD Working')]")
private WebElement MTD_Capsule;

//div[@class='col-1 text-end']//i[@aria-hidden='true']
@FindBy(how=How.XPATH,using="//div[@class='col-1 text-end']//i[@aria-hidden='true']")
private WebElement Arrow_Button;

@FindBy(how=How.XPATH,using="//div[contains(text(), 'YTD')]")
private WebElement YTD_Button;	
 

@FindBy (how=How.XPATH,using="//div[@class='common-footer-btn']//span[text()='CLOSE']")
private WebElement Close;
 

public WebElement getMTD_Capsule() {
	return MTD_Capsule;
}
 
public WebElement getArrow_Button() {
	return Arrow_Button;
}
 
public WebElement getYTD_Button() {
	return YTD_Button;
}
 
public WebElement getClose() {
	return Close;
}


}