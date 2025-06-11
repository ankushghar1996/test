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
import HO_Master.DLRM_Dealer_Master;

public class DLRM_DLRM_Dealer_Master_Page extends BaseClass {

    @Test
    public void Dealer_Master_Page() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        DLRM_Dealer_Master DM1 = PageFactory.initElements(driver, DLRM_Dealer_Master.class);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Master_Page_TC01", "Click Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Master_Page_TC02", "Click Dealer Master SubMenu", () -> {
            Liabrary.custom_click(hp.getOutletMaster_SubMenu(), "Select Dealer Master SubMenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Master_Page_TC03", "Click Dealer Master Menu", () -> {
            Liabrary.custom_click(DM1.getDealer_Master_Menu(), "Select Dealer Master Menu Page");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_DLRM_Dealer_Master_Page_TC04", "Verify Dealer Master List Header Text", () -> {
            WebElement Dealer_Master_List = driver.findElement(By.xpath("//*[text()='Outlet Master List']"));
            String Actual_Text = Dealer_Master_List.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Outlet Master List";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
    }
}
