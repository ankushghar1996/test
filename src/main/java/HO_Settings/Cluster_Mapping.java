package HO_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cluster_Mapping {

	
	WebDriver driver;
	
	
	
	@FindBy(how=How.XPATH,using="//p[text()='Cluster Mapping']")
	private WebElement Cluster_Mapping_Menu;
	
	
	//*[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_Input']
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType']")
	private WebElement Select_Cluster_Type_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_DropDown']//ul//li[text()='ZSM']")
	private WebElement Select_Cluster_Type_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnSearch']")
	private WebElement Search_Button;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAddAreaMappingModal']")
	private WebElement ADD_BTN;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Arrow']")
	private WebElement Select_Cluster_Type_Add_BTN_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")
	private WebElement Select_Cluster_Type_Dropdown_Add_BTN_Value;
	
	
	@FindBy(how=How.XPATH,using="//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_Arrow']")
	private WebElement Select_Cluster_Name_Add_BTN_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_DropDown']//ul//li[text()='Karnataka  and Kerala']")
	private WebElement Select_Cluster_Name_Add_BTN_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_Input']")
	private WebElement Select_Parent_Cluster_Add_BTN_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_DropDown']//ul//li[text()='UAT.RSM']")
	private WebElement Select_Parent_Cluster_Add_BTN_Value;
	
	
	@FindBy(how=How.XPATH,using="//*[@ID='ParentMasterContentPlaceHolder1_btnCloseAreaMapping']")
	private WebElement Cancel_button;
	
 
	public WebElement getCluster_Mapping_Menu() {
		return Cluster_Mapping_Menu;
	}
 
 
	public WebElement getSelect_Cluster_Type_Dropdown() {
		return Select_Cluster_Type_Dropdown;
	}
 
 
	public WebElement getSelect_Cluster_Type_Dropdown_Value() {
		return Select_Cluster_Type_Dropdown_Value;
	}
 
 
	public WebElement getSearch_Button() {
		return Search_Button;
	}
 
 
	public WebElement getADD_BTN() {
		return ADD_BTN;
	}
 
 
	public WebElement getSelect_Cluster_Type_Add_BTN_Dropdown() {
		return Select_Cluster_Type_Add_BTN_Dropdown;
	}
 
 
	public WebElement getSelect_Cluster_Type_Dropdown_Add_BTN_Value() {
		return Select_Cluster_Type_Dropdown_Add_BTN_Value;
	}
 
 
	public WebElement getSelect_Cluster_Name_Add_BTN_Dropdown() {
		return Select_Cluster_Name_Add_BTN_Dropdown;
	}
 
 
	public WebElement getSelect_Cluster_Name_Add_BTN_Dropdown_Value() {
		return Select_Cluster_Name_Add_BTN_Dropdown_Value;
	}
 
 
	public WebElement getSelect_Parent_Cluster_Add_BTN_Dropdown() {
		return Select_Parent_Cluster_Add_BTN_Dropdown;
	}
 
 
	public WebElement getSelect_Parent_Cluster_Add_BTN_Value() {
		return Select_Parent_Cluster_Add_BTN_Value;
	}
 
 
	public WebElement getCancel_button() {
		return Cancel_button;
	}

	
	
	
	
	
	
	
	
	
	
}
