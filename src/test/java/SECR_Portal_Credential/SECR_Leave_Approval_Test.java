package SECR_Portal_Credential;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Com_Utility.BaseClass_SECR_Portal;
import Com_Utility.Liabrary;
import SECR_Portal.SECR_Leave_Approval_Main;
 
public class SECR_Leave_Approval_Test extends BaseClass_SECR_Portal {
 
  @Test

  public void Leave_Approval () throws Exception {

  SECR_Leave_Approval_Main SECR = PageFactory.initElements(driver,SECR_Leave_Approval_Main.class);

  
	Liabrary.custom_click(SECR.getSECR_Menu(), "Click SECR Menu");
	Thread.sleep(1000);

	Liabrary.custom_click(SECR.getApproval_Button(), "Click Pending Approved Button");
	Thread.sleep(1000);

	
	Liabrary.custom_click(SECR.getLeave_APPROVAL_Button(), "Click Leave Approved Button");
	Thread.sleep(1000);

	
	Liabrary.custom_click(SECR.getLeave_APPROVAL_Pending(), "Click Leave Approved Pending");
	Thread.sleep(1000);	








  }


}

 