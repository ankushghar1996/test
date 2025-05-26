package Retailer_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.Logout_Main;

public class Logout extends BaseClass_Retailer {

    @Test
    public void Media_Tab() throws Exception {

        Logout_Main OUT = PageFactory.initElements(driver, Logout_Main.class);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Logout_TC01", "Click on Menu", () -> {
            Liabrary.custom_click(OUT.getMenu(), "Click on Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Logout_TC02", "Click on Logout", () -> {
            Liabrary.custom_click(OUT.getLogout(), "Click on Logout");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Logout_TC03", "Click on Yes button", () -> {
            Liabrary.custom_click(OUT.getLogout_Yes(), "Click on Yes button");
        });
        Thread.sleep(1000);
    }
}
