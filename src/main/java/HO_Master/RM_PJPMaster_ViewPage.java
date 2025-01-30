package HO_Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RM_PJPMaster_ViewPage {

	
	WebDriver driver;
	
	
	//Case 1 Alternate days //Select Row 1
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_chkSelectRecord']")
	   private WebElement Select_Row1_Checkbox;//Select Beat Name Row 1 Checkbox
	  
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlVisitFrequency']")
	  private WebElement Row1_Visit_Frequency1_Dropdown_Select_Case1;//Select Visit_Frequency1 Dropdown 
	  
	  
	  @FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1']//table//tbody/tr/td//option[text()='Alternate Day'])[1]")
	  private WebElement Row1_Visit_Frequency1_Dropdown_Value_Select_Case1;//Select Alternate_Days Value Case1
	  
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlWeekDay1']")
	  private WebElement Row1_WeekDay1_Dropdown_Select_Case1;// Select WeekDay1_Dropdown 
	  
	  
	  @FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//table//tbody//tr//td//option[text()='Monday'])[1]")
	  private WebElement Row1_WeekDay1_Dropdown_Day_Select_Case1;//Select Monday1_Value Case1
	 
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlWeekDay2']")
	  private WebElement Row1_WeekDay2_Dropdown_Select_Case1;// Select WeekDay2_Dropdown
	  
	  
	  @FindBy(how=How.XPATH,using= "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//table//tbody//tr//td//option[text()='Wednesday'])[1]")
	  private WebElement Row1_WeekDay2_Dropdown_Day_Select_Case1;//Select Wednesday1_Value Case1
	 
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlWeekDay3']")
	  private WebElement Row1_WeekDay3_Dropdown_Select_Case1;//Select WeekDay3_Dropdown
	  
	  
	  @FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//table//tbody//tr//td//option[text()='Friday'])[1]")
	  private WebElement Row1_WeekDay3_Dropdown_Day_Select_Case1;//Select Friday1_Value Case1
	  
	  
	  //Case 2 Fortnightly days //Select Row 1
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlVisitFrequency']")
	  private WebElement Row1_Visit_Frequency1_Dropdown_Select_Case2;//Select Visit_Frequency1 Dropdown
	  
	  
	  @FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1']//table//tbody/tr/td//option[text()='Fortnightly'])[1]")
	  private WebElement Row1_Visit_Frequency1_Dropdown_Value_Select_Case2;//Select Fortnightly_Value Case2
	  
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlWeekDay1']")
	  private WebElement Row1_WeekDay1_Dropdown_Select_Case2;// Select WeekDay1_Dropdown 
	  
	  
	  @FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//table//tbody//tr//td//option[text()='Monday'])[1]")
	  private WebElement Row1_WeekDay1_Dropdown_Value_Select_Case2;//Select Monday1_Value Case2
	  
	  
	  @FindBy(how=How.XPATH,using = "//*[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_ddlFreqDetails']")
	  private WebElement Row1_Frequency_Details_Dropdown_Select_Case2;//Select Frequency_Details Dropdown 
	  
	  
	  @FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1']//table//tbody/tr/td//option[text()='Second & Forth Week'])[1]")
	  private WebElement Row1_Frequency_Details_Dropdown_Value_Select_Case2;//Select Second & Forth Week Value Case 2
	 
	  
	 
	public WebElement getRow1_Visit_Frequency1_Dropdown_Select_Case1() {
		return Row1_Visit_Frequency1_Dropdown_Select_Case1;
	}
	 
	public WebElement getRow1_Visit_Frequency1_Dropdown_Value_Select_Case1() {
		return Row1_Visit_Frequency1_Dropdown_Value_Select_Case1;
	}
	 
	public WebElement getRow1_WeekDay1_Dropdown_Day_Select_Case1() {
		return Row1_WeekDay1_Dropdown_Day_Select_Case1;
	}
	 
	public WebElement getRow1_WeekDay2_Dropdown_Day_Select_Case1() {
		return Row1_WeekDay2_Dropdown_Day_Select_Case1;
	}
	 
	public WebElement getRow1_WeekDay3_Dropdown_Day_Select_Case1() {
		return Row1_WeekDay3_Dropdown_Day_Select_Case1;
	}
	 
	public WebElement getRow1_Visit_Frequency1_Dropdown_Value_Select_Case2() {
		return Row1_Visit_Frequency1_Dropdown_Value_Select_Case2;
	}
	 
	public WebElement getRow1_WeekDay1_Dropdown_Value_Select_Case2() {
		return Row1_WeekDay1_Dropdown_Value_Select_Case2;
	}
	 
	public WebElement getRow1_Frequency_Details_Dropdown_Value_Select_Case2() {
		return Row1_Frequency_Details_Dropdown_Value_Select_Case2;
	}
	 
	public WebElement getRow1_WeekDay1_Dropdown_Select_Case1() {
		return Row1_WeekDay1_Dropdown_Select_Case1;
	}
	 
	public WebElement getRow1_WeekDay2_Dropdown_Select_Case1() {
		return Row1_WeekDay2_Dropdown_Select_Case1;
	}
	 
	public WebElement getRow1_WeekDay3_Dropdown_Select_Case1() {
		return Row1_WeekDay3_Dropdown_Select_Case1;
	}
	 
	public WebElement getRow1_Visit_Frequency1_Dropdown_Select_Case2() {
		return Row1_Visit_Frequency1_Dropdown_Select_Case2;
	}
	 
	public WebElement getRow1_WeekDay1_Dropdown_Select_Case2() {
		return Row1_WeekDay1_Dropdown_Select_Case2;
	}
	 
	public WebElement getRow1_Frequency_Details_Dropdown_Select_Case2() {
		return Row1_Frequency_Details_Dropdown_Select_Case2;
	}
	 
	public WebElement getSelect_Row1_Checkbox() {
		return Select_Row1_Checkbox;
	}

	  //save and close written in common


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
