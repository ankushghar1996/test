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
import HO_Activity.Media_UploadMedia;
import HO_Activity.NotificationMaster_NotificationSetting;

public class NotificationSetting extends BaseClass{

	
	@Test
	public void Notification_setting() throws Exception {
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
			
	//	ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Notification Master sub menu.");
		Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
		Thread.sleep(1000);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be click Notification Setting menu.");
		Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be select Notification Setting Page.");
		WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Notification Settings";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
		

//		ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be select Notification Type dropdown.");	
		Liabrary.custom_click(NS.getType_Dropdown(), "select Notification Type dropdown");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be select Value Notification Type dropdown.");		
		Liabrary.custom_click(NS.getSelectValueType_Dropdown(), "select Value Notification Type dropdown");
		Thread.sleep(1000);
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be click on View btn.")	
		Liabrary.custom_click(NS.getViewBtn(), "click on View btn");
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
