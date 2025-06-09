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
import HO_Master.DLRM_Dealer_Approval_1st;
import HO_Master.DLRM_Dealer_Approval_1st_Approval_Page;
import HO_Master.DLRM_Dealer_Approval_1st_View_Page;

public class DLRM_DLRM_Dealer_Approval_1st_Approval_Page extends BaseClass{

	
	@Test
	public void Dealer_ApprovalBTN() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_Approval_1st_Approval_Page DAA3 = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st_Approval_Page.class);	
	DLRM_Dealer_Approval_1st_View_Page DAA2 = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st_View_Page.class);
	DLRM_Dealer_Approval_1st DAA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval_1st.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

    
        ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC02", "Click on Outlet Master SubMenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master Submenu");
		});
		Thread.sleep(1000);
 
		
		ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC03", "Click on Dealer_Approval_1st_Menu", () -> {
		Liabrary.custom_click(DAA1.getDealer_Approval_1st_Menu(),"Dealer Approval 1st Page");
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC04", "Click on Dealer Name Grid Value", () -> {
	    Liabrary.custom_click(DAA2.getDealer_Name_Grid_Value(),"Grid Data From Table");
		});
	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC05", "Click on Approve Button", () -> {	
	    Liabrary.custom_click(CD.getApproval_Btn(),"Click on Approve Button");	
	    });
	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC06", "Verify Retailer Details Header Text", () -> {	
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//*[text()='Retailer Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text = "Retailer Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);});

	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		  ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC07", "Click on Document 1 Download Button", () -> {	
	  		Liabrary.custom_click(DAA3.getDocument_1(),"Click Document1 download button ");
		  });
	  		Thread.sleep(1000);
	  		
	  		
	  	  ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC08", "Click on Document 2 Download Button", () -> {		
	  		Liabrary.custom_click(DAA3.getDocument_2(),"Document2 download button ");
	  	  });
	  		Thread.sleep(1000);
	  		
	  		
	  	  ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC09", "Click on Document 3 Download Button", () -> {		
	  		Liabrary.custom_click(DAA3.getDocument_3()," Document3 download button ");
	  	  });
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_Dealer_Approval_1st_TC10", "Click on Close Button", () -> {			
		    Liabrary.custom_click(CD.getClose_Btn(),"Close Button");
	  		}); 
		    Thread.sleep(1000);



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
