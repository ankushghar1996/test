package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DLRM_Dealer_Master_View_Page {

	WebDriver driver;
	
	@FindBy (how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailerMaster_ctl00']//tr//td[text()='Asian Enterprises']")
	private WebElement Dealer_Master_GridaData_Table_Value_Select;
	
	
	@FindBy(how=How.XPATH,using= "//*[text()='Dealer Details']")
	private WebElement Dealer_Master_Header_Text;
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_btnView']")
	private WebElement Dealer_Master_View_Button;
	
	@FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_documentLink1']")
	private WebElement Document1_Download;
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_documentLink2']")
	private WebElement Document2_Download;
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='ParentMasterContentPlaceHolder1_documentLink3']")
	private WebElement Document3_Download;
	
	
 
	public WebElement getDocument1_Download() {
		return Document1_Download;
	}
 
	public WebElement getDocument2_Download() {
		return Document2_Download;
	}
 
	public WebElement getDocument3_Download() {
		return Document3_Download;
	}
 
	public WebElement getDealer_Master_GridaData_Table_Value_Select() {
		return Dealer_Master_GridaData_Table_Value_Select;
	}
 
	public WebElement getDealer_Master_Header_Text() {
		return Dealer_Master_Header_Text;
	}
 
	public WebElement getDealer_Master_View_Button() {
		return Dealer_Master_View_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
