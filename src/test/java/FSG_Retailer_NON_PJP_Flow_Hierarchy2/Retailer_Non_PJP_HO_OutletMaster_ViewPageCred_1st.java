package FSG_Retailer_NON_PJP_Flow_Hierarchy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import HO_Portal_Main.OutletMaster_ViewPage;
import Com_Utility.ObjectRepo;


public class Retailer_Non_PJP_HO_OutletMaster_ViewPageCred_1st extends BaseClass_HO_Portal {

    @Test
    public void OM_View() throws Exception {

        OutletMaster_ViewPage view = PageFactory.initElements(driver, OutletMaster_ViewPage.class);

     // Package name + login name + class name + test case nmbr
        
        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC01", "Click Master Menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC02", "Click Outlet Master Menu", () -> {
            Liabrary.custom_click(view.getOutlet_Master_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC03", "Click Outlet Approval Submenu", () -> {
            Liabrary.custom_click(view.getOutlet_Approval_SubMenu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC04", "Verify Approval Heading Text", () -> {
            WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
            String actualText = Outlet_Details_Approval.getText();
            System.out.println(actualText);
            String expectedText = "Outlet Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC05", "Click Outlet Name Grid Value", () -> {
            Liabrary.custom_click(view.getOutlet_Name_Common_Value(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC06", "Click View Button", () -> {
            Liabrary.custom_click(view.getView_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC07", "Verify Outlet Details Header", () -> {
            WebElement Outlet_Details = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
            String actualText = Outlet_Details.getText();
            System.out.println(actualText);
            String expectedText = "Outlet Details";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC08", "Click Close Button", () -> {
            Liabrary.custom_click(view.getClose_btn(), null);
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void OM_View_NS1() throws Exception {

        OutletMaster_ViewPage view = PageFactory.initElements(driver, OutletMaster_ViewPage.class);

     // Package name + login name + class name + test case nmbr
        
        ObjectRepo.startTestAndLog_1_NS("Without click grid value");
        
        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC01", "Click Master Menu", () -> {
            Liabrary.custom_click(view.getMaster_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC02", "Click Outlet Master Menu", () -> {
            Liabrary.custom_click(view.getOutlet_Master_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC03", "Click Outlet Approval Submenu", () -> {
            Liabrary.custom_click(view.getOutlet_Approval_SubMenu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC04", "Verify Approval Heading Text", () -> {
            WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
            String actualText = Outlet_Details_Approval.getText();
            System.out.println(actualText);
            String expectedText = "Outlet Approval";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC05", "Click Outlet Name Grid Value", () -> {
//            Liabrary.custom_click(view.getOutlet_Name_Common_Value(), null);
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC06", "Click View Button", () -> {
            Liabrary.custom_click(view.getView_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC07", "Verify Outlet Details Header", () -> {
            WebElement Outlet_Details = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
            String actualText = Outlet_Details.getText();
            System.out.println(actualText);
            String expectedText = "Outlet Details";
            Assert.assertEquals(expectedText, actualText);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_HO_OutletMaster_ViewP_TC08", "Click Close Button", () -> {
            Liabrary.custom_click(view.getClose_btn(), null);
        });
        Thread.sleep(1000);
    }
}
