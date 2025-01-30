package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SR_Product_Sales_Report_Main {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using = "//p[text()='Product Sales Report']")
	private WebElement Product_Sales_Report_Menu;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement View_Button;		
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_Button2']")
	private WebElement Download_Button;
	
 
 
	public WebElement getProduct_Sales_Report_Menu() {
		return Product_Sales_Report_Menu;
	}
 
 
	public WebElement getView_Button() {
		return View_Button;
	}
 
 
	public WebElement getDownload_Button() {
		return Download_Button;
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
