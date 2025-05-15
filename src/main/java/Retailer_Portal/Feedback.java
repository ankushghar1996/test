package Retailer_Portal;
 
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
 
public class Feedback {

	@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")

	private WebElement Menu ;

	@FindBy(how=How.XPATH,using="")

	private WebElement Comment_Enter;

}

 