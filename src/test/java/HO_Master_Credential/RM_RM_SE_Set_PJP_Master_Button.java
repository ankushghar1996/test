package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.RM_SE_PJP_Master;
import HO_Master.RM_Set_PJP_Button;

public class RM_RM_SE_Set_PJP_Master_Button extends BaseClass{

	
	
	@Test
	public void Set_PJP_Master_Button () throws Exception {
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	RM_SE_PJP_Master SEPJP1 = PageFactory.initElements(driver,RM_SE_PJP_Master.class);
	RM_Set_PJP_Button SEPJP2 = PageFactory.initElements(driver,RM_Set_PJP_Button.class);
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
		Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Route Master sub menu.")
		Liabrary.custom_click(hp.getRouteMaster_SubMenu(),"Select Route Master Submenu");
		Thread.sleep(1000);
		
		
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select PJP Master Page.");	
		Liabrary.custom_click(SEPJP1.getSE_PJP_Master_Menu_Button(),"Select SE PJP Master Page");
		Thread.sleep(1000);	
		
		
	//ObjectRepo.test.log (Status.INFO,"Test Case 4 : Verify that user should be select PJP Master Header Text.")
		WebElement SE_PJP_Master = driver.findElement(By.xpath("(//*[text()='SE PJP Master'])[2]"));
		String Actual_Text = SE_PJP_Master.getText();
		System.out.println(Actual_Text);
		String Expected_Text = "SE PJP Master";
		Assert.assertEquals(Expected_Text,Actual_Text);
		
		
	//SE Set PJP Button 	
   //ObjectRepo.test.log (Status.INFO,"Test Case 4 : Verify that user should be Click on SET PJP Button.")
	Liabrary.custom_click(SEPJP2.getSET_PJP_Button(),"Click on SET PJP Button ");	
	Thread.sleep(1000);	
	
	
    WebElement SET_SE_PJP_Header_Text = driver.findElement(By.xpath("//*[text()='SET SE PJP']")); 
	String Actual_Text2 = SET_SE_PJP_Header_Text.getText();	
	System.out.println(Actual_Text2);	
	String Expected_Text2 = "SET SE PJP";
	Assert.assertEquals(Expected_Text,Actual_Text);

	
	
	}













	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
