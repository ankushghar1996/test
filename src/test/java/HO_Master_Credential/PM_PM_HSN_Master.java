package HO_Master_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.PM_HSN_Master;

public class PM_PM_HSN_Master extends BaseClass {

	@Test(priority=0)
	public void PM_HSN_MASTER () throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	Common_Data CD =PageFactory.initElements(driver,Common_Data.class);	
	PM_HSN_Master HSN1 = PageFactory.initElements(driver, PM_HSN_Master.class);	
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC01", "Click on Master Menu", () -> {
	Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");	
	});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC02", "Click on Product Master SubMenu", () -> {
	Liabrary.custom_click(hp.getProductMaster_SubMenu(),"Product Master Submenu");	
	});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC03", "Click on HSN Master Menu", () -> {
	Liabrary.custom_click(HSN1.getHSN_Master_Menu(),"HSN Master Menu");	
	});
	Thread.sleep(1000);


	}

	@Test(priority=1)
	public void PM_HSN_MASTER_NS01 () throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	Common_Data CD =PageFactory.initElements(driver,Common_Data.class);	
	PM_HSN_Master HSN1 = PageFactory.initElements(driver, PM_HSN_Master.class);	
	
	ObjectRepo.startTestAndLog_1_NS("Without Click On Master Menu");
	
//	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC01", "Click on Master Menu", () -> {
//	Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");	
//	});
//	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC02", "Click on Product Master SubMenu", () -> {
	Liabrary.custom_click(hp.getProductMaster_SubMenu(),"Product Master Submenu");	
	});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC03", "Click on HSN Master Menu", () -> {
	Liabrary.custom_click(HSN1.getHSN_Master_Menu(),"HSN Master Menu");	
	});
	Thread.sleep(1000);	
	
}

	
	
	
	@Test(priority=2)
	public void PM_HSN_MASTER_NS02() throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);	
	Common_Data CD =PageFactory.initElements(driver,Common_Data.class);	
	PM_HSN_Master HSN1 = PageFactory.initElements(driver, PM_HSN_Master.class);	
	
	ObjectRepo.startTestAndLog_1_NS("Without Click On Product Master Submenu");
	

	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC01", "Click on Master Menu", () -> {
	Liabrary.custom_click(hp.getMaster_Menu(),"Master Menu");	
	});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC02", "Click on Product Master SubMenu", () -> {
	Liabrary.custom_click(hp.getProductMaster_SubMenu(),"Product Master Submenu");	
	});
	Thread.sleep(1000);

	
	ObjectRepo.startTestAndLog_1_SS("SA_PM_HSN_Master_TC03", "Click on HSN Master Menu", () -> {
	Liabrary.custom_click(HSN1.getHSN_Master_Menu(),"HSN Master Menu");	
	});
	Thread.sleep(1000);

}

	
}