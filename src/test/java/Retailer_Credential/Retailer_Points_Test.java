package Retailer_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.Retailer_Points;

public class Retailer_Points_Test extends BaseClass_Retailer {
	
	@Test(priority=0)
    public void Points() throws Exception {

        Retailer_Points RETR = PageFactory.initElements(driver, Retailer_Points.class);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC01", "Click on menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC02", "Click on My Points", () -> {
            Liabrary.custom_click(RETR.getMy_Points(), "Click on My points");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC03", "Click on Redeem Points", () -> {
            Liabrary.custom_click(RETR.getRedeem_Points_Now(), "Click on Redeem points");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC04", "Click on Search Button", () -> {
            Liabrary.custom_click(RETR.getSearch_Button(), "Click on Search Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC05", "Navigate Back", () -> {
            driver.navigate().back();
        });
        Thread.sleep(3000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC06", "Click on View Performance (1st time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC07", "Click on View Performance (2nd time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);
    }
    @Test(priority=1)
    public void Points_NS01() throws Exception {

        Retailer_Points RETR = PageFactory.initElements(driver, Retailer_Points.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Search Button");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC01", "Click on menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC02", "Click on My Points", () -> {
            Liabrary.custom_click(RETR.getMy_Points(), "Click on My points");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC03", "Click on Redeem Points", () -> {
            Liabrary.custom_click(RETR.getRedeem_Points_Now(), "Click on Redeem points");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC04", "Click on Search Button", () -> {
//            Liabrary.custom_click(RETR.getSearch_Button(), "Click on Search Button");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC05", "Navigate Back", () -> {
            driver.navigate().back();
        });
        Thread.sleep(3000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC06", "Click on View Performance (1st time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC07", "Click on View Performance (2nd time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=2)
    public void Points_NS02() throws Exception {

        Retailer_Points RETR = PageFactory.initElements(driver, Retailer_Points.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Navigate Back Button");

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC01", "Click on menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC02", "Click on My Points", () -> {
            Liabrary.custom_click(RETR.getMy_Points(), "Click on My points");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC03", "Click on Redeem Points", () -> {
            Liabrary.custom_click(RETR.getRedeem_Points_Now(), "Click on Redeem points");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC04", "Click on Search Button", () -> {
            Liabrary.custom_click(RETR.getSearch_Button(), "Click on Search Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC05", "Navigate Back", () -> {
//            driver.navigate().back();
//        });
//        Thread.sleep(3000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC06", "Click on View Performance (1st time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_Points_TC07", "Click on View Performance (2nd time)", () -> {
            Liabrary.custom_click(RETR.getView_Performance(), "Click on View Performance");
        });
        Thread.sleep(1000);
}
}