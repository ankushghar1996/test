package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Media_Main;

public class SECR_Media_Test extends BaseClass_SECR_Portal {

    @Test
    public void Media() throws Exception {

        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC01", "Verify that user should be able to click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000);

  
        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC02", "Verify that user should be able to click on Media Documents", () -> {
            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
        });
        Thread.sleep(1000);

  
        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
        });
        Thread.sleep(1000);  
    }
    
    @Test(priority=1)
    public void Media_NS01() throws Exception {

        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);
        //Without Clicking Media Button
        ObjectRepo.startTestAndLog_1_NS("Without Clicking Media Button");

        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC01", "Verify that user should be able to click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000);

  
//        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC02", "Verify that user should be able to click on Media Documents", () -> {
//            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
//        });
//        Thread.sleep(1000);

  
        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
        });
        Thread.sleep(1000);
        
}
    @Test(priority=2)
    public void Media_NS02() throws Exception {

        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);
        //Without Click On Media Documents Search Button
        ObjectRepo.startTestAndLog_1_NS("Without Click On Media Documents Search Button");

        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC01", "Verify that user should be able to click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC02", "Verify that user should be able to click on Media Documents", () -> {
            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
        });
        Thread.sleep(1000);

  
//        ObjectRepo.startTestAndLog_1_SS("SECR_Media_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
//            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
//        });
//        Thread.sleep(1000);
}
}