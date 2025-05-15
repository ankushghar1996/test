package HO_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import HO_Portal_Main.OutletMaster_EditApprovalPage;

public class OutletMaster_EditApprovalPageCred extends BaseClass_HO_Portal{

	
	@Test
	public void OM_Edit() throws Exception {
	
	
		OutletMaster_EditApprovalPage edit = PageFactory.initElements(driver, OutletMaster_EditApprovalPage.class);
	
	
		Liabrary.custom_click(edit.getMaster_Menu(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(edit.getOutlet_Master_Menu(), null);
		Thread.sleep(1000);
		
		Liabrary.custom_click(edit.getOutlet_Approval_SubMenu(), null);
		Thread.sleep(1000);
		
		
		WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
		String Actual_Text = Outlet_Details_Approval.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "Outlet Approval";
		Assert.assertEquals(Expected_Text, Actual_Text);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getOutlet_Name_Common_Value(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(edit.getApproval_btn(), null);
		Thread.sleep(1000);
	
	
		WebElement Outlet_Details = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
		String Actual_Text1 = Outlet_Details.getText();
		System.out.println(Actual_Text1);
		String Expected_Text1 = "Outlet Details";
		Assert.assertEquals(Expected_Text1, Actual_Text1);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getEdit_btn(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getDistributor_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_Distributor_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getFSG_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_FSG_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getRoute_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_Route_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getRetailerFirmName());
		Thread.sleep(2000);
	
	
		Liabrary.custom_Sendkeys(edit.getRetailerFirmName(), excel.getStringdata("HO_Outlet_Edit", 1, 0), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getRetailerClass_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_RetailerClass_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getRetailerCategory_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_RetailerCategory_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getTxtAddressLine1());
		Thread.sleep(2000);
		
		
		Liabrary.custom_Sendkeys(edit.getTxtAddressLine1(), excel.getStringdata("HO_Outlet_Edit", 1, 1), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getState_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_State_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getCity_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(edit.getSelect_City_Input(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getTxtPinCode());
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(edit.getTxtPinCode(), excel.getNumericdata("HO_Outlet_Edit", 1, 2), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getTxtContactPersonName());
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(edit.getTxtContactPersonName(), excel.getStringdata("HO_Outlet_Edit", 1, 3), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getTxtPANNo());
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(edit.getTxtPANNo(), excel.getStringdata2("HO_Outlet_Edit", 1, 4), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_clear(edit.getTxtTotlBusinessInConstructionChemicals());
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(edit.getTxtTotlBusinessInConstructionChemicals(), excel.getNumericdata("HO_Outlet_Edit", 1, 5), null);
		Thread.sleep(5000);
		
		
		Liabrary.custom_click(edit.getClose_btn(), null);
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
	
	
}
