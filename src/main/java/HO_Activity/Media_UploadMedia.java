package HO_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Media_UploadMedia {

	
WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='nav-link'])[7]")
	private WebElement UploadMedia_Menu;
	
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space()='Media Upload'])[5]")
	private WebElement MediaUpload_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_Input']")
	private WebElement MediaType_Dropdown;
	
	public WebElement getMediaTypeValue_Dropdown() {
		return MediaTypeValue_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='All']")
	private WebElement MediaTypeValue_Dropdown;
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_btnView']")
	private WebElement View_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnadd']")
	private WebElement Add_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_Input']")
	private WebElement Type_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaCategory_Input']")
	private WebElement Category_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtTitle']")
	private WebElement Title_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_Btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Btn;
	
	@FindBy(how = How.XPATH, using = "//a[@id='ctl00_ParentMasterContentPlaceHolder1_radGridMediaUpload_ctl00_ctl04_lnkViewMedia']//i[@class='fa fa-eye ml-2']")
	private WebElement ActionView_Icon;
	
	public WebElement getActionView_Icon() {
		return ActionView_Icon;
	}

	public WebElement getActionDeactivate_Icon() {
		return ActionDeactivate_Icon;
	}

	public WebElement getNo_btn() {
		return No_btn;
	}

	public WebElement getYes_btn() {
		return Yes_btn;
	}

	@FindBy(how = How.XPATH, using = "//tr[@id='ctl00_ParentMasterContentPlaceHolder1_radGridMediaUpload_ctl00__0']//i[@id='disableIcon']")
	private WebElement ActionDeactivate_Icon;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement No_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes_btn;
	
	
	public WebElement getUploadMedia_Menu() {
		return UploadMedia_Menu;
	}

	public WebElement getMediaUpload_Header() {
		return MediaUpload_Header;
	}

	public WebElement getMediaType_Dropdown() {
		return MediaType_Dropdown;
	}

	public WebElement getView_Btn() {
		return View_Btn;
	}

	public WebElement getAdd_Btn() {
		return Add_Btn;
	}

	public WebElement getType_Dropdown() {
		return Type_Dropdown;
	}

	public WebElement getCategory_Dropdown() {
		return Category_Dropdown;
	}

	public WebElement getTitle_TextBox() {
		return Title_TextBox;
	}

	public WebElement getSave_Btn() {
		return Save_Btn;
	}

	public WebElement getClose_Btn() {
		return Close_Btn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
