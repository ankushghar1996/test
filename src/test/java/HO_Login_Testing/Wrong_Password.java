package HO_Login_Testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass_For_LoginTest;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;

public class Wrong_Password extends BaseClass_For_LoginTest {

    @Test
    public void testloginpage() throws Exception {
        
        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);

        ObjectRepo.startTestAndLog_1_SS("Login_WrongPwd_TC_01", "Verify that user should send username.", () -> {
            Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 3, 0), "UserName Field");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("Login_WrongPwd_TC_02", "Verify that user should send password.", () -> {
            Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 3, 1), "Password Field");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("Login_WrongPwd_TC_03", "Click on Login Button.", () -> {
            Liabrary.custom_click(loginelements.getLogin_Btn(), "Login Btn");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("Login_WrongPwd_TC_04", "Print error message.", () -> {
            Liabrary.checkErrorMessageChangable(driver, "print Error Message");
        });
        Thread.sleep(1000);
        
        
    }
}
