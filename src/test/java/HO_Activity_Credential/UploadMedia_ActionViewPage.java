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

public class UploadMedia_ActionViewPage extends BaseClass{

	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Media_UploadMedia UM =PageFactory.initElements(driver, Media_UploadMedia.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Activity Menu.");
		Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		Thread.sleep(1000);
		   
			
	//	ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Media sub menu.");
		Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Upload Media menu.");	
		Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
		WebElement UploadText=driver.findElement(By.xpath("(//*[normalize-space()='Media Upload'])[5]"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Media Upload";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(2000);
		
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be select Media Upload Header.");		
	//	Liabrary.custom_click(UM.getMediaUpload_Header(), "select Media Upload Header");
		Thread.sleep(1000);
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be select Media Type dropdown.");		
		Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
		Thread.sleep(1000);               
		                   
		
		Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
		Thread.sleep(1000);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be click on View btn.");	
		Liabrary.custom_click(UM.getView_Btn(), "click on View btn");
		Thread.sleep(2000);                     
	
	
		
		Liabrary.custom_click(UM.getActionView_Icon(), null);
		Thread.sleep(4000);
	
	
//	ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
		WebElement UploadText1=driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
		String Actual_Text1=UploadText1.getText();
		System.out.println(Actual_Text1);
		String Expected_Text1="Media Upload";
		Assert.assertEquals(Expected_Text1, Actual_Text1);
		Thread.sleep(2000);
	
	
	Liabrary.custom_click(UM.getClose_Btn(), Expected_Text1);
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
