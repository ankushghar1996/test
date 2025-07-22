package Com_Utility;

import org.testng.IExecutionListener;

public class ReportExecutionListener implements IExecutionListener {

    @Override
    public void onExecutionFinish() {
        System.out.println("✅ Finalizing ExtentReport and sending email...");
        ObjectRepo.finalizeReport();  // Your current report + email logic
    }

    @Override
    public void onExecutionStart() {
        // Optional: log start
    	
    	
    	
    }
    
    
    
}
