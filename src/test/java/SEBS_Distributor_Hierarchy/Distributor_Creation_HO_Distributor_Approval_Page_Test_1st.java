package SEBS_Distributor_Hierarchy;
 
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
import Com_Utility.ObjectRepo;
import HO_Master.DM_ADDSFADistributor;
import HO_Master.DM_DistributorApprovl;
import HO_Portal_Main.HO_Distributor_Approval_Page_Main;
import HO_Portal_Main.HO_Distributor_Approval_View_Main;
 
public class Distributor_Creation_HO_Distributor_Approval_Page_Test_1st extends BaseClass_HO_Portal{
	
	@Test
	public void DistM_DistributorApprov() throws Exception {
		
		ObjectRepo.driver = driver;
		
		HO_Distributor_Approval_Page_Main APP = PageFactory.initElements(driver, HO_Distributor_Approval_Page_Main.class);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_01", "Verify that user should be click on HO_Portal Master menu.", () -> {
		Liabrary.custom_click(APP.getMaster(), "select Master Menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_02", "Verify that user should click on HO_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Master(), "select Distributor Master sub menu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_03", "Verify that user should click on HO_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Approval(), "select Distributor Approval sub menu");
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_04", "Verify that user should see Distributor Approval header text.", () -> {
		    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
		    String Actual_Text = UploadText.getText();
		    System.out.println(Actual_Text);
		    String Expected_Text = "Distributor Approval";
		    Assert.assertEquals(Expected_Text, Actual_Text);
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_05", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_06", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(APP.getApproval_btn(), "click on Distributor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_07", "Verify that user should click on ProceedFor Approval button.", () -> {
		    Liabrary.custom_click(APP.getProceedForApproval_btn(), "click on ProceedFor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_08", "Verify that user should click on Yes button.", () -> {
		    Liabrary.custom_click(APP.getYes_btn(), "click on Yes button");
		});
			Thread.sleep(1000);
			
			
	//		Liabrary.custom_click(APP.getNo_btn(), null);
		//	Thread.sleep(1000);
				
			 
			    


			}	
	
	@Test(priority=1)
	public void DistM_DistributorApprov_NS1() throws Exception {
		
		ObjectRepo.driver = driver;
		
		HO_Distributor_Approval_Page_Main APP = PageFactory.initElements(driver, HO_Distributor_Approval_Page_Main.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without select Distributor Approval sub menu");
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_01", "Verify that user should be click on HO_Portal Master menu.", () -> {
		Liabrary.custom_click(APP.getMaster(), "select Master Menu");
		});
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_02", "Verify that user should click on HO_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Master(), "select Distributor Master sub menu");
		});
		Thread.sleep(1000);
		

//		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_03", "Verify that user should click on HO_Portal Distributor Approval menu.", () -> {
//		    Liabrary.custom_click(APP.getDistributor_Approval(), "select Distributor Approval sub menu");
//		});
//		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_04", "Verify that user should see Distributor Approval header text.", () -> {
		    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
		    String Actual_Text = UploadText.getText();
		    System.out.println(Actual_Text);
		    String Expected_Text = "Distributor Approval";
		    Assert.assertEquals(Expected_Text, Actual_Text);
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_05", "Verify that user should select Distributor Approval grid row.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_06", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(APP.getApproval_btn(), "click on Distributor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_07", "Verify that user should click on ProceedFor Approval button.", () -> {
		    Liabrary.custom_click(APP.getProceedForApproval_btn(), "click on ProceedFor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_08", "Verify that user should click on Yes button.", () -> {
		    Liabrary.custom_click(APP.getYes_btn(), "click on Yes button");
		});
			Thread.sleep(1000);
			
			
	//		Liabrary.custom_click(APP.getNo_btn(), null);
		//	Thread.sleep(1000);
				
			 
			    


			}	
	
	@Test(priority=2)
	public void DistM_DistributorApprov_NS2() throws Exception {
		
		ObjectRepo.driver = driver;
		
		HO_Distributor_Approval_Page_Main APP = PageFactory.initElements(driver, HO_Distributor_Approval_Page_Main.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without Select Distributor Approval Grid Page");
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_01", "Verify that user should be click on HO_Portal Master menu.", () -> {
		Liabrary.custom_click(APP.getMaster(), "select Master Menu");
		});
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_02", "Verify that user should click on HO_Portal Distributor Master menu.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Master(), "select Distributor Master sub menu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_03", "Verify that user should click on HO_Portal Distributor Approval menu.", () -> {
		    Liabrary.custom_click(APP.getDistributor_Approval(), "select Distributor Approval sub menu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_04", "Verify that user should see Distributor Approval header text.", () -> {
		    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Approval']"));
		    String Actual_Text = UploadText.getText();
		    System.out.println(Actual_Text);
		    String Expected_Text = "Distributor Approval";
		    Assert.assertEquals(Expected_Text, Actual_Text);
		});
		Thread.sleep(1000);
		

//		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_05", "Verify that user should select Distributor Approval grid row.", () -> {
//		    Liabrary.custom_click(APP.getDistributor_Approval_Grid_Page(), "Select Distributor Approval Grid Page");
//		});
//		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_06", "Verify that user should click on Distributor Approval button.", () -> {
		    Liabrary.custom_click(APP.getApproval_btn(), "click on Distributor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_07", "Verify that user should click on ProceedFor Approval button.", () -> {
		    Liabrary.custom_click(APP.getProceedForApproval_btn(), "click on ProceedFor Approval button");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SEBS_DistCreation_HO_Initial_Approval_Test_08", "Verify that user should click on Yes button.", () -> {
		    Liabrary.custom_click(APP.getYes_btn(), "click on Yes button");
		});
			Thread.sleep(1000);
			
			
	//		Liabrary.custom_click(APP.getNo_btn(), null);
		//	Thread.sleep(1000);


			}	

 
	

	}