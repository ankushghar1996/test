package SECR_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mark_Attendance {

	
	WebDriver driver;
	
	

	@FindBy(how=How.XPATH,using="//div[@class='mt-auto']//button[@type='button']")
    private WebElement Mark_Attendance_btn;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMark_Attendance_btn() {
		return Mark_Attendance_btn;
	}
	
	
	
	
}
