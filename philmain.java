
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
		
				
		
		//database connection
				//System.out.println("Testing JDBC basic connection");//message for testing
				ResultSet resultSet = null;
				try {
					//System.out.println("Loading driver...");//message for testing
					Class.forName("com.mysql.jdbc.Driver");
					//System.out.println("Driver loaded!");//message for testing
				} catch (ClassNotFoundException e) {
					throw new RuntimeException(
							"Cannot find the driver in the classpath!", e);
				}

				final String service_uri = "jdbc:mysql://localhost:3306/test";
				final String service_user = "root";
				final String service_pass = "root";

				System.out.println("Connecting database...");
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
					 		    resultSet = statement.executeQuery("SELECT onoma FROM test where idtest=1");
					 		    
					 		    while (resultSet.next() )
					 		  {
					 		  	System.out.println ("name : " + resultSet.getString("onoma")); 		  	
					 		  	//System.out.println ("Name : " + resultSet.getString("name"));
					 		  	JFrame frame = new philform();
								frame.setTitle(resultSet.getString("onoma"));
								frame.setVisible(true);
					 		  }
					 		   con.close();
					 		} catch (SQLException e) {
					 		     System.out.println("Unable to create statement");
					 		}
					 	}
					} catch (SQLException e) {
					     System.out.println("Unable to create statement");
					}  
				}
				} catch (SQLException e) {
					System.err.println(e);
				}
				//System.out.println("Database connected!");//message for testing
				//connection succeed

						
	}
	public void gg(){
		
	}
}
