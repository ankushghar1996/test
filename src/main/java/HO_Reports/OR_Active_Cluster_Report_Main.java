package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Active_Cluster_Report_Main {

	
	
	  WebDriver driver;
		@FindBy(how=How.XPATH, using="//a[@href='../Reports/Rpt_ActiveAreaReport.aspx']")
		private WebElement Active_Cluster_Report_Menu;
		
		
		@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_Input']")
		private WebElement Select_Cluster_Type_Name_Dropdown;
		
		
		@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//ul//li[text()='ZSM']")
		private WebElement Select_Cluster_Type_Name_Dropdown_Value;	
		
		
		@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
		private WebElement View_Button;	
		
		
		@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
		private WebElement Download_Button;
		
	 
		public WebElement getActive_Cluster_Report_Menu() {
			return Active_Cluster_Report_Menu;
		}
	 
		
	 
		public WebElement getView_Button() {
			return View_Button;
		}
	 
		public WebElement getDownload_Button() {
			return Download_Button;
		}
	 
	 
		public WebElement getSelect_Cluster_Type_Name_Dropdown() {
			return Select_Cluster_Type_Name_Dropdown;
		}
	 
	 
		public WebElement getSelect_Cluster_Type_Name_Dropdown_Value() {
			return Select_Cluster_Type_Name_Dropdown_Value;
		}


	
	
	
	
	
	
	
	
	
	
	
	
}
