package Retailer_Credential;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.Product_Wise_Purchase;

public class Product_Wise_Purchase_Test extends BaseClass_Retailer {

    @Test(priority=0)
    public void Product_Wise_Purchase() throws Exception {

        Product_Wise_Purchase PWP = PageFactory.initElements(driver, Retailer_Portal.Product_Wise_Purchase.class);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(PWP.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC02", "Click on Product Wise Purchase", () -> {
            Liabrary.custom_click(PWP.getProduct_Wise_Purchase(), "Click on Product Wise Purchase");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC03", "Click on Product Wise Purchase Back Button", () -> {
            Liabrary.custom_click(PWP.getProduct_Wise_Purchase_Back_Button(), "Click on Product Wise Purchase Back Button");
        });
        Thread.sleep(1000);
    }
    
    @Test(priority=1)
    public void Product_Wise_Purchase_NS01() throws Exception {

        Product_Wise_Purchase PWP = PageFactory.initElements(driver, Retailer_Portal.Product_Wise_Purchase.class);

        ObjectRepo.startTestAndLog_1_NS("Without Clicking Product Wise Purchase");
        
        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(PWP.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

//        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC02", "Click on Product Wise Purchase", () -> {
//            Liabrary.custom_click(PWP.getProduct_Wise_Purchase(), "Click on Product Wise Purchase");
//        });
//        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC03", "Click on Product Wise Purchase Back Button", () -> {
            Liabrary.custom_click(PWP.getProduct_Wise_Purchase_Back_Button(), "Click on Product Wise Purchase Back Button");
        });
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void Product_Wise_Purchase_NS02_With_Verification() throws Exception {
        
    	 Product_Wise_Purchase PWP = PageFactory.initElements(driver, Retailer_Portal.Product_Wise_Purchase.class);
    	 
    	 ObjectRepo.startTestAndLog_1_NS("Verify Product Wise Purchase Title Is Displayed");
    	 
        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC01", "Click on Menu Button", () -> {
            Liabrary.custom_click(PWP.getMenu(), "Click on Menu Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC02", "Click on Product Wise Purchase", () -> {
            Liabrary.custom_click(PWP.getProduct_Wise_Purchase(), "Click on Product Wise Purchase");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC03", "Verify Product Wise Purchase Title Is Displayed", () -> {
            WebElement title = PWP.getProduct_Wise_Purchase_Title(); // Add this in your Page Object
            if (!title.isDisplayed()) {
                throw new AssertionError("Product Wise Purchase Title not visible");
            }
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("Retailer_PWP_TC04", "Click on Back Button", () -> {
            Liabrary.custom_click(PWP.getProduct_Wise_Purchase_Back_Button(), "Click on Back Button");
        });
        Thread.sleep(1000);
    }

}
