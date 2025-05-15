package Retailer_Portal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Retailer_Points  {
WebDriver driver;
 
 
@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
private WebElement Menu ;
 
@FindBy(how=How.XPATH,using="//div[@class='padding-20']//span[text()='My Points']")
private WebElement My_Points ;	
 
@FindBy(how=How.XPATH,using="//div[@class='mt-3']//button[text()='Redeem Points Now']")
private WebElement Redeem_Points_Now ;

@FindBy(how=How.XPATH,using="//input[@placeholder='Search by Item Name']")
private WebElement Search_Button ;	

 
@FindBy(how=How.XPATH,using="(//div[@class='view-performance text-white d-flex justify-content-center align-items-center mb-4']//i[@aria-hidden='true'])[2]")
private WebElement View_Performance ;
 
 
public WebElement getMenu() {
	return Menu;
}
 
 
public WebElement getMy_Points() {
	return My_Points;
}
 
 
public WebElement getRedeem_Points_Now() {
	return Redeem_Points_Now;
}
 
 
public WebElement getSearch_Button() {
	return Search_Button;
}
 
 
public WebElement getView_Performance() {
	return View_Performance;
}


}