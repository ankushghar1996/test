package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PM_Product_Master {

	
	WebDriver driver;

		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_Header'][text()='Product Master Upload']")
		private WebElement Product_Master_Upload_Header_Text;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_btnDownload']")
		private WebElement Download_Template_BTN;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadButton']")
		private WebElement Select_File_To_Upload_BTN;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_Button3']")
		private WebElement UploadNOW_BTN;
	 
		
		
		public WebElement getProduct_Master_Upload_Header_Text() {
			return Product_Master_Upload_Header_Text;
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
