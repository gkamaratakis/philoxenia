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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;


public class rentals extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JButton btnNewButton_2;
	private JButton button;
	private JTextField txtDate;
	private JLabel lblNavigate;
	private JPanel panel;
	private JTextField textField_21;
	private JLabel lblTotalday;
	private JLabel lblSoftengTeam;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Statistics");
		btnNewButton.setBounds(10, 451, 163, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check availability");
		btnNewButton_1.setBounds(10, 411, 163, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogoff = new JButton("logout");
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				philform frame = new philform();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnLogoff.setBounds(418, 0, 80, 23);
		contentPane.add(btnLogoff);
		
		textField = new JTextField();
		textField.setBounds(104, 132, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 163, 134, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(248, 132, 48, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(248, 163, 48, 20);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "RES", "OCC", "N/A"}));
		comboBox.setBounds(43, 131, 51, 23);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "RES", "OCC", "N/A"}));
		comboBox_1.setBounds(43, 163, 51, 23);
		contentPane.add(comboBox_1);
		
		JLabel lblRoomStatus = new JLabel("Room status:");
		lblRoomStatus.setBounds(22, 111, 86, 14);
		contentPane.add(lblRoomStatus);
		
		JLabel lblClientsName = new JLabel("Client's name:");
		lblClientsName.setBounds(136, 111, 86, 14);
		contentPane.add(lblClientsName);
		
		JLabel lblPrice = new JLabel("\u20AC");
		lblPrice.setBounds(267, 111, 46, 14);
		contentPane.add(lblPrice);
		
		JLabel lblR = new JLabel("R1");
		lblR.setBounds(22, 135, 29, 14);
		contentPane.add(lblR);
		
		JLabel lblR_1 = new JLabel("R2");
		lblR_1.setBounds(22, 166, 20, 14);
		contentPane.add(lblR_1);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(180, 451, 88, 40);
		contentPane.add(btnPrint);
		
		JLabel lblR_2 = new JLabel("R3");
		lblR_2.setBounds(22, 195, 20, 14);
		contentPane.add(lblR_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "RES", "OCC", "N/A"}));
		comboBox_2.setBounds(43, 192, 51, 23);
		contentPane.add(comboBox_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 192, 134, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(248, 192, 48, 20);
		contentPane.add(textField_5);
		
		JLabel lblR_3 = new JLabel("R4");
		lblR_3.setBounds(22, 223, 20, 14);
		contentPane.add(lblR_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "RES", "OCC", "N/A"}));
		comboBox_3.setBounds(43, 220, 51, 23);
		contentPane.add(comboBox_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(104, 220, 134, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(248, 220, 48, 20);
		contentPane.add(textField_7);
		
		JLabel lblR_4 = new JLabel("R5");
		lblR_4.setBounds(22, 251, 20, 14);
		contentPane.add(lblR_4);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "RES", "OCC", "N/A"}));
		comboBox_4.setBounds(43, 248, 51, 23);
		contentPane.add(comboBox_4);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(104, 248, 134, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(248, 248, 48, 20);
		contentPane.add(textField_9);
		
		JButton btnSaveChanges = new JButton("Save");
		btnSaveChanges.setBounds(180, 411, 89, 40);
		contentPane.add(btnSaveChanges);
		
		textField_10 = new JTextField();
		textField_10.setBounds(306, 132, 68, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(385, 132, 68, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(306, 163, 68, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(385, 163, 68, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(306, 192, 68, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(385, 192, 68, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(306, 220, 68, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(385, 220, 68, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(306, 248, 68, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(385, 248, 68, 20);
		contentPane.add(textField_19);
		
		JLabel lblDateOfArrival = new JLabel("Date of Arrival");
		lblDateOfArrival.setBounds(300, 111, 84, 14);
		contentPane.add(lblDateOfArrival);
		
		JLabel lblDateOfDepart = new JLabel("Date of Depart");
		lblDateOfDepart.setBounds(385, 111, 84, 14);
		contentPane.add(lblDateOfDepart);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(139, 22, 174, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtDate = new JTextField();
		txtDate.setText("date");
		txtDate.setBounds(10, 11, 155, 30);
		panel.add(txtDate);
		txtDate.setColumns(10);
		
		button = new JButton("<<");
		button.setBounds(10, 44, 60, 23);
		panel.add(button);
		
		btnNewButton_2 = new JButton(">>");
		btnNewButton_2.setBounds(105, 44, 60, 23);
		panel.add(btnNewButton_2);
		
		textField_21 = new JTextField();
		textField_21.setBackground(Color.YELLOW);
		textField_21.setColumns(10);
		textField_21.setBounds(248, 278, 48, 20);
		contentPane.add(textField_21);
		
		lblTotalday = new JLabel("Total/day");
		lblTotalday.setBounds(180, 281, 59, 14);
		contentPane.add(lblTotalday);
		
		lblNavigate = new JLabel("Navigatation calendar");
		lblNavigate.setBounds(168, 4, 138, 14);
		contentPane.add(lblNavigate);
		
		lblSoftengTeam = new JLabel("Softeng Team 2013");
		lblSoftengTeam.setBounds(381, 488, 117, 14);
		contentPane.add(lblSoftengTeam);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 103, 463, 8);
		contentPane.add(separator);
	}
}
