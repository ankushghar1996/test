package SECR_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SECR_Pending_Approval_DB {
 
	@FindBy(how=How.XPATH,using="//div[@class='col-12 order-states-text']//b[text()='Pending Approval']")
	private WebElement Pending_Approval_DB;
	
	
	@FindBy(how=How.XPATH,using = "//div[@class='col-8 p-2']//span[text()=' Retailer KYC Approval']")
	private WebElement Retailer_KYC_Approval;
	
	
	@FindBy(how=How.XPATH,using = "//span[text()='Rahul']")
	private WebElement Retailer_Name;
	
	
	@FindBy(how=How.XPATH,using = "(//span[text()='Download'])[1]")
	private WebElement Aadhar_Card_Download;
	
	
	@FindBy(how=How.XPATH,using = "(//span[text()='Download'])[2]")
	private WebElement PAN_Card;
	
	
	@FindBy(how=How.XPATH,using = "(//span[text()='Download'])[3]")
	private WebElement Shop_Registration;
	
	
	//div[@class='col-12 p-0']//button[text()='Cancel']
	@FindBy(how=How.XPATH,using = "//div[@class='col-12 p-0']//button[text()='Cancel']")
	private WebElement Cancle_Button;
	
	
 
	public WebElement getPending_Approval() {
		return Pending_Approval_DB;
	}
 
	public WebElement getRetailer_KYC_Approval() {
		return Retailer_KYC_Approval;
	}
 
	public WebElement getRetailer_Name() {
		return Retailer_Name;
	}
 
	public WebElement getAadhar_Card_Download() {
		return Aadhar_Card_Download;
	}
 
	public WebElement getPAN_Card() {
		return PAN_Card;
	}
 
	public WebElement getShop_Registration() {
		return Shop_Registration;
	}
 
	public WebElement getCancle_Button() {
		return Cancle_Button;
	}











}