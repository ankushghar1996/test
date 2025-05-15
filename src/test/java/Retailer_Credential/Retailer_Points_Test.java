package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.Retailer_Points;
 
public class Retailer_Points_Test extends BaseClass_Retailer {
 
	@Test
	public void Points() throws Exception {
		
	Retailer_Points RETR = PageFactory.initElements(driver,Retailer_Points.class);
	
	
	Liabrary.custom_click(RETR.getMenu(),"Click on menu Button");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(RETR.getMy_Points(),"Click on My points");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(RETR.getRedeem_Points_Now(),"Click on Redeem points");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(RETR.getSearch_Button(),"Click on Search Button");
	Thread.sleep(1000);
	
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	//First Time Click
	Liabrary.custom_click(RETR.getView_Performance(),"Click on View Performance");
	Thread.sleep(1000);
	
	
	//Second Time Click
	Liabrary.custom_click(RETR.getView_Performance(),"Click on View Performance");
	Thread.sleep(1000);

	
	


	}
}