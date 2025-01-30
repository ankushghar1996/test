package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PM_Strategic_Product_Setting {

	
	WebDriver driver;
	
	
	
	@FindBy(how=How.XPATH,using="//p[text()='Strategic Product Setting']")
	private WebElement Strategic_Product_Setting_Menu_Button;
	
	
	@FindBy(how=How.XPATH,using="//h4[text()='Strategic Product Setting']")
	private WebElement Strategic_Product_Setting_Header_Text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_upPanelGridRouteMaster']")
	private WebElement Strategic_Product_Setting_Grid_Data;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='btnAdd']")
	private WebElement Strategic_Product_Setting_Add_Button;
	
	
	@FindBy(how=How.XPATH,using="//h5[text()='Add Special Product']")
	private WebElement Strategic_Product_Setting_Add_Button_HeaderTXT;
 
	
	@FindBy(how=How.XPATH,using="(//i[@id='disableIcon'])[1]")
	private WebElement Strategic_Product_Setting_Action_Icon;
	
	public WebElement getStrategic_Product_Setting_Action_Icon() {
		return Strategic_Product_Setting_Action_Icon;
	}

	public WebElement getStrategic_Product_Setting_Yes_Button() {
		return Strategic_Product_Setting_Yes_Button;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Strategic_Product_Setting_Yes_Button;
	
	public WebElement getStrategic_Product_Setting_No_Button() {
		return Strategic_Product_Setting_No_Button;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement Strategic_Product_Setting_No_Button;
	
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Deactivate Special Product']")
	private WebElement Strategic_Product_Setting_Deactivate_Special_HeaderTXT;
	
	
	public WebElement getStrategic_Product_Setting_Deactivate_Special_HeaderTXT() {
		return Strategic_Product_Setting_Deactivate_Special_HeaderTXT;
	}

	public WebElement getStrategic_Product_Setting_Menu_Button() {
		return Strategic_Product_Setting_Menu_Button;
	}
 
	public WebElement getStrategic_Product_Setting_Header_Text() {
		return Strategic_Product_Setting_Header_Text;
	}
 
	public WebElement getStrategic_Product_Setting_Grid_Data() {
		return Strategic_Product_Setting_Grid_Data;
	}
 
	public WebElement getStrategic_Product_Setting_Add_Button() {
		return Strategic_Product_Setting_Add_Button;
	}
 
	public WebElement getStrategic_Product_Setting_Add_Button_HeaderTXT() {
		return Strategic_Product_Setting_Add_Button_HeaderTXT;
	}
	//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory_Input']


	
	
	
	
	
}
