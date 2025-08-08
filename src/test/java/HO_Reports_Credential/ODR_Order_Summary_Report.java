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
import HO_Reports.ODR_Order_Summary_Report_Main;

public class ODR_Order_Summary_Report extends BaseClass {

    @Test(priority=0)
    public void Order_Detailes_Reports() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        ODR_Order_Summary_Report_Main OSR = PageFactory.initElements(driver, ODR_Order_Summary_Report_Main.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC02", "Click on Order Report Submenu", () -> {
            Liabrary.custom_click(hp.getOrder_Report_SubMenu(), "Click On Order_Report_SubMenu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC03", "Click on Order Summary Reports Menu", () -> {
            Liabrary.custom_click(OSR.getOrder_Summary_Report_Menu(), "Click On Order_Detailes_Reports Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC04", "Verify Header Text", () -> {
            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_PageHeader']"));
            String Actual_Text = Header_Text.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Order Summary Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC05", "Click on Select Type Master Dropdown", () -> {
            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown(), "Click On Select_Type_Master_Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC06", "Select Type Master Dropdown Value", () -> {
            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown_Value(), "Select Type Master Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC07", "Enter From Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/10/2024");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC08", "Enter To Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("29/11/2024");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC09", "Click on View Button", () -> {
            Liabrary.custom_click(OSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC10", "Click on Download Button", () -> {
//            Liabrary.custom_click(OSR.getDownload_Button(), "Click on Download button");
//        });
//        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=1)
    public void Order_Detailes_Reports_NS1() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        ODR_Order_Summary_Report_Main OSR = PageFactory.initElements(driver, ODR_Order_Summary_Report_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click On Order_Detailes_Reports Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC02", "Click on Order Report Submenu", () -> {
            Liabrary.custom_click(hp.getOrder_Report_SubMenu(), "Click On Order_Report_SubMenu");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC03", "Click on Order Summary Reports Menu", () -> {
//            Liabrary.custom_click(OSR.getOrder_Summary_Report_Menu(), "Click On Order_Detailes_Reports Menu");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC04", "Verify Header Text", () -> {
            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_PageHeader']"));
            String Actual_Text = Header_Text.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Order Summary Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC05", "Click on Select Type Master Dropdown", () -> {
            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown(), "Click On Select_Type_Master_Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC06", "Select Type Master Dropdown Value", () -> {
            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown_Value(), "Select Type Master Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC07", "Enter From Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/10/2024");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC08", "Enter To Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("29/11/2024");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC09", "Click on View Button", () -> {
            Liabrary.custom_click(OSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC10", "Click on Download Button", () -> {
            Liabrary.custom_click(OSR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=2)
    public void Order_Detailes_Reports_NS2() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        ODR_Order_Summary_Report_Main OSR = PageFactory.initElements(driver, ODR_Order_Summary_Report_Main.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click On Select_Type_Master_Dropdown");
        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC02", "Click on Order Report Submenu", () -> {
            Liabrary.custom_click(hp.getOrder_Report_SubMenu(), "Click On Order_Report_SubMenu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC03", "Click on Order Summary Reports Menu", () -> {
            Liabrary.custom_click(OSR.getOrder_Summary_Report_Menu(), "Click On Order_Detailes_Reports Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC04", "Verify Header Text", () -> {
            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_PageHeader']"));
            String Actual_Text = Header_Text.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Order Summary Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });

//        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC05", "Click on Select Type Master Dropdown", () -> {
//            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown(), "Click On Select_Type_Master_Dropdown");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC06", "Select Type Master Dropdown Value", () -> {
            Liabrary.custom_click(OSR.getSelect_TypeMaster_Dropdown_Value(), "Select Type Master Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC07", "Enter From Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/10/2024");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC08", "Enter To Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("29/11/2024");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC09", "Click on View Button", () -> {
            Liabrary.custom_click(OSR.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Summary_Report_TC10", "Click on Download Button", () -> {
            Liabrary.custom_click(OSR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
        
        
    }
}
