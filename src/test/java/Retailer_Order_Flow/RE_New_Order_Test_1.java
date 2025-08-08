package Retailer_Order_Flow;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.RE_New_Order;

public class RE_New_Order_Test_1 extends BaseClass_Retailer {
	
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
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC05", "Click on Add Cart (2nd time)", () -> {
            Liabrary.custom_click(RETR.getProduct_Add_Cart(), "Click on Add Cart");
       
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        driver.findElement(By.xpath("//input[@class='form-control serach-order-input']")).sendKeys("BRUSHBOND GREY (27.28kg)");

        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.findElement(By.xpath("//div[@class='qty-capsule']//button[text()='+']")).click();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.findElement(By.xpath("//div[@class='qty-capsule']//button[text()='+']")).click();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC06", "Click on View Cart", () -> {
            Liabrary.custom_click(RETR.getProduct_View_Cart(), "Click on View Cart");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC07", "one product minus", () -> {
         driver.findElement(By.xpath("(//div[@class='qty-capsule']//button[text()='-'])[2]")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC08", "Click on Submit Button", () -> {
            Liabrary.custom_click(RETR.getSubmit_Button(), "Click on Submit Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC09", "Click on Yes Button", () -> {
            Liabrary.custom_click(RETR.getYes_Button(), "Click on Yes Button");
        });
        Thread.sleep(2000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC10", "Click on Okay Button", () -> {
            Liabrary.custom_click(RETR.getOkay_Button(), "Click on Okay Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_NewOrder_TC11", "Click on Points New Order", () -> {
            Liabrary.custom_click(RETR.getPoints_New_Order(), "Click on Points New Order");
        });
        Thread.sleep(1000);
    }
}