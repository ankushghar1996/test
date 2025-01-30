package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.PM_Strategic_Product_Setting;

public class PM_Strategic_Product_Settings extends BaseClass{

	
	@Test
	public void Dealer_ApprovalBTN() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);
	PM_Strategic_Product_Setting SPS = PageFactory.initElements(driver, PM_Strategic_Product_Setting.class);
	
	Liabrary.custom_click(hp.getMaster_Menu(), null);
	
	
	Liabrary.custom_click(hp.getProductMaster_SubMenu(), null);
	
	
	Liabrary.custom_click(SPS.getStrategic_Product_Setting_Menu_Button(), null);
	
	
	WebElement Retailer_Details = driver.findElement(By.xpath("//h4[normalize-space()='Strategic Product Setting']"));
	String Actual_Text = Retailer_Details.getText();
	System.out.println(Actual_Text);
	String Expected_Text = "Strategic Product Setting";
	Assert.assertEquals(Expected_Text, Actual_Text);
	Thread.sleep(2000);
	
	
	Liabrary.custom_click(SPS.getStrategic_Product_Setting_Action_Icon(), null);
	Thread.sleep(2000);
	
	WebElement Deactivate_Special_Product1 = driver.findElement(By.xpath("//b[normalize-space()='Deactivate Special Product']"));
	String Actual_Text1 = Deactivate_Special_Product1.getText();
	System.out.println(Actual_Text1);
	String Expected_Text1 = "Deactivate Special Product";
	Assert.assertEquals(Expected_Text1, Actual_Text1);
	Thread.sleep(2000);
	
	
	Liabrary.custom_click(SPS.getStrategic_Product_Setting_No_Button(), null);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
