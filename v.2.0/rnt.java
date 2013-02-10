import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class rnt {
	int id;
	String doa;
	String dod;
	float price;
	String rname;
	String cname;
	boolean paid;
	String status;
	public rnt(String doa,String dod,String cname,String rname,float price){
		this.doa=doa;
		this.dod=dod;
		this.cname=cname;
		this.rname=rname;
		this.price=price;
		this.paid=false;
		status="available";	
		}
	public void pay(){
		paid=true;	
	}
	public void reserve(){
		status="Reserved";
	}
	public void checkout(){
		status="n/a";
		}
	public void checkin(){
		status="Occupied";	
	}
	public void register(){
				ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		
		final String service_uri = "jdbc:mysql://localhost:3306/test";
		final String service_user = "root";
		final String service_pass = "root";
	
		try {
			final Connection con = DriverManager.getConnection(service_uri, service_user, service_pass);
			
			if(con != null) {

				try {
					Statement statement = con.createStatement();
					if(statement != null) {
				 		try {
				 			resultSet = statement.executeQuery("INSERT INTO rentals VALUES (`"+cname+"`, `"+doa+"`, `"+dod+"`, `"+price+"`, `"+paid+"`, `"+status+"`, `"+rname+"`)"); 
				 			
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

