package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmp {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE emptable SET emp_name=?, emp_age=? WHERE emp_id=? ";
		    String sql1 = "UPDATE emptable SET emp_name=?, emp_age=? WHERE emp_id=? ";
		    
		    
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Pooja");
		    statement.setString(2, "19");
		    statement.setString(3, "101");
		    
		    PreparedStatement statement1 = conn.prepareStatement(sql);
		    statement1.setString(1, "Pavi");
		    statement1.setString(2, "21");
		    statement1.setString(3, "102");
		    
		     
		    int rowsUpdated = statement.executeUpdate();
		    int rowsUpdated1= statement1.executeUpdate();
		    
		    if (rowsUpdated > 0) {
		        System.out.println("An existing first employee was updated successfully!");
		    }
		    if (rowsUpdated > 0) {
		        System.out.println("An existing second employee was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
