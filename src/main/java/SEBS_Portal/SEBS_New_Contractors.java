package SEBS_Portal;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Com_Utility.ObjectRepo;
 
public class SEBS_New_Contractors {
	
@FindBy(how=How.XPATH,using="//div[@class='navbar-title']//i[@aria-hidden='true']")
private WebElement Menu ;

@FindBy(how=How.XPATH,using="//div[contains(@class,'offcanvas-options') and contains(@class,'mt-4')]//span[contains(text(),'New Contractor Creation')]")
private WebElement New_Contractor_Creation ;

@FindBy(how=How.XPATH,using="//div[@class='circle-add']//i[@aria-hidden='true']")
private WebElement Creation_Button ;	

@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[1]")
private WebElement Select_Distributor_Dropdown ;

@FindBy(how=How.XPATH,using="//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Bluehost DB [10145]']")
private WebElement Select_Distributor_Dropdown_Value ;		

@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[2]")
private WebElement Sales_Engineer_Dropdown ;	


//   (//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]
//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Nageshwar']
@FindBy(how=How.XPATH,using="(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]")
private WebElement Sales_Engineer_Dropdown_Value ;	

 
@FindBy(how=How.XPATH,using="(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[3]")
private WebElement Route ;


//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='karvey nagar']
@FindBy(how=How.XPATH,using="(//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-bottom']//child::div//child::span[contains(@class,'ng-option')])[1]")
private WebElement Route_Value ;		





//   (//div[@class='col-12 mb-3']//child::select[contains(@class,'form-select ng-untouched')])[1]
@FindBy(how=How.XPATH,using="//div[@class='col-12 mb-3']//child::select[contains(@class,'form-select ng-untouched')]")
private WebElement Contractor_Type ;
 
@FindBy(how=How.XPATH,using="//div[@class='col-12 mb-3']//option[text()='Contractor ']")
private WebElement Contractor_Type_Value;
 
@FindBy (how=How.XPATH,using = "(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[4]")
private WebElement State_Dropdown;
 
@FindBy (how=How.XPATH,using = "//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='Maharashtra']")
private WebElement State_Dropdown_Value;
 
@FindBy (how=How.XPATH,using = "(//div[@class='col-12 mb-3']//child::ng-select//child::div//input[@type='text'])[5]")
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