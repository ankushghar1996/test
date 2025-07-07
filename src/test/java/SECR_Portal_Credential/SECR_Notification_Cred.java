package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Notification_Main;

public class SECR_Notification_Cred extends BaseClass_SECR_Portal {

    @Test
    public void Logout() throws Exception {

        SECR_Notification_Main note = PageFactory.initElements(driver, SECR_Notification_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Notification_Cred_TC01", "Verify that user should be able to click on Notification Icon", () -> {
            Liabrary.custom_click(note.getNotification(), "Click Notification Icon");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Notification_Cred_TC02", "Verify that user should be able to close the Notification popup", () -> {
            Liabrary.custom_click(note.getClose_Button(), "Click Close Button");
        });
        Thread.sleep(1000);
        
        
    }
    @Test(priority=1)
    public void Logout_NS01() throws Exception {

        SECR_Notification_Main note = PageFactory.initElements(driver, SECR_Notification_Main.class);
        //withoutclick on close button

        ObjectRepo.startTestAndLog_1_SS("SECR_Notification_Cred_TC01", "Verify that user should be able to click on Notification Icon", () -> {
            Liabrary.custom_click(note.getNotification(), "Click Notification Icon");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Notification_Cred_TC02", "Verify that user should be able to close the Notification popup", () -> {
//            Liabrary.custom_click(note.getClose_Button(), "Click Close Button");
//        });
//        Thread.sleep(1000);
}
}