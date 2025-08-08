package HO_Scheme_Credential;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Scheme.Scheme_Master_Add_Page;

public class SM_Scheme_AddPage extends BaseClass {

    @Test(priority = 0)
    public void Scheme_Master_AddPage() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_Add_Page SMA = PageFactory.initElements(driver, Scheme_Master_Add_Page.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC02", "Select Scheme Setup Sub Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC03", "Select Scheme Master Menu", () -> {
            Liabrary.custom_click(SMA.getScheme_Master_Menu(), "Select Scheme Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC04", "Verify Scheme Master Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
            Assert.assertEquals(header.getText(), "Scheme Master");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC05", "Click Add Button", () -> {
            Liabrary.custom_click(SMA.getAdd_btn(), "Click Add Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC06", "Verify New Scheme Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            Assert.assertEquals(header.getText(), "New Scheme");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC07", "Click Product Hierarchy Dropdown", () -> {
            Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), "Click Product Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC08", "Select Product Hierarchy Value", () -> {
            Liabrary.custom_click(SMA.getProductHierarchySelect_dropdown(), "Select Product Hierarchy Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC09", "Click Product List Dropdown", () -> {
            Liabrary.custom_click(SMA.getProduct_List_dropdown(), "Click Product List Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC10", "Select Product List Value", () -> {
            Liabrary.custom_click(SMA.getProduct_ListSelect_dropdown(), "Select Product List Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC11", "Enter Scheme Name", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), "Enter Scheme Name");
        });
        Thread.sleep(1000);
        

        // Start Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC12", "Open Start Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
        });

        while (true) {
            String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
            if (text.equals("August, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC13", "Select Start Date", () -> {
            List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='28']"));
            for (WebElement element : ele) {
                if (element.getText().equals("28")) {
                    element.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        // End Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC14", "Open End Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
        });

        while (true) {
            String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
            if (text1.equals("December, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC15", "Select End Date", () -> {
            List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
            for (WebElement element1 : ele1) {
                if (element1.getText().equals("31")) {
                    element1.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC16", "Click Scheme Category Dropdown", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "Click Scheme Category Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC17", "Select Scheme Category Value", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select Scheme Category Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC18", "Enter Description", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "Enter Description");
        });
        Thread.sleep(1000);
        

        // TC19 - Distributor Selection
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC19", "Click Distributor Selection", () -> {
            Liabrary.custom_click(SMA.getDistributorSelection_btn(), "Click Distributor Selection");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC20", "Select Distributor State", () -> {
            Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "Select Distributor State");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC21", "Select Distributor Town", () -> {
            Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "Select Distributor Town");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC22", "Close Distributor Popup", () -> {
            Liabrary.custom_click(SMA.getClose_btn(), "Close Distributor Popup");
        });
        Thread.sleep(1000);
        

        // TC20 - Outlet Type
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC23", "Click Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_btn(), "Click Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC24", "Select Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Select Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC25", "Close Outlet Popup", () -> {
            Liabrary.custom_click(SMA.getCloseScheme_btn(), "Close Outlet Popup");
        });
        Thread.sleep(1000);
        
        
        // TC21 - Slab & Points
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC26", "Click Slab Basis Dropdown", () -> {
            Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "Click Slab Basis Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC27", "Select Slab Basis Value", () -> {
            Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select Slab Basis Value");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC28", "Enter TxtOn", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "Enter TxtOn");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC29", "Enter TxtPoint", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "Enter TxtPoint");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC30", "Click Save Button", () -> {
            Liabrary.custom_click(SMA.getSave_btn(), "Click Save Button");
        });
        Thread.sleep(1000);
        
        

    }
    
    @Test(priority = 1)
    public void Scheme_Master_AddPage_AllSku_NS1() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_Add_Page SMA = PageFactory.initElements(driver, Scheme_Master_Add_Page.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_NS("Without click on Add Button");
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC02", "Select Scheme Setup Sub Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC03", "Select Scheme Master Menu", () -> {
            Liabrary.custom_click(SMA.getScheme_Master_Menu(), "Select Scheme Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC04", "Verify Scheme Master Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
            Assert.assertEquals(header.getText(), "Scheme Master");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC05", "Click Add Button", () -> {
//            Liabrary.custom_click(SMA.getAdd_btn(), "Click Add Button");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC06", "Verify New Scheme Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            Assert.assertEquals(header.getText(), "New Scheme");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC07", "Click Product Hierarchy Dropdown", () -> {
            Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), "Click Product Hierarchy Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC08", "Select Product Hierarchy Value", () -> {
            Liabrary.custom_click(SMA.getProductHierarchySelect_dropdown(), "Select Product Hierarchy Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC09", "Click Product List Dropdown", () -> {
            Liabrary.custom_click(SMA.getProduct_List_dropdown(), "Click Product List Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC10", "Select Product List Value", () -> {
            Liabrary.custom_click(SMA.getProduct_ListSelect_dropdown(), "Select Product List Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC11", "Enter Scheme Name", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), "Enter Scheme Name");
        });
        Thread.sleep(1000);
        

        // Start Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC12", "Open Start Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
        });

        while (true) {
            String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
            if (text.equals("August, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC13", "Select Start Date", () -> {
            List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='28']"));
            for (WebElement element : ele) {
                if (element.getText().equals("28")) {
                    element.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        // End Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC14", "Open End Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
        });

        while (true) {
            String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
            if (text1.equals("December, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC15", "Select End Date", () -> {
            List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
            for (WebElement element1 : ele1) {
                if (element1.getText().equals("31")) {
                    element1.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC16", "Click Scheme Category Dropdown", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "Click Scheme Category Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC17", "Select Scheme Category Value", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select Scheme Category Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC18", "Enter Description", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "Enter Description");
        });
        Thread.sleep(1000);
        

        // TC19 - Distributor Selection
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC19", "Click Distributor Selection", () -> {
            Liabrary.custom_click(SMA.getDistributorSelection_btn(), "Click Distributor Selection");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC20", "Select Distributor State", () -> {
            Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "Select Distributor State");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC21", "Select Distributor Town", () -> {
            Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "Select Distributor Town");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC22", "Close Distributor Popup", () -> {
            Liabrary.custom_click(SMA.getClose_btn(), "Close Distributor Popup");
        });
        Thread.sleep(1000);
        

        // TC20 - Outlet Type
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC23", "Click Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_btn(), "Click Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC24", "Select Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Select Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC25", "Close Outlet Popup", () -> {
            Liabrary.custom_click(SMA.getCloseScheme_btn(), "Close Outlet Popup");
        });
        Thread.sleep(1000);
        
        
        // TC21 - Slab & Points
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC26", "Click Slab Basis Dropdown", () -> {
            Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "Click Slab Basis Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC27", "Select Slab Basis Value", () -> {
            Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select Slab Basis Value");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC28", "Enter TxtOn", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "Enter TxtOn");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC29", "Enter TxtPoint", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "Enter TxtPoint");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC30", "Click Save Button", () -> {
            Liabrary.custom_click(SMA.getSave_btn(), "Click Save Button");
        });
        Thread.sleep(1000);
        
        

    }
    
    @Test(priority = 2)
    public void Scheme_Master_AddPage_AllSku_NS2() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_Add_Page SMA = PageFactory.initElements(driver, Scheme_Master_Add_Page.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without selecting Product Hierarchy Dropdown");

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC02", "Select Scheme Setup Sub Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC03", "Select Scheme Master Menu", () -> {
            Liabrary.custom_click(SMA.getScheme_Master_Menu(), "Select Scheme Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC04", "Verify Scheme Master Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
            Assert.assertEquals(header.getText(), "Scheme Master");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC05", "Click Add Button", () -> {
            Liabrary.custom_click(SMA.getAdd_btn(), "Click Add Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC06", "Verify New Scheme Header", () -> {
            WebElement header = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            Assert.assertEquals(header.getText(), "New Scheme");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC07", "Click Product Hierarchy Dropdown", () -> {
//            Liabrary.custom_click(SMA.getProductHierarchy_dropdown(), "Click Product Hierarchy Dropdown");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC08", "Select Product Hierarchy Value", () -> {
            Liabrary.custom_click(SMA.getProductHierarchySelect_dropdown(), "Select Product Hierarchy Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC09", "Click Product List Dropdown", () -> {
            Liabrary.custom_click(SMA.getProduct_List_dropdown(), "Click Product List Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC10", "Select Product List Value", () -> {
            Liabrary.custom_click(SMA.getProduct_ListSelect_dropdown(), "Select Product List Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC11", "Enter Scheme Name", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeName_Textbox(), excel.getStringdata("HO_Scheme_Add", 1, 0), "Enter Scheme Name");
        });
        Thread.sleep(1000);
        

        // Start Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC12", "Open Start Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_popupButton']")).click();
        });

        while (true) {
            String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_Title']")).getText();
            if (text.equals("August, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC13", "Select Start Date", () -> {
            List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpStartDate_calendar']//table//tbody//tr//td//a[text()='2']"));
            for (WebElement element : ele) {
                if (element.getText().equals("22")) {
                    element.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        // End Date Calendar
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC14", "Open End Date Calendar", () -> {
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_popupButton']")).click();
        });

        while (true) {
            String text1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_Title']")).getText();
            if (text1.equals("December, 2025")) break;
            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            Thread.sleep(1000);
        }

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC15", "Select End Date", () -> {
            List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpEndDate_calendar']//table//tbody//tr//td//a[text()='31']"));
            for (WebElement element1 : ele1) {
                if (element1.getText().equals("31")) {
                    element1.click();
                    break;
                }
            }
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC16", "Click Scheme Category Dropdown", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagory_dropdown(), "Click Scheme Category Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC17", "Select Scheme Category Value", () -> {
            Liabrary.custom_click(SMA.getSchemeCatagorySelect_dropdown(), "Select Scheme Category Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC18", "Enter Description", () -> {
            Liabrary.custom_Sendkeys(SMA.getSchemeDiscription_Txtbox(), excel.getStringdata("HO_Scheme_Add", 1, 1), "Enter Description");
        });
        Thread.sleep(1000);
        

        // TC19 - Distributor Selection
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC19", "Click Distributor Selection", () -> {
            Liabrary.custom_click(SMA.getDistributorSelection_btn(), "Click Distributor Selection");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC20", "Select Distributor State", () -> {
            Liabrary.custom_click(SMA.getDistributorState_SelectCheckBox(), "Select Distributor State");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC21", "Select Distributor Town", () -> {
            Liabrary.custom_click(SMA.getDistributorTown_SelectCheckBox(), "Select Distributor Town");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC22", "Close Distributor Popup", () -> {
            Liabrary.custom_click(SMA.getClose_btn(), "Close Distributor Popup");
        });
        Thread.sleep(1000);
        

        // TC20 - Outlet Type
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC23", "Click Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_btn(), "Click Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC24", "Select Outlet Type", () -> {
            Liabrary.custom_click(SMA.getOutletType_SelectChecBox(), "Select Outlet Type");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC25", "Close Outlet Popup", () -> {
            Liabrary.custom_click(SMA.getCloseScheme_btn(), "Close Outlet Popup");
        });
        Thread.sleep(1000);
        
        
        // TC21 - Slab & Points
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC26", "Click Slab Basis Dropdown", () -> {
            Liabrary.custom_click(SMA.getSlabBasis_dropdown(), "Click Slab Basis Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC27", "Select Slab Basis Value", () -> {
            Liabrary.custom_click(SMA.getSlabBasisSelect_dropdown(), "Select Slab Basis Value");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC28", "Enter TxtOn", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtOn1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 2), "Enter TxtOn");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC29", "Enter TxtPoint", () -> {
            Liabrary.custom_Sendkeys(SMA.getTxtPoint1_ChechBox(), excel.getNumericdata("HO_Scheme_Add", 1, 3), "Enter TxtPoint");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_AddPage_TC30", "Click Save Button", () -> {
            Liabrary.custom_click(SMA.getSave_btn(), "Click Save Button");
        });
        Thread.sleep(1000);
        
        

    }
		
		
}	
		
