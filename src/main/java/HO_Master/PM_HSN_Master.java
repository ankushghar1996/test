package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PM_HSN_Master {

	
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//p[text()='HSN Master']")
	private WebElement HSN_Master_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ParentMasterContentPlaceHolder1_HSNMasterHeader']")
	private WebElement HSN_Master_Header_Text;
	
	
	@FindBy(how=How.XPATH,using ="//*[@id='ParentMasterContentPlaceHolder1_btnDownload']")
	private WebElement Download_Template;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentMasterContentPlaceHolder1_UploadButton']")
	private WebElement Select_File_To_Upload;
 
	
	public WebElement getHSN_Master_Header_Text() {
		return HSN_Master_Header_Text;
	}
 
	public WebElement getDownload_Template() {
		return Download_Template;
	}
 
	public WebElement getSelect_File_To_Upload() {
		return Select_File_To_Upload;
	}
 
	public WebElement getHSN_Master_Menu() {
		return HSN_Master_Menu;
	}
 
	
	//Upload Button is written in Common Folder

	
	
	
	
	
	
}
