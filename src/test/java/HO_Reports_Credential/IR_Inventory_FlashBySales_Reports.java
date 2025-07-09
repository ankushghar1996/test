package HO_Reports_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Reports.IR_Inventory_FlashBy_Product_Report_Main;

public class IR_Inventory_FlashBySales_Reports extends BaseClass {

	@Test(priority=0)
    public void Inventory_FlashBySales_Reports() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IFBSR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC03", "Click on Inventory Flash By Sales Hierarchy Report Menu", () -> {
            Liabrary.custom_click(IFBSR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Sales Hierarchy Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Sales Hierarchy Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC05", "Click on Product Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getProduct_Dropdown(), "Click On Product Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC06", "Select Product Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC08", "Select Sales Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC10", "Select Geography Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC12", "Select For Year Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC14", "Select For Month Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC16", "Select Report Level Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(IFBSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC18", "Select Grid Data Value", () -> {
            Liabrary.custom_click(IFBSR.getGrid_Button_Value(), "Select Grid Data value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(IFBSR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=1)
    public void Inventory_FlashBySales_Reports_NS01() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IFBSR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click On Inventory Flash By Sales Hierarchy Report Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC03", "Click on Inventory Flash By Sales Hierarchy Report Menu", () -> {
//            Liabrary.custom_click(IFBSR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Sales Hierarchy Report Menu");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Sales Hierarchy Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC05", "Click on Product Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getProduct_Dropdown(), "Click On Product Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC06", "Select Product Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC08", "Select Sales Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC10", "Select Geography Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC12", "Select For Year Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC14", "Select For Month Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC16", "Select Report Level Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(IFBSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC18", "Select Grid Data Value", () -> {
            Liabrary.custom_click(IFBSR.getGrid_Button_Value(), "Select Grid Data value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(IFBSR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=2)
    public void Inventory_FlashBySales_Reports_NS02() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IFBSR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click On Select Product Dropdown Value");
        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC03", "Click on Inventory Flash By Sales Hierarchy Report Menu", () -> {
            Liabrary.custom_click(IFBSR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Sales Hierarchy Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Sales Hierarchy Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC05", "Click on Product Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getProduct_Dropdown(), "Click On Product Dropdown");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC06", "Select Product Dropdown Value", () -> {
//            Liabrary.custom_click(IFBSR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC08", "Select Sales Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC10", "Select Geography Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC12", "Select For Year Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC14", "Select For Month Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC16", "Select Report Level Dropdown Value", () -> {
            Liabrary.custom_click(IFBSR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(IFBSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC18", "Select Grid Data Value", () -> {
            Liabrary.custom_click(IFBSR.getGrid_Button_Value(), "Select Grid Data value");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBySales_Reports_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(IFBSR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
}

}