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

public class IR_Inventory_FlashBy_Product_Report extends BaseClass {

    @Test(priority=0)
    public void Inventory_FlashBy_Product_Report() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC01", "Verify click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC03", "Click on Inventory Flash By Product Menu", () -> {
            Liabrary.custom_click(IR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Product Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Product";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC05", "Click on Product Dropdown", () -> {
            Liabrary.custom_click(IR.getProduct_Dropdown(), "Click On Product Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC06", "Select Product Dropdown Value", () -> {
            Liabrary.custom_click(IR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC08", "Select Sales Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC10", "Select Geography Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(IR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC12", "Select For Year Dropdown Value", () -> {
            Liabrary.custom_click(IR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(IR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC14", "Select For Month Dropdown Value", () -> {
            Liabrary.custom_click(IR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(IR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC16", "Select Report Level Dropdown Value", () -> {
            Liabrary.custom_click(IR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(IR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC18", "Select Grid Data Value", () -> {
            Liabrary.custom_click(IR.getGrid_Button_Value(), "Select Grid Data Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(IR.getDownload_Button(), "Click on Download Button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=1)
    public void Inventory_FlashBy_Product_Report_NS01() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Product Dropdown");
        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC01", "Verify click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC03", "Click on Inventory Flash By Product Menu", () -> {
            Liabrary.custom_click(IR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Product Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Product";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        

//        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC05", "Click on Product Dropdown", () -> {
//            Liabrary.custom_click(IR.getProduct_Dropdown(), "Click On Product Dropdown");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC06", "Select Product Dropdown Value", () -> {
            Liabrary.custom_click(IR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC08", "Select Sales Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(IR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC10", "Select Geography Hierarchy Dropdown Value", () -> {
            Liabrary.custom_click(IR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(IR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC12", "Select For Year Dropdown Value", () -> {
            Liabrary.custom_click(IR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(IR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC14", "Select For Month Dropdown Value", () -> {
            Liabrary.custom_click(IR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(IR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC16", "Select Report Level Dropdown Value", () -> {
            Liabrary.custom_click(IR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(IR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC18", "Select Grid Data Value", () -> {
            Liabrary.custom_click(IR.getGrid_Button_Value(), "Select Grid Data Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(IR.getDownload_Button(), "Click on Download Button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=2)
    public void Inventory_FlashBy_Product_Report_NS02() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Inventory_FlashBy_Product_Report_Main IR = PageFactory.initElements(driver, IR_Inventory_FlashBy_Product_Report_Main.class);

        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Inventory Flash By Product Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC01", "Verify click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC03", "Click on Inventory Flash By Product Menu", () -> {
//            Liabrary.custom_click(IR.getInventory_FlashBy_Product_Report_Menu(), "Click On Inventory Flash By Product Menu");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Inventory_FlashBy_Product_Report_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Product";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
}

}