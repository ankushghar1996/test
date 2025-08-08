package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AR_Activity_Reports_Main {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using = "//ul[@class=\"nav nav-treeview\"]//ul//li//p[text()='Activity Report']")
	private WebElement Activity_Report_Menu;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Activity_Details_Report_Header_Text;	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_Button;
	
	
	@FindBy(how=How.XPATH,using = "(//table[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00']//tbody//tr//td[text()='Karnataka'])[1]")
	private WebElement TSM_Territory_Name_Grid_DATA;	
	
	
	//input[@id='ParentMasterContentPlaceHolder1_btnDownload']
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement Download_Button;

	public WebElement getActivity_Report_Menu() {
		return Activity_Report_Menu;
	}
	 
	public WebElement getActivity_Details_Report_Header_Text() {
		return Activity_Details_Report_Header_Text;
	}
	 
	public WebElement getView_Button() {
		return View_Button;
	}
	 
	public WebElement getTSM_Territory_Name_Grid_DATA() {
		return TSM_Territory_Name_Grid_DATA;
	}
	 
	public WebElement getDownload_Button() {
		return Download_Button;
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
