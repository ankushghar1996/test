package HO_Activity_Credential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Activity.Activity_Upload;
import HO_Activity.Media_Add_Media;
import HO_Activity.Media_UploadMedia;

public class AddMedia extends BaseClass {

    @Test(priority = 0)
    public void Add_Media_Case1() throws Exception {
    	
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_01", "Select Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_02", "Select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_03", "Select Upload Media menu", () -> {
            Liabrary.custom_click(hp.getMedia_Upload(), "select Upload Media menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_04", "Click on Add button", () -> {
            Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_05", "Select Video from Type dropdown", () -> {
            Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Liabrary.custom_click(AM.getType_Dropdown_SelectValue_Video(), null);
        });
        Thread.sleep(1000);
        
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_06", "Select Application category", () -> {
            Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Liabrary.custom_click(AM.getCategory1_Dropdown_SelectValue_Application_Video(), null);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_07", "Enter Video Title", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_08", "Enter Video Link", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtLink']")).sendKeys("Ankush");
        });

        Thread.sleep(2000);
        
    }

    @Test(priority = 1)
    public void Add_Media_Case2() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Click on Add Button");

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_09", "Select Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_10", "Select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_03", "Select Upload Media menu", () -> {
            Liabrary.custom_click(hp.getMedia_Upload(), "select Upload Media menu");
        });
        Thread.sleep(1000);

        
//        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_12", "Click on Add button", () -> {
//            Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_13", "Select Document from Type dropdown", () -> {
            Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
            
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Liabrary.custom_click(AM.getType_Dropdown_SelectValue1_Document(), null);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_14", "Select New Product category", () -> {
            Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
            
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Liabrary.custom_click(AM.getCategory_Dropdown_Select_New_Product(), null);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_15", "Enter Document Title", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_16", "Upload Document File", () -> {
            driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_fUpload']")).sendKeys("C:\\Users\\10277\\Downloads\\SampleDoc.pdf");
        });

        Thread.sleep(2000);
        
    }
    
    

    @Test(priority = 2)
    public void Add_Media_Case3() throws Exception {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Media_Add_Media AM = PageFactory.initElements(driver, Media_Add_Media.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select Banner type dropdown");
        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_17", "Select Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_18", "Select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_03", "Select Upload Media menu", () -> {
            Liabrary.custom_click(hp.getMedia_Upload(), "select Upload Media menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_20", "Click on Add button", () -> {
            Liabrary.custom_click(UM.getAdd_Btn(), "click on Add btn");
        });
        Thread.sleep(1000);

//        
//        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_21", "Select Banner from Type dropdown", () -> {
//            Liabrary.custom_click(AM.getType_Dropdown_Select_Video(), null);
//            Liabrary.custom_click(AM.getType_Dropdown_SelectValue2_Banner(), null);
//        });
//        Thread.sleep(1000);
//        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_22", "Select Retailer category", () -> {
            Liabrary.custom_click(AM.getCategory1_Dropdown_Select_Application_Video(), null);
            
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Liabrary.custom_click(AM.getCategory_Dropdown_Select_Retailer(), null);
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_23", "Enter Banner Title", () -> {
            driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtTitle']")).sendKeys("Ankush");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("HOAct_AddMedia_TC_24", "Upload Banner Image", () -> {
            driver.findElement(By.xpath("//img[@id='ParentMasterContentPlaceHolder1_Image1']")).sendKeys("C:\\Users\\10277\\Pictures\\SampleBanner.jpg");
        });

        Thread.sleep(2000);
        
        
    }
}
