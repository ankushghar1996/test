package Retailer_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Com_Utility.BaseClass_Retailer;
import Com_Utility.Liabrary;
import Retailer_Portal.Product_Wise_Purchase;
 
public class Product_Wise_Purchase_Test extends BaseClass_Retailer {
 
	@Test
	public void Product_Wise_Purchase() throws Exception {
		
	Product_Wise_Purchase PWP = PageFactory.initElements(driver, Retailer_Portal.Product_Wise_Purchase.class);
	
	Liabrary.custom_click(PWP.getMenu(), "Click on Menu Button");
	Thread.sleep(1000);
	
	Liabrary.custom_click(PWP.getProduct_Wise_Purchase(), "Click on Product Wise Purchase");
	Thread.sleep(1000);
	
	Liabrary.custom_click(PWP.getProduct_Wise_Purchase_Back_Button(), "Click on Product Wise Purchase Back Button");
	Thread.sleep(1000);
	
	

	}
}