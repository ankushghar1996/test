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
import HO_Master.DLRM_Dealer_Approval;
import HO_Master.DLRM_Dealer_ApprovalBTN_Page;
import HO_Master.DLRM_Dealer_ApprovalView_Page;

public class DLRM_DLRM_Dealer_ApprovalBTN_Page extends BaseClass{

	
	@Test(priority = 0)
	public void Dealer_ApprovalBTN() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_ApprovalBTN_Page DA3 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalBTN_Page.class);	
	DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalView_Page.class);
	DLRM_Dealer_Approval DA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

    
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC01", "Click On Master Menu ", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");
        });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC02", "Click On Outlet Master SubMenu ", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master SubMenu");
		});
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC03", "Click On Outlet Approval Menu ", () -> {
		Liabrary.custom_click(DA3.getOutletApproval_Menu(),"Outlet Approval Page");
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC04", "Click On Dealer Name Grid Value", () -> {	
	    Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(),"Grid Data From Table Value");
		});
	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC05", "Click On Outlet Button Approval", () -> {	
	    Liabrary.custom_click(DA3.getOutlet_BtnApproval(),"Click on Approve Button");
	    });
	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC06", "Click On Outlet Button Approval", () -> {	
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text ="Outlet Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);});

	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC07", "Click On Document 1 Button", () -> {	
	  		Liabrary.custom_click(DA3.getDocument_1(),"Click Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC08", "Click On Document 2 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_2(),"Click Document2 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC09", "Click On Document 3 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_3(),"Click Document3 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC10", "Click On Close Button", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
	  		});
		    Thread.sleep(1000);



	}
	
	@Test(priority = 1)
	public void Dealer_ApprovalBTN_NS01() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_ApprovalBTN_Page DA3 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalBTN_Page.class);	
	DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalView_Page.class);
	DLRM_Dealer_Approval DA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

       ObjectRepo.startTestAndLog_1_NS("Without Selecting Grid Data");
    
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC01", "Click On Master Menu ", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");
        });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC02", "Click On Outlet Master SubMenu ", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master SubMenu");
		});
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC03", "Click On Outlet Approval Menu ", () -> {
		Liabrary.custom_click(DA3.getOutletApproval_Menu(),"Outlet Approval Page");
		});
		Thread.sleep(1000);	
		
//		
//		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC04", "Click On Dealer Name Grid Value", () -> {	
//	    Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(),"Grid Data From Table Value");
//		});
//	    Thread.sleep(1000);
	    
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC05", "Click On Outlet Button Approval", () -> {	
	    Liabrary.custom_click(DA3.getOutlet_BtnApproval(),"Click on Approve Button");
	    });
	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC06", "Click On Outlet Button Approval", () -> {	
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text ="Outlet Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);});

	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC07", "Click On Document 1 Button", () -> {	
	  		Liabrary.custom_click(DA3.getDocument_1(),"Click Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC08", "Click On Document 2 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_2(),"Click Document2 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC09", "Click On Document 3 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_3(),"Click Document3 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC10", "Click On Close Button", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
	  		});
		    Thread.sleep(1000);



	}
	
	@Test(priority = 2)
	public void Dealer_ApprovalBTN_NS02() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_ApprovalBTN_Page DA3 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalBTN_Page.class);	
	DLRM_Dealer_ApprovalView_Page DA2 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalView_Page.class);
	DLRM_Dealer_Approval DA1  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);	
    Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	

       ObjectRepo.startTestAndLog_1_NS("Without Click on Approve Button");
    
        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC01", "Click On Master Menu ", () -> {
	    Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");
        });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC02", "Click On Outlet Master SubMenu ", () -> {
		Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master SubMenu");
		});
		Thread.sleep(1000);
		
 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC03", "Click On Outlet Approval Menu ", () -> {
		Liabrary.custom_click(DA3.getOutletApproval_Menu(),"Outlet Approval Page");
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC04", "Click On Dealer Name Grid Value", () -> {	
	    Liabrary.custom_click(DA2.getDealer_Name_Grid_Value(),"Grid Data From Table Value");
		});
        Thread.sleep(1000);
	    
	    
//	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC05", "Click On Outlet Button Approval", () -> {	
//	    Liabrary.custom_click(DA3.getOutlet_BtnApproval(),"Click on Approve Button");
//	    });
//	    Thread.sleep(1000);
	    
	    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC06", "Click On Outlet Button Approval", () -> {	
	  		WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[text()='Outlet Details']"));
	  		String Actual_Text = Dealer_Details_Approval.getText();
	  		System.out.println(Actual_Text);
	  		String Expected_Text ="Outlet Details";
	  		Assert.assertEquals(Expected_Text, Actual_Text);});

	  		
	  		 WebElement scroll = driver.findElement(By.xpath("//*[text()='Documents']"));
		  	    JavascriptExecutor jse1= (JavascriptExecutor)driver;
			    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
		  		Thread.sleep(1000);
		  		
		  		
		    ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC07", "Click On Document 1 Button", () -> {	
	  		Liabrary.custom_click(DA3.getDocument_1(),"Click Document1 download button ");
		    });
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC08", "Click On Document 2 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_2(),"Click Document2 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC09", "Click On Document 3 Button", () -> {		
	  		Liabrary.custom_click(DA3.getDocument_3(),"Click Document3 download button ");
	  		});
	  		Thread.sleep(1000);
	  		
	  		
	  		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_Button_TC10", "Click On Close Button", () -> {	
		    Liabrary.custom_click(CD.getClose_Btn(),"Click on Close Button");
	  		});
		    Thread.sleep(1000);



	}
	
	
	/*
	 //Negative testing priority 2
	@Test(priority = 1)
	public void Dealer_WithourSelectiongGrid_Data() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	DLRM_Dealer_ApprovalBTN_Page DA3 = PageFactory.initElements(driver,DLRM_Dealer_ApprovalBTN_Page.class);	
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
		Liabrary.custom_click(DA3.getOutletApproval_Menu(),"Select Dealer Approval Page");
		Thread.sleep(1000);		
	
	    
	    
    //ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user is able to click Approve Button");	
	    Liabrary.custom_click(CD.getApproval_Btn(),"Click on Approve Button");	
	    Thread.sleep(1000);
	    
	    
	    Liabrary.checkErrorMessageCommon(driver, null);
	    Thread.sleep(1000);
	}
	
	*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

