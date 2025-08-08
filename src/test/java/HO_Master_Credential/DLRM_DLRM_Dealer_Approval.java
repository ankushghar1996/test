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
import Com_Utility.ObjectRepo;
import HO_Master.DLRM_Dealer_Approval;

public class DLRM_DLRM_Dealer_Approval extends BaseClass{
	
	@Test(priority=0)
	public void DLRM_Dealer_Approval() throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);  
	DLRM_Dealer_Approval DA  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class );	

	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC01", "Click On Master Menu ", () -> {
    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
	});
	Thread.sleep(1000);
		
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC02", "Click On OutletMaster_SubMenu ", () -> {
	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master Submenu");
	});
	Thread.sleep(1000);
 
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC03", "Click On Dealer Approval Menu ", () -> {	
	Liabrary.custom_click(DA.getDealer_Approval_Menu(),"Dealer Approval Page");
	});
	Thread.sleep(1000);
	
	// 
		ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC04", "Verify Outlet Approval Header Text", () -> {
		WebElement View_Dealer_Approval_Header_TXT = driver.findElement(By.xpath("//h4[text()='Outlet Approval']"));
		String Actual_Text = View_Dealer_Approval_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Outlet Approval";
		Assert.assertEquals(Expected_Text,Actual_Text);
	    });
		Thread.sleep(1000);
	
}
	
	@Test(priority=1)
	public void DLRM_Dealer_Approval_NS01() throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);  
	DLRM_Dealer_Approval DA  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class );	
	
	ObjectRepo.startTestAndLog_1_NS("Without Click on Dealer Approval Page");

	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC01", "Click On Master Menu ", () -> {
    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
	});
	Thread.sleep(1000);
	
	
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC02", "Click On OutletMaster_SubMenu ", () -> {
	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master Submenu");
	});
	Thread.sleep(1000);
 
//	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC03", "Click On Dealer Approval Menu ", () -> {	
//	Liabrary.custom_click(DA.getDealer_Approval_Menu(),"Dealer Approval Page");
//	});
//	Thread.sleep(1000);
	
	
	// 
	
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC04", "Verify Outlet Approval Header Text", () -> {
		WebElement View_Dealer_Approval_Header_TXT = driver.findElement(By.xpath("//h4[text()='Outlet Approval']"));
		String Actual_Text = View_Dealer_Approval_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Outlet Approval";
		Assert.assertEquals(Expected_Text,Actual_Text);
	    });
		Thread.sleep(1000);

		
		
}
	
	@Test(priority=2)
	public void DLRM_Dealer_Approval_NS02() throws Exception {
	HomePage hp = PageFactory.initElements(driver, HomePage.class);  
	DLRM_Dealer_Approval DA  = PageFactory.initElements(driver,DLRM_Dealer_Approval.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class );	
	
	ObjectRepo.startTestAndLog_1_NS("Without Click on Outlet Master Submenu");

	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC01", "Click On Master Menu ", () -> {
    Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
	});
	Thread.sleep(1000);
	
	
//	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC02", "Click On OutletMaster_SubMenu ", () -> {
//	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Outlet Master Submenu");
//	});
//	Thread.sleep(1000);
 
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC03", "Click On Dealer Approval Menu ", () -> {	
	Liabrary.custom_click(DA.getDealer_Approval_Menu(),"Dealer Approval Page");
	});
	Thread.sleep(1000);
	
	
	// 
	
	ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Approval_TC04", "Verify Outlet Approval Header Text", () -> {
		WebElement View_Dealer_Approval_Header_TXT = driver.findElement(By.xpath("//h4[text()='Outlet Approval']"));
		String Actual_Text = View_Dealer_Approval_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Outlet Approval";
		Assert.assertEquals(Expected_Text,Actual_Text);
	    });
		Thread.sleep(1000);

		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
