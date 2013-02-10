import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;


public class chav extends JFrame {

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
					chav frame = new chav();
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
	public chav() {
		setBounds(100, 100, 317, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*edw ginete to search sto opoio psaxnoume stin vasi dedomenwn
				 * SELECT roomName FROM rentals WHERE date BETWEEN dateofarrival AND dateofdeparture AND ?free? */
				// :D
			}
		});
		btnSearch.setBounds(184, 105, 107, 36);
		contentPane.add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(157, 11, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 37, 134, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"---", "Single room", "Double room", "Triple room"}));
		comboBox.setBounds(157, 68, 134, 26);
		contentPane.add(comboBox);
		
		JLabel lblDateOfArrival = new JLabel("Date of arrival:");
		lblDateOfArrival.setBounds(10, 14, 137, 14);
		contentPane.add(lblDateOfArrival);
		
		JLabel lblDateOfDeparture = new JLabel("Date of departure:");
		lblDateOfDeparture.setBounds(10, 40, 137, 14);
		contentPane.add(lblDateOfDeparture);
		
		JLabel lblRoomType = new JLabel("Room type:");
		lblRoomType.setBounds(10, 74, 137, 14);
		contentPane.add(lblRoomType);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			}
		});
		btnNewButton.setBounds(184, 143, 107, 39);
		contentPane.add(btnNewButton);
	}

}
