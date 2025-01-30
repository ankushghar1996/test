package HO_Scheme_Credential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Scheme.Scheme_Master_Add_Page;

public class SM_Scheme_AddPage extends BaseClass{

	
	
	@Test(priority = 0)	
	public void Scheme_Master_AddPage_AllSku() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	Scheme_Master_Add_Page SMA = PageFactory.initElements(driver,Scheme_Master_Add_Page.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	  Liabrary.custom_click(hp.getScheme_Menu(),"Select Master Menu");
	  Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Scheme Master menu.")
	  Liabrary.custom_click(hp.getScheme_Setup_SubMenu(),"Select Scheme Master menu");
	  Thread.sleep(1000);
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Scheme Master sub menu.")
	  Liabrary.custom_click(SMA.getScheme_Master_Menu(), "select Scheme Master sub menu");
	  Thread.sleep(1000);
	  
	  
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Scheme Master Header Text.");
	  WebElement Scheme_Master_Header_Text = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
	  String Actual_Text= Scheme_Master_Header_Text.getText();
	  System.out.println(Actual_Text);
	  String Expected_Text= "Scheme Master";
	  Assert.assertEquals(Expected_Text,Actual_Text);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Click on Add Btn.")
	  Liabrary.custom_click(SMA.getAdd_btn(), "Click on Add Btn");
	  Thread.sleep(1000);
	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 :Verify that Scheme Master Header Text.");
	  WebElement New_Scheme_Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
	  String Actual_Text1= New_Scheme_Header_Text.getText();
	  System.out.println(Actual_Text1);
	  String Expected_Text1 = "New Scheme";
	  Assert.assertEquals(Expected_Text1,Actual_Text1);
	
	
	  
	  Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
	  Liabrary.custom_click(SMA.getProductHierarchySelect_dropdown(), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
	  Liabrary.custom_click(SMA.getProduct_List_dropdown(), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
	  Liabrary.custom_click(SMA.getProduct_ListSelect_dropdown(), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
	  
	  Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month= "December 2024";
	    String date = "28";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
	    
		while(true)
		{
		String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='28']"));
		
		for(WebElement element : ele) {
			
			String date1 = element.getText();
			
			if(date1.equals(date)) {
			
				element.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month1= "December 2024";
	    String date1 = "31";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
	    
		while(true)
		{
		String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
		
		if(text1.equals(month1))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
		
		for(WebElement element1 : ele1) {
			
			String date2 = element1.getText();
			
			if(date2.equals(date1)) {
			
				element1.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	    Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "select scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select value scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "send value on discriptiion textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getDistributorSelection_btn(), "select distributor selection button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "select distributor state select");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "select distributor town select");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getClose_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_btn(), "Click on Outlet type button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Click on Outlet type checkbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getCloseScheme_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "click on slab basis dropodown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select value on slab basis dropdown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "send value on TxtOn textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "send value on TxtPoint textbox");
		Thread.sleep(4000);
		
		
	//	Liabrary.custom_click(SMA.getCloseScheme1_btn(), "click on close button");
		Thread.sleep(1000);
		
		Liabrary.custom_click(SMA.getSave_btn(), "click on close button");
		Thread.sleep(4000);
		
		
		
		
		
	}
		
		
		
		
	@Test(priority = 1)	
	public void Scheme_Master_AddPage_MultipleSku() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	Scheme_Master_Add_Page SMA = PageFactory.initElements(driver,Scheme_Master_Add_Page.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	  Liabrary.custom_click(hp.getScheme_Menu(),"Select Master Menu");
	  Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Scheme Master menu.")
	  Liabrary.custom_click(hp.getScheme_Setup_SubMenu(),"Select Scheme Master menu");
	  Thread.sleep(1000);
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Scheme Master sub menu.")
	  Liabrary.custom_click(SMA.getScheme_Master_Menu(), "select Scheme Master sub menu");
	  Thread.sleep(1000);
	  
	  
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Scheme Master Header Text.");
	  WebElement Scheme_Master_Header_Text = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
	  String Actual_Text= Scheme_Master_Header_Text.getText();
	  System.out.println(Actual_Text);
	  String Expected_Text= "Scheme Master";
	  Assert.assertEquals(Expected_Text,Actual_Text);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Click on Add Btn.")
	  Liabrary.custom_click(SMA.getAdd_btn(), "Click on Add Btn");
	  Thread.sleep(1000);
	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 :Verify that Scheme Master Header Text.");
	  WebElement New_Scheme_Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
	  String Actual_Text1= New_Scheme_Header_Text.getText();
	  System.out.println(Actual_Text1);
	  String Expected_Text1 = "New Scheme";
	  Assert.assertEquals(Expected_Text1,Actual_Text1);
		
		
	Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), "select product hierarchy dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProductHierarchySelect1_dropdown(), "select product hierarchy value dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getGo_btn(), "click on Go button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProduct_dropdown(), "select product dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProductSelect1_dropdown(), "select product value dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getOk_btn(), "click on Ok button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), Expected_Text1);
	  Thread.sleep(1000);
	  
	  
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month= "December 2024";
	    String date = "28";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
	    
		while(true)
		{
		String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='28']"));
		
		for(WebElement element : ele) {
			
			String date1 = element.getText();
			
			if(date1.equals(date)) {
			
				element.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month1= "December 2024";
	    String date2 = "31";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
	    
		while(true)
		{
		String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
		
		if(text1.equals(month1))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
		
		for(WebElement element1 : ele1) {
			
			String date3 = element1.getText();
			
			if(date3.equals(date2)) {
			
				element1.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	    Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "select scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select value scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "send value on discriptiion textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getDistributorSelection_btn(), "select distributor selection button");
		Thread.sleep(2000);
		
		
		Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "select distributor state select");
		Thread.sleep(2000);
		
		
		Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "select distributor town select");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getClose_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_btn(), "Click on Outlet type button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Click on Outlet type checkbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getCloseScheme_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "click on slab basis dropodown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select value on slab basis dropdown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "send value on TxtOn textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "send value on TxtPoint textbox");
		Thread.sleep(4000);
		
		
		Liabrary.custom_click(SMA.getCloseScheme1_btn(), "click on close button");
		Thread.sleep(1000);
	
		
	}	
	
	  
	@Test(priority = 2)	
	public void Scheme_Master_Enter_MandetoryField() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	Scheme_Master_Add_Page SMA = PageFactory.initElements(driver,Scheme_Master_Add_Page.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	  Liabrary.custom_click(hp.getScheme_Menu(),"Select Master Menu");
	  Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Scheme Master menu.")
	  Liabrary.custom_click(hp.getScheme_Setup_SubMenu(),"Select Scheme Master menu");
	  Thread.sleep(1000);
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Scheme Master sub menu.")
	  Liabrary.custom_click(SMA.getScheme_Master_Menu(), "select Scheme Master sub menu");
	  Thread.sleep(1000);
	  
	  
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Scheme Master Header Text.");
	  WebElement Scheme_Master_Header_Text = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
	  String Actual_Text= Scheme_Master_Header_Text.getText();
	  System.out.println(Actual_Text);
	  String Expected_Text= "Scheme Master";
	  Assert.assertEquals(Expected_Text,Actual_Text);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Click on Add Btn.")
	  Liabrary.custom_click(SMA.getAdd_btn(), "Click on Add Btn");
	  Thread.sleep(1000);
	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 :Verify that Scheme Master Header Text.");
	  WebElement New_Scheme_Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
	  String Actual_Text1= New_Scheme_Header_Text.getText();
	  System.out.println(Actual_Text1);
	  String Expected_Text1 = "New Scheme";
	  Assert.assertEquals(Expected_Text1,Actual_Text1);
		
		
	Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), "select product hierarchy dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProductHierarchySelect1_dropdown(), "select product hierarchy value dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getGo_btn(), "click on Go button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProduct_dropdown(), "select product dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getProductSelect1_dropdown(), "select product value dropdown");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(SMA.getOk_btn(), "click on Ok button");
	Thread.sleep(1000);
	
	
//	Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), Expected_Text1);
	Thread.sleep(1000);
	  
	  
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month= "December 2024";
	    String date = "28";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
	    
		while(true)
		{
		String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='28']"));
		
		for(WebElement element : ele) {
			
			String date1 = element.getText();
			
			if(date1.equals(date)) {
			
				element.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month1= "December 2024";
	    String date2 = "31";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
	    
		while(true)
		{
		String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
		
		if(text1.equals(month1))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
		
		for(WebElement element1 : ele1) {
			
			String date3 = element1.getText();
			
			if(date3.equals(date2)) {
			
				element1.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
	
	
	
	    Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "select scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select value scheme category");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "send value on discriptiion textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getDistributorSelection_btn(), "select distributor selection button");
		Thread.sleep(2000);
		
		
		Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "select distributor state select");
		Thread.sleep(2000);
		
		
		Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "select distributor town select");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getClose_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_btn(), "Click on Outlet type button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Click on Outlet type checkbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getCloseScheme_btn(), "click on close button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "click on slab basis dropodown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select value on slab basis dropdown");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "send value on TxtOn textbox");
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "send value on TxtPoint textbox");
		Thread.sleep(4000);
		
		/*
		Liabrary.custom_click(SMA.getCloseScheme1_btn(), "click on close button");
		Thread.sleep(1000);
	 */
	  
		
		
	  
		WebElement scroll = driver.findElement(By.xpath("//span[@id='ParentMasterContentPlaceHolder1_lblSchemeName']"));
  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
	    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
  		Thread.sleep(5000);
	  
	  
	  
  		Liabrary.custom_click(SMA.getSave_btn(), "click on Save button");
		Thread.sleep(4000);
	  
	  
		Liabrary.custom_click(SMA.getCloseScheme1_btn(), "click on close button");
		Thread.sleep(5000);
	  
	
		
		/*
		
		// show 1 to 10 of 30 (1909 Pages)
		
	String text =	driver.findElement(By.xpath("//div[Contains(text(),'Pages')]")).getText();
		
	//  Integer.parseInt() ---- convert string into the Integer 
	
		int Total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		//	5
		// repeating pages 
					//		5
		for(int p = 1; p<= Total_Pages; p++ )
		{
			
			if(p>1)
			{
				
			WebElement	active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			active_page.click();
			
			}
			
			// reading data 
			
		int noOfRows = driver.findElements(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr")).size();
			
			for(int r=1; r< noOfRows; r++)
			{
		
			//	driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr[1]/td[2]")).getText();
				
				String custmor_name =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				
				String email =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				
				String status =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				
				System.out.println(custmor_name+"\t"+email+"\t"+status);
				
			}
			
		}
		
	
	}
	
	
	*/
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
