package HO_Scheme_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Scheme.Scheme_Master_View;

public class SM_Scheme_ViewPage extends BaseClass{

	

	@Test		
	public void Route_Master_Page() throws Exception{	
	HomePage hp = PageFactory.initElements(driver,HomePage.class);		
	Scheme_Master_View SMV = PageFactory.initElements(driver,Scheme_Master_View.class);
	Common_Data CD = PageFactory.initElements(driver,Common_Data.class);	
	
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
	  Liabrary.custom_click(hp.getScheme_Menu(),"Select Master Menu");
	  Thread.sleep(1000);
			
			
	//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Scheme Master menu.")
	  Liabrary.custom_click(hp.getScheme_Setup_SubMenu(),"Select Scheme Master menu");
	  Thread.sleep(1000);
	
	//ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be select Scheme Master sub menu.")
	  Liabrary.custom_click(SMV.getScheme_Master_Menu(), "select Scheme Master sub menu");
	  Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
