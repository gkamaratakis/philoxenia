import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;


public class rentals extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rentals frame = new rentals();
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
	public rentals() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Statistics");
		btnNewButton.setBounds(261, 372, 163, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check availability");
		btnNewButton_1.setBounds(261, 323, 163, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogoff = new JButton("logoff");
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				philform frame = new philform();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnLogoff.setBounds(338, 11, 86, 23);
		contentPane.add(btnLogoff);
		
		textField = new JTextField();
		textField.setBounds(45, 56, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 87, 134, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 56, 48, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 87, 48, 20);
		contentPane.add(textField_3);
	}
}
