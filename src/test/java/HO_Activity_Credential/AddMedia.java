package HO_Activity_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Activity.Media_Add_Media;
import HO_Activity.Media_UploadMedia;

public class AddMedia extends BaseClass{

	//Data test
	@Test(priority = 0)
	public void Add_Media_Case1() throws Exception {
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Media_UploadMedia UM =PageFactory.initElements(driver, Media_UploadMedia.class);
		Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
//	    ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Media sub menu.");
		Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Upload Media menu.");	
		Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be click on Add btn.");	
		Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
		Thread.sleep(1000);
		
// Case 1 :- Video select
		
		
		Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getType_Dropdown_SelectValue_Video(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getCategory1_Dropdown_SelectValue_Application_Video(), null);
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtLink']")).sendKeys("Ankush");
		Thread.sleep(3000);
		
		
		
		
	}	
		
	
	
	
	
	
	
	
	
		
	@Test(priority = 1)
	public void Add_Media_Case2() throws Exception {
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Media_UploadMedia UM =PageFactory.initElements(driver, Media_UploadMedia.class);
		Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
//	    ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Media sub menu.");
		Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Upload Media menu.");	
		Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be click on Add btn.");	
		Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
		Thread.sleep(1000);
		
// Case 2 :-  Document Select
		
//		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Radupload1file0']")).sendKeys("C:\\Users\\10277\\Desktop\\Arvind CR\\Arvin
		
		Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AM.getType_Dropdown_SelectValue1_Document(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getCategory_Dropdown_Select_New_Product(), null);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_fUpload']")).sendKeys("C:\\Users\\10277\\Downloads");
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority = 2)
	public void Add_Media_Case3() throws Exception {
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Media_UploadMedia UM =PageFactory.initElements(driver, Media_UploadMedia.class);
		Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);	
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
//	    ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Media sub menu.");
		Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Upload Media menu.");	
		Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be click on Add btn.");	
		Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
		Thread.sleep(1000);
		
// Case 2 :-  Banner Select
		
//		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Radupload1file0']")).sendKeys("C:\\Users\\10277\\Desktop\\Arvind CR\\Arvin
		
		Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getType_Dropdown_SelectValue2_Banner(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
		Thread.sleep(1000);
		
	
		Liabrary.custom_click(AM.getCategory_Dropdown_Select_Retailer(), null);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).sendKeys("C:\\Users\\10277\\Pictures");
		Thread.sleep(3000);
		
		
		
	
	}
		
}
