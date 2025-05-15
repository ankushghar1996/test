package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.RE_My_Order;
 
public class RE_My_Order_Test  extends BaseClass_Retailer{
@Test
	public void Order () throws Exception {
	
	RE_My_Order REMO = PageFactory.initElements(driver,RE_My_Order.class);
	
	Liabrary.custom_click(REMO.getMenu(), "Click on Menu Button");
	Thread.sleep(1000);
	
	Liabrary.custom_click(REMO.getMy_Order(), "Click on My Orders");
	Thread.sleep(1000);
	
	Liabrary.custom_click(REMO.getOrder_Select(), "Click on Orders");
	Thread.sleep(1000);
	
	Liabrary.custom_click(REMO.getBack_Button(), "Click on Back Button");
	Thread.sleep(1000);
	




	}	
}