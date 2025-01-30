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
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_DistributorApprovl;

public class DistM_DistributorApprovl extends BaseClass{

	
	@Test
	public void Upload_media() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprovl AP = PageFactory.initElements(driver, DM_DistributorApprovl.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
		Thread.sleep(1000);
		   
			
//		ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Distributor Master sub menu.");
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(AP.getDistributor_Approval(), null);
		Thread.sleep(1000);
	
	
//		ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Target Upload Header Text.");
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Approval";
			Assert.assertEquals(Expected_Text, Actual_Text);
			Thread.sleep(2000);
	
	
			Liabrary.custom_click(AP.getDistributor_GridaDataTable(), Expected_Text);
			Thread.sleep(1000);
		
		
			Liabrary.custom_click(AP.getApproval_btn(), Expected_Text);
			Thread.sleep(3000);
			
			
			// show 1 to 10 of 30 (1909 Pages)
		//	 26 items in 3 pages
			
			
			String text =	driver.findElement(By.xpath("//strong[normalize-space()='3']")).getText();
				
			//  Integer.parseInt() ---- convert string into the Integer 
			
				int Total_Pages = Integer.parseInt(text.substring(text.indexOf("n")+1, text.indexOf("P")-1));
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
	
	
		
	
	
	
	
	
	
	
	
	

	
	
	
	
	}
	

