package jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


	// ket noi vao MySQL
	public class MySQLConnUtils {
		public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
			String hostName = "localhost";
			String dbName = "testingsystem3";
			String username = "root";
			String password = "root";
			
			return getMySQLConnection(hostName, dbName, username, password);
		}
		
		public static Connection getMySQLConnection(String hostName, String dbName, String username, String password) 
				throws SQLException, ClassNotFoundException {
	// Khai báo class Driver cho DB MySQL
			String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
			Connection conn = DriverManager.getConnection(connectionURL, username, password);
			return conn;
		}
	}


