package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmp {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM emptable WHERE emp_id=?";
		    String sql1 = "DELETE FROM emptable WHERE emp_id=?";
		    
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    PreparedStatement statement1 = conn.prepareStatement(sql1);
		    
		    statement.setString(1, "103");
		    statement1.setString(1, "104");
		     
		    
		    int rowsDeleted = statement.executeUpdate();
		    int rowsDeleted1 = statement1.executeUpdate();
		    
		    if (rowsDeleted > 0) {
		        System.out.println("first employee was deleted successfully!");
		    }
		    
		    if (rowsDeleted1> 0) {
		        System.out.println("second employee was deleted successfully!");
		    }
		    
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
