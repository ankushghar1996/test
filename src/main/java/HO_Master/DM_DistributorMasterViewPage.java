package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_DistributorMasterViewPage {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='SFA/Distributor Master']")
	private WebElement SFADistributor_Master;
	
	

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement SFADistributor_Master_Header;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")
	private WebElement ChannelType_Dropdown;

	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_SFAGridView_GridData']/table/tbody/tr)[1]")
	private WebElement SFADistributor_Master_GridData;
	
	
	
	public WebElement getSFADistributor_Master() {
		return SFADistributor_Master;
	}

	public WebElement getSFADistributor_Master_Header() {
		return SFADistributor_Master_Header;
	}

	public WebElement getChannelType_Dropdown() {
		return ChannelType_Dropdown;
	}

	public WebElement getSFADistributor_Master_GridData() {
		return SFADistributor_Master_GridData;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='Distributor']")
	private WebElement ChannelTypeValue1_Dropdown;
	
	
	public WebElement getChannelTypeValue1_Dropdown() {
		return ChannelTypeValue1_Dropdown;
	}

	public WebElement getSearch_btn() {
		return Search_btn;
	}

	public void setChannelTypeValue1_Dropdown(WebElement channelTypeValue1_Dropdown) {
		ChannelTypeValue1_Dropdown = channelTypeValue1_Dropdown;
	}



	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Button3']")
	private WebElement Search_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;

	public WebElement getClose_btn() {
		return Close_btn;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Button2']")
	private WebElement View_btn;



	public WebElement getView_btn() {
		return View_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
