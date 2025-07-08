package FSG_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_Login;

public class Login_Credential extends BaseClass_FSG_Portal {

    @Test(priority=0)
    public void testLoginPage() throws Exception {

        FSG_Login login = PageFactory.initElements(driver, FSG_Login.class);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC01", "Enter Username", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata("Sheet1", 2, 0), "Username Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC02", "Enter Password", () -> {
            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata("Sheet1", 2, 1), "Password Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC03", "Click on Login Button", () -> {
            Liabrary.custom_click(login.getLogin_Btn(), "Login Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority=01)
    public void testLoginPage_NS01 () throws Exception{

        FSG_Login login = PageFactory.initElements(driver, FSG_Login.class);
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC01", "Enter Username", () -> {
            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata("Sheet1", 2, 0), "Username Field");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC02", "Enter Password", () -> {
//            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata("Sheet1", 2, 1), "Password Field");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC03", "Click on Login Button", () -> {
            Liabrary.custom_click(login.getLogin_Btn(), "Login Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=02)
    public void testLoginPage_NS02() throws Exception{

        FSG_Login login = PageFactory.initElements(driver, FSG_Login.class);
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC01", "Enter Username", () -> {
//            Liabrary.custom_Sendkeys(login.getUserName(), excel.getStringdata("Sheet1", 2, 0), "Username Field");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC02", "Enter Password", () -> {
            Liabrary.custom_Sendkeys(login.getPassword(), excel.getStringdata("Sheet1", 2, 1), "Password Field");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_Login_TC03", "Click on Login Button", () -> {
            Liabrary.custom_click(login.getLogin_Btn(), "Login Button");
        });
        Thread.sleep(1000);
        
    }
}
