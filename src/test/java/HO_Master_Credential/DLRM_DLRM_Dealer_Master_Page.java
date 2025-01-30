package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DLRM_Dealer_Master;

public class DLRM_DLRM_Dealer_Master_Page extends BaseClass{

	
	@Test
	public void Dealer_Master_Page () throws Exception{
	HomePage hp	= PageFactory.initElements(driver,HomePage.class);
	DLRM_Dealer_Master DM1 = PageFactory.initElements(driver,DLRM_Dealer_Master.class); 	

	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
	Thread.sleep(1000);
	
	
    //ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Dealer Master SUB Menu.");		
	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master SubMenu");		
	Thread.sleep(1000);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Dealer Master Menu.");
	Liabrary.custom_click(DM1.getDealer_Master_Menu(),"Select Dealer Master Menu Page");	
	Thread.sleep(1000);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 4 : Verify Dealer Master List Header text");		
	WebElement Dealer_Master_List = driver.findElement(By.xpath("//*[text()='Outlet Master List']"));
	String Actual_Text = Dealer_Master_List.getText();	
	System.out.println(Actual_Text);	
	String Expected_Text = "Outlet Master List";
	Assert.assertEquals(Expected_Text,Actual_Text);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
