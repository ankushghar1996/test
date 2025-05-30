package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.New_Site_Creation;

public class New_Site_Cred extends BaseClass_SEBS_Portal {

    @Test
    public void SEBS_New_Site_Cred() throws Exception {

        New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_01", "Click on SEBS Menu", () -> {
            Liabrary.custom_click(view.getSEBS_Menu(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_02", "Click on Site Creation SubMenu", () -> {
            Liabrary.custom_click(view.getSite_Creation_SubMenu(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_03", "Click on Add Menu", () -> {
            Liabrary.custom_click(view.getAdd_Menu(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_04", "Click on Distributor Mapped", () -> {
            Liabrary.custom_click(view.getDistributor_Mapped(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_05", "Select Distributor", () -> {
            Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_06", "Open Sales Engineer Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_07", "Select Sales Engineer", () -> {
            Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_08", "Open Location Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_09", "Select Location", () -> {
            Liabrary.custom_click(view.getSelect_Location(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_10", "Open Developer Name Dropdown", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_11", "Select Developer Name", () -> {
            Liabrary.custom_click(view.getSelect_developer_Name(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_12", "Scroll to Site Name Label", () -> {
            WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_13", "Enter Site Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("mukeshdelhi");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_14", "Click Checkbox Flex Default", () -> {
            Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_15", "Scroll to State Label", () -> {
            WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_16", "Click on State Dropdown", () -> {
            Liabrary.custom_click(view.getDropdownMenuButton(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_17", "Select State Checkbox", () -> {
            Liabrary.custom_click(view.getCheckbox(), null);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_18", "Scroll to Contractor Name Label", () -> {
            WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_19", "Enter Contractor Name", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("raj");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_20", "Enter Contractor Contact", () -> {
            driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120142");
        });

        ObjectRepo.startTestAndLog_1_SS("SEBS_Cred_TC_21", "Click Cancel Button", () -> {
            Liabrary.custom_click(view.getCANCEL_Button(), null);
        });
    }
}
