package HO_Scheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Scheme_Master_Add_Page {

	
WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Scheme Master']")
	private WebElement Scheme_Master_Menu;
	
	
	public WebElement getScheme_Master_Menu() {
		return Scheme_Master_Menu;
	}


	public WebElement getAdd_btn() {
		return Add_btn;
	}


	public WebElement getProductHierarchy_dropdown() {
		return ProductHierarchy_dropdown;
	}


	public WebElement getProductHierarchySelect_dropdown() {
		return ProductHierarchySelect_dropdown;
	}


	public WebElement getProduct_List_dropdown() {
		return Product_List_dropdown;
	}


	public WebElement getProduct_ListSelect_dropdown() {
		return Product_ListSelect_dropdown;
	}


	public WebElement getSchemeName_Textbox() {
		return SchemeName_Textbox;
	}


	public WebElement getSchemeCatagory_dropdown() {
		return SchemeCatagory_dropdown;
	}


	public WebElement getSchemeCatagorySelect_dropdown() {
		return SchemeCatagorySelect_dropdown;
	}


	public WebElement getSchemeDiscription_Txtbox() {
		return SchemeDiscription_Txtbox;
	}


	public WebElement getDistributorSelection_btn() {
		return DistributorSelection_btn;
	}


	public WebElement getDistributorState_SelectCheckBox() {
		return DistributorState_SelectCheckBox;
	}


	public WebElement getDistributorTown_SelectCheckBox() {
		return DistributorTown_SelectCheckBox;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	public WebElement getOutletType_btn() {
		return OutletType_btn;
	}


	public WebElement getOutletType_SelectChecBox() {
		return OutletType_SelectChecBox;
	}


	public WebElement getCloseScheme_btn() {
		return CloseScheme_btn;
	}


	public WebElement getSlabBasis_dropdown() {
		return SlabBasis_dropdown;
	}


	public WebElement getSlabBasisSelect_dropdown() {
		return SlabBasisSelect_dropdown;
	}


	public WebElement getTxtOn1_ChechBox() {
		return txtOn1_ChechBox;
	}


	public WebElement getTxtPoint1_ChechBox() {
		return txtPoint1_ChechBox;
	}


	public WebElement getSave_btn() {
		return Save_btn;
	}


	public WebElement getCloseScheme1_btn() {
		return CloseScheme1_btn;
	}


	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_Input']")
	private WebElement ProductHierarchy_dropdown;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_DropDown']//ul//li[text()='All']")
	private WebElement ProductHierarchySelect_dropdown;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSKU_Input']")
	private WebElement Product_List_dropdown;
	
	
	@FindBy(how=How.XPATH, using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSKU_DropDown']//ul//li)[1]")
	private WebElement Product_ListSelect_dropdown;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_txtSchemeName']")
	private WebElement SchemeName_Textbox;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeCatagory_Input']")
	private WebElement SchemeCatagory_dropdown;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeCatagory_DropDown']//ul//li[text()='Forsoc']")
	private WebElement SchemeCatagorySelect_dropdown;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ParentMasterContentPlaceHolder1_txtDescription']")
	private WebElement SchemeDiscription_Txtbox;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='btnAddSchemeModal']")
	private WebElement DistributorSelection_btn;
	
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxState']//ul//li//label//span[text()='Bihar']
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxState']//ul//li//label//input)[6]
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxState']//ul//li//label//input)[6]")
	private WebElement DistributorState_SelectCheckBox;
	
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxTown']//ul//li//label//input)[4]
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxTown']//ul//li//label//span[text()='Begusarai']
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ChkListBoxTown']//ul//li//label//input)[4]")
	private WebElement DistributorTown_SelectCheckBox;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnDistributorSelectionClose']")
	private WebElement Close_btn;
	
	
	@FindBy(how=How.XPATH,using="//button[@id='btnASchemeModal']")
	private WebElement OutletType_btn;
	
	
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_chkListOutletType']//ul//li//label//span[text()='Distributor']
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_chkListOutletType']//ul//li//label//input)[2]")
	private WebElement OutletType_SelectChecBox;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnCloseScheme']")
	private WebElement CloseScheme_btn;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlab']//span[@class='rcbInner']")
	private WebElement SlabBasis_dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlab_DropDown']//ul//li[text()='Value']")
	private WebElement SlabBasisSelect_dropdown;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtOn1']")
	private WebElement txtOn1_ChechBox;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtPoint1']")
	private WebElement txtPoint1_ChechBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnSaveScheme']")
	private WebElement Save_btn;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnSchemeClose']")
	private WebElement CloseScheme1_btn;
	
	
	
	@FindBy(how=How.XPATH, using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_DropDown']//ul//li[text()='Multiple SKU']")
	private WebElement ProductHierarchySelect1_dropdown;
	
	public WebElement getProductHierarchySelect1_dropdown() {
		return ProductHierarchySelect1_dropdown;
	}


	public WebElement getGo_btn() {
		return Go_btn;
	}


	public WebElement getProduct_dropdown() {
		return Product_dropdown;
	}


	public WebElement getProductSelect1_dropdown() {
		return ProductSelect1_dropdown;
	}


	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnGo']")
	private WebElement Go_btn;
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_Input']")
	private WebElement Product_dropdown;
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_DropDown']//ul//li//label[text()='AURACAST 405 (20kg)']")
	private WebElement ProductSelect1_dropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnOK']")
	private WebElement Ok_btn;


	public WebElement getOk_btn() {
		return Ok_btn;
	}
	
	
	
}
