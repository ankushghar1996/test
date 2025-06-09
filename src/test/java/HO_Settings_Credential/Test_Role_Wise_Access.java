package HO_Settings_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Settings.Role_Wise_Access;

public class Test_Role_Wise_Access extends BaseClass {

    @Test
    public void Role_Wise_Access() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Role_Wise_Access RWA = PageFactory.initElements(driver, Role_Wise_Access.class);

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_03", "Select Role Wise Access Page.", () -> {
            Liabrary.custom_click(RWA.getRole_Wise_Access_Menu(), "Select Role Wise Access Page");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_04", "Verify Role Wise Access Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[normalize-space()='Role Wise Access']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Role Wise Access";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_05", "Select Type Dropdown.", () -> {
            Liabrary.custom_click(RWA.getType_Dropdown(), "Select Type Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_06", "Select Type Dropdown Value.", () -> {
            Liabrary.custom_click(RWA.getType_Dropdown_Value(), "Select Type Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Role_Wise_Access_TC_07", "Click on View Button.", () -> {
            Liabrary.custom_click(RWA.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        
        
    }
}
