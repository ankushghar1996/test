package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.RE_New_Order;
import Retailer_Portal.Retailer_Points;
 
public class RE_New_Order_Test extends BaseClass_Retailer {
 
	@Test
	public void Order_Test() throws Exception {
		
	RE_New_Order RETR = PageFactory.initElements(driver,RE_New_Order.class);
	
	Liabrary.custom_click(RETR.getMenu(),"Click on menu Button");
	Thread.sleep(1000);
	
	
	
	Liabrary.custom_click(RETR.getNew_Order(),"Click on New Order");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(RETR.getWaterproofing(),"Click on WaterProofing");
	Thread.sleep(2000);
	
	
	Liabrary.custom_click(RETR.getProduct_Add_Cart(),"Click on Add Cart");
	Thread.sleep(1000);	
	
	
	Liabrary.custom_click(RETR.getProduct_Add_Cart(),"Click on Add Cart");
	Thread.sleep(2000);	
	
	
	Liabrary.custom_click(RETR.getProduct_View_Cart(),"Click on View Cart");
	Thread.sleep(1000);	
	
	
	Liabrary.custom_click(RETR.getSubmit_Button(),"Click on Submit Button");
	Thread.sleep(1000);	
	
	
//	Liabrary.custom_click(RETR.getNO_Button(),"Click on Cancle button Button");
//	Thread.sleep(1000);	
	Liabrary.custom_click(RETR.getYes_Button(),"Click on Yes button Button");
	Thread.sleep(2000);	
	
	
	Liabrary.custom_click(RETR.getOkay_Button(),"Click on Okay Button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(RETR.getPoints_New_Order(),"Click on Points New Order");
	Thread.sleep(1000);
	
	
	}
}