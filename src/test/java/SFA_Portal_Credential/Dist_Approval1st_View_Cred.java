package SFA_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SFA;
import Com_Utility.Liabrary;
import SFA_Portal.Distributor_Approval1st_ViewPage;

public class Dist_Approval1st_View_Cred extends BaseClass_SFA{

	
	
	@Test
	public void Distributor_View() throws Exception {
		
		Distributor_Approval1st_ViewPage view = PageFactory.initElements(driver, Distributor_Approval1st_ViewPage.class);
	
	
		Liabrary.custom_click(view.getMaster_Menu(), "Click Master Menu");
		Thread.sleep(1000);
	
		
		Liabrary.custom_click(view.getDistributor_Master_Menu(), "Click Distributor Menu");
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getDistributor_Approval_Menu(), "Click Distributor Approval Menu");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getDistributor_View_Table(), "Select grid list Value");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getView_btn(), "Click View Btn");
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
	
	
	}
	
}
