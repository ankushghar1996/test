package SEBS_Portal_Credential;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SECR_Portal.SECR_Media_Main;

public class SEBS_Media_Test extends BaseClass_SEBS_Portal {
	
	@Test(priority = 0)
	public void Media() throws Exception {

	    SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC01", "Verify that user should be able to click on Media Tab", () -> {
	        wait.until(ExpectedConditions.elementToBeClickable(SECR.getMedia_Tab()));
	        Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC02", "Verify that user should be able to click on Media Documents", () -> {
	        wait.until(ExpectedConditions.elementToBeClickable(SECR.getMedia_Documents()));
	        Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
	    });
	    Thread.sleep(1000);

	    ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
	        wait.until(ExpectedConditions.elementToBeClickable(SECR.getDocuments_Search_Button()));
	        Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
	    });
	    
	    Thread.sleep(1000);
	}

        
        

    
    @Test(priority=1)
    public void Media_NS01() throws Exception {
    	
        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);
        
        //Without Click Search Button
        ObjectRepo.startTestAndLog_1_NS("Without Click Search Button");

        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC01", "Verify that user should be able to click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000); 

        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC02", "Verify that user should be able to click on Media Documents", () -> {
            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
//            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
//        });
//        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=2)
    public void Media_NS02() throws Exception {
    	
        SECR_Media_Main SECR = PageFactory.initElements(driver, SECR_Media_Main.class);
        
        //Without Click on Media Documents
        ObjectRepo.startTestAndLog_1_NS("Without Click Media Documents");

        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC01", "Verify that user should be able to click on Media Tab", () -> {
            Liabrary.custom_click(SECR.getMedia_Tab(), "Click on Media Tab");
        });
        Thread.sleep(1000); 

//        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC02", "Verify that user should be able to click on Media Documents", () -> {
//            Liabrary.custom_click(SECR.getMedia_Documents(), "Click on Media Documents");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Media_Test_TC03", "Verify that user should be able to click on Media Documents Search Button", () -> {
            Liabrary.custom_click(SECR.getDocuments_Search_Button(), "Click on Media Documents Search Button");
        });
        Thread.sleep(1000);
        
        
    }

}
