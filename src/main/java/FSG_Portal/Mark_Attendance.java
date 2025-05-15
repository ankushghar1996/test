package FSG_Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mark_Attendance {

	
WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='MARK ATTENDANCE']")
	private WebElement MARK_ATTENDANCE;

	
	


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMARK_ATTENDANCE() {
		return MARK_ATTENDANCE;
	}
	
	
	
	
	
	
}
