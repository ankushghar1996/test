package HO_Login_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_PageObjectModel.LoginPage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Com_Utility_NegativeScenario_BaseClass.BaseClass_For_LoginTest;

public class Without_Click_LoginBtn extends BaseClass_For_LoginTest {

    @Test
    public void testloginpage() throws Exception {

        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);

        ObjectRepo.startTestAndLog_1_SS("Login_Without_Click_LoginBtn_TC_01", "Verify that user should be send username.", () -> {
            Liabrary.custom_Sendkeys(loginelements.getUserName(), excel.getStringdata("Sheet1", 1, 0), "UserName Field");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("Login_Without_Click_LoginBtn_TC_02", "Verify that user should be send password.", () -> {
            Liabrary.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata("Sheet1", 1, 1), "Password Field");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("Login_Without_Click_LoginBtn_TC_03", "Click on Login button.", () -> {
            driver.findElement(By.xpath("//input[@id='btnLogi']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("Login_Without_Click_LoginBtn_TC_04", "Click on Dashboard link.", () -> {
            driver.findElement(By.xpath("//p[text()='Dashboard']")).click();
        });
        Thread.sleep(1000);
        
        

    }

}
