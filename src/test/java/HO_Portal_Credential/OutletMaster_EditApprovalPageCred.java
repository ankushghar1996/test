package HO_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import HO_Portal_Main.OutletMaster_EditApprovalPage;
import  Com_Utility.ObjectRepo;

public class OutletMaster_EditApprovalPageCred extends BaseClass_HO_Portal {

    @Test
    public void OM_Edit() throws Exception {

        OutletMaster_EditApprovalPage edit = PageFactory.initElements(driver, OutletMaster_EditApprovalPage.class);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC01", "Clicking on Master menu", () -> {
            Liabrary.custom_click(edit.getMaster_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC02", "Clicking on Outlet Master menu", () -> {
            Liabrary.custom_click(edit.getOutlet_Master_Menu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC03", "Clicking on Outlet Approval submenu", () -> {
            Liabrary.custom_click(edit.getOutlet_Approval_SubMenu(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC04", "Verifying Outlet Approval header", () -> {
            WebElement Outlet_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headingAreaReport']"));
            Assert.assertEquals(Outlet_Details_Approval.getText(), "Outlet Approval");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC05", "Clicking on Outlet Name", () -> {
            Liabrary.custom_click(edit.getOutlet_Name_Common_Value(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC06", "Clicking on Approval button", () -> {
            Liabrary.custom_click(edit.getApproval_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC07", "Verifying Outlet Details header", () -> {
            WebElement Outlet_Details = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_retailerHeader']"));
            Assert.assertEquals(Outlet_Details.getText(), "Outlet Details");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC08", "Clicking on Edit button", () -> {
            Liabrary.custom_click(edit.getEdit_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC09", "Clicking Distributor input", () -> {
            Liabrary.custom_click(edit.getDistributor_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC10", "Selecting Distributor", () -> {
            Liabrary.custom_click(edit.getSelect_Distributor_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC11", "Clicking FSG input", () -> {
            Liabrary.custom_click(edit.getFSG_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC12", "Selecting FSG", () -> {
            Liabrary.custom_click(edit.getSelect_FSG_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC13", "Clicking Route input", () -> {
            Liabrary.custom_click(edit.getRoute_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC14", "Selecting Route", () -> {
            Liabrary.custom_click(edit.getSelect_Route_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC15", "Clearing Retailer Firm Name", () -> {
            Liabrary.custom_clear(edit.getRetailerFirmName());
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC16", "Entering Retailer Firm Name", () -> {
            Liabrary.custom_Sendkeys(edit.getRetailerFirmName(), excel.getStringdata("HO_Outlet_Edit", 1, 0), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC17", "Clicking Retailer Class input", () -> {
            Liabrary.custom_click(edit.getRetailerClass_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC18", "Selecting Retailer Class", () -> {
            Liabrary.custom_click(edit.getSelect_RetailerClass_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC19", "Clicking Retailer Category input", () -> {
            Liabrary.custom_click(edit.getRetailerCategory_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC20", "Selecting Retailer Category", () -> {
            Liabrary.custom_click(edit.getSelect_RetailerCategory_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC21", "Clearing Address Line 1", () -> {
            Liabrary.custom_clear(edit.getTxtAddressLine1());
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC22", "Entering Address Line 1", () -> {
            Liabrary.custom_Sendkeys(edit.getTxtAddressLine1(), excel.getStringdata("HO_Outlet_Edit", 1, 1), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC23", "Clicking State input", () -> {
            Liabrary.custom_click(edit.getState_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC24", "Selecting State", () -> {
            Liabrary.custom_click(edit.getSelect_State_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC25", "Clicking City input", () -> {
            Liabrary.custom_click(edit.getCity_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC26", "Selecting City", () -> {
            Liabrary.custom_click(edit.getSelect_City_Input(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC27", "Clearing Pin Code", () -> {
            Liabrary.custom_clear(edit.getTxtPinCode());
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC28", "Entering Pin Code", () -> {
            Liabrary.custom_Sendkeys(edit.getTxtPinCode(), excel.getNumericdata("HO_Outlet_Edit", 1, 2), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC29", "Clearing Contact Person Name", () -> {
            Liabrary.custom_clear(edit.getTxtContactPersonName());
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC30", "Entering Contact Person Name", () -> {
            Liabrary.custom_Sendkeys(edit.getTxtContactPersonName(), excel.getStringdata("HO_Outlet_Edit", 1, 3), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC31", "Clearing PAN No", () -> {
            Liabrary.custom_clear(edit.getTxtPANNo());
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC32", "Entering PAN No", () -> {
            Liabrary.custom_Sendkeys(edit.getTxtPANNo(), excel.getStringdata2("HO_Outlet_Edit", 1, 4), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC33", "Clearing Business in Construction Chemicals", () -> {
            Liabrary.custom_clear(edit.getTxtTotlBusinessInConstructionChemicals());
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC34", "Entering Business in Construction Chemicals", () -> {
            Liabrary.custom_Sendkeys(edit.getTxtTotlBusinessInConstructionChemicals(), excel.getNumericdata("HO_Outlet_Edit", 1, 5), null);
        });
        Thread.sleep(5000);

        ObjectRepo.startTestAndLog_1_SS("HO_Outlet_EditApproval_TC35", "Clicking Close Button", () -> {
            Liabrary.custom_click(edit.getClose_btn(), null);
        });
    }
}
