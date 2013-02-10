import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class philform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					philform frame = new philform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public philform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClickMe = new JButton("login");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame ren = new rentals();
				JOptionPane.showMessageDialog(null,"Welcome user : "+textField.getText());
				ren.setTitle("Philoxenia - Rentals");
				ren.setVisible(true);	
				setVisible(false);
			}
		});
		btnClickMe.setBounds(120, 142, 89, 23);
		contentPane.add(btnClickMe);
		
		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 11, 186, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 75, 71, 14);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(10, 52, 171, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 36, 101, 14);
		panel.add(lblUsername);
		
		lblLogin = new JLabel("Login ");
		lblLogin.setBounds(65, 11, 58, 30);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 89, 171, 20);
			panel.add(passwordField);
	}

	@SuppressWarnings("deprecation")
	public int multtest(int x,int y){
		int c=0;
		c=x*y;
		return c;
	}
	private void logIN(){
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
				 			resultSet = statement.executeQuery("SELECT onoma,pass FROM test WHERE onoma="+textField.getText()+"AND pass="+passwordField.getPassword()); 
							
				 			while (resultSet.next() ){	
				 		    	/*	if ((resultSet.getString("pass") == passwordField.getPassword())&&(resultSet.getString("onoma") == textField.getText()) ){
									JFrame rnts = new rentals();									
									rnts.setVisible(true);
								 }*/
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

