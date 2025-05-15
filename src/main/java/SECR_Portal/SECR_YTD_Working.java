package SECR_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SECR_YTD_Working {
 
	
	@FindBy(how=How.XPATH,using = "//div[@class='col-12 mt-1']//span[text()='Fosroc Retailer']")
	private WebElement YTD_Retailer ;
	
	
	@FindBy(how=How.XPATH,using = "//div[text()=' YTD (1) ']")
	private WebElement YTD_Button ;
	
	
	@FindBy(how=How.XPATH,using = "//div[@class='capsule']//span[text()='MTD Working']")
	private WebElement MTD_Working;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='text-end']//i[@aria-hidden='true']")
    private WebElement Arrow_Button;
	
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-10 col-lg-10']//span[text()='Download'])[1]")
    private WebElement Download_Button1;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-10 col-lg-10']//span[text()='Download'])[2]")
    private WebElement Download_Button2;
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-10 col-lg-10']//span[text()='Download'])[3]")
    private WebElement Download_Button3;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='common-footer-btn']//span[text()='CLOSE']")
    private WebElement Close_Button;
	
	
 
	public WebElement getYTD_Retailer() {
		return YTD_Retailer;
	}
 
	public WebElement getMTD_Working() {
		return MTD_Working;
	}
 
	public WebElement getArrow_Button() {
		return Arrow_Button;
	}
 
	public WebElement getDownload_Button1() {
		return Download_Button1;
	}
 
	public WebElement getDownload_Button2() {
		return Download_Button2;
	}
 
	public WebElement getDownload_Button3() {
		return Download_Button3;
	}
 
	public WebElement getClose_Button() {
		return Close_Button;
	}
 
	public WebElement getYTD_Button() {
		return YTD_Button;
	}


}