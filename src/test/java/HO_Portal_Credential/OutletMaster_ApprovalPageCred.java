package HO_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import HO_Portal_Main.OutletMaster_ApprovalPage;

public class OutletMaster_ApprovalPageCred extends BaseClass_HO_Portal{

	
	
	@Test
	public void OM_View() throws Exception {
	
	
		OutletMaster_ApprovalPage Appr = PageFactory.initElements(driver, OutletMaster_ApprovalPage.class);
	
	
		Liabrary.custom_click(Appr.getMaster_Menu(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(Appr.getOutlet_Master_Menu(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(Appr.getOutlet_Approval_SubMenu(), null);
		Thread.sleep(1000);
		
		
		WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
		String Actual_Text = Outlet_Details_Approval.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Outlet Approval";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(Appr.getOutlet_Name_Grid_Value(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(Appr.getApproval_btn(), null);
		Thread.sleep(1000);
		
		
		WebElement Outlet_Details = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
		String Actual_Text1 = Outlet_Details.getText();
		System.out.println(Actual_Text1);
		String Expected_Text1 = "Outlet Details";
		Assert.assertEquals(Expected_Text1, Actual_Text1);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(Appr.getClose_btn(), null);
		Thread.sleep(1000);
		
		
	
	
	
	
	
	}
	
	
	
}
