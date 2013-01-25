import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class philform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
	public philform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 207, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClickMe = new JButton("login");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame ren = new rentals();
				ren.setTitle("rentals");
				ren.setVisible(true);	
				setVisible(false);
			}
		});
		btnClickMe.setBounds(92, 106, 89, 23);
		contentPane.add(btnClickMe);
		
		textField = new JTextField();
		textField.setBounds(10, 28, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 75, 171, 20);
		contentPane.add(textField_1);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 11, 101, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 59, 71, 14);
		contentPane.add(lblPassword);
	}
}
