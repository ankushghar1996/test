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
import HO_Master.DLRM_Dealer_Approval_1st;

public class DLRM_DLRM_Dealer_Approval_1st extends BaseClass{

	@Test(priority=0)
	 public void Dealer_Approval_1st_View_Page () throws Exception{
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
    DLRM_Dealer_Approval_1st DAA1 = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st.class);

    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
    });
		Thread.sleep(1000);
		
		
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC02", "Click on Outlet Master SubMenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
	});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC03", "Click on Dealer Approval 1st Menu", () -> {	
		Liabrary.custom_click(DAA1.getDealer_Approval_1st_Menu(),"Dealer Approval 1st Page");
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC04", "Verify Retailer Approval (1st) Header Text", () -> {	
		WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Approval (1st) ']"));
		String Actual_Text = Retailer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Retailer Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text); 
		});

  }	


	@Test(priority=1)
	 public void Dealer_Approval_1st_View_Page_NS1 () throws Exception{
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
    DLRM_Dealer_Approval_1st DAA1 = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st.class);

     ObjectRepo.startTestAndLog_1_NS("Without Click Dealer Approval 1st page");
    
    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
    });
		Thread.sleep(1000);
		
		
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC02", "Click on Outlet Master SubMenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
	});
		Thread.sleep(1000);
		
		
//		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC03", "Click on Dealer Approval 1st Menu", () -> {	
//		Liabrary.custom_click(DAA1.getDealer_Approval_1st_Menu(),"Dealer Approval 1st Page");
//		});
//		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC04", "Verify Retailer Approval (1st) Header Text", () -> {	
		WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Approval (1st) ']"));
		String Actual_Text = Retailer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Retailer Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text); 
		});
		
		
			
		

  }
	
	@Test(priority=2)
	 public void Dealer_Approval_1st_View_Page_NS2 () throws Exception{
   HomePage hp = PageFactory.initElements(driver,HomePage.class);
   DLRM_Dealer_Approval_1st DAA1 = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st.class);

   ObjectRepo.startTestAndLog_1_NS("Without Click Dealer Master Submenu");   
   
   ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
   });
		Thread.sleep(1000);
		
		
//	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC02", "Click on Outlet Master SubMenu", () -> {
//		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
//	});
//		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC03", "Click on Dealer Approval 1st Menu", () -> {	
		Liabrary.custom_click(DAA1.getDealer_Approval_1st_Menu(),"Dealer Approval 1st Page");
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_1st_TC04", "Verify Retailer Approval (1st) Header Text", () -> {	
		WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Approval (1st) ']"));
		String Actual_Text = Retailer_Details.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Retailer Approval (1st)";
		Assert.assertEquals(Expected_Text, Actual_Text); 
		});
		
		
			
		

 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
