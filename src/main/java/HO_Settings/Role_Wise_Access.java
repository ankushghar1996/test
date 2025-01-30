package HO_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Role_Wise_Access {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Role Wise Access']")
	private WebElement Role_Wise_Access_Menu;
	
	
//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlroletype_Input']
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlroletype_Input']")
	private WebElement Type_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlroletype_DropDown']//li[text()='HO']")
	private WebElement Type_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_btnView']")
	private WebElement View_Button;


	public WebElement getRole_Wise_Access_Menu() {
		return Role_Wise_Access_Menu;
	}

	public WebElement getType_Dropdown() {
		return Type_Dropdown;
	}

	public WebElement getType_Dropdown_Value() {
		return Type_Dropdown_Value;
	}

	public WebElement getView_Button() {
		return View_Button;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
