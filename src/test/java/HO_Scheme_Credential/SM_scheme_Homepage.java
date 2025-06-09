package HO_Scheme_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Scheme.Scheme_Master_Homepage;

public class SM_scheme_Homepage extends BaseClass {

    @Test
    public void Route_Master_Page() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_Homepage SMH = PageFactory.initElements(driver, Scheme_Master_Homepage.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_SM_scheme_Homepage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_scheme_Homepage_TC02", "Select Scheme Setup Sub Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_scheme_Homepage_TC03", "Select Scheme Master Sub Menu", () -> {
            Liabrary.custom_click(SMH.getScheme_Master_Menu(), "Select Scheme Master Sub Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_scheme_Homepage_TC04", "Verify Scheme Master Header Text", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
            String actualText = header.getText();
            System.out.println("Header Text: " + actualText);
            Assert.assertEquals(actualText, "Scheme Master");
        });
        Thread.sleep(1000);
        
    }
}
