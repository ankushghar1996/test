package Distributor_Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Creation {

	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='PurchaseOrder']")
	private WebElement Purchase_Order ;
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='PO Generation']")
	private WebElement PO_Generation ;
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='PO Creation']")
	private WebElement PO_Creation ;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_Input']")
	private WebElement Distributor_Dropdown;
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li)[1]")
	private WebElement Distributor_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlPricingType_Input']")
	private WebElement Pricing_Type_Dropdown;
	
	@FindBy(how=How.XPATH,using="(//ul[@class='rcbList']//li)[2]")
	private WebElement Pricing_Type_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProduct_Input']")
	private WebElement Select_Product_Dropdown;
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProduct_DropDown']//ul//li)[1]")
	private WebElement Select_Product_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using="//div[@class='row mb-2']//input[@type='button']")
	private WebElement Add_Button;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnCalculate']")
	private WebElement Calculate_Button;
	
	@FindBy(how=How.XPATH,using="//div[@id='ParentMasterContentPlaceHolder1_up2']")
	private WebElement Save_Button;

	public WebElement getPurchase_Order() {
		return Purchase_Order;
	}

	public WebElement getPO_Generation() {
		return PO_Generation;
	}

	public WebElement getPO_Creation() {
		return PO_Creation;
	}

	public WebElement getDistributor_Dropdown() {
		return Distributor_Dropdown;
	}

	public WebElement getDistributor_Dropdown_Value() {
		return Distributor_Dropdown_Value;
	}

	public WebElement getPricing_Type_Dropdown() {
		return Pricing_Type_Dropdown;
	}

	public WebElement getPricing_Type_Dropdown_Value() {
		return Pricing_Type_Dropdown_Value;
	}

	public WebElement getSelect_Product_Dropdown() {
		return Select_Product_Dropdown;
	}

	public WebElement getSelect_Product_Dropdown_Value() {
		return Select_Product_Dropdown_Value;
	}

	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getCalculate_Button() {
		return Calculate_Button;
	}

	public WebElement getSave_Button() {
		return Save_Button;
	}
	
	
	
	
	
	
}
