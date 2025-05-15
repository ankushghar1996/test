package FSG_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class New_Retailer_MTD_YTD_Main {
 
	
	@FindBy(how=How.XPATH,using="//div[@class='capsule']//span[text()='MTD Working']")
	private WebElement MTD_Working;
	
	@FindBy(how=How.XPATH,using="//div[@class='text-end ms-2']//i[@aria-hidden='true']")
	private WebElement New_Retailer_Created_Arrow;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='YTD']")
	private WebElement YTD_Button;
	
	//div//span[text()='Fosroc Retailer']
	@FindBy(how=How.XPATH,using="//div//span[text()='Fosroc Retailer']")
	private WebElement Retailer_Selection;

	//div[@class='mt-1']//span[normalize-space()='More info']
	@FindBy(how=How.XPATH,using="//div[@class='mt-1']//span[normalize-space()='More info']")
	private WebElement More_Info_Tab;
	
	@FindBy(how=How.XPATH,using="(//div[@class='d-flex flex-column justify-content-center ms-2']//span[normalize-space()='Download'])[1]")
	private WebElement Download1;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='d-flex flex-column justify-content-center ms-2']//span[normalize-space()='Download'])[2]")
	private WebElement Download2;
	
	@FindBy(how=How.XPATH,using="(//div[@class='d-flex flex-column justify-content-center ms-2']//span[normalize-space()='Download'])[3]")
	private WebElement Download3;
	
	
 
	public WebElement getMTD_Working() {
		return MTD_Working;
	}
 
	public WebElement getNew_Retailer_Created_Arrow() {
		return New_Retailer_Created_Arrow;
	}
 
	public WebElement getYTD_Button() {
		return YTD_Button;
	}
 
	public WebElement getRetailer_Selection() {
		return Retailer_Selection;
	}
 
	public WebElement getMore_Info_Tab() {
		return More_Info_Tab;
	}
 
	public WebElement getDownload1() {
		return Download1;
	}
 
	public WebElement getDownload2() {
		return Download2;
	}
 
	public WebElement getDownload3() {
		return Download3;
	}



}