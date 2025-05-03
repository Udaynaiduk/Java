import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] a) throws SQLException {
		
		Connection Connection=DBUtilites.getDbConnection();
        Statement Statement = DBUtilites.getStatementObject(Connection); 
        String Query="CREATE TABLE dbo.Table_6\r\n"
        		+ "	(\r\n"
        		+ "	Id int NOT NULL,\r\n"
        		+ "	Name varchar(50) NULL\r\n"
        		+ "	)  ON [PRIMARY]";
        DBUtilites.Execute(Statement,Query);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("0.Table Creation \n 1.Alter Table \n 2.Rename Table");
        
        
		
	}
}


