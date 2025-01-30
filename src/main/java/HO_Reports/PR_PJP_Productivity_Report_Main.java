package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PR_PJP_Productivity_Report_Main {

	
	
	WebDriver driver;
	
	
		@FindBy(how=How.XPATH,using = "//a[@href='../Reports/Rpt_PJPProductiviityReport.aspx']")
		private WebElement PJP_Productivity_Report_Menu;	

		
		@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
		private WebElement View_Button;	
		
		
		@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
		private WebElement Download_Button;
		
		
	 
		public WebElement getView_Button() {
			return View_Button;
		}
	 
		public WebElement getDownload_Button() {
			return Download_Button;
		}
	 
		public WebElement getPJP_Productivity_Report_Menu() {
			return PJP_Productivity_Report_Menu;
		}
	
	
	
	
	
	
	
	
	
}
