package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_PJPMaster {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using = "//*[text()='PJP Master']")
	  private WebElement PJP_Master_Menu;
	
	 
	  @FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_lblError']")
	  private WebElement PJP_Master_Header_Text;
	  
	 
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Input']")
	  private WebElement Select_Division_Dropdown;
	  
	  
	  @FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_DropDown']//ul//li[text()='CR']")
	  private WebElement Select_Division_Dropdown_Value;
	  
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_Input']")
	  private WebElement Chanel_Type_Dropdown;
	  
	  
	//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_DropDown']//ul//li[text()='Distributor']
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_DropDown']//ul//li[text()='SFA']")
	  private WebElement Chanel_Type_Dropdown_Value;
	  
	 
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorName_Input']")
	  private WebElement Distributor_Name_Dropdown;
	  
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorName_DropDown']//ul//li[text()='New Annapurna  Associate [SFA-001]']")
	  private WebElement Distributor_Name_Dropdown_Value;
	 
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanName_Input']")
	  private WebElement FSG_Name_Dropdown;
	  
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanName_DropDown']//ul//li")
	  private WebElement FSG_Name_Dropdown_Value;
	  
	 
	  //View,Save And Close Button are written in Common

	 
	  public WebElement getPJP_Master_Header_Text() {
	      return PJP_Master_Header_Text;
	  }
	 
	  public WebElement getSelect_Division_Dropdown() {
	      return Select_Division_Dropdown;
	  }
	 
	  public WebElement getChanel_Type_Dropdown() {
	      return Chanel_Type_Dropdown;
	  }
	 
	  public WebElement getDistributor_Name_Dropdown() {
	      return Distributor_Name_Dropdown;
	  }
	 
	  public WebElement getFSG_Name_Dropdown() {
	      return FSG_Name_Dropdown;
	  }
	 
	public WebElement getPJP_Master_Menu() {
		return PJP_Master_Menu;
	}
	 
	public WebElement getSelect_Division_Dropdown_Value() {
		return Select_Division_Dropdown_Value;
	}
	 
	public WebElement getChanel_Type_Dropdown_Value() {
		return Chanel_Type_Dropdown_Value;
	}
	 
	public WebElement getDistributor_Name_Dropdown_Value() {
		return Distributor_Name_Dropdown_Value;
	}
	 
	public WebElement getFSG_Name_Dropdown_Value() {
		return FSG_Name_Dropdown_Value;
	}
	 
	
	
	
	
	
	
	
}
