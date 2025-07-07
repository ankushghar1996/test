package SECR_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.PJP;


public class PJP_Cred extends BaseClass_SECR_Portal {

    @Test
    public void PJP_Setting() throws Exception {

        PJP pjp = PageFactory.initElements(driver, PJP.class);

        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(pjp.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC02", "Verify that user should be able to click on PJP SubMenu", () -> {
            Liabrary.custom_click(pjp.getPJP_SubMenu(), "Click PJP SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC03", "Verify that user should be able to click on Close button", () -> {
            Liabrary.custom_click(pjp.getCLOSE_btn(), "Click Close Button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=01)
    public void PJP_Setting_NS01() throws Exception {

        PJP pjp = PageFactory.initElements(driver, PJP.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Clicking PJP Submenu");

        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC01", "Verify that user should be able to click on SECR Menu", () -> {
            Liabrary.custom_click(pjp.getSECR_Menu(), "Click SECR Menu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC02", "Verify that user should be able to click on PJP SubMenu", () -> {
//            Liabrary.custom_click(pjp.getPJP_SubMenu(), "Click PJP SubMenu");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SECR_PJP_Cred_TC03", "Verify that user should be able to click on Close button", () -> {
            Liabrary.custom_click(pjp.getCLOSE_btn(), "Click Close Button");
        });
        Thread.sleep(1000);
        
        
    }

}
