package Distributor_Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Outlet_Approval_1st_View {

	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Master']")
	private WebElement Master ;
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Outlet Master']")
	private WebElement Outlet_Master ;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='sidebar']//p[text()='Outlet Approval (1st)']")
	private WebElement Outlet_Approval_1st ;
	
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailer1stApproval']//table//tr)[4]")
	private WebElement Grid_Data ;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_Button;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink1']")
	private WebElement Download1_Button;
	
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink2']")
	private WebElement Download2_Button;
	
	
	@FindBy(how=How.XPATH,using="//a[@id='ParentMasterContentPlaceHolder1_documentLink3']")
	private WebElement Download3_Button;
	public WebElement getMaster() {
		return Master;
	}

	public WebElement getOutlet_Master() {
		return Outlet_Master;
	}

	public WebElement getOutlet_Approval_1st() {
		return Outlet_Approval_1st;
	}

	public WebElement getGrid_Data() {
		return Grid_Data;
	}

	public WebElement getView_Button() {
		return View_Button;
	}

	public WebElement getClose_Button() {
		return Close_Button;
	}

	public WebElement getDownload1_Button() {
		return Download1_Button;
	}

	public WebElement getDownload2_Button() {
		return Download2_Button;
	}

	public WebElement getDownload3_Button() {
		return Download3_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
