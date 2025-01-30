package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PM_Project_Image_Upload {

	
	
	WebDriver driver;

	@FindBy(how=How.XPATH,using="//p[text()='Product Image Upload']")
	private WebElement Product_Image_Upload_Menu;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_Header'][text()='Product Image Upload']")
	private WebElement Product_Image_Upload_Header_text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_Input']")
	private WebElement PIM_Category_Dropdown;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProducts_DropDown']//child::label[text()='FOSROC MEMBRANE HDPE-P STANDARD (1.2mmx1.5mx20m)']")
	private WebElement PIM_Category_Dropdown_Value;
	
	
 
	public WebElement getProduct_Image_Upload_Menu(){
		return Product_Image_Upload_Menu;
	}
 
	public WebElement getProduct_Image_Upload_Header_text() {
		return Product_Image_Upload_Header_text;
	}
 
	public WebElement getPIM_Category_Dropdown() {
		return PIM_Category_Dropdown;
	}
 
	public WebElement getPIM_Category_Dropdown_Value() {
		return PIM_Category_Dropdown_Value;
	}
	//View Button Written in Common Folder
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
