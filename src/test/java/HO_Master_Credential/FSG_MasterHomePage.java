package HO_Master_Credential;

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
import HO_Master.FSG_FSGMaster;

public class FSG_MasterHomePage extends BaseClass {

    @Test
    public void FSG_Master_Method() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on FSG Master Page");

        ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC01", "Click on Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), " Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC02", "Click on FSG Master Submenu", () -> {
            Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "FSG Master Submenu");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC03", "Click onFSG Master Page", () -> {
//            Liabrary.custom_click(FSG.getFSG_Master(), " FSG Master Page");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC04", "Verify FSG Master Header Text", () -> {
            WebElement FSG_Master_Header_TXT = driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
            String Actual_Text = FSG_Master_Header_TXT.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "FSG Master";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(1000);
    }
}
