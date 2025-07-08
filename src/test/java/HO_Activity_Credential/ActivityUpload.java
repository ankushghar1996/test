package HO_Activity_Credential;

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
import HO_Activity.Activity_Upload;

public class ActivityUpload extends BaseClass {

    @Test(priority = 0)
    public void Target_Upload() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Activity_Upload AU = PageFactory.initElements(driver, Activity_Upload.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_01", "Verify that user should be select Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_02", "Verify that user should be select Activity Master sub menu", () -> {
            Liabrary.custom_click(hp.getActivityMaster_SubMenu(), "select Activity Master sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_03", "Verify that user should be select Activity Upload Page", () -> {
            Liabrary.custom_click(AU.getActivity_Upload(), "select Activity Upload Page");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_04", "Verify Activity Upload header text", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//*[@class=' mt-2 ml-2 text-bold']"));
            String Actual_Text = UploadText.getText();
            String Expected_Text = "Activity Upload";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_05", "Verify click on User Type1 dropdown", () -> {
            Liabrary.custom_click(AU.getUserType1_Dropdown(), "click User Type1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_06", "Verify select Value User Type1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectUserType1_Dropdown(), "select Value User Type1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_07", "Verify select Division1 dropdown", () -> {
            Liabrary.custom_click(AU.getDivision_Dropdown(), "select Division1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_08", "Verify select Value Division1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectDivision_Dropdown(), "select Value Division1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_09", "Verify select Activity For 1 dropdown", () -> {
            Liabrary.custom_click(AU.getActivityFor1_Dropdown(), "select Activity For 1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_10", "Verify select Value Activity For 1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityFor1_Dropdown(), "select Value Activity For 1 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_11", "Verify select Activity Type dropdown", () -> {
            Liabrary.custom_click(AU.getActivityType_Dropdown(), "select Activity Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_12", "Verify select Value Activity Type dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityType_Dropdown(), "select Value Activity Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_13", "Verify select month1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectMonth1_Dropdown(), "select month1 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_14", "Verify select value month1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueMonth1_Dropdown(), "select value month1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_15", "Verify select year1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectYear1_Dropdown(), "select year1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_16", "Verify select value year1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueYear1_Dropdown(), "select value year1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_17", "Verify select User Type2 dropdown", () -> {
            Liabrary.custom_click(AU.getUserType2_Dropdown(), "select User Type2 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_18", "Verify select Value User Type2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectUserType2_Dropdown(), "select User Type2 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_19", "Verify select Activity For 2 dropdown", () -> {
            Liabrary.custom_click(AU.getActivityFor2_Dropdown(), "select Activity For 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_20", "Verify select value Activity For 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityFor2_Dropdown(), "select value Activity For 2 dropdown");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_21", "Verify select month 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectMonth2_Dropdown(), "select month 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_22", "Verify select value month 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueMonth2_Dropdown(), "select value month 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_23", "Verify select year 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectYear2_Dropdown(), "select year 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_24", "Verify select value year 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueYear2_Dropdown(), "select value year 2 dropdown");
        });
        Thread.sleep(1000);
     
    }
    
    @Test(priority = 1)
    public void Target_Upload_NS01() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Activity_Upload AU = PageFactory.initElements(driver, Activity_Upload.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_01", "Verify that user should be select Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_02", "Verify that user should be select Activity Master sub menu", () -> {
            Liabrary.custom_click(hp.getActivityMaster_SubMenu(), "select Activity Master sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_03", "Verify that user should be select Activity Upload Page", () -> {
            Liabrary.custom_click(AU.getActivity_Upload(), "select Activity Upload Page");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_04", "Verify Activity Upload header text", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//*[@class=' mt-2 ml-2 text-bold']"));
            String Actual_Text = UploadText.getText();
            String Expected_Text = "Activity Upload";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        Thread.sleep(2000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_05", "Verify click on User Type1 dropdown", () -> {
            Liabrary.custom_click(AU.getUserType1_Dropdown(), "click User Type1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_06", "Verify select Value User Type1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectUserType1_Dropdown(), "select Value User Type1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_07", "Verify select Division1 dropdown", () -> {
            Liabrary.custom_click(AU.getDivision_Dropdown(), "select Division1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_08", "Verify select Value Division1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectDivision_Dropdown(), "select Value Division1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_09", "Verify select Activity For 1 dropdown", () -> {
            Liabrary.custom_click(AU.getActivityFor1_Dropdown(), "select Activity For 1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_10", "Verify select Value Activity For 1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityFor1_Dropdown(), "select Value Activity For 1 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_11", "Verify select Activity Type dropdown", () -> {
            Liabrary.custom_click(AU.getActivityType_Dropdown(), "select Activity Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_12", "Verify select Value Activity Type dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityType_Dropdown(), "select Value Activity Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_13", "Verify select month1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectMonth1_Dropdown(), "select month1 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_14", "Verify select value month1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueMonth1_Dropdown(), "select value month1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_15", "Verify select year1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectYear1_Dropdown(), "select year1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_16", "Verify select value year1 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueYear1_Dropdown(), "select value year1 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_17", "Verify select User Type2 dropdown", () -> {
            Liabrary.custom_click(AU.getUserType2_Dropdown(), "select User Type2 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_18", "Verify select Value User Type2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectUserType2_Dropdown(), "select User Type2 dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_19", "Verify select Activity For 2 dropdown", () -> {
            Liabrary.custom_click(AU.getActivityFor2_Dropdown(), "select Activity For 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_20", "Verify select value Activity For 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectActivityFor2_Dropdown(), "select value Activity For 2 dropdown");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_21", "Verify select month 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectMonth2_Dropdown(), "select month 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_22", "Verify select value month 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueMonth2_Dropdown(), "select value month 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_23", "Verify select year 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectYear2_Dropdown(), "select year 2 dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_ActivityUpload_TC_24", "Verify select value year 2 dropdown", () -> {
            Liabrary.custom_click(AU.getSelectValueYear2_Dropdown(), "select value year 2 dropdown");
        });
        Thread.sleep(1000);
        
        
               
}
}