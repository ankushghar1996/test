package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import Retailer_Portal.Logout_Main;
 
public class Logout extends BaseClass_Retailer {

	 @Test
	  public void Media_Tab() throws Exception {
	 ObjectRepo.driver = driver;
	  Logout_Main OUT = PageFactory.initElements(driver,Logout_Main.class);

		Liabrary.custom_click(OUT.getMenu(), "Click on Menu");
		Thread.sleep(1000);
		
		Liabrary.custom_click(OUT.getLogout(), "Click on Logout");
		Thread.sleep(1000);
		
		Liabrary.custom_click(OUT.getLogout_Yes(), " Click on yes button");
		Thread.sleep(1000);








	 }
}