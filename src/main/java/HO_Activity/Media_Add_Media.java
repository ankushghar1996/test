package HO_Activity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Media_Add_Media {

	
	WebElement Driver;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_pageHeader'][text()='Media Upload']")
	private WebElement Media_Upload_Header_Text;	
	
	
	//Video
	
	@FindBy(how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_Input']")
	private WebElement Type_Dropdown_Select_Video;
	
	
	public WebElement getType_Dropdown_SelectValue_Video() {
		return Type_Dropdown_SelectValue_Video;
	}
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='Video']")
	private WebElement Type_Dropdown_SelectValue_Video;
	
	
	@FindBy(how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaCategory_Input']")
	private WebElement Category1_Dropdown_Select_Application_Video;
	
	
	public WebElement getCategory1_Dropdown_SelectValue_Application_Video() {
		return Category1_Dropdown_SelectValue_Application_Video;
	}

	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaCategory_DropDown']//ul//li[text()='Application Video']")
	private WebElement Category1_Dropdown_SelectValue_Application_Video;
	 
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")
	private WebElement Title_Textbox1;	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_txtLink']")
	private WebElement Link_Embedded_Textbox;	
	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='Document']")
	private WebElement Type_Dropdown_SelectValue1_Document;
	
	public WebElement getType_Dropdown_SelectValue1_Document() {
		return Type_Dropdown_SelectValue1_Document;
	}

	public WebElement getType_Dropdown_SelectValue2_Banner() {
		return Type_Dropdown_SelectValue2_Banner;
	}

	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='Banner']")
	private WebElement Type_Dropdown_SelectValue2_Banner;
	
	
	
	//Document
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='Document']")
	private WebElement Type_Dropdown_Select_Document;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaCategory_DropDown']//ul//li[text()='New Product']")
	private WebElement Category_Dropdown_Select_New_Product;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")
	private WebElement Title_Textbox2 ;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_fUpload']")
	private WebElement  Choose_File_Upload_Button ;
	
	//Banner	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaType_DropDown']//ul//li[text()='Banner']")
	private WebElement  Type_Dropdown_Select_Banner ;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMediaCategory_DropDown']//ul//li[text()='Retailer']")
	private WebElement Category_Dropdown_Select_Retailer;	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")
	private WebElement Title_Textbox ;	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_Image1']")
	private WebElement  Banner_Image1_Click ;
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_Image2']")
	private WebElement  Banner_Image2_Click ;	
	
	@FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_Image3']")
	private WebElement  Banner_Image3_Click ;
	 
	public WebElement getType_Dropdown_Select_Video() {
		return Type_Dropdown_Select_Video;
	}
	 
	public WebElement getCategory1_Dropdown_Select_Application_Video() {
		return Category1_Dropdown_Select_Application_Video;
	}
	 
	public WebElement getTitle_Textbox1() {
		return Title_Textbox1;
	}
	 
	public WebElement getLink_Embedded_Textbox() {
		return Link_Embedded_Textbox;
	}
	 
	public WebElement getType_Dropdown_Select_Document() {
		return Type_Dropdown_Select_Document;
	}
	 
	public WebElement getCategory_Dropdown_Select_New_Product() {
		return Category_Dropdown_Select_New_Product;
	}
	 
	public WebElement getTitle_Textbox2() {
		return Title_Textbox2;
	}
	 
	public WebElement getChoose_File_Button() {
		return Choose_File_Upload_Button;
	}
	 
	public WebElement getType_Dropdown_Select_Banner() {
		return Type_Dropdown_Select_Banner;
	}
	 
	public WebElement getCategory_Dropdown_Select_Retailer() {
		return Category_Dropdown_Select_Retailer;
	}
	 
	public WebElement getTitle_Textbox() {
		return Title_Textbox;
	}
	 
	public WebElement getBanner_Image1_Click() {
		return Banner_Image1_Click;
	}
	 
	public WebElement getBanner_Image2_Click() {
		return Banner_Image2_Click;
	}
	 
	public WebElement getBanner_Image3_Click() {
		return Banner_Image3_Click;
		
		
		
	}
	//Save & Close Button Written in Common
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
