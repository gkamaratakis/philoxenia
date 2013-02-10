import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class client {
	public String fname;
	public String email;
	
	final private String service_uri = "jdbc:mysql://localhost:3306/test";
	final private String service_user = "root";
	final private String service_pass = "root";

	public client(String fname,String email){
		this.fname=fname;
		this.email=email;
	}

	public void register(){
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}

		try {
			final Connection con = DriverManager.getConnection(service_uri, service_user, service_pass);
			
			if(con != null) {

				try {
					Statement statement = con.createStatement();
					if(statement != null) {
				 		try {
				 			resultSet = statement.executeQuery("INSERT INTO Clients VALUES (`"+fname+"`, "+email+")"); 
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

	public void exists(){
			ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}

		try {
			final Connection con = DriverManager.getConnection(service_uri, service_user, service_pass);
			
			if(con != null) {

				try {
					Statement statement = con.createStatement();
					if(statement != null) {
				 		try {
				 			resultSet = statement.executeQuery("SELECT onoma FROM Clients WHERE onoma="+fname); 
				 			/*if (resultSet.length==0){
				 				return false;
				 			} else{
				 				return true;
				 			}*/
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
