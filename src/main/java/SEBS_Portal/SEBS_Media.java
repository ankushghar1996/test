package SEBS_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SEBS_Media {
 
  
	  @FindBy(how=How.XPATH,using="//div[@class='col-3 footer-option']//span[text()='Media']")
	  private WebElement Media_Tab;
	  
	  @FindBy(how=How.XPATH,using="//div[@class='row main-header']//span[text()='Documents']")
	  private WebElement Media_Documents;	
	  
	  @FindBy(how=How.XPATH,using="//input[@placeholder='Search Document']")
	  private WebElement Documents_Search_Button;
	  
 
	  public WebElement getMedia_Tab() {
	  	return Media_Tab;
	  }
 
	  public WebElement getMedia_Documents() {
	  	return Media_Documents;
	  }
 
	  public WebElement getDocuments_Search_Button() {
	  	return Documents_Search_Button;
	  }








  }