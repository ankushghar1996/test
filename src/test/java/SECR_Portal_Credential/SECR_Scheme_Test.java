package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Scheme_Main;

public class SECR_Scheme_Test extends BaseClass_SECR_Portal {

    @Test
    public void Scheme() throws Exception {

        SECR_Scheme_Main SECR = PageFactory.initElements(driver, SECR_Scheme_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC01", "Verify that user should be able to click on Scheme Tab", () -> {
            Liabrary.custom_click(SECR.getScheme_Tab(), "Click Scheme Tab");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC02", "Verify that user should be able to click on Scheme Name", () -> {
            Liabrary.custom_click(SECR.getScheme_Name(), "Click Scheme Name");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC03", "Verify that user should be able to click on Scheme Close button", () -> {
            Liabrary.custom_click(SECR.getScheme_Close(), "Click Scheme Close Button");
        });
        Thread.sleep(1000);
        
        
    }
    
    
    @Test(priority = 1)
    public void Scheme_NS01() throws Exception {

        SECR_Scheme_Main SECR = PageFactory.initElements(driver, SECR_Scheme_Main.class);

        //Without Click Scheme Name
        ObjectRepo.startTestAndLog_1_NS("Without Click Scheme Name");
        
        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC01", "Verify that user should be able to click on Scheme Tab", () -> {
            Liabrary.custom_click(SECR.getScheme_Tab(), "Click Scheme Tab");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC02", "Verify that user should be able to click on Scheme Name", () -> {
//            Liabrary.custom_click(SECR.getScheme_Name(), "Click Scheme Name");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SECR_Scheme_Test_TC03", "Verify that user should be able to click on Scheme Close button", () -> {
            Liabrary.custom_click(SECR.getScheme_Close(), "Click Scheme Close Button");
        });
        Thread.sleep(1000);
        
}
    
    
}