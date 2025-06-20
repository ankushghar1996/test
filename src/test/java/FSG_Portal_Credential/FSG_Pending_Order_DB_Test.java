package FSG_Portal_Credential;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_FSG_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import FSG_Portal.FSG_Pending_Order_DB_Main;

public class FSG_Pending_Order_DB_Test extends BaseClass_FSG_Portal {
	
    @Test
    public void FSG_Pending_Order () throws Exception {
        
        FSG_Pending_Order_DB_Main FSG = PageFactory.initElements(driver, FSG_Pending_Order_DB_Main.class);

        ObjectRepo.startTestAndLog_1_SS("FSG_POD_TC01", "Verify that user clicks on Pending Order.", () -> {
            Liabrary.custom_click(FSG.getPending_Order(), "Click On Pending Order");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_POD_TC02", "Verify that user clicks on Reminder button.", () -> {
            Liabrary.custom_click(FSG.getPending_Order_Reminder(), "Click On Reminder Button");
        });
        Thread.sleep(1000);

        ObjectRepo.startTestAndLog_1_SS("FSG_POD_TC03", "Verify that user clicks on Reminder Send button.", () -> {
            try {
                Liabrary.custom_click(FSG.getPending_Order_Reminder_Send_Button(), "Click On Reminder Send Button");
                Thread.sleep(1000);
                System.out.println("Reminder notification will be sent to the Distributor for Billing of the selected Order.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

    }

}
