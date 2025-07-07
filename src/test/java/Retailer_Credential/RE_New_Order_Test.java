package Retailer_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.RE_New_Order;

public class RE_New_Order_Test extends BaseClass_Retailer {

	@Test(priority=0)
    public void Order_Test() throws Exception {

        RE_New_Order RETR = PageFactory.initElements(driver, RE_New_Order.class);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC02", "Click on New Order", () -> {
            Liabrary.custom_click(RETR.getNew_Order(), "Click on New Order");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC03", "Click on WaterProofing", () -> {
            Liabrary.custom_click(RETR.getWaterproofing(), "Click on WaterProofing");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC04", "Click on Add Cart (1st time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC05", "Click on Add Cart (2nd time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC06", "Click on View Cart", () -> {
            Liabrary.custom_click(RETR.getProduct_View_Cart(), "Click on View Cart");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC07", "Click on Submit Button", () -> {
            Liabrary.custom_click(RETR.getSubmit_Button(), "Click on Submit Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC08", "Click on Yes Button", () -> {
            Liabrary.custom_click(RETR.getYes_Button(), "Click on Yes Button");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC09", "Click on Okay Button", () -> {
            Liabrary.custom_click(RETR.getOkay_Button(), "Click on Okay Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC10", "Click on Points New Order", () -> {
            Liabrary.custom_click(RETR.getPoints_New_Order(), "Click on Points New Order");
        });
        Thread.sleep(1000);
    }
    @Test(priority=1)
    public void Order_Test_NS01() throws Exception {

        RE_New_Order RETR = PageFactory.initElements(driver, RE_New_Order.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking on Yes Button");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC02", "Click on New Order", () -> {
            Liabrary.custom_click(RETR.getNew_Order(), "Click on New Order");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC03", "Click on WaterProofing", () -> {
            Liabrary.custom_click(RETR.getWaterproofing(), "Click on WaterProofing");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC04", "Click on Add Cart (1st time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC05", "Click on Add Cart (2nd time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC06", "Click on View Cart", () -> {
            Liabrary.custom_click(RETR.getProduct_View_Cart(), "Click on View Cart");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC07", "Click on Submit Button", () -> {
            Liabrary.custom_click(RETR.getSubmit_Button(), "Click on Submit Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC08", "Click on Yes Button", () -> {
//            Liabrary.custom_click(RETR.getYes_Button(), "Click on Yes Button");
//        });
//        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC09", "Click on Okay Button", () -> {
            Liabrary.custom_click(RETR.getOkay_Button(), "Click on Okay Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC10", "Click on Points New Order", () -> {
            Liabrary.custom_click(RETR.getPoints_New_Order(), "Click on Points New Order");
        });
        Thread.sleep(1000);
    }
    @Test(priority=2)
    public void Order_Test_NS02() throws Exception {

        RE_New_Order RETR = PageFactory.initElements(driver, RE_New_Order.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking on Add To Cart Button");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(RETR.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC02", "Click on New Order", () -> {
            Liabrary.custom_click(RETR.getNew_Order(), "Click on New Order");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC03", "Click on WaterProofing", () -> {
            Liabrary.custom_click(RETR.getWaterproofing(), "Click on WaterProofing");
        });
        Thread.sleep(2000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC04", "Click on Add Cart (1st time)", () -> {
//            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC05", "Click on Add Cart (2nd time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC06", "Click on View Cart", () -> {
            Liabrary.custom_click(RETR.getProduct_View_Cart(), "Click on View Cart");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC07", "Click on Submit Button", () -> {
            Liabrary.custom_click(RETR.getSubmit_Button(), "Click on Submit Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC08", "Click on Yes Button", () -> {
            Liabrary.custom_click(RETR.getYes_Button(), "Click on Yes Button");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC09", "Click on Okay Button", () -> {
            Liabrary.custom_click(RETR.getOkay_Button(), "Click on Okay Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC10", "Click on Points New Order", () -> {
            Liabrary.custom_click(RETR.getPoints_New_Order(), "Click on Points New Order");
        });
        Thread.sleep(1000);
    }
    
    
}
