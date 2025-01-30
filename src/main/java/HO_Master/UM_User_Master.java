package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UM_User_Master {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="(//*[text()='User Master'])[2]")
	private WebElement User_Master_Menu;
	
	
	@FindBy(how=How.XPATH,using="(//*[text()='User Master'])[3]")
	private WebElement User_Master_Header_Text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement User_Type_Dropdown;
	
	
	//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='HO']
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='HO']")
	private WebElement User_Type_Dropdown_Value;

	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Input']")
	private WebElement Division_Retailer_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_DropDown']//ul//li[text()='CR']")
	private WebElement Division_Retailer_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_btnSearch']")
	private WebElement Search_Button;
	
	
	public WebElement getUser_Master_Header_Text() {
		return User_Master_Header_Text;
	}
 
	public WebElement getUser_Type_Dropdown() {
		return User_Type_Dropdown;
	}
	
	public WebElement getSearch_Button() {
		return Search_Button;
	}
 
	public WebElement getUser_Master_Menu() {
		return User_Master_Menu;
	}
 
	public WebElement getDivision_Retailer_Dropdown() {
		return Division_Retailer_Dropdown;
	}
 
	public WebElement getUser_Type_Dropdown_Value() {
		return User_Type_Dropdown_Value;
	}
 
	public WebElement getDivision_Retailer_Dropdown_Value() {
		return Division_Retailer_Dropdown_Value;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
