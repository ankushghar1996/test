package HO_Activity_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Activity.Media_UploadMedia;

public class UploadMedia_ViewPage extends BaseClass {

    @Test(priority=0)
    public void Upload_media_View() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_02", "Verify select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_03", "Verify select Upload Media menu", () -> {
            Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_04", "Verify Media Upload header selection", () -> {
            Liabrary.custom_click(UM.getMediaUpload_Header(), "select Media Upload Header");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_05", "Verify Media Type dropdown", () -> {
            Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_06", "Verify Media Type value selection", () -> {
            Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(UM.getView_Btn(), "click on View btn");
        });
        Thread.sleep(1000);
        
    }
    
    @Test(priority=1)
    public void Upload_media_NS1() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without Select Upload MJedia Menu");

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_02", "Verify select Media sub menu", () -> {
        Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });                                                                                              
        Thread.sleep(1000);

        
  //        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_03", "Verify select Upload Media menu", () -> {
  //            Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
  //        });
  //        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_04", "Verify Media Upload header selection", () -> {
            Liabrary.custom_click(UM.getMediaUpload_Header(), "select Media Upload Header");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_05", "Verify Media Type dropdown", () -> {
            Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_06", "Verify Media Type value selection", () -> {
            Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(UM.getView_Btn(), "click on View btn");
        });
        Thread.sleep(1000);
        
    }
    
    @Test(priority=2)
    public void Upload_media_NS2() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Media_UploadMedia UM = PageFactory.initElements(driver, Media_UploadMedia.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);
        
        ObjectRepo.startTestAndLog_1_NS("Without select Media type Dropdown");

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_01", "Verify click on Activity Menu", () -> {
            Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_02", "Verify select Media sub menu", () -> {
            Liabrary.custom_click(hp.getMedia_SubMenu(), "select Media sub menu");
        });
        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_03", "Verify select Upload Media menu", () -> {
            Liabrary.custom_click(UM.getUploadMedia_Menu(), "select Upload Media menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_04", "Verify Media Upload header selection", () -> {
            Liabrary.custom_click(UM.getMediaUpload_Header(), "select Media Upload Header");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_05", "Verify Media Type dropdown", () -> {
//            Liabrary.custom_click(UM.getMediaType_Dropdown(), "select Media Type dropdown");
//        });
//        Thread.sleep(1000);

        
        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_06", "Verify Media Type value selection", () -> {
            Liabrary.custom_click(UM.getMediaTypeValue_Dropdown(), "select Media Value Type dropdown");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_UploadMedia_ViewPage_TC_07", "Click on View button", () -> {
            Liabrary.custom_click(UM.getView_Btn(), "click on View btn");
        });
        Thread.sleep(1000);
        
    }
}
