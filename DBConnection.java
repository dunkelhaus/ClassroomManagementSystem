package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * Gets the db connection and keeps it for entire App lifecycle
 *
 */
public class DBConnection {
	// JDBC driver name and database URL
	   Connection conn = null;
	   public Connection GetConnection(){
		   // if the connection is null then get a connection from db else return the previous conn
		   if (conn == null){
			   String strJdbcDriver = "com.mysql.jdbc.Driver";  
			   String strDbUrl = "jdbc:mysql://localhost/classroom";
			   //  Database credentials
			   String usrName = "root";
			   String pwd = "root";	
			   try {
				  Class.forName(strJdbcDriver);
				  conn = DriverManager.getConnection(strDbUrl,usrName,pwd);
			   } catch(SQLException e) {
				 e.printStackTrace();
			   } catch(Exception e) {
				 e.printStackTrace();		
			   }
		   }
		   return conn;
	   }
}
