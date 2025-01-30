package HO_Activity_Credential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Activity.NotificationMaster_AddNotification;
import HO_Activity.NotificationMaster_NotificationSetting;

public class AddNotification extends BaseClass{

	@Test
	public void Notification_setting() throws Exception {
	
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
		NotificationMaster_AddNotification AN = PageFactory.initElements(driver, NotificationMaster_AddNotification.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
			
//  	ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Notification Master sub menu.");
		Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be click Notification Setting menu.");
		Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be click Add btn.");
		Liabrary.custom_click(CD.getAdd_Btn(), "select Add btn");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be select Add New Notification Setting Page.");
		WebElement UploadText=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Add New Notification";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
		

//		ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be click on the Notification dropdown.");	
		Liabrary.custom_click(AN.getTypeOfNotification_Dropdown(), "select Notification Type dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be select value on Notification dropdown.");	
		Liabrary.custom_click(AN.getSelectValue_TypeOfNotification_Dropdown(), "select value on Notification dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be click on User dropdown.");
		Liabrary.custom_click(AN.getUser_Dropdown(), "click on User dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be select value on User dropdown.");
		Liabrary.custom_click(AN.getSelectValue_User_CheckBox(), "select value on User dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be click on Division dropdown.");
		Liabrary.custom_click(AN.getDivision_Dropdown(), "click on User dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 11 : Verify that user should be select value on Division CheckBox.");
		Liabrary.custom_click(AN.getSelectValue_Division_CheckBox(), "select value on Division CheckBox");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 12 : Verify that user should be click on ClusterType dropdown.");
		Liabrary.custom_click(AN.getClusterType_Dropdown(), "click on ClusterType dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 13 : Verify that user should be select value on ClusterType dropdown.");	
		Liabrary.custom_click(AN.getSelectValue_ClusterType_Dropdown(), "select value on ClusterType dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 14 : Verify that user should be click on Cluster dropdown.");
		Liabrary.custom_click(AN.getCluster_Dropdown(), "click on Cluster dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 15 : Verify that user should be select value on Cluster dropdown.");
		Liabrary.custom_click(AN.getSelectValue_Cluster_Dropdown(), "select value on Cluster dropdown");
		Thread.sleep(1000);
	
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 16 : Verify that user should be select text on Notification Titile TextBox.");	
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtNotificationTile']")).sendKeys("Ankush");
		Thread.sleep(1000);
	

	
//		ObjectRepo.test.log(Status.INFO, "Test Case 17 : Verify that user should be select date on Calender.");	
		String month= "November 2024";
	    String date = "20";
	    
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_popupButton']")).click();
	    
		while(true)
		{
		String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_Title']")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
		}
		Thread.sleep(1000);	
		}

	
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar']//table//tbody//tr//td//a[text()='20']"));
		
		for(WebElement element : ele) {
			
			String date1 = element.getText();
			
			if(date1.equals(date)) {
			
				element.click();
				
				break;
				
		}
		
		}
	
		Thread.sleep(2000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 18 : Verify that user should be select on Sent Time textbox.");	
		Liabrary.custom_click(AN.getSent_Time(), date);
		Thread.sleep(1000);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 19 : Verify that user should be select on Sent Time textbox.");	
		
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("05:30");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("AM");
		Thread.sleep(2000);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 20 : Verify that user should be select text on Notification TextBox.");	
		driver.findElement(By.xpath("//textarea[@id='ParentMasterContentPlaceHolder1_txtNotification']")).sendKeys("Ankush");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']"));
		element.sendKeys("C:\\Users\\10277\\Pictures");
		Thread.sleep(2000);
	
	
	
		Liabrary.custom_click(AN.getRecurrence_Pattern_Checkbox(), date);
		Thread.sleep(3000);
	
	//	Liabrary.custom_click(AN.getSent_Notification_Btn(), date);
		Thread.sleep(1000);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
