package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmp {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM emptable";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String emp_id = result.getString(1);
			    String emp_name = result.getString(2);
			    String emp_age = result.getString(3);
			  
			 
			    String output = "User #%d: %s - %s - %s ";
			    System.out.println(String.format(output, ++count, emp_id, emp_name, emp_age));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
