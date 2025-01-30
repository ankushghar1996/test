package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Master.DLRM_DealerTransfer;
import HO_Master.DLRM_Dealer_Master;

public class DLRM_DLRM_Dealer_Transfer extends BaseClass{

	
	
	@Test
	public void Outlet_Transfer() throws Exception{
      HomePage hp = PageFactory.initElements(driver,HomePage.class);
      DLRM_DealerTransfer DM = PageFactory.initElements(driver, DLRM_DealerTransfer.class);
	
      
    //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Master Menu.");
    	Liabrary.custom_click(hp.getMaster_Menu(),"Select Master Menu");
    	Thread.sleep(1000);
    	
    	
        //ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be Dealer Master SUB Menu.");		
    	Liabrary.custom_click(hp.getOutletMaster_SubMenu(),"Select Dealer Master SubMenu");		
    	Thread.sleep(1000);
	
	
    	Liabrary.custom_click(DM.getOutlet_Transfer_Menu(), "select outlet master");
    	Thread.sleep(1000);
	
	
    	WebElement Upload_Retailer_Header_Text = driver.findElement(By.xpath("//h4[@id='ParentMasterContentPlaceHolder1_header']"));	
    	String Actual_Text1 = Upload_Retailer_Header_Text.getText();	
    	System.out.println(Actual_Text1);	
    	String Expected_Text= "Outlet Transfer";	
    	Assert.assertEquals(Expected_Text,Actual_Text1);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getFrom_Distributor(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_From_Distributor(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getFrom_Route(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_From_Route(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getTo_Distributor(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_To_Distributor(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getTo_Route(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_To_Route(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getTransfer_btn(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_FromFirstCheckBox(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getForward_ArrBtn(), null);
    	Thread.sleep(1000);
    	
    	
    	Liabrary.custom_click(DM.getSelect_ToFirstCheckBox(), null);
    	Thread.sleep(5000);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
	
	
	}
	
	
}
