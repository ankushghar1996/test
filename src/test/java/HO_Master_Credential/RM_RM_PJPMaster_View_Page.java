package HO_Master_Credential;

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
import HO_Master.RM_PJPMaster;
import HO_Master.RM_PJPMaster_ViewPage;

public class RM_RM_PJPMaster_View_Page extends BaseClass {

    @Test
    public void RM_PJPmaster() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        RM_PJPMaster PM1 = PageFactory.initElements(driver, RM_PJPMaster.class);
        RM_PJPMaster_ViewPage PM2 = PageFactory.initElements(driver, RM_PJPMaster_ViewPage.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_01", "Verify click on Master Menu", () -> {
            Liabrary.custom_click(hp.getMaster_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_02", "Verify Route Master Submenu click", () -> {
            Liabrary.custom_click(hp.getRouteMaster_SubMenu(), "Select Route Master Submenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_03", "Verify PJP Master Page click", () -> {
            Liabrary.custom_click(PM1.getPJP_Master_Menu(), "Select PJP Master Page");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_04", "Verify PJP Master Header Text", () -> {
            WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("(//*[text()='PJP Master'])[2]"));
            String actual = PJP_Master_Header_Text.getText();
            Assert.assertEquals(actual, "PJP Master");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_05", "Select Division Dropdown", () -> {
            Liabrary.custom_click(PM1.getSelect_Division_Dropdown(), "Select Division From dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_06", "Select Division Dropdown Value", () -> {
            Liabrary.custom_click(PM1.getSelect_Division_Dropdown_Value(), "Select Division From dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_07", "Select Channel Type Dropdown", () -> {
            Liabrary.custom_click(PM1.getChanel_Type_Dropdown(), "Select Channel Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_08", "Select Channel Type Dropdown Value", () -> {
            Liabrary.custom_click(PM1.getChanel_Type_Dropdown_Value(), "Select Channel Type dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_09", "Select Distributor Dropdown", () -> {
            Liabrary.custom_click(PM1.getDistributor_Name_Dropdown(), "Select Distributor dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_10", "Select Distributor Name Dropdown Value", () -> {
            Liabrary.custom_click(PM1.getDistributor_Name_Dropdown_Value(), "Select Distributor Name dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_11", "Select FSG Name Dropdown", () -> {
            Liabrary.custom_click(PM1.getFSG_Name_Dropdown(), "Select FSG Name dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_12", "Select FSG Name Dropdown Value", () -> {
            Liabrary.custom_click(PM1.getFSG_Name_Dropdown_Value(), "Select FSG Name dropdown Value");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_13", "Click View Button", () -> {
            Liabrary.custom_click(CD.getView_Btn(), "Click on View Button");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_14", "Select Row1 Checkbox", () -> {
            Liabrary.custom_click(PM2.getSelect_Row1_Checkbox(), "Select Row1 Checkbox");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_15", "Click Visit_Frequency1 Dropdown Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Select_Case1(), "Click Visit_Frequency1 Dropdown Case1");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_16", "Select Visit_Frequency1 Value (Alternate days)", () -> {
            Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Value_Select_Case1(), "Select Alternate days");
        });
        Thread.sleep(1000);
        

        // Case 1
        
        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_17", "Select WeekDay1 Dropdown Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Select_Case1(), "Select WeekDay1 Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_18", "Select Day in WeekDay1 Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Day_Select_Case1(), "Select WeekDay1 Day");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_19", "Select WeekDay2 Dropdown Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay2_Dropdown_Select_Case1(), "Select WeekDay2 Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_20", "Select Day in WeekDay2 Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay2_Dropdown_Day_Select_Case1(), "Select WeekDay2 Day");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_21", "Select WeekDay3 Dropdown Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay3_Dropdown_Select_Case1(), "Select WeekDay3 Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_22", "Select Day in WeekDay3 Case1", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay3_Dropdown_Day_Select_Case1(), "Select WeekDay3 Day");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_23", "Click Visit_Frequency1 Dropdown Case2", () -> {
            Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Select_Case2(), "Click Visit_Frequency1 Dropdown Case2");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_24", "Select Fortnightly Frequency Case2", () -> {
            Liabrary.custom_click(PM2.getRow1_Visit_Frequency1_Dropdown_Value_Select_Case2(), "Select Fortnightly");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_25", "Select WeekDay1 Dropdown Case2", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Select_Case2(), "Select WeekDay1 Dropdown Case2");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_26", "Select Day in WeekDay1 Dropdown Case2", () -> {
            Liabrary.custom_click(PM2.getRow1_WeekDay1_Dropdown_Value_Select_Case2(), "Select Day in WeekDay1 Case2");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_27", "Select Frequency Details Dropdown Case2", () -> {
            Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Select_Case2(), "Select Frequency Details Dropdown Case2");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_28", "Select Frequency Details Value (Second & Forth Week)", () -> {
            Liabrary.custom_click(PM2.getRow1_Frequency_Details_Dropdown_Value_Select_Case2(), "Select Second & Forth Week");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_29", "Click Save Button", () -> {
//            Liabrary.custom_click(CD.getSave_Btn(), "Click on Save Button");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_HO_Mas_PJPView_TC_30", "Click Close Button", () -> {
            Liabrary.custom_click(CD.getClose_Btn(), "Click on Close Button");
        });
        Thread.sleep(1000);
        
        
    }
}
