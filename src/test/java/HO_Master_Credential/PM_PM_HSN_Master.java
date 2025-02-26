package HO_Master_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.PM_HSN_Master;

public class PM_PM_HSN_Master extends BaseClass {

	
	
	@Test
	public void PM_HSN_MASTER () throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	Common_Data CD =PageFactory.initElements(driver,Common_Data.class);	
	PM_HSN_Master HSN1 = PageFactory.initElements(driver, PM_HSN_Master.class);	
	
	
	Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");	
	Thread.sleep(1000);
	
	Liabrary.custom_click(hp.getProductMaster_SubMenu(),"Select Product Master Submenu");	
	Thread.sleep(1000);
	
	Liabrary.custom_click(HSN1.getHSN_Master_Menu(),"Select HSN Master Menu");	
	Thread.sleep(1000);


	



	}
















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
