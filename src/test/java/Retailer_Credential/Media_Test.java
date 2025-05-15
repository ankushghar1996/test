package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.Media;
 
public class Media_Test extends BaseClass_Retailer {
 
  @Test
  public void Media_Tab() throws Exception {
	  
  Media MDI = PageFactory.initElements(driver,Media.class);
  
	Liabrary.custom_click(MDI.getMenu(), "Click On Menu button");
	Thread.sleep(1000);
	
	Liabrary.custom_click(MDI.getMedia(), "Click on Media Button");
	Thread.sleep(1000);
	
	Liabrary.custom_click(MDI.getDocuments(), "Click on Documents ");
	Thread.sleep(1000);
	
	Liabrary.custom_click(MDI.getBack_Arrow_Button(), "Click on Back Button");
	Thread.sleep(1000);




	}
}