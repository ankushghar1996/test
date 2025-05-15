package SEBS_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mark_Attendance_SEBS {

	
	WebDriver driver;
	
	

	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getMark_Attendance_btn() {
		return Mark_Attendance_btn;
	}



	@FindBy(how=How.XPATH,using="//div[@class='col-12']//button[@type='button']")
    private WebElement Mark_Attendance_btn;
	
	
	
	
	
	
	
	
	
}
