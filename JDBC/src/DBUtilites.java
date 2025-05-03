import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilites {
	
	public static Connection getDbConnection() throws SQLException{
		return	DriverManager.getConnection(Creds.url, Creds.username, Creds.password);
	}
	
	public static Statement getStatementObject(Connection Connection) throws SQLException {
		return Connection.createStatement();
		}
	
	public static void Execute(Statement Statement,String Query) throws SQLException {
		if(isDmlExcution(Query)) {
			System.out.println("DML Execution");
			int rowseffected=Statement.executeUpdate(Query);
			System.out.println("Execution Completed ,rowseffected:"+ rowseffected);
		}
		else{
			
			System.out.println("DDL/DQLExecution");
			Statement.execute(Query);
			
		}
		System.out.println("Operation Successfully Completed");
		
	}
	
	public static boolean isDmlExcution(String Query) {
		String query=Query.toLowerCase();
		boolean isdelete=query.contains("delete");
		
		boolean isdml=query.contains("insert")|| isdelete;
		if(isdelete && query.contains("where") ) {
			System.out.println("Warning Delete have must where condition");
			
		}
		return isdml;
		
		}
		
	}


