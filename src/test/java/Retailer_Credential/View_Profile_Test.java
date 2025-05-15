package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.View_Profile;
 
  public class View_Profile_Test extends BaseClass_Retailer{
 
  @Test
  public void Profile_view () throws Exception {	
	  
  View_Profile VPF = PageFactory.initElements(driver, View_Profile.class);
  
  Liabrary.custom_click(VPF.getMenu(), "Click On Menu button");
  Thread.sleep(1000);
  
 
  Liabrary.custom_click(VPF.getView_Profile(), "Click on Media Button");
  Thread.sleep(1000);
 
  Liabrary.custom_click(VPF.getClose_Button(), "Click on Back Button ");
  Thread.sleep(1000);





}
}