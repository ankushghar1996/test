package SEBS_Portal;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class SEBS_New_Contractors {
	
@FindBy(how=How.XPATH,using="//div[@class='navbar-title']//i[@aria-hidden='true']")
private WebElement Menu ;

@FindBy(how=How.XPATH,using="//div[@class='offcanvas-options mt-4']//span[text()='New Contractor Creation']")
private WebElement New_Contractor_Creation ;

@FindBy(how=How.XPATH,using="//div[@class='retailer-add d-flex align-items-center text-right']//i[@aria-hidden='true']")
private WebElement Creation_Button ;	

@FindBy(how=How.XPATH,using="(//div[@class='ng-select-container ng-has-value']//input[@type='text'])[1]")
private WebElement Select_Distributor_Dropdown ;

@FindBy(how=How.XPATH,using="//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Bluehost DB [10145]']")
private WebElement Select_Distributor_Dropdown_Value ;		

@FindBy(how=How.XPATH,using="(//div[@class='ng-select-container ng-has-value']//input[@type='text'])[2]")
private WebElement Sales_Engineer_Dropdown ;	

@FindBy(how=How.XPATH,using="//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Nageshwar']")
private WebElement Sales_Engineer_Dropdown_Value ;	

 
@FindBy(how=How.XPATH,using="//ng-select[@formcontrolname='Route']")
private WebElement Route ;

@FindBy(how=How.XPATH,using="//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='karvey nagar']")
private WebElement Route_Value ;		

@FindBy(how=How.XPATH,using="//div[@class='col-12 mb-3']//select[@aria-label='Default select example']")
private WebElement Contractor_Type ;
 
@FindBy(how=How.XPATH,using="//div[@class='col-12 mb-3']//option[text()='Contractor ']")
private WebElement Contractor_Type_Value;
 
@FindBy (how=How.XPATH,using = "//div[@class='col-12 mb-3']//ng-select[@bindvalue='StateId']")
private WebElement State_Dropdown;
 
@FindBy (how=How.XPATH,using = "//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Maharashtra']")
private WebElement State_Dropdown_Value;
 
@FindBy (how=How.XPATH,using = "//ng-select[@bindvalue='TownId']//input[@type='text']")
private WebElement City_Dropdown ;
 
@FindBy (how=How.XPATH,using = "//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Ahmednagar']")
private WebElement City_Dropdown_Value ;
 

public WebElement getMenu() {
	return Menu;
}
 
public WebElement getNew_Contractor_Creation() {
	return New_Contractor_Creation;
}
 
public WebElement getCreation_Button() {
	return Creation_Button;
}
 
public WebElement getSelect_Distributor_Dropdown() {
	return Select_Distributor_Dropdown;
}
 
public WebElement getSelect_Distributor_Dropdown_Value() {
	return Select_Distributor_Dropdown_Value;
}
 
public WebElement getSales_Engineer_Dropdown() {
	return Sales_Engineer_Dropdown;
}
 
public WebElement getSales_Engineer_Dropdown_Value() {
	return Sales_Engineer_Dropdown_Value;
}
 
public WebElement getRoute() {
	return Route;
}
 
public WebElement getRoute_Value() {
	return Route_Value;
}
 
public WebElement getContractor_Type() {
	return Contractor_Type;
}
 
public WebElement getContractor_Type_Value() {
	return Contractor_Type_Value;
}
 
public WebElement getState_Dropdown() {
	return State_Dropdown;
}
 
public WebElement getState_Dropdown_Value() {
	return State_Dropdown_Value;
}
 
public WebElement getCity_Dropdown() {
	return City_Dropdown;
}
 
public WebElement getCity_Dropdown_Value() {
	return City_Dropdown_Value;
}

}