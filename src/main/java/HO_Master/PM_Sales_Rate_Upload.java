package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PM_Sales_Rate_Upload {

	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_retailerHeader'][text()='Sales Rate Upload']")
	private WebElement Sales_Rate_Upload_Header_Text ;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_btnDownload']")
	private WebElement Download_Template_BTN;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadButton']")
	private WebElement Select_File_To_Upload_BTN;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_Button3']")
	private WebElement UploadNOW_BTN;
	
	
 
	public WebElement getSales_Rate_upload_Header_Text() {
		return Sales_Rate_Upload_Header_Text ;
	}
 
	public WebElement getDownload_Template_BTN() {
		return Download_Template_BTN;
	}
 
	public WebElement getSelect_File_To_Upload_BTN() {
		return Select_File_To_Upload_BTN;
	}
 
	public WebElement getUploadNOW_BTN() {
		return UploadNOW_BTN;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
