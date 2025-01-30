package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DLRM_Dealer_Approval_2nd;

public class DLRM_DLRM_Dealer_Approval_2nd extends BaseClass{

	
	@Test	
	 public void Dealer_Approval_1st_View_Page () throws Exception{
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
    DLRM_Dealer_Approval_2nd DAA2 = PageFactory.initElements(driver, DLRM_Dealer_Approval_2nd.class);

	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Dealer Master sub menu.")
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master Submenu");
		Thread.sleep(1000);
		

		//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Select Retailer Approval 2nd Page.");	
		Liabrary.custom_click(DAA2.getRetailer_Approval_2nd_Menu(),"Select Retailer Approval 2ND Page");
		Thread.sleep(1000);
		

	  //ObjectRepo.test.log(Status.INFO, "Test Case 4:Verify that Retailer Approval 2nd Header Text.");	
		WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Approval (2nd) ']"));
		String Actual_Text = Retailer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Retailer Approval (2nd)";
		Assert.assertEquals(Expected_Text, Actual_Text);







  }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
