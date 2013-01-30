
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class philmain {
	
	public static void main(String[] args) {

		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
			throw new RuntimeException(
					"Cannot find the driver in the classpath!", e);
		}

		final String service_uri = "jdbc:mysql://localhost:3306/test";
		final String service_user = "root";
		final String service_pass = "root";

		try {
			final Connection con = DriverManager.getConnection(service_uri,
					service_user, service_pass);
			
			//statement
			if(con != null) {
		        try {
			     Statement statement = con.createStatement();
			   //execute
			     if(statement != null) {
			 		try {
			 		    resultSet = statement.executeQuery("SELECT onoma FROM test where idtest=1");//jframe title 
			 		    while (resultSet.next() )
			 		  {	
			 		    //emfanizoume to login form kai dinoume titlo apo tin vasi dedomenwn	
			 		  	JFrame frame = new philform();
						frame.setTitle(resultSet.getString("onoma"));
						frame.setVisible(true);
						
			 		  }
			 		   con.close();
			 		} catch (SQLException e) {
			 		    // System.out.println("Unable to create statement");
			 		}
			 	}
			} catch (SQLException e) {
				//system.out.println(e);
			}  
		}
		} catch (SQLException e) {
			System.err.println(e);
		}
		
	}
	
}
