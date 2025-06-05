package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Scheme_Main;

public class SEBS_Scheme_Test extends BaseClass_SEBS_Portal {


    @Test
    public void Scheme() throws Exception {

        SECR_Scheme_Main SECR = PageFactory.initElements(driver, SECR_Scheme_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Scheme_Test_TC01", "Verify that user should be able to click on Scheme Tab", () -> {
            Liabrary.custom_click(SECR.getScheme_Tab(), "Click on Scheme Tab");
        });
        Thread.sleep(1000);

        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_Scheme_Test_TC02", "Verify that user should be able to click on Scheme Name", () -> {
            Liabrary.custom_click(SECR.getScheme_Name(), "Click on Scheme Name");
        });
        Thread.sleep(1000);

        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_Scheme_Test_TC03", "Verify that user should be able to close the Scheme popup", () -> {
            Liabrary.custom_click(SECR.getScheme_Close(), "Click on Close Button of Scheme popup");
        });
        Thread.sleep(1000);
        
        
    }
}


