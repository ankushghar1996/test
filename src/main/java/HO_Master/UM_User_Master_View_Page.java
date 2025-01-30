package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UM_User_Master_View_Page {

	
	WebDriver driver;
	
	
	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridUserMaster_ctl00']//tbody/tr/td[text()='Rohit Deshpande']")
	  private WebElement userMasterGridLine1;
	 
	  @FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	  private WebElement userDetailsHeaderText;

	 
	  public WebElement getUserMasterGridLine1() {
	      return userMasterGridLine1;
	  }
	 
	  public WebElement getUserDetailsHeaderText() {
	      return userDetailsHeaderText;
	  }
	
	
	
	
	
	
	
	
	
}
