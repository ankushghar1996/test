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
import HO_Activity.Media_UploadMedia;

public class UploadMedia_ActionViewPage extends BaseClass {

    @Test (priority=0)
    public void Upload_media() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_02", "Verify select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_03", "Verify select Upload Media menu", () -> {
            Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_04", "Verify Media Upload header text", () -> {
            WebElement uploadText = driver.findElement(By.xpath("(//*[normalize-space()='Media Upload'])[5]"));
            String actualText = uploadText.getText();
            String expectedText = "Media Upload";
            System.out.println("Header Text: " + actualText);
            Assert.assertEquals(actualText, expectedText);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_05", "Select Media Type dropdown", () -> {
            Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_06", "Select Media Type value", () -> {
            Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(UM.getView_Btn(), "click on View button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_08", "Click on Action View icon", () -> {
            Liabrary.custom_click(UM.getActionView_Icon(), "click on Action View icon");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_09", "Verify Media Upload header in Action View page", () -> {
            WebElement uploadText1 = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
            String actualText1 = uploadText1.getText();
            String expectedText1 = "Media Upload";
            System.out.println("Action View Header Text: " + actualText1);
            Assert.assertEquals(actualText1, expectedText1);
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_10", "Click on Close button", () -> {
            Liabrary.custom_click(UM.getClose_Btn(), "click Close button");
        });
        Thread.sleep(1000);
        
        
    }
    
  //Ns For Action view button without click
@Test (priority=1)
public void Upload_media_NS01() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
    Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
    
    ObjectRepo.startTestAndLog_1_NS("Without click on view button");

    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_01", "Verify click on Activity Menu", () -> {
        Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
    });
    Thread.sleep(1000);

    
    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_02", "Verify select Media sub menu", () -> {
        Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
    });
    Thread.sleep(1000);

    
    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_03", "Verify select Upload Media menu", () -> {
        Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
    });
    Thread.sleep(1000);

    
    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_04", "Verify Media Upload header text", () -> {
        WebElement uploadText = driver.findElement(By.xpath("(//*[normalize-space()='Media Upload'])[5]"));
        String actualText = uploadText.getText();
        String expectedText = "Media Upload";
        System.out.println("Header Text: " + actualText);
        Assert.assertEquals(actualText, expectedText);
    });
    Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_05", "Select Media Type dropdown", () -> {
        Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
    });
    Thread.sleep(1000);

    
    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_06", "Select Media Type value", () -> {
        Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
    });
    Thread.sleep(1000);

    
//    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_07", "Click on View button", () -> {
//        Liabrary.custom_click(UM.getView_Btn(), "click on View button");
//    });
//    Thread.sleep(1000);

//    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_08", "Click on Action View icon", () -> {
//        Liabrary.custom_click(UM.getActionView_Icon(), "click on Action View icon");
//    });
//    Thread.sleep(1000);
    

    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_09", "Verify Media Upload header in Action View page", () -> {
        WebElement uploadText1 = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
        String actualText1 = uploadText1.getText();
        String expectedText1 = "Media Upload";
        System.out.println("Action View Header Text: " + actualText1);
        Assert.assertEquals(actualText1, expectedText1);
    });
    Thread.sleep(1000);

    
    ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_10", "Click on Close button", () -> {
        Liabrary.custom_click(UM.getClose_Btn(), "click Close button");
    });
    Thread.sleep(1000);
    
    
}

//Ns For Action view button without click
@Test (priority=2)
public void Upload_media_NS02() throws Exception {

   HomePage hp = PageFactory.initElements(driver, HomePage.class);
   Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
   Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
   
   ObjectRepo.startTestAndLog_1_NS("Without Select Upload Media Menu");

   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_01", "Verify click on Activity Menu", () -> {
       Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
   });
   Thread.sleep(1000);

   
   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_02", "Verify select Media sub menu", () -> {
       Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
   });
   Thread.sleep(1000);

   
//   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_03", "Verify select Upload Media menu", () -> {
//       Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
//   });
//   Thread.sleep(1000);

   
   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_04", "Verify Media Upload header text", () -> {
       WebElement uploadText = driver.findElement(By.xpath("(//*[normalize-space()='Media Upload'])[5]"));
       String actualText = uploadText.getText();
       String expectedText = "Media Upload";
       System.out.println("Header Text: " + actualText);
       Assert.assertEquals(actualText, expectedText);
   });
   Thread.sleep(1000);
   

   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_05", "Select Media Type dropdown", () -> {
       Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
   });
   Thread.sleep(1000);

   
   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_06", "Select Media Type value", () -> {
       Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
   });
   Thread.sleep(1000);

   
   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_07", "Click on View button", () -> {
       Liabrary.custom_click(UM.getView_Btn(), "click on View button");
   });
   Thread.sleep(1000);

//   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_08", "Click on Action View icon", () -> {
//       Liabrary.custom_click(UM.getActionView_Icon(), "click on Action View icon");
//   });
//   Thread.sleep(1000);
   

   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_09", "Verify Media Upload header in Action View page", () -> {
       WebElement uploadText1 = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_pageHeader']"));
       String actualText1 = uploadText1.getText();
       String expectedText1 = "Media Upload";
       System.out.println("Action View Header Text: " + actualText1);
       Assert.assertEquals(actualText1, expectedText1);
   });
   Thread.sleep(1000);

   
   ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ActionViewPage_TC_10", "Click on Close button", () -> {
       Liabrary.custom_click(UM.getClose_Btn(), "click Close button");
   });
   Thread.sleep(1000);
}

}