import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.sql.RowSetMetaData;

public class JDBC {
    public static void main(String[] args) {
    	Connection con=null;;
    	 Statement state=null;
    	 ResultSet result=null;
    		
        try {
        	 con=DBUtilites.getDbConnection();
        	 state = con.createStatement();
            String query = "SELECT * FROM [AddressDetails]";
            String query1 = "create Table AddressDetails([Do-no] int,Adreess nvarchar(MAX))";
            String insertdata="Insert into AddressDetails values(36,'Anasagaram')";
            //state.execute(insertdata);
            System.out.println("prepareStatement Start");
            PreparedStatement ps1=con.prepareStatement("Insert into AddressDetails values(?,?)");
            ps1.setInt(1, 39);
            ps1.setString(2, "nandigama");
            ps1.executeUpdate();
            System.out.println("prepareStatement Completed");
         int rowseffiected  = state.executeUpdate(insertdata);
         System.out.println("rowseffiected"+ rowseffiected);
           result = state.executeQuery(query);

           while (result.next()) {
               int id = result.getInt("Do-no");
               String Addrrss=result.getNString("Adreess");
               System.out.println("ID: " + id+" Addrrss "+ Addrrss);
           }
           ResultSetMetaData metadata=result.getMetaData();
           
           CallableStatement cst=con.prepareCall("{call TableDetails()}");
           
           result=cst.executeQuery();
           
           System.out.println("Metadata" + metadata.getColumnCount());
           System.out.println("Metadata" + metadata.getColumnName(1));

            while (result.next()) {
                int Id = result.getInt(1);
                String Name=result.getNString(2);
                System.out.println("ID: " + Id+" Name "+ Name);
            }

            System.out.println("Query completed");

        } catch (Exception ex) {
            ex.printStackTrace();
        }       
    }
}
