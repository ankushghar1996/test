package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RR_Redemption_Summary_Report_Main {

	
	WebDriver driver;	

	@FindBy(how=How.XPATH,using = "//p[text()='Redemption Summary Report']")
	private WebElement Redemption_Summary_Report_Menu;	
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear_Input']")
	private WebElement Select_Year_Dropdown;	
	
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear_DropDown']//ul//li[text()='2024']")
	private WebElement Select_Year_Dropdown_Value;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement View_Button;		
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
	private WebElement Download_Button;
	
	
 
	public WebElement getRedemption_Summary_Report_Menu() {
		return Redemption_Summary_Report_Menu;
	}
 
	public WebElement getSelect_Year_Dropdown() {
		return Select_Year_Dropdown;
	}
 
	public WebElement getSelect_Year_Dropdown_Value() {
		return Select_Year_Dropdown_Value;
	}
 
	public WebElement getView_Button() {
		return View_Button;
	}
 
	public WebElement getDownload_Button() {
		return Download_Button;
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
