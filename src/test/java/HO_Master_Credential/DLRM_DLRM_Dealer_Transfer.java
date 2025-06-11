package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.DLRM_DealerTransfer;

public class DLRM_DLRM_Dealer_Transfer extends BaseClass {

    @Test
    public void Outlet_Transfer() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        DLRM_DealerTransfer DM = PageFactory.initElements(driver, DLRM_DealerTransfer.class);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC02", "Select Dealer Master SubMenu", () -> {
            Liabrary.custom_click(hp.getOutletMaster_SubMenu(), "Select Dealer Master SubMenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC03", "Select Outlet Transfer Menu", () -> {
            Liabrary.custom_click(DM.getOutlet_Transfer_Menu(), "Select Outlet Transfer Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC04", "Verify Outlet Transfer Header Text", () -> {
            WebElement Upload_Retailer_Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_header']"));
            String Actual_Text1 = Upload_Retailer_Header_Text.getText();
            System.out.println(Actual_Text1);
            String Expected_Text = "Outlet Transfer";
            Assert.assertEquals(Expected_Text, Actual_Text1);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC05", "Click From Distributor Dropdown", () -> {
            Liabrary.custom_click(DM.getFrom_Distributor(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC06", "Select From Distributor", () -> {
            Liabrary.custom_click(DM.getSelect_From_Distributor(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC07", "Click From Route Dropdown", () -> {
            Liabrary.custom_click(DM.getFrom_Route(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC08", "Select From Route", () -> {
            Liabrary.custom_click(DM.getSelect_From_Route(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC09", "Click To Distributor Dropdown", () -> {
            Liabrary.custom_click(DM.getTo_Distributor(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC10", "Select To Distributor", () -> {
            Liabrary.custom_click(DM.getSelect_To_Distributor(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC11", "Click To Route Dropdown", () -> {
            Liabrary.custom_click(DM.getTo_Route(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC12", "Select To Route", () -> {
            Liabrary.custom_click(DM.getSelect_To_Route(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC13", "Click Transfer Button", () -> {
            Liabrary.custom_click(DM.getTransfer_btn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC14", "Select From First CheckBox", () -> {
            Liabrary.custom_click(DM.getSelect_FromFirstCheckBox(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC15", "Click Forward Arrow Button", () -> {
            Liabrary.custom_click(DM.getForward_ArrBtn(), null);
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Transfer_TC16", "Select To First CheckBox", () -> {
            Liabrary.custom_click(DM.getSelect_ToFirstCheckBox(), null);
        });
        Thread.sleep(5000);
    }
}
