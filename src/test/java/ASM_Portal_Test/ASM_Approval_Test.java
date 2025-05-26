package ASM_Portal_Test;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import ASM_Portal.ASM_Approval_Page;
import ASM_Portal.ASM_Approval_View;
import Com_Utility.BaseClass_ASM;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
 
public class ASM_Approval_Test extends BaseClass_ASM {
	
	
	@Test
	public void Approval_Page() throws Exception {
		
	ASM_Approval_Page ASM = PageFactory.initElements(driver,ASM_Approval_Page.class);
	
	
	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_01", "Verify that user should be click on ASM_Portal Master menu.", () -> {
	Liabrary.custom_click(ASM.getMaster(), "Click on Master");
	});
	Thread.sleep(1000);
	
	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_02", "Verify that user should click on ASM_Portal Distributor Master menu.", () -> {
	    Liabrary.custom_click(ASM.getDistributor_Master(), "Click on Distributor Master");
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_03", "Verify that user should click on ASM_Portal Distributor 2nd Approval menu.", () -> {
	    Liabrary.custom_click(ASM.getDistributor_Approval_2nd(), "Click Distributor Approval 2nd");
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_04", "Verify that user should select Distributor Approval grid row.", () -> {
	    Liabrary.custom_click(ASM.getGrid_Data(), "Select Grid Data From Grid Table");
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_05", "Verify that user should click on Approval button.", () -> {
	    Liabrary.custom_click(ASM.getApproval_Page_Button(), "Click on Approval Button");
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_06", "Scroll to Documents section on Approval page.", () -> {
	    WebElement scroll = driver.findElement(By.xpath("//label[text()='Documents']"));
	    JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	    jse1.executeScript("arguments[0].scrollIntoView(true);", scroll);
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_07", "Verify that user should click on Approve button.", () -> {
	    Liabrary.custom_click(ASM.getApprove_Button(), "Click on Approve Button");
	});
	Thread.sleep(1000);
	

	ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_08", "Verify that user should click on Yes button.", () -> {
	    Liabrary.custom_click(ASM.getYes_Button(), "Click on Yes Btn");
	});

	// Optional - Uncomment if No button flow is needed
	// ObjectRepo.startTestAndLog_1_SS("ASM_ASM_Approval_Test_09", "Verify that user should click on No button.", () -> {
//	     Liabrary.custom_click(ASM.getNo_Button(), "Click on No Button");
	// });








	}	
}