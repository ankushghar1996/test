package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.FSG_FSGMaster;
import HO_Master.FSG_FSGMasterViewPage;

public class FSG_MasterViewPage extends BaseClass{


	@Test(priority=0)
	public void FSG_MasterHomepage() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_FSGMasterViewPage FV = PageFactory.initElements(driver, FSG_FSGMasterViewPage.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_MasterViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
		});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC02", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "FSG Master SubMenu");
		});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC03", "Click On FSG Master", () -> {		
		Liabrary.custom_click(FSG.getFSG_Master(), null);
		});
		Thread.sleep(1000);
	
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC04", "Verify FSG Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="FSG Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC05", "Click on FSG Grida Data Table", () -> {
	Liabrary.custom_click(FV.getFSG_GridaDataTable(), null);
    });
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC06", "Click on View Button", () -> {
	Liabrary.custom_click(FV.getView_btn(),null);
	});
	Thread.sleep(1000);
	
	
	
	}
	
	@Test(priority=1)
	public void FSG_MasterHomepage_NS01() throws Exception {
		

		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_FSGMasterViewPage FV = PageFactory.initElements(driver, FSG_FSGMasterViewPage.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);

	ObjectRepo.startTestAndLog_1_NS("Without Click on FSG Master");

	
		ObjectRepo.startTestAndLog_1_SS("SA_MasterViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
		});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC02", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "FSG Master SubMenu");
		});
		Thread.sleep(1000);
	
	
//		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC03", "Click On FSG Master", () -> {		
//		Liabrary.custom_click(FSG.getFSG_Master(), null);
//		});
//		Thread.sleep(1000);
//	

		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC04", "Verify FSG Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="FSG Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC05", "Click on FSG Grida Data Table", () -> {
	Liabrary.custom_click(FV.getFSG_GridaDataTable(), null);
    });
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC06", "Click on View Button", () -> {
	Liabrary.custom_click(FV.getView_btn(),null);
	});
	Thread.sleep(1000);

	

}

	
	@Test(priority=2)
	public void FSG_MasterHomepage_NS2() throws Exception {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		FSG_FSGMasterViewPage FV = PageFactory.initElements(driver, FSG_FSGMasterViewPage.class);
		FSG_FSGMaster FSG = PageFactory.initElements(driver, FSG_FSGMaster.class);
		
		ObjectRepo.startTestAndLog_1_NS("Without click on Fsg Grid Data");
	
	

		ObjectRepo.startTestAndLog_1_SS("SA_MasterViewPage_TC01", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "Master Menu");
		});
		Thread.sleep(1000);
		   
			
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC02", "Click on Master Menu", () -> {
		Liabrary.custom_click(hp.getFSGMaster_SubMenu(), "FSG Master SubMenu");
		});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC03", "Click On FSG Master", () -> {		
		Liabrary.custom_click(FSG.getFSG_Master(), null);
		});
		Thread.sleep(1000);

	
	
		ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC04", "Verify FSG Master Header Text", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='FSG Master']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="FSG Master";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
//    ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC05", "Click on FSG Grida Data Table", () -> {
//	Liabrary.custom_click(FV.getFSG_GridaDataTable(), null);
//    });
//	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("SA_FSGMaster_TC06", "Click on View Button", () -> {
	Liabrary.custom_click(FV.getView_btn(),null);
	});
	Thread.sleep(1000);
  }
}