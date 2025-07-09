package HO_Activity_Credential;

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
import HO_Activity.NotificationMaster_NotificationSetting;

public class NotificationSetting extends BaseClass {

    @Test
    public void Notification_setting() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_02", "Verify select Notification Master sub menu", () -> {
            Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_03", "Verify click Notification Setting menu", () -> {
            Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_04", "Verify Notification Settings page title", () -> {
            WebElement pageHeader = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String actualText = pageHeader.getText();
            String expectedText = "Notification Settings";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(2000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_05", "Click on Notification Type dropdown", () -> {
            Liabrary.custom_click(NS.getType_Dropdown(), "select Notification Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_06", "Select value from Notification Type dropdown", () -> {
            Liabrary.custom_click(NS.getSelectValueType_Dropdown(), "select value from Notification Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(NS.getViewBtn(), "click on View button");
        });
        Thread.sleep(1000);
        
    }
    
    @Test(priority=1)
    public void Notification_setting_NS01() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without click Notification Setting menu");

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_02", "Verify select Notification Master sub menu", () -> {
            Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_03", "Verify click Notification Setting menu", () -> {
//            Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_04", "Verify Notification Settings page title", () -> {
            WebElement pageHeader = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String actualText = pageHeader.getText();
            String expectedText = "Notification Settings";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(2000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_05", "Click on Notification Type dropdown", () -> {
            Liabrary.custom_click(NS.getType_Dropdown(), "select Notification Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_06", "Select value from Notification Type dropdown", () -> {
            Liabrary.custom_click(NS.getSelectValueType_Dropdown(), "select value from Notification Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(NS.getViewBtn(), "click on View button");
        });
        Thread.sleep(1000);
        
        

    }
    
    @Test(priority=2)
    public void Notification_setting_NS02() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without select value from Notification Type dropdown");

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_02", "Verify select Notification Master sub menu", () -> {
            Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_03", "Verify click Notification Setting menu", () -> {
            Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_04", "Verify Notification Settings page title", () -> {
            WebElement pageHeader = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String actualText = pageHeader.getText();
            String expectedText = "Notification Settings";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(2000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_05", "Click on Notification Type dropdown", () -> {
            Liabrary.custom_click(NS.getType_Dropdown(), "select Notification Type dropdown");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_06", "Select value from Notification Type dropdown", () -> {
//            Liabrary.custom_click(NS.getSelectValueType_Dropdown(), "select value from Notification Type dropdown");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_NotificationSetting_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(NS.getViewBtn(), "click on View button");
        });
        Thread.sleep(1000);

}

}