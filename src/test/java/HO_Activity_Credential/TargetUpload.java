package HO_Activity_Credential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Activity.ActivityMaster_TargetUpload;

public class TargetUpload extends BaseClass{

	@Test
	public void Target_Upload() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ActivityMaster_TargetUpload TU = PageFactory.initElements(driver, ActivityMaster_TargetUpload.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Activity Master sub menu.");
		Liabrary.custom_click(hp.getActivityMaster_SubMenu(), "select Activity Master sub menu");
		Thread.sleep(1000);
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Target Upload Page.");
		Liabrary.custom_click(TU.getTarget_Upload_Page(), "select Target Upload Page");
		Thread.sleep(1000);
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
		WebElement UploadText=driver.findElement(By.xpath("(//*[normalize-space()='Target Upload'])[4]"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Target Upload";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
		
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be select Download Template button.");
	//	Liabrary.custom_click(TU.getDownload_Template(), "Click on Download Template button");
		Thread.sleep(1000);
		
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be select User Type 1 Dropdown.");
		Liabrary.custom_click(TU.getUserType1_Dropdown(), "select User Type 1 Dropdown");
		Thread.sleep(2000);
		Liabrary.custom_click(TU.getSelectUserType1(), "usertype1");
		Thread.sleep(1000);
/*		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='rcbScroll rcbWidth']/ul)[1]"));
			for(WebElement ele :list)
		{
				if(ele.getText().equals("SE-CR"))
			{
					ele.click();
					break;
			}
		} 
		Thread.sleep(1000);
	*/	
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be select User Type 2 Dropdown.");
		Liabrary.custom_click(TU.getUserTypes2_Dropdown(),  "select User Type 2 Dropdown");
		Thread.sleep(2000);
		Liabrary.custom_click(TU.getSelectUserType2(), "usertype2");
		Thread.sleep(1000);
	/*	List<WebElement> list1 = driver.findElements(By.xpath("(//ul[@class='rcbList'])[1]"));
		for(WebElement ele1 :list1)
		{
			if(ele1.getText().equals("SE-CR"))
			{
				ele1.click();
				break;
			}
		}
		Thread.sleep(1000);
	
		*/
	//	ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be click on Select Month Dropdown.");
			Liabrary.custom_click(TU.getSelectMonth_Dropdown(),  "click on Select Month Dropdown");
			Thread.sleep(1000);
			Liabrary.custom_click(TU.getSelectMonth(), "Month");
			Thread.sleep(1000);
			/*
			List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMonths_DropDown']//ul[@class='rcbList']"));
			for(WebElement ele2 :list2)
			{
				if(ele2.getText().equals("October"))
				{
					ele2.click();
					break;
				}
			}
			Thread.sleep(1000);
		*/
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be click on Select Year Dropdown.");
				Liabrary.custom_click(TU.getSelectYear_Dropdown(),  "click on Select Year Dropdown");
				Thread.sleep(1000);
				Liabrary.custom_click(TU.getSelectYear(), "Year");
				Thread.sleep(1000);
				
				
		/*		List<WebElement> list3 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYears_DropDown']//ul[@class='rcbList']"));
				for(WebElement ele3 :list3)
				{
					if(ele3.getText().equals("2024"))
					{
						ele3.click();
						break;
					}
				}
				Thread.sleep(1000);
		*/
		
	//	ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be select Upload button.");
		Liabrary.custom_click(TU.getUpload_Btn(), "select Upload button");
		Thread.sleep(1000);
		
		/*
		WebElement UploadText1=driver.findElement(By.xpath("//span[@id='ParentMasterContentPlaceHolder1_lblUploadHeaderText']"));
		String Actual_Text1=UploadText1.getText();
		System.out.println(Actual_Text1);
		String Expected_Text1=" Activity Target Upload";
		Assert.assertEquals(Expected_Text1, Actual_Text1);
		Thread.sleep(2000);
		*/
	//	Liabrary.custom_click(TU.getSelectFileToUpload_Btn(), "file to upload");
		Thread.sleep(1000);
	/*
		WebElement element = driver.findElement(By.xpath("//*[@value=' +  Select File to upload']"));
		element.sendKeys("C:\\\\Users\\\\10277\\\\Downloads");
	
		*/
		
		driver.findElement(By.xpath("//*[@value=' +  Select File to upload']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value=' +  Select File to upload']")).sendKeys("C:\\Users\\10277\\Downloads");
		Thread.sleep(1000);
		//Liabrary.custom_click(TU.getUpload_Btn(), "Upload Now");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
