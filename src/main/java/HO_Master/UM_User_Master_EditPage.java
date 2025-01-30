package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UM_User_Master_EditPage {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveTo_popupButton']")
	  private WebElement Active_TO_Button;
	 
	
	  @FindBy(how=How.XPATH,using = "//*[@id='pageHeader']")
	  private WebElement Edit_User_Header_Text;
	 
	  
	//*[@id='ParentMasterContentPlaceHolder1_BtnUpdate']
	  @FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_BtnUpdate']")
	  private WebElement Edit_Button;
	  
	  
	  public WebElement getActive_TO_Button() {
	      return Active_TO_Button;
	  }
	 
	  public WebElement getEdit_User_Header_Text() {
	      return Edit_User_Header_Text;
	  }
	 
	public WebElement getEdit_Button() {
		return Edit_Button;
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
