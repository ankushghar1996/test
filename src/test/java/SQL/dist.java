package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dist {

    Connection con;
    Statement stmt;
    ResultSet rs;

    // Expected values
    String expectedName = "Ajinkya Jadhav";
    String expectedCode = "10029";
    String expectedId = "23";
    String expectedBeat = "Koregaon Park";

    @BeforeClass
    public void setUp() throws Exception {
        String jdbcURL = "jdbc:sqlserver://172.25.0.74:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true;loginTimeout=10";
        String username = "Test_Team";
        String password = "Pass@2025";

        // Load the JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Create connection and statement
        con = DriverManager.getConnection(jdbcURL, username, password);
        stmt = con.createStatement();
    }

    @Test
    public void verifyDistributorData() throws Exception {
        String query = "SELECT * FROM DistributorMaster";
        rs = stmt.executeQuery(query);

        boolean matchFound = false;

        while (rs.next()) {
            String name = rs.getString("DistributorName");
            String code = rs.getString("DistributorCode");
            String id = rs.getString("Id");
            String beat = rs.getString("BeatName");

            if (expectedName.equals(name) && expectedCode.equals(code)
                    && expectedId.equals(id) && expectedBeat.equals(beat)) {
            	System.out.println("Test Pass: Data Matched Successfully  && Ajinkya Jadhav | 10029 | 23 | Koregaon Park");
                matchFound = true;
                break;
            }
        }

        Assert.assertTrue(matchFound, "Test Failed: No matching distributor data found in DB.");
    }

    @AfterClass
    public void tearDown() throws Exception {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (con != null) con.close();
    }
}
