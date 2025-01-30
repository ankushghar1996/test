package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DLRM_Dealer_Master;
import HO_Master.DLRM_Dealer_Master_Upload_Retailer_Page;

public class DLRM_DLRM_Dealer_Master_Upload_Retailer_Page extends BaseClass{

	
	@Test
	public void Dealer_Master_Upload_Retailer_Page() throws Exception{
      HomePage hp = PageFactory.initElements(driver,HomePage.class);
      DLRM_Dealer_Master_Upload_Retailer_Page DM3 = PageFactory.initElements(driver,DLRM_Dealer_Master_Upload_Retailer_Page.class);
      DLRM_Dealer_Master DM1 = PageFactory.initElements(driver,DLRM_Dealer_Master.class);		
      Common_Data CD = PageFactory.initElements(driver,Common_Data.class);
      
      
    //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
  	Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
  	Thread.sleep(1000);
  	
  	
      //ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Dealer Master SUB Menu.");		
  	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master SubMenu");		
  	Thread.sleep(1000);
  	
  	
  	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Dealer Master Menu.");
  	Liabrary.custom_click(DM1.getDealer_Master_Menu(),"Select Dealer Master Menu Page");	
  	Thread.sleep(1000);		
  	
  	
	//ObjectRepo.test.log(Status.INFO,"Test Case 4: Verify that user should be click on Upload Button.");	
	Liabrary.custom_click(CD.getUpload_Btn(),"Click On Upload Button");
	Thread.sleep(1000);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 5 :Verify that Upload Retailer Header Text.");		
	WebElement Upload_Retailer_Header_Text = driver.findElement(By.xpath("//*[text()='Upload Retailer']"));	
	String Actual_Text1 = Upload_Retailer_Header_Text.getText();	
	System.out.println(Actual_Text1);	
	String Expected_Text= "Upload Retailer";	
	Assert.assertEquals(Expected_Text,Actual_Text1);
	
	
  //ObjectRepo.test.log(Status.INFO,"Test Case 6: Verify That user Should click on Download Template.");
	Liabrary.custom_click(DM3.getDownload_template_button(), "Click on Download Template button");	
	Thread.sleep(1000);
	
	
/*	
  //ObjectRepo.test.log(Status.INFO,"Test Case 7: Verify That user Should click on Select File To Upload button.");
	Liabrary.custom_click(DM3.getSelect_File_To_Upload_Button(),"Click on Select File To Upload Button");
	Thread.sleep(1000);
	*/
	
	
	 //ObjectRepo.test.log(Status.INFO,"Test Case 8: Verify That user Should click on Upload Now Button.");
		Liabrary.custom_click(DM3.getUpload_Now_Button(), "Click On Upload Now Button");
		Thread.sleep(1000);
 
	
	WebElement Upload_Error_MSG = driver.findElement(By.xpath("//*[text()='Please select a file to upload.']"));
	String Actual_Text2 = Upload_Error_MSG.getText();
	System.out.println(Actual_Text2);
	String Expected_Text2 = "Please select a file to upload.";
	Assert.assertEquals(Expected_Text2,Actual_Text2);

	
  //ObjectRepo.test.log(Status.INFO,"Test Case 6: Verify That user Should click on Close Button.");
	Liabrary.custom_click(CD.getClose_Btn(),"Click On Close Button");
	Thread.sleep(1000);


	}
	
	
	
	
	
	
	
	
	
	
}
