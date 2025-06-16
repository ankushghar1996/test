package HO_Login_Testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Com_Utility_NegativeScenario_BaseClass.BaseClass_For_LoginTest;

public class Forget_Password extends BaseClass_For_LoginTest {

    @Test
    public void testloginpage() throws Exception {

        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Login_Testing_Forget_Password_TC01", "Click on Enter Username", () -> {
            Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 2, 0), "UserName Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Login_Testing_Forget_Password_TC02", "Click on Enter Password", () -> {
            Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 2, 1), "Password Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Login_Testing_Forget_Password_TC03", "Click on Login Button", () -> {
            Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HO_Login_Testing_Forget_Password_TC04", "Check Error Message", () -> {
            Liabrary.checkErrorMessageChangable(driver, "");
        });
        Thread.sleep(1000);
    }
}
