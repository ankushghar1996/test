package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PR_Target_Achievement_Report_Main {

	
	
	WebDriver driver;	

	@FindBy(how=How.XPATH,using = "//a[@href='../Reports/Rpt_OutletWiseTargetAchivementReports.aspx']")
	private WebElement Target_Achievement_Report_Menu;	
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlReportLevel_Input']")
	private WebElement Report_level_Dropdown;	
	 
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlReportLevel_DropDown']//ul//li[text()='ZSM']")
	private WebElement Report_level_Dropdown_Value;		
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlperiod_Input']")
	private WebElement Period_Dropdown;	
	
	 
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlperiod_DropDown']//ul//li[text()='MTD']")
	private WebElement Period_Dropdown_Value;		
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_Input']")
	private WebElement Select_Month_Dropdown;	
	 
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_DropDown']//ul//li[text()='November']")
	private WebElement Select_Month_Dropdown_Value;	
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement View_Button;		
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_Button2']")
	private WebElement Download_Button;
	 
	
	public WebElement getTarget_Achievement_Report_Menu() {
		return Target_Achievement_Report_Menu;
	}
	 
	public WebElement getReport_level_Dropdown() {
		return Report_level_Dropdown;
	}
	 
	public WebElement getReport_level_Dropdown_Value() {
		return Report_level_Dropdown_Value;
	}
	 
	public WebElement getPeriod_Dropdown() {
		return Period_Dropdown;
	}
	 
	public WebElement getPeriod_Dropdown_Value() {
		return Period_Dropdown_Value;
	}
	 
	public WebElement getSelect_Month_Dropdown() {
		return Select_Month_Dropdown;
	}
	 
	public WebElement getSelect_Month_Dropdown_Value() {
		return Select_Month_Dropdown_Value;
	}
	 
	public WebElement getView_Button() {
		return View_Button;
	}
	 
	public WebElement getDownload_Button() {
		return Download_Button;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
