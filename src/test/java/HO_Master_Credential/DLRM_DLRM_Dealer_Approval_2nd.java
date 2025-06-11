package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.DLRM_Dealer_Approval_2nd;

public class DLRM_DLRM_Dealer_Approval_2nd extends BaseClass{

	
	 @Test	
	 public void Dealer_Approval_1st_View_Page () throws Exception{
       HomePage hp = PageFactory.initElements(driver,HomePage.class);
       DLRM_Dealer_Approval_2nd DAA2 = PageFactory.initElements(driver, DLRM_Dealer_Approval_2nd.class);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_Page_TC01", "Click On Master Menu ", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
        });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_Page_TC02", "Click On Outlet Master SubMenu ", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master Submenu");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_Page_TC03", "Click On Retailer Approval 2nd Menu ", () -> {
		Liabrary.custom_click(DAA2.getRetailer_Approval_2nd_Menu(),"Select Retailer Approval 2ND Page");
		});
		Thread.sleep(1000);
		

		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_Page_TC04", "Verify Retailer Approval (2nd) Header Text", () -> {
		WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Approval (2nd) ']"));
		String Actual_Text = Retailer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Retailer Approval (2nd)";
		Assert.assertEquals(Expected_Text, Actual_Text);});







  }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
