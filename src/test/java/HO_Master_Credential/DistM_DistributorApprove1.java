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
import Com_Utility.ObjectRepo;
import HO_Activity.Media_UploadMedia;
import HO_Master.DM_DistributorApprove1;

public class DistM_DistributorApprove1 extends BaseClass{

	@Test(priority=0)
	public void DistributorApprove1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprove1 DA = PageFactory.initElements(driver, DM_DistributorApprove1.class);;
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC02", "Click On Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC03", "Click On Distributor Approval", () -> {
		Liabrary.custom_click(DA.getDistributor_Approval(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC04", "Verify Distributor Approval (1st)Header Text", () -> {
		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval (1st)']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Distributor Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text);});
		Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC05", "Click On View Button", () -> {
		Liabrary.custom_click(CD.getView_Btn(), null);});
		Thread.sleep(1000);
		
		
		// show 1 to 10 of 30 (1909 Pages)
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC06 to TC11", "Pagination Steps", () -> {
		String text = driver.findElement(By.xpath("//div[Contains(text(),'Pages')]")).getText();
			
		//  Integer.parseInt() ---- convert string into the Integer 
		
			int Total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("P")-1));
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
		});
		
		}
		
	@Test(priority=1)
	public void DistributorApprove1_NS01() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprove1 DA = PageFactory.initElements(driver, DM_DistributorApprove1.class);;
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		
		ObjectRepo.startTestAndLog_1_NS("Without Click On Distributor Approval");
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC02", "Click On Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC03", "Click On Distributor Approval", () -> {
//		Liabrary.custom_click(DA.getDistributor_Approval(), null);});
//		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC04", "Verify Distributor Approval (1st)Header Text", () -> {
		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval (1st)']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Distributor Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text);});
		Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC05", "Click On View Button", () -> {
		Liabrary.custom_click(CD.getView_Btn(), null);});
		Thread.sleep(1000);
		
		
		// show 1 to 10 of 30 (1909 Pages)
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC06 to TC11", "Pagination Steps", () -> {
		String text = driver.findElement(By.xpath("//div[Contains(text(),'Pages')]")).getText();
			
		//  Integer.parseInt() ---- convert string into the Integer 
		
			int Total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("P")-1));
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
		});
		
	}
	@Test(priority=2)
	public void DistributorApprove1_NS02() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorApprove1 DA = PageFactory.initElements(driver, DM_DistributorApprove1.class);;
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Click On Distributor Approval");
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC02", "Click On Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "Distributor Master sub menu");});
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC03", "Click On Distributor Approval", () -> {
//		Liabrary.custom_click(DA.getDistributor_Approval(), null);});
//		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC04", "Verify Distributor Approval (1st)Header Text", () -> {
		WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval (1st)']"));
		String Actual_Text=UploadText.getText();
		System.out.println(Actual_Text);
		String Expected_Text="Distributor Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text);});
		Thread.sleep(2000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC05", "Click On View Button", () -> {
		Liabrary.custom_click(CD.getView_Btn(), null);});
		Thread.sleep(1000);
		
		
		// show 1 to 10 of 30 (1909 Pages)
		ObjectRepo.startTestAndLog_1_SS("SA_DistributorApprove1_TC06 to TC11", "Pagination Steps", () -> {
		String text = driver.findElement(By.xpath("//div[Contains(text(),'Pages')]")).getText();
			
		//  Integer.parseInt() ---- convert string into the Integer 
		
			int Total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("P")-1));
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
		});
		
		
		
	
	
	
	}
	
}
