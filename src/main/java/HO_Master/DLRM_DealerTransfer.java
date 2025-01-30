package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_DealerTransfer {

	
	WebDriver driver;
	

	@FindBy (how=How.XPATH,using = "//p[normalize-space()='Outlet Transfer']")
	private WebElement Outlet_Transfer_Menu;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOutlet_Transfer_Menu() {
		return Outlet_Transfer_Menu;
	}


	public WebElement getOutlet_Transfer_Header() {
		return Outlet_Transfer_Header;
	}


	public WebElement getFrom_Distributor() {
		return From_Distributor;
	}


	public WebElement getSelect_From_Distributor() {
		return Select_From_Distributor;
	}


	public WebElement getTo_Distributor() {
		return To_Distributor;
	}


	public WebElement getSelect_To_Distributor() {
		return Select_To_Distributor;
	}


	public WebElement getFrom_Route() {
		return From_Route;
	}


	public WebElement getSelect_From_Route() {
		return Select_From_Route;
	}


	public WebElement getTo_Route() {
		return To_Route;
	}


	public WebElement getSelect_To_Route() {
		return Select_To_Route;
	}


	public WebElement getTransfer_btn() {
		return Transfer_btn;
	}


	public WebElement getSelect_FromFirstCheckBox() {
		return Select_FromFirstCheckBox;
	}


	public WebElement getSelect_FromAllFirstCheckBox() {
		return Select_FromAllFirstCheckBox;
	}


	public WebElement getForward_ArrBtn() {
		return Forward_ArrBtn;
	}


	public WebElement getSelect_ToFirstCheckBox() {
		return Select_ToFirstCheckBox;
	}


	public WebElement getSelect_ToAllFirstCheckBox() {
		return Select_ToAllFirstCheckBox;
	}


	public WebElement getBackward_ArrBtn() {
		return Backward_ArrBtn;
	}


	@FindBy (how=How.XPATH,using = "//h4[@id='ParentMasterContentPlaceHolder1_header']")
	private WebElement Outlet_Transfer_Header;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor_Input']")
	private WebElement From_Distributor;
	
	
	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor_DropDown']//ul//li[text()='Aishwarya Lakshmi Agencies [100079]']")
	private WebElement Select_From_Distributor;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToDistributor_Input']")
	private WebElement To_Distributor;
	
	
	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToDistributor_DropDown']//ul//li[text()='Akash Marketing [100070]']")
	private WebElement Select_To_Distributor;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_Input']")
	private WebElement From_Route;
	
	
	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_DropDown']//ul//li[text()='Kadugodi']")
	private WebElement Select_From_Route;

	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_Input']")
	private WebElement To_Route;
	

	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_DropDown']//ul//li[text()='Kaveri Nagar']")
	private WebElement Select_To_Route;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_btnTransfer']")
	private WebElement Transfer_btn;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl04_pTemplate0SelectCheckBox']")
	private WebElement Select_FromFirstCheckBox;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl02_ctl00_pTemplate0SelectCheckBox']")
	private WebElement Select_FromAllFirstCheckBox;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement Forward_ArrBtn;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_pTemplate1SelectCheckBox']")
	private WebElement Select_ToFirstCheckBox;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl00_pTemplate1SelectCheckBox']")
	private WebElement Select_ToAllFirstCheckBox;
	
	
	@FindBy (how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button2']")
	private WebElement Backward_ArrBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
