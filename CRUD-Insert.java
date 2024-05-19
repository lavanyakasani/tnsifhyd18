package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertemp {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO emptable (emp_id, emp_name,emp_age) VALUES (?, ?, ?)";
		    String sql1= "INSERT INTO emptable (emp_id, emp_name,emp_age) VALUES (?, ?, ?)";
		    String sql2 = "INSERT INTO emptable (emp_id, emp_name,emp_age) VALUES (?, ?, ?)";
		    String sql3 = "INSERT INTO emptable (emp_id, emp_name,emp_age) VALUES (?, ?, ?)";
		    
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "101");
		    statement.setString(2, "shannu");
		    statement.setString(3, "20");
		    
		  
		    PreparedStatement statement1 = conn.prepareStatement(sql);
		    statement1.setString(1, "102");
		    statement1.setString(2, "lavs");
		    statement1.setString(3, "20");
		   
		    PreparedStatement statement2 = conn.prepareStatement(sql);
		    statement2.setString(1, "103");
		    statement2.setString(2, "dileep");
		    statement2.setString(3, "21");
		    
		    PreparedStatement statement3 = conn.prepareStatement(sql);
		    statement3.setString(1, "104");
		    statement3.setString(2, "chintu");
		    statement3.setString(3, "20");
		   
		     
		    int rowsInserted = statement.executeUpdate();
		    int rowsInserted1 = statement1.executeUpdate();
		    int rowsInserted2 = statement2.executeUpdate();
		    int rowsInserted3 = statement3.executeUpdate();
		    
		    if (rowsInserted > 0) {
		        System.out.println("first employee was inserted successfully!");
		    }
		    if (rowsInserted> 0) {
		        System.out.println("Second employee was inserted successfully!");
		    }
		    if (rowsInserted> 0) {
		        System.out.println("Third employee was inserted successfully!");
		    }
		    if (rowsInserted > 0) {
		        System.out.println("fourth employee was inserted successfully!");
		    }
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
