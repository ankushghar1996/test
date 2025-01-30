package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Master_Upload_Retailer_Page {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="") 
	private WebElement Upload_Button_Header_Text;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadUserControl_lnkDownload']") 
	private WebElement Download_template_button;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadUserControl_UploadButton']") 
	private WebElement Select_File_To_Upload_Button;
	
 
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadUserControl_Button3']") 
	private WebElement Upload_Now_Button;
	
	
	//Upload & Close Button Written in Common 
	public WebElement getUpload_Button_Header_Text() {
		return Upload_Button_Header_Text;
	}
 
	public WebElement getDownload_template_button() {
		return Download_template_button;
	}
 
	public WebElement getSelect_File_To_Upload_Button() {
		return Select_File_To_Upload_Button;
	}
 
	public WebElement getUpload_Now_Button() {
		return Upload_Now_Button;
	}
 
	
	
	
	
	
}
