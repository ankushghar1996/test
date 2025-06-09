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
import HO_Reports.IR_Geographical_Hierarchy_Report_Main;

public class IR_Geographical_Hierarchy_Report extends BaseClass {

    @Test
    public void Inventory_FlashBy_Product_Report () throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        IR_Geographical_Hierarchy_Report_Main GHR = PageFactory.initElements(driver, IR_Geographical_Hierarchy_Report_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC01", "Verify click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC02", "Click on Inventory Report Submenu", () -> {
            Liabrary.custom_click(hp.getInventory_Report_SubMenu(), "Click On Inventory_Report_SubMenu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC03", "Click on Geographical Hierarchy Report Menu", () -> {
            Liabrary.custom_click(GHR.getGeographical_Hierarchy_Menu(), "Click On Geographical Hierarchy Report Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC04", "Verify Page Title", () -> {
            WebElement Dealer_Details_Approval = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_headerpages']"));
            String Actual_Text = Dealer_Details_Approval.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Inventory Flash By Geographical Hierarchy ";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC05", "Click on Product Dropdown", () -> {
            Liabrary.custom_click(GHR.getProduct_Dropdown(), "Click On Product Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC06", "Select Product from Dropdown", () -> {
            Liabrary.custom_click(GHR.getProduct_Dropdown_Value(), "Select Product Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC07", "Click on Sales Hierarchy Dropdown", () -> {
            Liabrary.custom_click(GHR.getSales_Hierarchy_Dropdown(), "Click On Sales Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC08", "Select Sales Hierarchy", () -> {
            Liabrary.custom_click(GHR.getSales_Hierarchy_Dropdown_Value(), "Select Sales Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC09", "Click on Geography Hierarchy Dropdown", () -> {
            Liabrary.custom_click(GHR.getGeography_Hierarchy_Dropdown(), "Select Geography Hierarchy Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC10", "Select Geography Hierarchy", () -> {
            Liabrary.custom_click(GHR.getGeography_Hierarchy_Dropdown_Value(), "Select Geography Hierarchy Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC11", "Click on For Year Dropdown", () -> {
            Liabrary.custom_click(GHR.getFor_Year_Dropdown(), "Select For Year Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC12", "Select Year", () -> {
            Liabrary.custom_click(GHR.getFor_Year_Dropdown_Value(), "Select For Year Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC13", "Click on For Month Dropdown", () -> {
            Liabrary.custom_click(GHR.getFor_Month_Dropdown(), "Select For Month Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC14", "Select Month", () -> {
            Liabrary.custom_click(GHR.getFor_Month_Dropdown_Value(), "Select For Month Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC15", "Click on Report Level Dropdown", () -> {
            Liabrary.custom_click(GHR.getReport_Level_Dropdown(), "Select Report Level Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC16", "Select Report Level", () -> {
            Liabrary.custom_click(GHR.getReport_Level_Dropdown_Value(), "Select Report Level Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC17", "Click on View Button", () -> {
            Liabrary.custom_click(GHR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC18", "Select Grid Data", () -> {
            Liabrary.custom_click(GHR.getGrid_Data_Value(), "Select Grid Data Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_IR_Geographical_Hierarchy_Report_TC19", "Click on Download Button", () -> {
            Liabrary.custom_click(GHR.getDownload_Button(), "Click on Download Button");
        });
        Thread.sleep(1000);
        
        
    }
}
