package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Active_User_Main {

	
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//p[text()='Active User']")
	private WebElement Active_User_Report_Menu;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement Select_User_Type_Dropdown;	
	
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='ZSM']")
	private WebElement Select_User_Type_Dropdown_Value;	
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_Button;	
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
	private WebElement Download_Button;
 
	
	public WebElement getSelect_User_Type_Dropdown() {
		return Select_User_Type_Dropdown;
	}
 
	public WebElement getSelect_User_Type_Dropdown_Value() {
		return Select_User_Type_Dropdown_Value;
	}
 
	public WebElement getView_Button() {
		return View_Button;
	}
 
	public WebElement getDownload_Button() {
		return Download_Button;
	}
 
	public WebElement getActive_User_Report_Menu() {
		return Active_User_Report_Menu;
	}
 
	

	
	
	
	
	
	
	
	
	
	
	
	
}
