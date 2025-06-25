package DataBase_Fosroc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Connection_Test {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.2.206:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "sqlservices";
        String password = "Pass@2025";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("✅ JDBC Driver loaded.");

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to the database successfully.");

            conn.close();
            System.out.println("🔒 Connection closed.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
