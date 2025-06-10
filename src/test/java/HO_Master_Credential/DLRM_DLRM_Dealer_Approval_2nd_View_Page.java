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
import Com_Utility.ObjectRepo;
import HO_Master.DLRM_Dealer_Approval_2nd;
import HO_Master.DLRM_Dealer_Approval_2nd_View_Page;

public class DLRM_DLRM_Dealer_Approval_2nd_View_Page extends BaseClass{

	
	
	@Test
	public void Dealer_Approval_2nd_View_Page () throws Exception{
	    HomePage hp = PageFactory.initElements(driver,HomePage.class);
	    DLRM_Dealer_Approval_2nd_View_Page DAA2 = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_View_Page.class);
		DLRM_Dealer_Approval_2nd DAA1 = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd.class);
		Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
		
		
		   ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC01", "Click On Master Menu ", () -> {		
		    Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");
		    });
			Thread.sleep(1000);
			
			
		  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC02", "Click On Outlet Master SubMenu", () -> {
			Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master SubMenu");
		   });
			Thread.sleep(1000);
	 
			
	        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC03", "Click On Retailer Approval 2nd Menu", () -> {
			Liabrary.custom_click(DAA1.getRetailer_Approval_2nd_Menu(),"Retailer Approval 2nd Page");
	         });
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC04", "Click On Dealer Name 2nd Grid Value", () -> {	
		    Liabrary.custom_click(DAA2.getDealer_Name_2nd_Grid_Value()," Grid Data From Table");
			});
		    Thread.sleep(1000);
		    
		    
		    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC05", "Click On View Button", () -> {
		    Liabrary.custom_click(DAA2.getDealer_Approval_2nd_View_Page(),"Click on View Button");
		    });
		    Thread.sleep(1000);		
		    
		    
		    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC06", "Verify Retailer Details Header Text", () -> {
			WebElement Retailer_Details = driver.findElement(By.xpath("//*[text()='Retailer Details']"));
			String Actual_Text = Retailer_Details.getText();
			System.out.println(Actual_Text);
			String Expected_Text = "Retailer Details";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			
			
			 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		   ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC07", "Click On Document 1 Button", () -> {
			Liabrary.custom_click(DAA2.getDocument_1(), null);
		    });
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC08", "Click On Document 2 Button", () -> {
			Liabrary.custom_click(DAA2.getDocument_2(), null);
			});
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC09", "Click On Document 3 Button", () -> {		
			Liabrary.custom_click(DAA2.getDocument_3(), null);
			});
			Thread.sleep(1000);
			
			
			ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2ndView_Page_TC10", "Click On Close Button", () -> {
		    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
			});
		    Thread.sleep(1000);	


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
