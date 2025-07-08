package HO_Activity_Credential;

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
import HO_Activity.NotificationMaster_AddNotification;
import HO_Activity.NotificationMaster_NotificationSetting;

public class AddNotification extends BaseClass {

    @Test(priority = 0)
    public void Notification_setting() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
        NotificationMaster_AddNotification AN = PageFactory.initElements(driver, NotificationMaster_AddNotification.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
            Thread.sleep(1000);
    

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_02", "Verify click on Notification Master sub menu", () -> {
            Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
        });
            Thread.sleep(1000);
      

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_03", "Verify click on Notification Setting menu", () -> {
            Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_04", "Verify click on Add button", () -> {
            Liabrary.custom_click(CD.getAdd_Btn(), "select Add btn");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_05", "Verify Notification Title Assertion", () -> {
            WebElement UploadText = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String Actual_Text = UploadText.getText();
            String Expected_Text = "Add New Notification";
            Assert.assertEquals(Expected_Text, Actual_Text);
        });
            Thread.sleep(2000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_06", "Click on Type of Notification dropdown", () -> {
            Liabrary.custom_click(AN.getTypeOfNotification_Dropdown(), "select Notification Type dropdown");
        });
            Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_07", "Select value from Type of Notification dropdown", () -> {
            Liabrary.custom_click(AN.getSelectValue_TypeOfNotification_Dropdown(), "select value on Notification dropdown");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_08", "Click on User dropdown", () -> {
            Liabrary.custom_click(AN.getUser_Dropdown(), "click on User dropdown");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_09", "Select value from User dropdown", () -> {
            Liabrary.custom_click(AN.getSelectValue_User_CheckBox(), "select value on User dropdown");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_10", "Click on Division dropdown", () -> {
            Liabrary.custom_click(AN.getDivision_Dropdown(), "click on Division dropdown");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_11", "Select value from Division dropdown", () -> {
            Liabrary.custom_click(AN.getSelectValue_Division_CheckBox(), "select value on Division CheckBox");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_12", "Click on ClusterType dropdown", () -> {
            Liabrary.custom_click(AN.getClusterType_Dropdown(), "click on ClusterType dropdown");
        });
            Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_13", "Select value from ClusterType dropdown", () -> {
            Liabrary.custom_click(AN.getSelectValue_ClusterType_Dropdown(), "select value on ClusterType dropdown");
        });
            Thread.sleep(1000);
       
            
        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_14", "Click on Cluster dropdown", () -> {
            Liabrary.custom_click(AN.getCluster_Dropdown(), "click on Cluster dropdown");
        });
            Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_15", "Select value from Cluster dropdown", () -> {
            Liabrary.custom_click(AN.getSelectValue_Cluster_Dropdown(), "select value on Cluster dropdown");
        });
            Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_16", "Enter Notification Title", () -> {
            driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtNotificationTile']")).sendKeys("Ankush");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_17", "Select date from calendar", () -> {
            String month = "November 2024";
            String date = "20";

            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_popupButton']")).click();
            while (true) {
                String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_Title']")).getText();
                if (text.equals(month)) break;
                else {
                    driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
                }
                
            }

            List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar']//table//tbody//tr//td//a[text()='20']"));
            for (WebElement element : ele) {
                if (element.getText().equals(date)) {
                    element.click();
                    break;
                }
            }
        });
            Thread.sleep(2000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_18", "Click on Sent Time", () -> {
            Liabrary.custom_click(AN.getSent_Time(), "click sent time");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_19", "Enter Time and Period", () -> {
            driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("05:30");
           
            driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("AM");
        });
            Thread.sleep(2000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_20", "Enter Notification Content", () -> {
            driver.findElement(By.xpath("//textarea[@id='ParentMasterContentPlaceHolder1_txtNotification']")).sendKeys("Ankush");
        });
            Thread.sleep(1000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_21", "Click on Upload Image", () -> {
            driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
        });
            Thread.sleep(2000);
            
            WebElement element = driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']"));
            element.sendKeys("C:\\Users\\10277\\Pictures");
            Thread.sleep(2000);
       

        ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_22", "Click on Recurrence Pattern Checkbox", () -> {
            Liabrary.custom_click(AN.getRecurrence_Pattern_Checkbox(), "click recurrence checkbox");
        });
            Thread.sleep(3000);
       
        // If needed:
        // ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_23", "Click on Send Notification", () -> {
        //     Liabrary.custom_click(AN.getSent_Notification_Btn(), "click send notification button");
        //     Thread.sleep(1000);
        // });

    }


//Negative Senario _01 
@Test(priority = 1)
public void Notification_setting_NS01() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
    NotificationMaster_AddNotification AN = PageFactory.initElements(driver, NotificationMaster_AddNotification.class);
    Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

    ObjectRepo.Headlines_logOnlyDescription("NS01= ");
    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_01", "Verify click on Activity Menu", () -> {
        Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
    });
        Thread.sleep(1000);


    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_02", "Verify click on Notification Master sub menu", () -> {
        Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
    });
        Thread.sleep(1000);
  

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_03", "Verify click on Notification Setting menu", () -> {
        Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_04", "Verify click on Add button", () -> {
        Liabrary.custom_click(CD.getAdd_Btn(), "select Add btn");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_05", "Verify Notification Title Assertion", () -> {
        WebElement UploadText = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
        String Actual_Text = UploadText.getText();
        String Expected_Text = "Add New Notification";
        Assert.assertEquals(Expected_Text, Actual_Text);
    });
        Thread.sleep(2000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_06", "Click on Type of Notification dropdown", () -> {
        Liabrary.custom_click(AN.getTypeOfNotification_Dropdown(), "select Notification Type dropdown");
    });
        Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_07", "Select value from Type of Notification dropdown", () -> {
        Liabrary.custom_click(AN.getSelectValue_TypeOfNotification_Dropdown(), "select value on Notification dropdown");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_08", "Click on User dropdown", () -> {
        Liabrary.custom_click(AN.getUser_Dropdown(), "click on User dropdown");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_09", "Select value from User dropdown", () -> {
        Liabrary.custom_click(AN.getSelectValue_User_CheckBox(), "select value on User dropdown");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_10", "Click on Division dropdown", () -> {
        Liabrary.custom_click(AN.getDivision_Dropdown(), "click on Division dropdown");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_11", "Select value from Division dropdown", () -> {
        Liabrary.custom_click(AN.getSelectValue_Division_CheckBox(), "select value on Division CheckBox");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_12", "Click on ClusterType dropdown", () -> {
        Liabrary.custom_click(AN.getClusterType_Dropdown(), "click on ClusterType dropdown");
    });
        Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_13", "Select value from ClusterType dropdown", () -> {
        Liabrary.custom_click(AN.getSelectValue_ClusterType_Dropdown(), "select value on ClusterType dropdown");
    });
        Thread.sleep(1000);
   
        
    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_14", "Click on Cluster dropdown", () -> {
        Liabrary.custom_click(AN.getCluster_Dropdown(), "click on Cluster dropdown");
    });
        Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_15", "Select value from Cluster dropdown", () -> {
        Liabrary.custom_click(AN.getSelectValue_Cluster_Dropdown(), "select value on Cluster dropdown");
    });
        Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_16", "Enter Notification Title", () -> {
        driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtNotificationTile']")).sendKeys("Ankush");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_17", "Select date from calendar", () -> {
        String month = "November 2024";
        String date = "20";

        driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_popupButton']")).click();
        while (true) {
            String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_Title']")).getText();
            if (text.equals(month)) break;
            else {
                driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
            }
            
        }

        List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar']//table//tbody//tr//td//a[text()='20']"));
        for (WebElement element : ele) {
            if (element.getText().equals(date)) {
                element.click();
                break;
            }
        }
    });
        Thread.sleep(2000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_18", "Click on Sent Time", () -> {
        Liabrary.custom_click(AN.getSent_Time(), "click sent time");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_19", "Enter Time and Period", () -> {
        driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("05:30");
       
        driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("AM");
    });
        Thread.sleep(2000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_20", "Enter Notification Content", () -> {
        driver.findElement(By.xpath("//textarea[@id='ParentMasterContentPlaceHolder1_txtNotification']")).sendKeys("Ankush");
    });
        Thread.sleep(1000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_21", "Click on Upload Image", () -> {
        driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
    });
        Thread.sleep(2000);
        
        WebElement element = driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']"));
        element.sendKeys("C:\\Users\\10277\\Pictures");
        Thread.sleep(2000);
   

    ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_22", "Click on Recurrence Pattern Checkbox", () -> {
        Liabrary.custom_click(AN.getRecurrence_Pattern_Checkbox(), "click recurrence checkbox");
    });
        Thread.sleep(3000);
   
    // If needed:
    // ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_23", "Click on Send Notification", () -> {
    //     Liabrary.custom_click(AN.getSent_Notification_Btn(), "click send notification button");
    //     Thread.sleep(1000);
    // });

}
 //Negative Senario _02
 @Test(priority = 2)
 public void Notification_setting_NS02() throws Exception {

 HomePage hp = PageFactory.initElements(driver, HomePage.class);
 NotificationMaster_NotificationSetting NS = PageFactory.initElements(driver, NotificationMaster_NotificationSetting.class);
 NotificationMaster_AddNotification AN = PageFactory.initElements(driver, NotificationMaster_AddNotification.class);
 Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
	
     ObjectRepo.Headlines_logOnlyDescription("NS01= ");
     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_01", "Verify click on Activity Menu", () -> {
         Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
     });
         Thread.sleep(1000);


     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_02", "Verify click on Notification Master sub menu", () -> {
         Liabrary.custom_click(hp.getNotificationMaster_SubMenu(), "select Notification Master sub menu");
     });
         Thread.sleep(1000);
   

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_03", "Verify click on Notification Setting menu", () -> {
         Liabrary.custom_click(NS.getNotificationSetting_Menu(), "click Notification Setting menu");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_04", "Verify click on Add button", () -> {
         Liabrary.custom_click(CD.getAdd_Btn(), "select Add btn");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_05", "Verify Notification Title Assertion", () -> {
         WebElement UploadText = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
         String Actual_Text = UploadText.getText();
         String Expected_Text = "Add New Notification";
         Assert.assertEquals(Expected_Text, Actual_Text);
     });
         Thread.sleep(2000);
     

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_06", "Click on Type of Notification dropdown", () -> {
         Liabrary.custom_click(AN.getTypeOfNotification_Dropdown(), "select Notification Type dropdown");
     });
         Thread.sleep(1000);
     

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_07", "Select value from Type of Notification dropdown", () -> {
         Liabrary.custom_click(AN.getSelectValue_TypeOfNotification_Dropdown(), "select value on Notification dropdown");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_08", "Click on User dropdown", () -> {
         Liabrary.custom_click(AN.getUser_Dropdown(), "click on User dropdown");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_09", "Select value from User dropdown", () -> {
         Liabrary.custom_click(AN.getSelectValue_User_CheckBox(), "select value on User dropdown");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_10", "Click on Division dropdown", () -> {
         Liabrary.custom_click(AN.getDivision_Dropdown(), "click on Division dropdown");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_11", "Select value from Division dropdown", () -> {
         Liabrary.custom_click(AN.getSelectValue_Division_CheckBox(), "select value on Division CheckBox");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_12", "Click on ClusterType dropdown", () -> {
         Liabrary.custom_click(AN.getClusterType_Dropdown(), "click on ClusterType dropdown");
     });
         Thread.sleep(1000);
     

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_13", "Select value from ClusterType dropdown", () -> {
         Liabrary.custom_click(AN.getSelectValue_ClusterType_Dropdown(), "select value on ClusterType dropdown");
     });
         Thread.sleep(1000);
    
         
     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_14", "Click on Cluster dropdown", () -> {
         Liabrary.custom_click(AN.getCluster_Dropdown(), "click on Cluster dropdown");
     });
         Thread.sleep(1000);
     

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_15", "Select value from Cluster dropdown", () -> {
         Liabrary.custom_click(AN.getSelectValue_Cluster_Dropdown(), "select value on Cluster dropdown");
     });
         Thread.sleep(1000);
     

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_16", "Enter Notification Title", () -> {
         driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtNotificationTile']")).sendKeys("Ankush");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_17", "Select date from calendar", () -> {
         String month = "November 2024";
         String date = "20";

         driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_popupButton']")).click();
         while (true) {
             String text = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_Title']")).getText();
             if (text.equals(month)) break;
             else {
                 driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar_NN']//span[@class='t-font-icon t-i-arrow-right']")).click();
             }
             
         }

         List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_DateNotification_calendar']//table//tbody//tr//td//a[text()='20']"));
         for (WebElement element : ele) {
             if (element.getText().equals(date)) {
                 element.click();
                 break;
             }
         }
     });
         Thread.sleep(2000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_18", "Click on Sent Time", () -> {
         Liabrary.custom_click(AN.getSent_Time(), "click sent time");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_19", "Enter Time and Period", () -> {
         driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("05:30");
        
         driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtTime']")).sendKeys("AM");
     });
         Thread.sleep(2000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_20", "Enter Notification Content", () -> {
         driver.findElement(By.xpath("//textarea[@id='ParentMasterContentPlaceHolder1_txtNotification']")).sendKeys("Ankush");
     });
         Thread.sleep(1000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_21", "Click on Upload Image", () -> {
         driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).click();
     });
         Thread.sleep(2000);
         
         WebElement element = driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']"));
         element.sendKeys("C:\\Users\\10277\\Pictures");
         Thread.sleep(2000);
    

     ObjectRepo.startTestAndLog_1_SS("SA_AddNotification_TC_22", "Click on Recurrence Pattern Checkbox", () -> {
         Liabrary.custom_click(AN.getRecurrence_Pattern_Checkbox(), "click recurrence checkbox");
     });
         Thread.sleep(3000);
    
	
}

}