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
import HO_Master.DLRM_Dealer_Approval_2nd_Approval_Page;
import HO_Master.DLRM_Dealer_Approval_2nd_View_Page;

public class DLRM_DLRM_Dealer_Approval_2nd_Approval_Page extends BaseClass{

	
	@Test(priority=0)
	public void Dealer_ApprovalBTN() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_Approval_2nd_Approval_Page DAA3 = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_Approval_Page.class);	
	DLRM_Dealer_Approval_2nd_View_Page DAA2= PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_View_Page.class);
	DLRM_Dealer_Approval_2nd DAA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
        });
		Thread.sleep(1000);
		
		
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC02", "Click on Dealer Master Submenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
	    });
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC03", "Click on Dealer Approval 2nd Page", () -> {
		Liabrary.custom_click(DAA1.getRetailer_Approval_2nd_Menu(),"Dealer Approval 2nd Page");
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC04", "Click on Grid Data From Table", () -> {	
	    Liabrary.custom_click(DAA2.getDealer_Name_2nd_Grid_Value(),"Grid Data From Table");
		});
	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC05", "Click on Approval Button", () -> {
	    Liabrary.custom_click(CD.getApproval_Btn(),"Approve Button");	
	    });
	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC06", "Verify Retailer Details Header Text", () -> {
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//*[text()='Retailer Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text = "Retailer Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);
	    });
	    Thread.sleep(1000);
	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC07", "Click On Document_1 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_1(),"Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	      ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC08", "Click On Document_2 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_2(),"Document 2 download button ");
	      });
	  		Thread.sleep(1000);
	  		
	  		
	  	  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC09", "Click On Document_1 Button ", () -> {		
	  		Liabrary.custom_click(DAA3.getDocument_3(),"Document 3 download button ");
	  	  });
	  		Thread.sleep(1000);
	  		
	  		
	  	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC10", "Click On Close Button ", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Close Button");
	  	});
		    Thread.sleep(1000);



	}
	
	@Test(priority=1)
	public void Dealer_ApprovalBTN_NS01() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_Approval_2nd_Approval_Page DAA3 = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_Approval_Page.class);	
	DLRM_Dealer_Approval_2nd_View_Page DAA2= PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_View_Page.class);
	DLRM_Dealer_Approval_2nd DAA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

        ObjectRepo.startTestAndLog_1_NS("Without click on Approve button");
    
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
        });
		Thread.sleep(1000);
		
		
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC02", "Click on Dealer Master Submenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
	    });
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC03", "Click on Dealer Approval 2nd Page", () -> {
		Liabrary.custom_click(DAA1.getRetailer_Approval_2nd_Menu(),"Dealer Approval 2nd Page");
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC04", "Click on Grid Data From Table", () -> {	
	    Liabrary.custom_click(DAA2.getDealer_Name_2nd_Grid_Value(),"Grid Data From Table");
		});
	    Thread.sleep(1000);
	    
	    
//	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC05", "Click on Approval Button", () -> {
//	    Liabrary.custom_click(CD.getApproval_Btn(),"Approve Button");	
//	    });
//	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC06", "Verify Retailer Details Header Text", () -> {
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//*[text()='Retailer Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text = "Retailer Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);
	    });
	    Thread.sleep(1000);
	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC07", "Click On Document_1 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_1(),"Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	      ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC08", "Click On Document_2 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_2(),"Document 2 download button ");
	      });
	  		Thread.sleep(1000);
	  		
	  		
	  	  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC09", "Click On Document_1 Button ", () -> {		
	  		Liabrary.custom_click(DAA3.getDocument_3(),"Document 3 download button ");
	  	  });
	  		Thread.sleep(1000);
	  		
	  		
	  	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC10", "Click On Close Button ", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Close Button");
	  	});
		    Thread.sleep(1000);



	}
	
	@Test(priority=2)
	public void Dealer_ApprovalBTN_NS02() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_Approval_2nd_Approval_Page DAA3 = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_Approval_Page.class);	
	DLRM_Dealer_Approval_2nd_View_Page DAA2= PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd_View_Page.class);
	DLRM_Dealer_Approval_2nd DAA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval_2nd.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
    
        ObjectRepo.startTestAndLog_1_NS("Without Select Grid data From Table");

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC01", "Click on Master Menu", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
        });
		Thread.sleep(1000);
		
		
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC02", "Click on Dealer Master Submenu", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Dealer Master Submenu");
	    });
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC03", "Click on Dealer Approval 2nd Page", () -> {
		Liabrary.custom_click(DAA1.getRetailer_Approval_2nd_Menu(),"Dealer Approval 2nd Page");
		});
		Thread.sleep(1000);	
		
		
//		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC04", "Click on Grid Data From Table", () -> {	
//	    Liabrary.custom_click(DAA2.getDealer_Name_2nd_Grid_Value(),"Grid Data From Table");
//		});
//	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC05", "Click on Approval Button", () -> {
	    Liabrary.custom_click(CD.getApproval_Btn(),"Approve Button");	
	    });
	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC06", "Verify Retailer Details Header Text", () -> {
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//*[text()='Retailer Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text = "Retailer Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);
	    });
	    Thread.sleep(1000);
	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC07", "Click On Document_1 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_1(),"Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	      ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC08", "Click On Document_2 Button ", () -> {
	  		Liabrary.custom_click(DAA3.getDocument_2(),"Document 2 download button ");
	      });
	  		Thread.sleep(1000);
	  		
	  		
	  	  ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC09", "Click On Document_1 Button ", () -> {		
	  		Liabrary.custom_click(DAA3.getDocument_3(),"Document 3 download button ");
	  	  });
	  		Thread.sleep(1000);
	  		
	  		
	  	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_2nd_TC10", "Click On Close Button ", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Close Button");
	  	});
		    Thread.sleep(1000);



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
