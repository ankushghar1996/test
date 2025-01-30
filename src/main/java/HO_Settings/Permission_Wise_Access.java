package HO_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Permission_Wise_Access {

	
	WebDriver driver;
	
	
	@FindBy (how=How.XPATH,using = "//p[text()='Permission Wise Access']")
	private WebElement Permission_Wise_Access_Menu;
	
	
	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUsers_Input']")
	private WebElement Select_User_Dropdown;
	
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUsers_DropDown']//ul//li[text()='Amit Thakare [Amit@1411]']
	@FindBy (how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUsers_DropDown']//ul//li[text()='Amit Thakare [Amit@1411]']")
	private WebElement Select_User_Dropdown_Value;
	
 
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnSearch']")
	private WebElement Search_Button;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	
 
	public WebElement getPermission_Wise_Access_Menu() {
		return Permission_Wise_Access_Menu;
	}
 
	public WebElement getSelect_User_Dropdown() {
		return Select_User_Dropdown;
	}
 
	public WebElement getSelect_User_Dropdown_Value() {
		return Select_User_Dropdown_Value;
	}
 
	public WebElement getSearch_Button() {
		return Search_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
