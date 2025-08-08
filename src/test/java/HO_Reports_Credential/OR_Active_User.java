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
import HO_Reports.OR_Active_User_Main;

public class OR_Active_User extends BaseClass {

    @Test(priority=0)
    public void Active_User_Reports() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        OR_Active_User_Main AU = PageFactory.initElements(driver, OR_Active_User_Main.class);

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC02", "Click on Other Report Submenu", () -> {
            Liabrary.custom_click(hp.getOther_Report_SubMenu(), "Click On Other_Report_SubMenu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC03", "Click on Active User Report Menu", () -> {
            Liabrary.custom_click(AU.getActive_User_Report_Menu(), "Click On Active_User_Report Menu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC04", "Verify Header Text", () -> {
//            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
//            String Actual_Text = Header_Text.getText();
//            System.out.println(Actual_Text);
//            String Expected_Text = "Active Users Reports";
//            Assert.assertEquals(Expected_Text, Actual_Text);
//        });
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC05", "Click on Select User Type Dropdown", () -> {
            Liabrary.custom_click(AU.getSelect_User_Type_Dropdown(), "Select_User_Type_Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC06", "Select User Type Dropdown Value", () -> {
            Liabrary.custom_click(AU.getSelect_User_Type_Dropdown_Value(), "Select_User_Type_Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC07", "Click on View Button", () -> {
            Liabrary.custom_click(AU.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC08", "Click on Download Button", () -> {
//            Liabrary.custom_click(AU.getDownload_Button(), "Click on Download button");
//        });
//        Thread.sleep(1000);
        
        
    }
    
    @Test(priority=1)
    public void Active_User_Reports_NS1() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        OR_Active_User_Main AU = PageFactory.initElements(driver, OR_Active_User_Main.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without click on Active User Report Menu");

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC01", "Click on Report Menu", () -> {
            Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC02", "Click on Other Report Submenu", () -> {
            Liabrary.custom_click(hp.getOther_Report_SubMenu(), "Click On Other_Report_SubMenu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC03", "Click on Active User Report Menu", () -> {
//            Liabrary.custom_click(AU.getActive_User_Report_Menu(), "Click On Active_User_Report Menu");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC04", "Verify Header Text", () -> {
            WebElement Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String Actual_Text = Header_Text.getText();
            System.out.println(Actual_Text);
            String Expected_Text = "Active Users Reports";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC05", "Click on Select User Type Dropdown", () -> {
            Liabrary.custom_click(AU.getSelect_User_Type_Dropdown(), "Select_User_Type_Dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC06", "Select User Type Dropdown Value", () -> {
            Liabrary.custom_click(AU.getSelect_User_Type_Dropdown_Value(), "Select_User_Type_Dropdown Value");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC07", "Click on View Button", () -> {
            Liabrary.custom_click(AU.getView_Button(), "Click on View Button");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_OR_Active_User_TC08", "Click on Download Button", () -> {
            Liabrary.custom_click(AU.getDownload_Button(), "Click on Download button");
        });
        Thread.sleep(1000);
        
        
    }
}
