package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ODR_Order_Summary_Report_Main {

	
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//a[@href='../Reports/Rpt_OrderSummaryReport.aspx']")
	private WebElement Order_Summary_Report_Menu;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType1Master_Input']")
	private WebElement Select_TypeMaster_Dropdown;	
	
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType1Master_DropDown']//ul//li[text()='Distributor']")
	private WebElement Select_TypeMaster_Dropdown_Value;	
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement View_Button;	
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
	private WebElement Download_Button;
	
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Grid_Value;
 
	
	public WebElement getOrder_Summary_Report_Menu() {
		return Order_Summary_Report_Menu;
	}
 
	public WebElement getSelect_TypeMaster_Dropdown() {
		return Select_TypeMaster_Dropdown;
	}
 
	public WebElement getSelect_TypeMaster_Dropdown_Value() {
		return Select_TypeMaster_Dropdown_Value;
	}
 
	public WebElement getView_Button() {
		return View_Button;
	}
 
	public WebElement getDownload_Button() {
		return Download_Button;
	}
 
	public WebElement getGrid_Value() {
		return Grid_Value;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
