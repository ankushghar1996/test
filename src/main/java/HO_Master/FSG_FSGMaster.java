package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FSG_FSGMaster {

WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//a[@href='../Master/Mst_SalesmanMaster.aspx']//p[contains(text(),'FSG Master')]")
	private WebElement FSG_Master;

	public WebElement getFSG_Master() {
		return FSG_Master;
	}

	public WebElement getFSG_Master_Header() {
		return FSG_Master_Header;
	}

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='FSG Master']")
	private WebElement FSG_Master_Header;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
