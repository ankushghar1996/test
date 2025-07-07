package Retailer_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.RE_My_Order;

public class RE_My_Order_Test extends BaseClass_Retailer {

	@Test(priority=0)
    public void Order() throws Exception {

        RE_My_Order REMO = PageFactory.initElements(driver, RE_My_Order.class);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(REMO.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC02", "Click on My Orders", () -> {
            Liabrary.custom_click(REMO.getMy_Order(), "Click on My Orders");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC03", "Click on Orders", () -> {
            Liabrary.custom_click(REMO.getOrder_Select(), "Click on Orders");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC04", "Click on Back Button", () -> {
            Liabrary.custom_click(REMO.getBack_Button(), "Click on Back Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void Order_NS01() throws Exception {

        RE_My_Order REMO = PageFactory.initElements(driver, RE_My_Order.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking on Orders");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(REMO.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC02", "Click on My Orders", () -> {
            Liabrary.custom_click(REMO.getMy_Order(), "Click on My Orders");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC03", "Click on Orders", () -> {
//            Liabrary.custom_click(REMO.getOrder_Select(), "Click on Orders");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC04", "Click on Back Button", () -> {
            Liabrary.custom_click(REMO.getBack_Button(), "Click on Back Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority=2)
    public void Order_NS02() throws Exception {

        RE_My_Order REMO = PageFactory.initElements(driver, RE_My_Order.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking on My Orders");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(REMO.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC02", "Click on My Orders", () -> {
//            Liabrary.custom_click(REMO.getMy_Order(), "Click on My Orders");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC03", "Click on Orders", () -> {
            Liabrary.custom_click(REMO.getOrder_Select(), "Click on Orders");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_MyOrder_TC04", "Click on Back Button", () -> {
            Liabrary.custom_click(REMO.getBack_Button(), "Click on Back Button");
        });
        Thread.sleep(1000);
    }
    
}
