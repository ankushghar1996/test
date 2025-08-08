package Com_Utility;

 
import org.testng.IExecutionListener;
 
public class ReportExecutionListener implements IExecutionListener {
 
    private static boolean reportFinalized = false; // prevent multiple executions
 
    @Override
    public void onExecutionFinish() {
        if (!reportFinalized) {
            System.out.println("✅ Finalizing and emailing report only once...");
            ObjectRepo.finalizeReport();  // Your report+email logic
            reportFinalized = true;
        }
    }
}

