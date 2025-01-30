package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_Set_PJP_Button {

	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using = "//*[@id='btnadd']")
    private WebElement SET_PJP_Button;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_pageHeader']")
    private WebElement SET_SE_PJP_Header_Text;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_Input']")
    private WebElement Select_months_Dropdown;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Arrow']")
    private WebElement Select_Division_Dropdown;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSe_Input']")
    private WebElement Select_SE_Dropdown;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddldb_Input']")
    private WebElement Select_Distributor_Dropdown;
 
    @FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_openCalendarButton']")
    private WebElement Select_Distributor_Calendar_Button;
 
    @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRouteORName1_Arrow']")
    private WebElement Select_Dropdown;
 
    @FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_Image2']")
    private WebElement Select_Calendar_Button;
  //Apply,Save and Close Button Are Written in Common
    public WebElement getSET_PJP_Button() {
        return SET_PJP_Button;
    }
 
    public WebElement getSET_SE_PJP_Header_Text() {
        return SET_SE_PJP_Header_Text;
    }
 
    public WebElement getSelect_months_Dropdown() {
        return Select_months_Dropdown;
    }
 
    public WebElement getSelect_Division_Dropdown() {
        return Select_Division_Dropdown;
    }
 
    public WebElement getSelect_SE_Dropdown() {
        return Select_SE_Dropdown;
    }
 
    public WebElement getSelect_Distributor_Dropdown() {
        return Select_Distributor_Dropdown;
    }
 
    public WebElement getSelect_Distributor_Calendar_Button() {
        return Select_Distributor_Calendar_Button;
    }
 
    public WebElement getSelect_Dropdown() {
        return Select_Dropdown;
    }
 
    public WebElement getSelect_Calendar_Button() {
        return Select_Calendar_Button;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
