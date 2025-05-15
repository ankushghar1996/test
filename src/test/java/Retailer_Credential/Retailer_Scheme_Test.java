package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.Retailer_Scheme;
 
public class Retailer_Scheme_Test extends BaseClass_Retailer {
@Test
	public void Retailer_Scheme () throws Exception {
	
		Retailer_Scheme RETR = PageFactory.initElements(driver,Retailer_Scheme.class);
		
		
		Liabrary.custom_click(RETR.getMy_Scheme(),"Click on Scheme Button");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(RETR.getScheme_Banner(),"Click on Scheme Banner");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(RETR.getAdd_to_cart(),"Click on Add to cart");
		
		Thread.sleep(1000);
		
		Liabrary.custom_click(RETR.getCart_Button(),"Click on cart button");
		Thread.sleep(1000);







	}
}