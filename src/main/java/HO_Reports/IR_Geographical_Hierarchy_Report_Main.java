package HO_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IR_Geographical_Hierarchy_Report_Main {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using = "//p[text()='Geographical Hierarchy']")
	private WebElement Geographical_Hierarchy_Menu ;

   //p[text()='Geographical Hierarchy']
   //Product, Sales_Hierarchy_Dropdown, Geography_Hierarchy_Dropdown, For_Year_Dropdown, For_Month_Dropdown, Report_Level_Dropdown
   @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlproductHierarchy_Input']")
   private WebElement Product_Dropdown;
   
   
   @FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlproductHierarchy_DropDown']//ul//li[text()='NITOTILE GROUT LIGHT GREY RAL7035 (1kg)']")
   private WebElement Product_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesHierarchy_Input']")
   private WebElement Sales_Hierarchy_Dropdown;
   
   
   @FindBy(how=How.XPATH,using ="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesHierarchy_DropDown']//ul//li[text()='Chiranth Agencies']")
   private WebElement Sales_Hierarchy_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlgeographySalesHiearchy_Input']")
   private WebElement Geography_Hierarchy_Dropdown;
   
   
   @FindBy(how=How.XPATH,using ="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlgeographySalesHiearchy_DropDown']//ul//li[text()='Bangalore']")
   private WebElement Geography_Hierarchy_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlForYear_Input']")
   private WebElement For_Year_Dropdown;
   
   
   @FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlForYear_DropDown']//ul//li[text()='2024']")
   private WebElement For_Year_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_Input']")
   private WebElement For_Month_Dropdown;
   
   
   @FindBy(how=How.XPATH,using ="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_DropDown']//ul//li[text()='December']")
   private WebElement For_Month_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlReportLevel_Input']")
   private WebElement Report_Level_Dropdown;
   
   
   @FindBy(how=How.XPATH,using ="//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlReportLevel_DropDown']//ul//li[text()='State']")
   private WebElement Report_Level_Dropdown_Value;
   
   
   @FindBy(how=How.XPATH,using ="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
   private WebElement View_Button;
   
   
   @FindBy(how=How.XPATH,using ="//table[@id='ctl00_ParentMasterContentPlaceHolder1_RadGridSalesTrendProduct_ctl00']//tbody//tr//td[text()='South 1']")
   private WebElement Grid_Data_Value;
   
   
   @FindBy(how=How.XPATH,using ="//input[@id='ParentMasterContentPlaceHolder1_btnDownload']")
   private WebElement Download_Button;
   
   
 
 
public WebElement getProduct_Dropdown() {
	return Product_Dropdown;
}
 
public WebElement getProduct_Dropdown_Value() {
	return Product_Dropdown_Value;
}
 
public WebElement getSales_Hierarchy_Dropdown() {
	return Sales_Hierarchy_Dropdown;
}
 
public WebElement getSales_Hierarchy_Dropdown_Value() {
	return Sales_Hierarchy_Dropdown_Value;
}
 
public WebElement getGeography_Hierarchy_Dropdown() {
	return Geography_Hierarchy_Dropdown;
}
 
public WebElement getGeography_Hierarchy_Dropdown_Value() {
	return Geography_Hierarchy_Dropdown_Value;
}
 
public WebElement getFor_Year_Dropdown() {
	return For_Year_Dropdown;
}
 
public WebElement getFor_Year_Dropdown_Value() {
	return For_Year_Dropdown_Value;
}
 
public WebElement getFor_Month_Dropdown() {
	return For_Month_Dropdown;
}
 
public WebElement getFor_Month_Dropdown_Value() {
	return For_Month_Dropdown_Value;
}
 
public WebElement getReport_Level_Dropdown() {
	return Report_Level_Dropdown;
}
 
public WebElement getReport_Level_Dropdown_Value() {
	return Report_Level_Dropdown_Value;
}
 
public WebElement getView_Button() {
	return View_Button;
}
 
 
public WebElement getDownload_Button() {
	return Download_Button;
}
 
public WebElement getGrid_Data_Value() {
	return Grid_Data_Value;
}
 
public WebElement getGeographical_Hierarchy_Menu() {
	return Geographical_Hierarchy_Menu;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
