package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UM_User_Master_Add_Page {

	WebDriver driver;
	
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Add New User']")
	private WebElement Add_New_User_Header_Text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType']")
	private WebElement User_Type_Dropdown;
	
	
	//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='HO']
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='HO']")
	private WebElement User_Type_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Input']")
	private WebElement Division_Dropdown;
	
	
	@FindBy (how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_Input']")
	private WebElement Cluster_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_txtUserId']")
	private WebElement User_ID_Textbox;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_txtName']")
	private WebElement Name_Textbox;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_txtEmail']")
	private WebElement Email_Textbox;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_txtMobileNo']")
	private WebElement Mobile_Textbox; 
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_dtpActiveFrom_popupButton']")
	private WebElement Active_From;
 
	
 
	public WebElement getAdd_New_User_Header_Text() {
		return Add_New_User_Header_Text;
	}
 
	public WebElement getUser_Type_Dropdown() {
		return User_Type_Dropdown;
	}
 
	public WebElement getDivision_Dropdown() {
		return Division_Dropdown;
	}
 
	public WebElement getCluster_Dropdown() {
		return Cluster_Dropdown;
	}
 
	public WebElement getUser_ID_Textbox() {
		return User_ID_Textbox;
	}
 
	public WebElement getName_Textbox() {
		return Name_Textbox;
	}
 
	public WebElement getEmail_Textbox() {
		return Email_Textbox;
	}
 
	public WebElement getMobile_Textbox() {
		return Mobile_Textbox;
	}
 
	public WebElement getActive_From() {
		return Active_From;
	}
 
	public WebElement getUser_Type_Dropdown_Value() {
		return User_Type_Dropdown_Value;
	}
	//Save & Close button Xpath written in Common Data
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
