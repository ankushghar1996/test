package FSG_Retailer_Hierarchy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Portal_Main.OutletMaster_ApprovalPage;

public class Retailer_HO_OutletMaster_ApprovalPageCred_1st extends BaseClass_HO_Portal {

    @Test
    public void OM_View() throws Exception {

        OutletMaster_ApprovalPage Appr = PageFactory.initElements(driver, OutletMaster_ApprovalPage.class);

     // Package name + login name + class name + test case nmbr
		
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_01", "Click Master Menu", () -> {
            Liabrary.custom_click(Appr.getMaster_Menu(), "Click Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_02", "Click Outlet Master Menu", () -> {
            Liabrary.custom_click(Appr.getOutlet_Master_Menu(), "Click Outlet Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_03", "Click Outlet Approval SubMenu", () -> {
            Liabrary.custom_click(Appr.getOutlet_Approval_SubMenu(), "Click Outlet Approval SubMenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_04", "Validate Outlet Approval Text", () -> {
            WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
            String Actual_Text = Outlet_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Approval";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_05", "Click Grid Value", () -> {
            Liabrary.custom_click(Appr.getOutlet_Name_Common_Value(), "Click Grid Value");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_06", "Click Approval Button", () -> {
            Liabrary.custom_click(Appr.getApproval_btn(), "Click Approval Button");
        });
        Thread.sleep(1000);

       
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_08", "Click ProceedForApproval Button", () -> {
            Liabrary.custom_click(Appr.getProceedForApproval_btn(), "Click ProceedForApproval Button");
        });
        Thread.sleep(1000);
        
        
        
        ObjectRepo.startTestAndLog_1_SS("FSG_Retailer_OutletMaster_ApprovalPageCred_1st_TC_09", "Click Yes Button", () -> {
            Liabrary.custom_click(Appr.getYes_btn(), "Click Yes Button");
        });
        Thread.sleep(1000);
        
        
        

//        ObjectRepo.startTestAndLog_1_SS("OM_AP_TC08", "Click Close Button", () -> {
//            Liabrary.custom_click(Appr.getClose_btn(), null);
//        });
//        Thread.sleep(1000);
        
        
        
        
    }
}
