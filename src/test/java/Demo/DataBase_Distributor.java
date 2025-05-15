package Demo;

	 
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	 
	public class DataBase_Distributor {
	 
	    public static void main(String[] args) throws Exception {
	        // Database connection details
	    	
	    	String jdbcURL = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true"; // Added timeout properties
	        String username = "Test_Team"; // Database username
	        String password = "Pass@2025"; // Database password
	         // Data We Want To Validate //Data from a Grid List
	        
			String DistributorName = "Rahul Enterprises and sons";
			String DistributorCode = "10030" ;
			String Id = "24"; 
			String BeatName = "Koregaon Park" ;
	 
	        // Load the MySQL JDBC Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Establish a connection to the database
	        Connection con = DriverManager.getConnection(jdbcURL, username, password);
	        
	        // Create a Statement object to execute queries
	        Statement stmt = con.createStatement();
	        
	        
	        // SQL query to retrieve data from SalesmanMaster
	        String query = "SELECT * FROM DistributorMaster";
	        
	        
	        // Execute the query and get the result set
	        ResultSet rs = stmt.executeQuery(query);
	        
	        
	        // Track if a matching record was found
	        boolean status = false;
	        
	        // Iterate over the result set and compare the data
	        while (rs.next()) {
	            // Process the result set
	            String Dist_Name = rs.getString("DistributorName");
	           String Dist_Code = rs.getString("DistributorCode");
	            String id = rs.getString("Id");
	            String Beat_Name = rs.getString("BeatName");
	            
	            
	            // Compare the result set data with the input data
	            
	            if (DistributorName.equals(Dist_Name) && DistributorCode.equals(Dist_Code)
	&& Id.equals(id) && BeatName.equals(Beat_Name)) {
	                System.out.println("Test Pass: Data Matched Successfully  && Ajinkya Jadhav | 10029 | 23 | Koregaon Park");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

