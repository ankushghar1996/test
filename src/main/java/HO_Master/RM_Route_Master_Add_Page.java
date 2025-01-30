package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_Route_Master_Add_Page {

	
	WebDriver driver;
	
	
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster_GridData']//tbody//tr//td[text()='Whitefield Area'])[1]")
	  private WebElement Route_Master_Grid_Line1;
	
	 
	  @FindBy(how=How.XPATH,using= "//*[text()='Add New Route']")
	  private WebElement Add_New_Route_Header_Text;
	
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster_Add_Button']")
	  private WebElement Route_Master_Add_Button;
	 
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_Input']")
	  private WebElement Channel_Type_Dropdown;
	 
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor_Input']")
	  private WebElement Distributor_Name_Dropdown;
	 
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsalesman_Input']")
	  private WebElement FSG_Name_Dropdown;
	 
	  
	  @FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_txtRouteName']")
	  private WebElement Route_Name_Textbox;
	 
	  
	  //Save and Close Button Written in Common
	  public WebElement getRoute_Master_Grid_Line1() {
	      return Route_Master_Grid_Line1;
	  }
	 
	  public WebElement getAdd_New_Route_Header_Text() {
	      return Add_New_Route_Header_Text;
	  }
	 
	  public WebElement getRoute_Master_Add_Button() {
	      return Route_Master_Add_Button;
	  }
	 
	  public WebElement getChannel_Type_Dropdown() {
	      return Channel_Type_Dropdown;
	  }
	 
	  public WebElement getDistributor_Name_Dropdown() {
	      return Distributor_Name_Dropdown;
	  }
	 
	  public WebElement getFSG_Name_Dropdown() {
	      return FSG_Name_Dropdown;
	  }
	 
	  public WebElement getRoute_Name_Textbox() {
	      return Route_Name_Textbox;
	  }
	 
	
	
	
	
	
	
	
}
