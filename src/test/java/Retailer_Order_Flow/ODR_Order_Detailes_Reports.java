package Retailer_Order_Flow;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Reports.ODR_Order_Detailes_Reports_Main;

public class ODR_Order_Detailes_Reports extends BaseClass {

    @Test
    public void Order_Detailes_Reports() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        ODR_Order_Detailes_Reports_Main ODR = PageFactory.initElements(driver, ODR_Order_Detailes_Reports_Main.class);
       
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC02", "Click on Order Report Submenu", () -> {
            Liabrary.custom_click(hp.getOrder_Report_SubMenu(), "Click On Order_Report_SubMenu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC03", "Click on Order Details Reports Menu", () -> {
            Liabrary.custom_click(ODR.getOrder_Details_Report_Menu(), "Click On Order_Detailes_Reports Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC04", "Verify Header Text", () -> {
            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_PageHeader']"));
            String Actual_Text = Header_Text.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Day Wise Order Details Report";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
       
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC05", "Click on Select Type Master Dropdown", () -> {
            Liabrary.custom_click(ODR.getSelect_Type_Master_Dropdown(), "Click On Select_Type_Master_Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC06", "Select Type Master Dropdown Value", () -> {
            Liabrary.custom_click(ODR.getSelect_Type_Master_Dropdown_Value(), "Select Type Master Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC07", "Enter From Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/7/2025");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC08", "Enter To Date", () -> {
            driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("30/08/2025");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC09", "Click on View Button and print Grid Data", () -> {
        Liabrary.custom_click(ODR.getView_Button(), "Click on View Button");

            // Wait for grid to load
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            // Print headers
            List<WebElement> headers = ObjectRepo.driver.findElements(By.xpath("//table[@class='rgMasterTable rgClipCells']/thead/tr/th"));
            StringBuilder headerRow = new StringBuilder("HEADERS: ");
            for (WebElement header : headers) {
                headerRow.append(header.getText().trim()).append(" | ");
            }
            System.out.println(headerRow.toString());
            ObjectRepo.test.log(com.aventstack.extentreports.Status.INFO, headerRow.toString()); // Log to Extent

            // Print table body rows
            List<WebElement> rows = ObjectRepo.driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//table/tbody/tr"));
            for (int i = 0; i < rows.size(); i++) {
                List<WebElement> cells = rows.get(i).findElements(By.xpath(".//td"));
                StringBuilder rowData = new StringBuilder();
                for (WebElement cell : cells) {
                    // Try to get inner text safely
                    String text = cell.getText().trim();
                    if (text.isEmpty()) {
                        // fallback if empty
                        text = cell.getAttribute("innerText").trim();
                    }
                    rowData.append(text).append(" | ");
                }
                
                System.out.println("Row " + (i + 1) + ": " + rowData.toString());
                //Print In Report
                ObjectRepo.test.log(com.aventstack.extentreports.Status.INFO, "Row " + (i + 1) + ": " + rowData.toString());
            }
        });
        

        ObjectRepo.startTestAndLog_1_SS("SA_ODR_Order_Detailes_Reports_TC10", "Click on Download Button", () -> {
            Liabrary.custom_click(ODR.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000); 
    }
    
    
}