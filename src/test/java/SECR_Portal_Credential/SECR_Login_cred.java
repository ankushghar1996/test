package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Login;

public class SECR_Login_cred extends BaseClass_SECR_Portal {

    @Test
    public void SECR_Login() throws Exception {

        SECR_Login login = PageFactory.initElements(driver, SECR_Login.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC01", "Verify that user should be able to enter SECR User Name", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata2("Sheet1", 4, 0), "UserName Field");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC02", "Verify that user should be able to enter SECR Password", () -> {
            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata2("Sheet1", 4, 1), "Password Field");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_Cred_Login_TC03", "Verify that user should be able to click on Login button", () -> {
            Liabrary.custom_click(login.getLogin_btn(), "Login Btn");
        });
        
        Thread.sleep(1000);
        
        
        
    }
}
