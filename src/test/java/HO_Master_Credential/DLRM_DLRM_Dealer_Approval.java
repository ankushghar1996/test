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
import HO_Master.DLRM_Dealer_Approval;

public class DLRM_DLRM_Dealer_Approval extends BaseClass{

	
	@Test
	public void DLRM_Dealer_Approval() throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);  
	DLRM_Dealer_Approval DA  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class );	

	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Dealer Master sub menu.")
	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master Submenu");
	Thread.sleep(1000);
 
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Dealer Approval Page.");	
	Liabrary.custom_click(DA.getDealer_Approval_Menu(),"Select Dealer Approval Page");
	Thread.sleep(1000);
	
	
	// 
	
		//ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Dealer Approval Header Text.");
		WebElement View_Dealer_Approval_Header_TXT = driver.findElement(By.xpath("//h4[text()='Outlet Approval']"));
		String Actual_Text = View_Dealer_Approval_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Outlet Approval";
		Assert.assertEquals(Expected_Text,Actual_Text);
		Thread.sleep(1000);

		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
