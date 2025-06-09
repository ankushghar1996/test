package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_SFAViewPage;

public class DistM_ADD_SFADistributor extends BaseClass{

	
	@Test(priority = 0)
	public void Add_SFA() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_ADDSFADistributor AD = PageFactory.initElements(driver, DM_ADDSFADistributor.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC01", "Click Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC02", "Click Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC03", "Click SFA Distributor Master", () -> {
		Liabrary.custom_click(AD.getSFADistributor_Master(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC04", "Click on Add button", () -> {
		Liabrary.custom_click(AD.getAdd_btn(), null);});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC05", "Verify Add New SFA Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Add New SFA";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);

		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC06", "Click on Channel Type Dropdown", () -> {
		Liabrary.custom_click(AD.getChannelType_Dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC07", "Select Channel Type Dropdown Value", () -> {
		Liabrary.custom_click(AD.getChannelTypeValue1_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC08", "Click on Cluster Dropdown", () -> {
		Liabrary.custom_click(AD.getCluster_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC09", "Select Cluster Dropdown Value", () -> {
		Liabrary.custom_click(AD.getClusterValue_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC10", "Verify Add New SFA Header Text", () -> {
		Liabrary.custom_Sendkeys(AD.getName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 0), "send Name TextBox");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC11", "Click on Class Dropdown", () -> {
		Liabrary.custom_click(AD.getClass_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC12", "Select Class Dropdown Value", () -> {
		Liabrary.custom_click(AD.getClassValue_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC13", "Click on Category_Dropdown", () -> {
		Liabrary.custom_click(AD.getCategory_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC14", "Select Category Dropdown value", () -> {
		Liabrary.custom_click(AD.getCategoryValue_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC15", "Send Local Name", () -> {
		Liabrary.custom_Sendkeys(AD.getLocalName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 1), "send Local Name");});
		Thread.sleep(4000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC16", "Send Contact Person Name", () -> {
		Liabrary.custom_Sendkeys(AD.getContactPersonName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 2), null);});
		Thread.sleep(1000);
		
		
	//	driver.findElement(By.xpath("(//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber'])[1]")).sendKeys("9845721510");
	//	Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC17", "Send Contact Number", () -> {
		try {
		Liabrary.custom_Sendkeys(AD.getContactNumber_TextBox(), excel.getNumericdata("HO_Add_SFA", 1, 3), null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} });
	
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC18", "Send Email", () -> {
		Liabrary.custom_Sendkeys(AD.getEmail_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 4), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC19", "Send Address1", () -> {
		Liabrary.custom_Sendkeys(AD.getAddress1_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 5), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC20", "Send Address2", () -> {
		Liabrary.custom_Sendkeys(AD.getAddress2_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 6), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC21", "Send Address3", () -> {
		Liabrary.custom_Sendkeys(AD.getTxtAddress3_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 7), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC22", "Click on State Dropdown", () -> {
		Liabrary.custom_click(AD.getState_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC23", "Select State Dropdown value", () -> {
		Liabrary.custom_click(AD.getStateValue_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC24", "Click on City Dropdown", () -> {
		Liabrary.custom_click(AD.getCity_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC25", "Select City Dropdown value", () -> {
		Liabrary.custom_click(AD.getCityValue_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC26", "Send PinCode", () -> {
		Liabrary.custom_Sendkeys(AD.getPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 1, 8), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC27", "Send GST Number", () -> {
		Liabrary.custom_Sendkeys(AD.getGSTNumber_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 9), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC28", "Click On GST State Dropdown", () -> {
		Liabrary.custom_click(AD.getGSTState_Dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC29", "Select GST State Value", () -> {
		Liabrary.custom_click(AD.getGSTStateValue_Dropdown(), null);});
		Thread.sleep(2000);
		
		
		WebElement Ele=driver.findElement(By.xpath("//label[normalize-space()='Shipping Address']"));
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		jse1.executeScript("arguments[0].scrollIntoView(true);", Ele);
		Thread.sleep(2000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC30", "Godown Address 1", () -> {
		driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']")).click();});
		Thread.sleep(1000);
		
		
		/*
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']"))).build().perform();
		Thread.sleep(1000);
		
		
		try {
		Liabrary.custom_click(AD.getGodawn_Address1(), null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	*/
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC31", "Click on Address Textbox", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddressName1']")).sendKeys("Manaji Nagar");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC32", "Click on Address_Line_1 Textbox", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine1']")).sendKeys("Near Ganpti Mandir");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC33", "Click on Address_Line_2 Textbox", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine2']")).sendKeys("Narhe Gaon");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC34", "Click on Address_Line_3 Textbox", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine3']")).sendKeys("Pune");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC35", "Click on State Dropdown", () -> {
		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_Input']")).click();});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC36", "Select State Dropdown Value", () -> {
		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_DropDown']//ul//li[text()='Maharashtra']")).click();});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC37", "Select State Dropdown Value", () -> {
		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_Input']")).click();});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC38", "Select State Dropdown Value", () -> {
		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_DropDown']//ul//li[text()='Nagpur']")).click();});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC39", "Send Pincode", () -> {
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1PinCode']")).sendKeys("411041");});
		Thread.sleep(4000);
		
		
		/*
		
		Liabrary.custom_Sendkeys(AD.getAddressName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 10), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine1_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 11), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine2_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 12), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine3_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 13), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownState_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownStateValue_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCity_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCityValue_Dropdown(), null);
		Thread.sleep(1000);
			
			
		Liabrary.custom_Sendkeys(AD.getGodownPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 1, 14), null);
		Thread.sleep(1000);
		
		*/
		ObjectRepo.startTestAndLog_1_SS("SA_ADD_SFADistributor_TC40", "Click On Close Button", () -> {
		Liabrary.custom_click(CD.getClose_Btn(), null);});
		Thread.sleep(1000);
		
		
	}
	
	
//	@Test(priority = 1)
//	public void Add_SFA_ClusterChange1() throws Exception {
//		
//		
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
//		DM_ADDSFADistributor AD = PageFactory.initElements(driver, DM_ADDSFADistributor.class);
//		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
//	
//		
////		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
//		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
//		Thread.sleep(1000);
//		   
//			
////		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
//		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
//		Thread.sleep(1000);
//	
//	
//		Liabrary.custom_click(AD.getSFADistributor_Master(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getAdd_btn(), null);
//		Thread.sleep(1000);
//		
//		
////		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
//			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
//			String Actual_Text=UploadText.getText();
//			System.out.println(Actual_Text);
//			String Expected_Text="Add New SFA";
//			Assert.assertEquals(Expected_Text, Actual_Text);
//			Thread.sleep(2000);
//
//	
//		Liabrary.custom_click(AD.getChannelType_Dropdown(), null);
//		Thread.sleep(1000);
//	
//	
//		Liabrary.custom_click(AD.getChannelTypeValue1_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCluster_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClusterValue1_dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getName_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 0), "send Name TextBox");
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClass_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClassValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCategory_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCategoryValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getLocalName_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 1), "send Local Name");
//		Thread.sleep(4000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getContactPersonName_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 2), null);
//		Thread.sleep(1000);
//		
//		
	//	driver.findElement(By.xpath("(//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber'])[1]")).sendKeys("9845721510");
	//	Thread.sleep(1000);
		
		
//		try {
//		Liabrary.custom_Sendkeys(AD.getContactNumber_TextBox(), excel.getNumericdata("HO_Add_SFA", 2, 3), null);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	
//		Thread.sleep(1000);
//		
//		
//		
//		Liabrary.custom_Sendkeys(AD.getEmail_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 4), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getAddress1_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 5), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getAddress2_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 6), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getTxtAddress3_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 7), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getState_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getStateValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCity_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCityValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 2, 8), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getGSTNumber_TextBox(), excel.getStringdata("HO_Add_SFA", 2, 9), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getGSTState_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getGSTStateValue_Dropdown(), null);
//		Thread.sleep(2000);
//		
//		
//		WebElement Ele=driver.findElement(By.xpath("//label[normalize-space()='Shipping Address']"));
//		JavascriptExecutor jse1= (JavascriptExecutor)driver;
//		Thread.sleep(1000);
//		jse1.executeScript("arguments[0].scrollIntoView(true);", Ele);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']")).click();
//		Thread.sleep(1000);
//		
		
		/*
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']"))).build().perform();
		Thread.sleep(1000);
		
		
		try {
		Liabrary.custom_click(AD.getGodawn_Address1(), null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	*/
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddressName1']")).sendKeys("Manaji Nagar");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine1']")).sendKeys("Near Ganpti Mandir");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine2']")).sendKeys("Narhe Gaon");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine3']")).sendKeys("Pune");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_Input']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_DropDown']//ul//li[text()='Maharashtra']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_Input']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_DropDown']//ul//li[text()='Nagpur']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1PinCode']")).sendKeys("411041");
//		Thread.sleep(4000);
//		
		
		/*
		
		Liabrary.custom_Sendkeys(AD.getAddressName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 10), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine1_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 11), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine2_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 12), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine3_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 13), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownState_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownStateValue_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCity_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCityValue_Dropdown(), null);
		Thread.sleep(1000);
			
			
		Liabrary.custom_Sendkeys(AD.getGodownPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 1, 14), null);
		Thread.sleep(1000);
		
		*/
		
//		Liabrary.custom_click(CD.getClose_Btn(), null);
//		Thread.sleep(1000);
//		
		
	
//	}
//	
//	
//	@Test(priority = 2)
//	public void Add_SFA_ClusterChange2() throws Exception {
//		
//		
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
//		DM_ADDSFADistributor AD = PageFactory.initElements(driver, DM_ADDSFADistributor.class);
//		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
//	
////		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
//		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
//		Thread.sleep(1000);
//		   
//			
////		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
//		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
//		Thread.sleep(1000);
//	
//	
//		Liabrary.custom_click(AD.getSFADistributor_Master(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getAdd_btn(), null);
//		Thread.sleep(1000);
//		
//		
////		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
//			WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
//			String Actual_Text=UploadText.getText();
//			System.out.println(Actual_Text);
//			String Expected_Text="Add New SFA";
//			Assert.assertEquals(Expected_Text, Actual_Text);
//			Thread.sleep(2000);
//
//	
//		Liabrary.custom_click(AD.getChannelType_Dropdown(), null);
//		Thread.sleep(1000);
//	
//	
//		Liabrary.custom_click(AD.getChannelTypeValue1_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCluster_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClusterValue2_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getName_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 0), "send Name TextBox");
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClass_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getClassValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCategory_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCategoryValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getLocalName_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 1), "send Local Name");
//		Thread.sleep(4000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getContactPersonName_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 2), null);
//		Thread.sleep(1000);
//		
//		
//	//	driver.findElement(By.xpath("(//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber'])[1]")).sendKeys("9845721510");
//	//	Thread.sleep(1000);
//		
//		
//		try {
//		Liabrary.custom_Sendkeys(AD.getContactNumber_TextBox(), excel.getNumericdata("HO_Add_SFA", 3, 3), null);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	
//		Thread.sleep(1000);
//		
//		
//		
//		Liabrary.custom_Sendkeys(AD.getEmail_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 4), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getAddress1_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 5), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getAddress2_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 6), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getTxtAddress3_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 7), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getState_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getStateValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCity_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getCityValue_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 3, 8), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_Sendkeys(AD.getGSTNumber_TextBox(), excel.getStringdata("HO_Add_SFA", 3, 9), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getGSTState_Dropdown(), null);
//		Thread.sleep(1000);
//		
//		
//		Liabrary.custom_click(AD.getGSTStateValue_Dropdown(), null);
//		Thread.sleep(2000);
//		
//		
//		WebElement Ele=driver.findElement(By.xpath("//label[normalize-space()='Shipping Address']"));
//		JavascriptExecutor jse1= (JavascriptExecutor)driver;
//		Thread.sleep(1000);
//		jse1.executeScript("arguments[0].scrollIntoView(true);", Ele);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']")).click();
//		Thread.sleep(1000);
		
		
		/*
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[@class='btn btn-link btn-block text-left label_default']"))).build().perform();
		Thread.sleep(1000);
		
		
		try {
		Liabrary.custom_click(AD.getGodawn_Address1(), null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	*/
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddressName1']")).sendKeys("Manaji Nagar");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine1']")).sendKeys("Near Ganpti Mandir");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine2']")).sendKeys("Narhe Gaon");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine3']")).sendKeys("Pune");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_Input']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_DropDown']//ul//li[text()='Maharashtra']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_Input']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_DropDown']//ul//li[text()='Nagpur']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtGD1PinCode']")).sendKeys("411041");
//		Thread.sleep(4000);
		
		
		/*
		
		Liabrary.custom_Sendkeys(AD.getAddressName_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 10), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine1_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 11), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine2_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 12), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(AD.getAddressLine3_TextBox(), excel.getStringdata("HO_Add_SFA", 1, 13), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownState_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownStateValue_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCity_Dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AD.getGodownCityValue_Dropdown(), null);
		Thread.sleep(1000);
			
			
		Liabrary.custom_Sendkeys(AD.getGodownPinCode_TextBox(), excel.getNumericdata("HO_Add_SFA", 1, 14), null);
		Thread.sleep(1000);
		
		*/
		
//		Liabrary.custom_click(CD.getClose_Btn(), null);
//		Thread.sleep(1000);
//		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

