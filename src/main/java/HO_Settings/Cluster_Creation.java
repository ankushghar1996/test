package HO_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cluster_Creation {

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[text()='Cluster Creation']")
	private WebElement Cluster_Creation;
	
	
	//*[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_Input']
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_Input']")
	private WebElement Select_Cluster_Dropdown;
	
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_DropDown']//ul//li[text()='NSM']
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_radAreaType_DropDown']//ul//li[text()='NSM']")
	private WebElement Select_Cluster_Dropdown_Value;
	
	
	//input[@id='ParentMasterContentPlaceHolder1_BtnSearch']
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnSearch']")
	private WebElement Search_Button;
	
	
	//Add Button
	@FindBy(how=How.XPATH,using="//button[@id='btnAddAreaModal']")
	private WebElement Cluster_Add_BTN;
	
	
	//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']")
	private WebElement Select_Cluster_Type_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")
	private WebElement Select_Cluster_Type_Dropdown_Value;
	
	
	//input[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")
	private WebElement Add_New_Area_Cancel_Button;
	
	
	public WebElement getCluster_Creation() {
		return Cluster_Creation;
	}
	public WebElement getSelect_Cluster_Dropdown() {
		return Select_Cluster_Dropdown;
	}
	public WebElement getSelect_Cluster_Dropdown_Value() {
		return Select_Cluster_Dropdown_Value;
	}
	public WebElement getSearch_Button() {
		return Search_Button;
	}
	public WebElement getCluster_Add_BTN() {
		return Cluster_Add_BTN;
	}
	public WebElement getSelect_Cluster_Type_Dropdown() {
		return Select_Cluster_Type_Dropdown;
	}
	public WebElement getSelect_Cluster_Type_Dropdown_Value() {
		return Select_Cluster_Type_Dropdown_Value;
	}
	public WebElement getAdd_New_Area_Cancel_Button() {
		return Add_New_Area_Cancel_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
