package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_ADDSFADistributor {

WebDriver driver;
	
	public WebElement getChannelTypeValue1_Dropdown() {
	return ChannelTypeValue1_Dropdown;
}

public WebElement getClusterValue_Dropdown() {
	return ClusterValue_Dropdown;
}

public WebElement getCategoryValue_Dropdown() {
	return CategoryValue_Dropdown;
}

public WebElement getStateValue_Dropdown() {
	return StateValue_Dropdown;
}

public WebElement getCityValue_Dropdown() {
	return CityValue_Dropdown;
}

public WebElement getGSTStateValue_Dropdown() {
	return GSTStateValue_Dropdown;
}

public WebElement getGodownStateValue_Dropdown() {
	return GodownStateValue_Dropdown;
}

public WebElement getGodownCityValue_Dropdown() {
	return GodownCityValue_Dropdown;
}

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='SFA/Distributor Master']")
	private WebElement SFADistributor_Master;
	
	

	@FindBy(how = How.XPATH, using = "//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']")
	private WebElement SFADistributor_ADD_Header;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_Input']")
	private WebElement ChannelType_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_DropDown']//ul//li[text()='SFA']")
	private WebElement ChannelTypeValue1_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_Input']")
	private WebElement Cluster_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//ul//li[text()='Karnataka and Goa']")
	private WebElement ClusterValue_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//ul//li[text()='UAT.ASM']")
	private WebElement ClusterValue1_dropdown;
	
	public WebElement getClusterValue1_dropdown() {
		return ClusterValue1_dropdown;
	}

	public WebElement getClusterValue2_Dropdown() {
		return ClusterValue2_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//ul//li[text()='Sambajinagar']")
	private WebElement ClusterValue2_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtDistributorName']")
	private WebElement Name_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorClass_Input']")
	private WebElement Class_Dropdown;
	
	public WebElement getClass_Dropdown() {
		return Class_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorClass_DropDown']//ul//li[text()='None']")
	private WebElement ClassValue_Dropdown;
	
	public WebElement getClassValue_Dropdown() {
		return ClassValue_Dropdown;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorCategory_Input']")
	private WebElement Category_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorCategory_DropDown']//ul//li[text()='None']")
	private WebElement CategoryValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtLocalName']")
	private WebElement LocalName_TextBox;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactPersonName']")
	private WebElement ContactPersonName_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber']")
	private WebElement ContactNumber_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmail']")
	private WebElement Email_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	public WebElement getAdd_btn() {
		return Add_btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress1']")
	private WebElement Address1_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress2']")
	private WebElement Address2_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress3']")
	private WebElement txtAddress3_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement PinCode_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPhoneNo']")
	private WebElement PhoneNo_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_Input']")
	private WebElement State_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[text()='Maharashtra']")
	private WebElement StateValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_Input']")
	private WebElement City_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[text()='Nagpur']")
	private WebElement CityValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGSTNumber']")
	private WebElement GSTNumber_TextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGSTState_Input']")
	private WebElement GSTState_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGSTState_DropDown']//ul//li[text()='Maharashtra']")
	private WebElement GSTStateValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_Image1']")
	private WebElement Document_Image;
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-link btn-block text-left label_default collapsed']")
	private WebElement Godawn_Address1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtGD2ShippingAddressName']")
	private WebElement AddressName_TextBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtGD2ShippingAddressLine1']")
	private WebElement AddressLine1_TextBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtGD2ShippingAddressLine2']")
	private WebElement AddressLine2_TextBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtGD2ShippingAddressLine3']")
	private WebElement AddressLine3_TextBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD2State_Input']")
	private WebElement GodownState_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_DropDown']//ul//li[text()='Maharashtra']")
	private WebElement GodownStateValue_Dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD2City_Input']")
	private WebElement GodownCity_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_DropDown']//ul//li[text()='Nagpur']")
	private WebElement GodownCityValue_Dropdown;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_txtGD2PinCode']")
	private WebElement GodownPinCode_TextBox;
	
	
	
	
	public WebElement getSFADistributor_Master() {
		return SFADistributor_Master;
	}

	public WebElement getSFADistributor_ADD_Header() {
		return SFADistributor_ADD_Header;
	}

	public WebElement getChannelType_Dropdown() {
		return ChannelType_Dropdown;
	}

	public WebElement getCluster_Dropdown() {
		return Cluster_Dropdown;
	}

	public WebElement getName_TextBox() {
		return Name_TextBox;
	}

	public WebElement getCategory_Dropdown() {
		return Category_Dropdown;
	}

	public WebElement getLocalName_TextBox() {
		return LocalName_TextBox;
	}

	public WebElement getContactPersonName_TextBox() {
		return ContactPersonName_TextBox;
	}

	public WebElement getContactNumber_TextBox() {
		return ContactNumber_TextBox;
	}

	public WebElement getEmail_TextBox() {
		return Email_TextBox;
	}

	public WebElement getAddress1_TextBox() {
		return Address1_TextBox;
	}

	public WebElement getAddress2_TextBox() {
		return Address2_TextBox;
	}

	public WebElement getTxtAddress3_TextBox() {
		return txtAddress3_TextBox;
	}

	public WebElement getPinCode_TextBox() {
		return PinCode_TextBox;
	}

	public WebElement getPhoneNo_TextBox() {
		return PhoneNo_TextBox;
	}

	public WebElement getState_Dropdown() {
		return State_Dropdown;
	}

	public WebElement getCity_Dropdown() {
		return City_Dropdown;
	}

	public WebElement getGSTNumber_TextBox() {
		return GSTNumber_TextBox;
	}

	public WebElement getGSTState_Dropdown() {
		return GSTState_Dropdown;
	}

	public WebElement getDocument_Image() {
		return Document_Image;
	}

	public WebElement getGodawn_Address1() {
		return Godawn_Address1;
	}

	public WebElement getAddressName_TextBox() {
		return AddressName_TextBox;
	}

	public WebElement getAddressLine1_TextBox() {
		return AddressLine1_TextBox;
	}

	public WebElement getAddressLine2_TextBox() {
		return AddressLine2_TextBox;
	}

	public WebElement getAddressLine3_TextBox() {
		return AddressLine3_TextBox;
	}

	public WebElement getGodownState_Dropdown() {
		return GodownState_Dropdown;
	}

	public WebElement getGodownCity_Dropdown() {
		return GodownCity_Dropdown;
	}

	public WebElement getGodownPinCode_TextBox() {
		return GodownPinCode_TextBox;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
