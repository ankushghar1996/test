package HO_Scheme_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Scheme.Scheme_Master_Homepage;

public class SM_scheme_Homepage extends BaseClass{

	
	@Test		
	public void Route_Master_Page() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	Scheme_Master_Homepage SMH = PageFactory.initElements(driver,Scheme_Master_Homepage.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	  Liabrary.custom_click(hp.getScheme_Menu(),"Select Master Menu");
	  Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Scheme Master menu.")
	  Liabrary.custom_click(hp.getScheme_Setup_SubMenu(),"Select Scheme Master menu");
	  Thread.sleep(1000);
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Scheme Master sub menu.")
	  Liabrary.custom_click(SMH.getScheme_Master_Menu(), "select Scheme Master sub menu");
	  Thread.sleep(1000);
	  
	  
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Scheme Master Header Text.");
	  WebElement PJP_Master_Header_Text = driver.findElement(By.xpath("//h4[normalize-space()='Scheme Master']"));
	  String Actual_Text= PJP_Master_Header_Text.getText();
	  System.out.println(Actual_Text);
	  String Expected_Text= "Scheme Master";
	  Assert.assertEquals(Expected_Text,Actual_Text);
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
