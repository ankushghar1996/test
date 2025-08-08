package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_DistributorTransfer {

	
WebDriver driver;
	
	public WebElement getSFA1Value_Dropdown() {
	return SFA1Value_Dropdown;
}

public WebElement getRoute1Value_Dropdown() {
	return Route1Value_Dropdown;
}

public WebElement getSFA2Value_Dropdown() {
	return SFA2Value_Dropdown;
}

public WebElement getRoute2Value_Dropdown() {
	return Route2Value_Dropdown;
}

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Transfer']")
	private WebElement Distributor_Transfer;

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Distributor Transfer']")
	private WebElement Distributor_Transfer_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromSFA_Input']")
	private WebElement SFA1_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//li[text()='Consol Care India Private Limited [SFA-006]']")
	private WebElement SFA1Value_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_Input']")
	private WebElement Route1_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_DropDown']//ul//li")
	private WebElement Route1Value_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToSFA_Input']")
	private WebElement SFA2_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//li[text()='New Annapurna  Associate [SFA-001]'])[1]")
	private WebElement SFA2Value_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_Input']")
	private WebElement Route2_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_DropDown']//ul//li")
	private WebElement Route2Value_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnTransfer']")
	private WebElement Transfer_btn;
	
	// Transfer btn Xpath written in Common Data
	
	public WebElement getTransfer_btn() {
		return Transfer_btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl04_pTemplate0SelectCheckBox']")
	private WebElement SelectCheckBox1;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRightRatailer']")
	private WebElement Arrow1_Forward;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_pTemplate1SelectCheckBox']")
	private WebElement SelectCheckBox2;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnLeft']")
	private WebElement Arrow2_Backword;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl02_ctl00_pTemplate0SelectCheckBox']")
	private WebElement SelectAllCheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl00_pTemplate1SelectCheckBox']")
	private WebElement SelectAll2CheckBox;
	
	
	public WebElement getSelectAll2CheckBox() {
		return SelectAll2CheckBox;
	}

	public WebElement getSelectAllCheckBox() {
		return SelectAllCheckBox;
	}

	public WebElement getSave_btn() {
		return Save_btn;
	}

	public WebElement getCancel_btn() {
		return cancel_btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnsave']")
	private WebElement Save_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btncancel']")
	private WebElement cancel_btn;
	
	// Save & Close btn Xpath written in Common Data
	
	
	public WebElement getDistributor_Transfer() {
		return Distributor_Transfer;
	}

	public WebElement getDistributor_Transfer_Header() {
		return Distributor_Transfer_Header;
	}

	public WebElement getSFA1_Dropdown() {
		return SFA1_Dropdown;
	}

	public WebElement getRoute1_Dropdown() {
		return Route1_Dropdown;
	}

	public WebElement getSFA2_Dropdown() {
		return SFA2_Dropdown;
	}

	public WebElement getRoute2_Dropdown() {
		return Route2_Dropdown;
	}

	public WebElement getSelectCheckBox1() {
		return SelectCheckBox1;
	}

	public WebElement getArrow1_Forward() {
		return Arrow1_Forward;
	}

	public WebElement getSelectCheckBox2() {
		return SelectCheckBox2;
	}

	public WebElement getArrow2_Backword() {
		return Arrow2_Backword;
	}
	
	
	
	
}
