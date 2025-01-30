package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_SE_PJP_Master {

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using = "//*[text()='SE PJP Master']")
	private WebElement SE_PJP_Master_Menu_Button;
	 
	
	@FindBy(how=How.XPATH,using = "(//*[text()='SE PJP Master'])[2]")
	private WebElement Set_PJP_Header_Text;

	 
	public WebElement getSE_PJP_Master_Menu_Button() {
		return SE_PJP_Master_Menu_Button;
	}
	 
	public WebElement getSet_PJP_Header_Text() {
		return Set_PJP_Header_Text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
