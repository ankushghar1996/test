package HO_Settings_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Settings.Cluster_Mapping;

public class Test_Cluster_Mapping extends BaseClass {

    @Test
    public void Cluster_Mapping() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        //ABC
        Cluster_Mapping CM = PageFactory.initElements(driver, Cluster_Mapping.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_03", "Select Cluster Mapping Page.", () -> {
            Liabrary.custom_click(CM.getCluster_Mapping_Menu(), "Select Cluster Mapping Page");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_04", "Verify Cluster Mapping Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//span[text()='Cluster Mapping']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Cluster Mapping";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_05", "Select Cluster Mapping Dropdown.", () -> {
            Liabrary.custom_click(CM.getSelect_Cluster_Type_Dropdown(), "Select Cluster Mapping Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_06", "Select Cluster Mapping Dropdown Value.", () -> {
            Liabrary.custom_click(CM.getSelect_Cluster_Type_Dropdown_Value(), "Select Cluster Mapping Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_07", "Click on Search Button.", () -> {
            Liabrary.custom_click(CM.getSearch_Button(), "Click on Search Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_08", "Click on Cluster Mapping Add Button.", () -> {
            Liabrary.custom_click(CM.getADD_BTN(), "Click on Cluster Mapping Add Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_09", "Verify Area Hierarchy Mapping Header Text.", () -> {
            WebElement areaHeader = driver.findElement(By.xpath("//h4[normalize-space()='Area Hierarchy Mapping']"));
            String actualText2 = areaHeader.getText();
            System.out.println(actualText2);
            String expectedText2 = "Area Hierarchy Mapping";
            Assert.assertEquals(actualText2, expectedText2);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_10", "Click on Cluster Add Button.", () -> {
            Liabrary.custom_click(CM.getADD_BTN(), "Click on Cluster Add Button");
        });
        Thread.sleep(1000);

        
        Actions action = new Actions(driver);

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_11", "Select Area Type from dropdown.", () -> {
            WebElement element1 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Arrow']"));
            action.moveToElement(element1).click().perform();
       
            driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_12", "Select Area Name from dropdown.", () -> {
            WebElement element2 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_Arrow']"));
            action.moveToElement(element2).click().perform();
            
            driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_DropDown']//ul//li[normalize-space()='Karnataka and Kerala']")).click();
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_13", "Select Parent Area from dropdown.", () -> {
            WebElement element3 = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_Input']"));
            action.moveToElement(element3).click().perform();
           
            driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_DropDown']//ul//li[text()='UAT.RSM']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Mapping_TC_14", "Click Cancel button.", () -> {
            Liabrary.custom_click(CM.getCancel_button(), "Click Cancel Button");
        });
        Thread.sleep(1000);
        
        
    }
}
