package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FSG_FSGMasterViewPage {
	
	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//a[@href='../Master/Mst_SalesmanMaster.aspx']//p[contains(text(),'FSG Master')]")
	private WebElement FSG_Master;
	
	public WebElement getFSG_Master() {
		return FSG_Master;
	}


	public WebElement getView_FSG_Header() {
		return View_FSG_Header;
	}


	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData']/table/tbody/tr[1]/td[2]")
	private WebElement FSG_GridaDataTable;
	
	// View & Close btn Xpath written in Common Data

	public WebElement getFSG_GridaDataTable() {
		return FSG_GridaDataTable;
	}


	@FindBy(how = How.XPATH, using = "//span[@id='ParentMasterContentPlaceHolder1_lblHeader']")
	private WebElement View_FSG_Header;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;


	public WebElement getView_btn() {
		return View_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
