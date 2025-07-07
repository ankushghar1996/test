package DataBase_Fosroc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OtpFetcher {

    public static void main(String[] args) {
        String mobileNumber = "9403586060";  // 🔁 Replace with your test number
        String otp = fetchOtpFromDatabase(mobileNumber);

        if (otp != null) {
            System.out.println("✅ OTP received: " + otp);
        } else {
            System.out.println("❌ OTP not found for mobile: " + mobileNumber);
        }
    }

    public static String fetchOtpFromDatabase(String mobileNumber) {
        String otp = null;

        String url = "jdbc:sqlserver://192.168.2.206:1433;databaseName=Fosroc_UAT;encrypt=true;trustServerCertificate=true";
        String username = "sqlservices";
        String password = "Pass@2025";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement()) {

                String query = "SELECT OTP FROM RegistrationPendingMaster WHERE MobileNo = '" + mobileNumber + "'";
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    otp = rs.getString("OTP");
                    System.out.println("🔐 OTP fetched from DB for " + mobileNumber + ": " + otp);
                }

                rs.close();
            }
        } catch (Exception e) {
            System.out.println("❌ Error fetching OTP:");
            e.printStackTrace();
        }

        return otp;
    }
}
