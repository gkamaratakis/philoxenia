import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class chin extends JFrame {

	private JPanel contentPane;
	private JTextField Client;
	private JTextField DOD;
	private JTextField Price;
	private JTextField DOA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chin frame = new chin();
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
	public chin() {
		setTitle("Philoxenia - Checkin");
		setBounds(100, 100, 356, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 338, 170);
		contentPane.add(panel);
		
		Client = new JTextField();
		Client.setColumns(10);
		Client.setBounds(121, 11, 183, 20);
		panel.add(Client);
		
		DOD = new JTextField();
		DOD.setColumns(10);
		DOD.setBounds(121, 98, 183, 20);
		panel.add(DOD);
		
		JLabel label = new JLabel("Client's name:");
		label.setBounds(10, 14, 101, 14);
		panel.add(label);
		
		JLabel label_2 = new JLabel("Date of departure:");
		label_2.setBounds(10, 101, 117, 14);
		panel.add(label_2);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(10, 42, 127, 14);
		panel.add(lblPrice);
		
		Price = new JTextField();
		Price.setText("0");
		Price.setColumns(10);
		Price.setBounds(121, 39, 63, 20);
		panel.add(Price);
		
		JLabel lblSource = new JLabel("Source:");
		lblSource.setBounds(10, 126, 101, 14);
		panel.add(lblSource);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----------", "Reservation", "Non-reserved"}));
		comboBox.setBounds(121, 129, 183, 23);
		panel.add(comboBox);
		
		JLabel label_1 = new JLabel("Date of arrival:");
		label_1.setBounds(10, 73, 117, 14);
		panel.add(label_1);
		
		DOA = new JTextField();
		DOA.setColumns(10);
		DOA.setBounds(121, 70, 183, 20);
		panel.add(DOA);
		
		JButton btnCheckin = new JButton("Checkin");
		btnCheckin.setBounds(249, 173, 89, 23);
		contentPane.add(btnCheckin);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(158, 173, 89, 23);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCheckin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if rental exists as reservation then just change status of room to OCCUPIED    else
				rnt ren1 = new rnt(DOA.getText(),DOD.getText(),Client.getText(),"ROOM",Float.parseFloat(Price.getText()));
				client cl = new client(Client.getText(),"email@here.gr");
				ren1.checkin();
				ren1.register();
				cl.register();
			}
		});
	}
}
