package HO_Activity_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Activity.ActivityMaster_ActivityUpload;
import HO_Activity.ActivityMaster_TargetUpload;

public class ActivityUpload extends BaseClass{

	@Test
	public void Target_Upload() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ActivityMaster_ActivityUpload AU = PageFactory.initElements(driver, ActivityMaster_ActivityUpload.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SUPER_ActivityUpload_TC_01", "Verify that user should be select Activity Menu", () -> {
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		});
		Thread.sleep(1000);
	   
	
		ObjectRepo.startTestAndLog_1_SS("SUPER_ActivityUpload_TC_02", "Verify that user should be select Activity Master sub menu", () -> {
		Liabrary.custom_click(hp.getActivityMaster_SubMenu(), "select Activity Master sub menu");
		});
		Thread.sleep(1000);
			

		ObjectRepo.startTestAndLog_1_SS("SUPER_ActivityUpload_TC_03", "Verify that user should be select Activity Upload Page", () -> {
		Liabrary.custom_click(AU.getActivity_Upload(), "select Activity Upload Page");
		});
		Thread.sleep(1000);
			
	//	ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
		
		WebElement UploadText=driver.findElement(By.xpath("//*[@class=' mt-2 ml-2 text-bold']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Activity Upload";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
	
   
		ObjectRepo.startTestAndLog_1_SS("SUPER_ActivityUpload_TC_04", "Verify that user should be click on User Type1 dropdown", () -> {
		Liabrary.custom_click(AU.getUserType1_Dropdown(), "click User Type1 dropdown");
		});
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be select Value User Type1 dropdown.");	
		ObjectRepo.startTestAndLog_1_SS("SUPER_ActivityUpload_TC_05", "Verify that user should be select Value User Type1 dropdown", () -> {
		Liabrary.custom_click(AU.getSelectUserType1_Dropdown(), "select Value User Type1 dropdown");
		});
		Thread.sleep(1000);
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be select Division1 dropdown.");	
		Liabrary.custom_click(AU.getDivision_Dropdown(), "select Division1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be select Value Division1 dropdown.");	
		Liabrary.custom_click(AU.getSelectDivision_Dropdown(), "select Value Division1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be select Activity For 1 dropdown.");	
		Liabrary.custom_click(AU.getActivityFor1_Dropdown(), "select Activity For 1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be select Value Activity For 1 dropdown.");	
		Liabrary.custom_click(AU.getSelectActivityFor1_Dropdown(), "select Value Activity For 1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 11 : Verify that user should be select Activity Type dropdown.");	
		Liabrary.custom_click(AU.getActivityType_Dropdown(), "select Activity Type dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be select Value Activity Type dropdown.");
		Liabrary.custom_click(AU.getSelectActivityType_Dropdown(), "select Value Activity Type dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 13 : Verify that user should be select month1 dropdown.");	
		Liabrary.custom_click(AU.getSelectMonth1_Dropdown(), "select month1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 14 : Verify that user should be select month1 dropdown.");
		Liabrary.custom_click(AU.getSelectValueMonth1_Dropdown(), "select value month1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 15 : Verify that user should be select year1 dropdown.");		
		Liabrary.custom_click(AU.getSelectYear1_Dropdown(), "select year1 dropdown");
		Thread.sleep(1000);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 16 : Verify that user should be select value year1 dropdown.");
		Liabrary.custom_click(AU.getSelectValueYear1_Dropdown(), "select value year1 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select User Type2 dropdown.");	
		Liabrary.custom_click(AU.getUserType2_Dropdown(), "select User Type2 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 18 : Verify that user should be select User Type2 dropdown.");	
		Liabrary.custom_click(AU.getSelectUserType2_Dropdown(), "select User Type2 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 19 : Verify that user should be select Activity For 2 dropdown.");	
		Liabrary.custom_click(AU.getActivityFor2_Dropdown(), "select Activity For 2 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 20 : Verify that user should be select Activity For 2 dropdown.");	
		Liabrary.custom_click(AU.getSelectActivityFor2_Dropdown(), "select value Activity For 2 dropdown");
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 21 : Verify that user should be select month 2 dropdown.");	
		Liabrary.custom_click(AU.getSelectMonth2_Dropdown(), "select month 2 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 22 : Verify that user should be select month 2 dropdown.");		
		Liabrary.custom_click(AU.getSelectValueMonth2_Dropdown(), "select value month 2 dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 23 : Verify that user should be select Year 2 dropdown.");	
		Liabrary.custom_click(AU.getSelectYear2_Dropdown(), "select Year 2 dropdown");
		Thread.sleep(1000);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 24 : Verify that user should be select value Year 2 dropdown.");
		Liabrary.custom_click(AU.getSelectValueYear2_Dropdown(), "select value Year 2 dropdown");
		Thread.sleep(1000);
		
	
	
	
	
	
	
	
	
	
		
	
	
		}	
	
	
}
