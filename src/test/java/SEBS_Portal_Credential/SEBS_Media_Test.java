package SEBS_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Media_Main;

public class SEBS_Media_Test extends BaseClass_SEBS_Portal {

    @Test
    public void Media() throws Exception {

        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Media_TC_01", "Click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Media_TC_02", "Click on Media Documents", () -> {
            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_Media_TC_03", "Click on Media Documents Search Button", () -> {
            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
        });
        Thread.sleep(1000);
    }
}
