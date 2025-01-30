package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DLRM_Dealer_Approval;
import HO_Master.DLRM_Dealer_ApprovalView_Page;

public class DLRM_DLRM_Dealer_ApprovalView_Page extends BaseClass{

	
	@Test
	public void Dealer_Approval_View()throws Exception {
	HomePage hp = PageFactory.initElements(driver,HomePage.class);
	DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalView_Page.class);
	DLRM_Dealer_Approval DA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Dealer Master sub menu.")
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master Submenu");
		Thread.sleep(1000);
 
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Dealer Approval Page.");	
		Liabrary.custom_click(DA1.getDealer_Approval_Menu(),"Select Dealer Approval Page");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify that user should be Select Grid Data From Table");	
	    Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(),"Select Grid Data From Table");
	    Thread.sleep(1000);
	    
	    
    //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user is able to click View Button");	
	    Liabrary.custom_click(DA2.getDealer_Details_View_Page(),"Click on View Button");
	    Thread.sleep(1000);	
	    
	    
	//ObjectRepo.test.log(Status.INFO, "Test Case 6 :Verify that Dealer Details Header Text.");	
		WebElement Dealer_Details = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
		String Actual_Text = Dealer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Outlet Details";
		
		
		Assert.assertEquals(Expected_Text, Actual_Text);
	   WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
	   JavascriptExecutor jse1= (JavascriptExecutor)driver;
	   jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	   Thread.sleep(1000);
	   
	   
	//ObjectRepo.test.log(Status.INFO, "Test Case 7 :Verify that user should download Document1");	
		Liabrary.custom_click(DA2.getDocument_1(), Expected_Text);
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 8 :Verify that user should download Document1");	
		Liabrary.custom_click(DA2.getDocument_2(), Expected_Text);
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 9 :Verify that user should download Document1");		
		Liabrary.custom_click(DA2.getDocument_3(), Expected_Text);
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user is able to click close Button");	
	    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
	    Thread.sleep(1000);	


	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
