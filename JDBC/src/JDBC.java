import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        ResultSet result = null;

        try {
        	String url = "jdbc:sqlserver://INL-9SHCPL3\\SQL2022EXPRESS;databaseName=Test1;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "Password@123";

            con = DriverManager.getConnection(url, username, password);
            state = con.createStatement();
            String query = "SELECT * FROM [User]";
            result = state.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                System.out.println("ID: " + id);
            }

            System.out.println("Query completed");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (result != null) result.close();
                if (state != null) state.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
