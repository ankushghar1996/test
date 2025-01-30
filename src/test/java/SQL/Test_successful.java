package SQL ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test_successful {
	
	
    public static void main(String[] args) {
    	
    	
        // JDBC URL for SQL Server
    	String jdbcURL = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "Test_Team"; // Replace with your SQL Server username
        String password = "Pass@2025"; // Replace with your SQL Server password
        
        
        try {
        	
            // Load the SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish the connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection successful!");
            // Close the connection
            connection.close();
            
        } 
        catch (ClassNotFoundException e) {
        	
            System.out.println("SQL Server JDBC Driver not found.");
            e.printStackTrace();
            
        } 
        catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        
        
    }
}