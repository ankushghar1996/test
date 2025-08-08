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
import HO_Settings.Cluster_Creation;

public class Test_Cluster_Creation extends BaseClass {

    @Test
    public void Cluster_Creation_Page() throws Exception { 
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Cluster_Creation CC = PageFactory.initElements(driver, Cluster_Creation.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_03", "Select Cluster Creation Page.", () -> {
            Liabrary.custom_click(CC.getCluster_Creation(), "Select Cluster Creation Page");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_04", "Verify Cluster Creation Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//span[text()='Cluster Creation']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Cluster Creation";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_05", "Select Cluster Dropdown.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown(), "Select Cluster Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_06", "Select Cluster Dropdown Value.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown_Value(), "Select Cluster Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_07", "Click on Search Button.", () -> {
            Liabrary.custom_click(CC.getSearch_Button(), "Click on Search Button");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_08", "Click on Cluster Add Button.", () -> {
            Liabrary.custom_click(CC.getCluster_Add_BTN(), "Click on Cluster Add Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_09", "Select Area Type from dropdown.", () -> {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']"));
            action.moveToElement(element).click().perform();
            
            driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_10", "Enter Area Name.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtAreaName']")).sendKeys("New ZSM FOR TEST AUTO");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_11", "Click Close Area Creation button.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")).click();
        });
        Thread.sleep(1000);
        
    }
    @Test(priority=1)
    public void Cluster_Creation_Page_NS1() throws Exception { 
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Cluster_Creation CC = PageFactory.initElements(driver, Cluster_Creation.class);

        ObjectRepo.startTestAndLog_1_NS("Without click on search button");
        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_03", "Select Cluster Creation Page.", () -> {
            Liabrary.custom_click(CC.getCluster_Creation(), "Select Cluster Creation Page");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_04", "Verify Cluster Creation Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//span[text()='Cluster Creation']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Cluster Creation";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_05", "Select Cluster Dropdown.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown(), "Select Cluster Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_06", "Select Cluster Dropdown Value.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown_Value(), "Select Cluster Dropdown Value");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_07", "Click on Search Button.", () -> {
//            Liabrary.custom_click(CC.getSearch_Button(), "Click on Search Button");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_08", "Click on Cluster Add Button.", () -> {
            Liabrary.custom_click(CC.getCluster_Add_BTN(), "Click on Cluster Add Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_09", "Select Area Type from dropdown.", () -> {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']"));
            action.moveToElement(element).click().perform();
            
            driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_10", "Enter Area Name.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtAreaName']")).sendKeys("New ZSM FOR TEST AUTO");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_11", "Click Close Area Creation button.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")).click();
        });
        Thread.sleep(1000);
        
    }
    
    @Test(priority=2)
    public void Cluster_Creation_Page_NS2() throws Exception { 
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Cluster_Creation CC = PageFactory.initElements(driver, Cluster_Creation.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click on Cluster Add Button");
        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_01", "Select Setting menu.", () -> {
            Liabrary.custom_click(hp.getSettings_Menu(), "Select Setting menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_02", "Select Configurations Sub menu.", () -> {
            Liabrary.custom_click(hp.getConfigurations_SubMenu(), "Select Configurations Sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_03", "Select Cluster Creation Page.", () -> {
            Liabrary.custom_click(CC.getCluster_Creation(), "Select Cluster Creation Page");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_04", "Verify Cluster Creation Header Text.", () -> {
            WebElement header = driver.findElement(By.xpath("//span[text()='Cluster Creation']"));
            String actualText = header.getText();
            System.out.println(actualText);
            String expectedText = "Cluster Creation";
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_05", "Select Cluster Dropdown.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown(), "Select Cluster Dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_06", "Select Cluster Dropdown Value.", () -> {
            Liabrary.custom_click(CC.getSelect_Cluster_Dropdown_Value(), "Select Cluster Dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_07", "Click on Search Button.", () -> {
            Liabrary.custom_click(CC.getSearch_Button(), "Click on Search Button");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_08", "Click on Cluster Add Button.", () -> {
//            Liabrary.custom_click(CC.getCluster_Add_BTN(), "Click on Cluster Add Button");
//        });
//        Thread.sleep(1000);
//        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_09", "Select Area Type from dropdown.", () -> {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']"));
            action.moveToElement(element).click().perform();
            
            driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_10", "Enter Area Name.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtAreaName']")).sendKeys("New ZSM FOR TEST AUTO");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_Test_Cluster_Creation_TC_11", "Click Close Area Creation button.", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")).click();
        });
        Thread.sleep(1000);
        
    }
}
