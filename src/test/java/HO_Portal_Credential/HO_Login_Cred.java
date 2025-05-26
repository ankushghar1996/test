package HO_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_HO_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Portal_Main.HO_Login;

public class HO_Login_Cred extends BaseClass_HO_Portal {

    @Test
    public void testloginpage() throws Exception {

        HO_Login log = PageFactory.initElements(driver, HO_Login.class);

        ObjectRepo.startTestAndLog_1_SS("HO_LC_TC01", "Enter Username", () -> {
            Liabrary.custom_Sendkeys(log.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_LC_TC02", "Enter Password", () -> {
            Liabrary.custom_Sendkeys(log.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Passwod Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_LC_TC03", "Click Login Button", () -> {
            Liabrary.custom_click(log.getLogin_Btn(), "Login Btn");
        });
        Thread.sleep(1000);
    }
}
