package HO_Portal_Credential;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass;
import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_DistributorApprovl;
import HO_Portal_Main.HO_Distributor_Approval_View_Main;
 
public class HO_Distributor_Approval_View_Test extends BaseClass_HO_Portal{
 
	
	@Test
	public void DistM_DistributorApprov_View() throws Exception {
		HO_Distributor_Approval_View_Main AP = PageFactory.initElements(driver, HO_Distributor_Approval_View_Main.class);
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(AP.getMaster(), "select Master Menu");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(AP.getDistributor_Master(), "select Distributor Master sub menu");
		Thread.sleep(1000);
		
		
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(AP.getDistributor_Approval(), "select Distributor Approval sub menu");
		Thread.sleep(1000);
		
 
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
			
			
			Liabrary.custom_click(AP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(AP.getView_btn(), "Click On view Button");
			Thread.sleep(1000);

			WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
			   JavascriptExecutor jse1= (JavascriptExecutor)driver;
			   jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
			   Thread.sleep(1000);
			   
			   
				Liabrary.custom_click(AP.getDocument_1(), Expected_Text);
				Thread.sleep(1000);

			//ObjectRepo.test.log(Status.INFO, "Test Case 8 :Verify that user should download Document1");	
				Liabrary.custom_click(AP.getDocument_2(), Expected_Text);
				Thread.sleep(1000);

			//ObjectRepo.test.log(Status.INFO, "Test Case 9 :Verify that user should download Document1");		
				Liabrary.custom_click(AP.getDocument_3(), Expected_Text);
				Thread.sleep(1000);

			//ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user is able to click close Button");	
			    Liabrary.custom_click(AP.getClose_btn(),"Click on Close Button");
			    Thread.sleep(1000);	
 
			

			}	

	}