package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_Route_Master {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using= "(//*[normalize-space()='Route Master'])[3]")
	  private WebElement Route_Master_Menu_Btn;
	
	 
	  @FindBy(how=How.XPATH,using = "*(//*[normalize-space()='Route Master'])[7]")
	  private WebElement Route_Master_Header_Text;
	  
	  
	 
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelTypeList_Input']")
	  private WebElement Channel_Type_Dropdown;
	  
	 
	  @FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelTypeList_DropDown']//ul//li[text()='Distributor']")
	  private WebElement Channel_Type_Dropdown_Value;//Distributor
	  
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorList_Input']")
	  private WebElement Distributor_Dropdown;
	  
	  
	  @FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorList_DropDown']//ul//li[text()='Chiranth Agencies [10001]']")
	  private WebElement Distributor_Dropdown_Value;//Chiranth Agencies [10001]
	 
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ParentMasterContentPlaceHolder1_btnSearch']")
	  private WebElement Search_Button;
	  
	 
	  @FindBy(how=How.XPATH,using = "//*[text()='Giri Nagar']")
	  private WebElement Verify_Text;
	  
	//*[text()='Giri Nagar']
	  public WebElement getRoute_Master_Menu_Btn() {
	      return Route_Master_Menu_Btn;
	  }
	 
	  public WebElement getRoute_Master_Header_Text() {
	      return Route_Master_Header_Text;
	  }
	 
	  public WebElement getChannel_Type_Dropdown() {
	      return Channel_Type_Dropdown;
	  }
	 
	  public WebElement getDistributor_Dropdown() {
	      return Distributor_Dropdown;
	  }
	 
	  public WebElement getSearch_Button() {
	      return Search_Button;
	  }
	 
	public WebElement getChannel_Type_Dropdown_Value() {
		return Channel_Type_Dropdown_Value;
	}
	 
	public WebElement getDistributor_Dropdown_Value() {
		return Distributor_Dropdown_Value;
	}
	 
	public WebElement getVerify_Text() {
		return Verify_Text;
	}

	
	
	
	
	
	
	
}
