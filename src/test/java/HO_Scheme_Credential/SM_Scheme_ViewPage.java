package HO_Scheme_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Scheme.Scheme_Master_View;

public class SM_Scheme_ViewPage extends BaseClass {

   @Test(priority=0)
   public void Scheme_View_Page() throws Exception {

	        HomePage hp = PageFactory.initElements(driver, HomePage.class);
	        Scheme_Master_View SMV = PageFactory.initElements(driver, Scheme_Master_View.class);
	        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

	        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC01", "Select Master Menu", () -> {
	            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
	        });
	        Thread.sleep(1000);
	        
	        
	        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC02", "Select Scheme Setup Sub Menu", () -> {
	            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
	        });
	        Thread.sleep(1000);
	        

	        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC03", "Select Scheme Master Sub Menu", () -> {
	            Liabrary.custom_click(SMV.getScheme_Master_Menu(), "Select Scheme Master Sub Menu");
	        });
	        Thread.sleep(1000);
	        
	    }
          
    @Test(priority=01)
    public void Scheme_View_Page_NS01() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_View SMV = PageFactory.initElements(driver, Scheme_Master_View.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_NS("Without Click Select Scheme Master Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC02", "Select Scheme Setup Sub Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC03", "Select Scheme Master Sub Menu", () -> {
//            Liabrary.custom_click(SMV.getScheme_Master_Menu(), "Select Scheme Master Menu");
//        });
//        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC04", "Click View Button", () -> {
            Liabrary.custom_click(SMV.getView_btn(), "Click View Button ");
        });
        Thread.sleep(1000);
        
    }
    
    @Test(priority=02)
    public void Scheme_View_Page_NS02() throws Exception {

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        Scheme_Master_View SMV = PageFactory.initElements(driver, Scheme_Master_View.class);
        Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

        ObjectRepo.startTestAndLog_1_NS("Without Select Scheme Setup Sub Menu");
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC01", "Select Master Menu", () -> {
            Liabrary.custom_click(hp.getScheme_Menu(), "Select Master Menu");
        });
        Thread.sleep(1000);
        

//        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC02", "Select Scheme Setup Sub Menu", () -> {
//            Liabrary.custom_click(hp.getScheme_Setup_SubMenu(), "Select Scheme Setup Sub Menu");
//        });
//        Thread.sleep(1000);
        

        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC03", "Select Scheme Master Sub Menu", () -> {
            Liabrary.custom_click(SMV.getScheme_Master_Menu(), "Select Scheme Master  Menu");
        });
        Thread.sleep(1000);
        
        ObjectRepo.startTestAndLog_1_SS("SA_SM_Scheme_ViewPage_TC04", "Click View Button", () -> {
            Liabrary.custom_click(SMV.getView_btn(), "Click View Button ");
        });
        Thread.sleep(1000);
        
    }
}
