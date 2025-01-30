package SQL;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Test_2 {
 
    public static void main(String[] args) throws Exception {
        // Database connection details
    	
    	String jdbcURL = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true"; // Added timeout properties
        String username = "Test_Team"; // Database username
        String password = "Pass@2025"; // Database password
         // Data We Want To Validate //Data from a Grid List
        
		String Cust_FSG_Name = "Rajesh";
		String Cust_StateId = "18" ;
		String Cust_PinCode = "560058"; 
		String Cust_PANNo = "BAJPC4350M" ;
 
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        Connection con = DriverManager.getConnection(jdbcURL, username, password);
        
        // Create a Statement object to execute queries
        Statement stmt = con.createStatement();
        
        
        // SQL query to retrieve data from SalesmanMaster
        String query = "SELECT * FROM SalesmanMaster";
        
        
        // Execute the query and get the result set
        ResultSet rs = stmt.executeQuery(query);
        
        
        // Track if a matching record was found
        boolean status = false;
        
        // Iterate over the result set and compare the data
        while (rs.next()) {
            // Process the result set
            String FSG_Name = rs.getString("SalesmanName");
           String StateId = rs.getString("StateId");
            String PinCode = rs.getString("PinCode");
            String PANNo = rs.getString("PANNo");
            
            
            // Compare the result set data with the input data
            
            if (Cust_FSG_Name.equals(FSG_Name) && Cust_StateId.equals(StateId)
&& Cust_PinCode.equals(PinCode) && Cust_PANNo.equals(PANNo)) {
                System.out.println("Test Pass: Data Matched Successfully");
                status = true; // Set status to true if a match is found
                
                
               // break; // Exit the loop once a match is found
            }
        }
 
        // If no match was found, print the failure message
        if (!status) {
        	
            System.out.println("Test failed: No matching data found");
            
        }
 
        // Clean up and close resources
        rs.close();
        
        stmt.close();
        
        con.close();
        
        
        
        
        
        
        
        
        
    }
}