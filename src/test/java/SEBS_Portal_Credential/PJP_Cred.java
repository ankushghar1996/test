package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.PJP_SEBS;

public class PJP_Cred extends BaseClass_SEBS_Portal {

    @Test
    public void PJP_Setting() throws Exception {

        PJP_SEBS pj = PageFactory.initElements(driver, PJP_SEBS.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_PJP_Cred_TC01", "Verify that user should be able to click on SEBS Menu", () -> {
            Liabrary.custom_click(pj.getSEBS_Menu(), null);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SEBS_PJP_Cred_TC02", "Verify that user should be able to click on PJP SubMenu", () -> {
            Liabrary.custom_click(pj.getPJP_SubMenu(), null);
        });
        Thread.sleep(1000);

        
        
        ObjectRepo.startTestAndLog_1_SS("SEBS_PJP_Cred_TC03", "Verify that user should be able to click on Close Button", () -> {
            Liabrary.custom_click(pj.getCLOSE_btn(), null);
        });
        Thread.sleep(1000);
        
        
        
        
    }
}
