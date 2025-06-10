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
import HO_Settings.Permission_Wise_Access;

public class Test_Permission_Wise_Access extends BaseClass {

    @Test
    public void Permission_Wise_Access() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Permission_Wise_Access PWA = PageFactory.initElements(driver, Permission_Wise_Access.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_03", "Select Permission Wise Access Page.", () -> {
            Liabrary.custom_click(PWA.getPermission_Wise_Access_Menu(), "Select Permission Wise Access Page");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_04", "Verify Permission Wise Access Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[text()='Permission Wise Access']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Permission Wise Access";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_05", "Select User Dropdown.", () -> {
            Liabrary.custom_click(PWA.getSelect_User_Dropdown(), "Select User Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Permission_Wise_Access_TC_06", "Select User Dropdown Value.", () -> {
            Liabrary.custom_click(PWA.getSelect_User_Dropdown_Value(), "Select User Dropdown Value");
        });
        Thread.sleep(1000);
        
        
    }
}
