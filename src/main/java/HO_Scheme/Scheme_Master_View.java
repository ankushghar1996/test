package HO_Scheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Scheme_Master_View {

	
WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Scheme Master']")
	private WebElement Scheme_Master_Menu;
	
	//table[@id='ctl00_ParentMasterContentPlaceHolder1_RadGridSalesTrendProduct_ctl00']//tr//td[text()='Karnataka  and Kerala']
	 
	
	
	public WebElement getScheme_Master_Menu() {
		return Scheme_Master_Menu;
	}

	public WebElement getView_btn() {
		return View_btn;
	}

	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
