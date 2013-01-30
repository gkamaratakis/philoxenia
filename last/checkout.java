import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;


public class checkout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkout frame = new checkout();
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
	public checkout() {
		setTitle("Philoxenia - Chcekout");
		setResizable(false);
		setBounds(100, 100, 415, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseRoomFor = new JLabel("Choose room for checkout");
		lblChooseRoomFor.setBounds(10, 11, 246, 14);
		contentPane.add(lblChooseRoomFor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"---", "R1", "R2", "R3", "R4", "R5"}));
		comboBox.setBounds(10, 32, 124, 20);
		contentPane.add(comboBox);
		
		JButton btnPrintCheckoutReceipt = new JButton("Print checkout");
		btnPrintCheckoutReceipt.setBounds(265, 32, 134, 20);
		contentPane.add(btnPrintCheckoutReceipt);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			}
		});
		Cancel.setBounds(265, 80, 134, 23);
		contentPane.add(Cancel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(77, 106, 91, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalBill = new JLabel("Bill:");
		lblTotalBill.setBounds(10, 110, 58, 14);
		contentPane.add(lblTotalBill);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(77, 137, 91, 23);
		contentPane.add(textField_1);
		
		JLabel lblTotalDays = new JLabel("Total days:");
		lblTotalDays.setBounds(10, 141, 68, 14);
		contentPane.add(lblTotalDays);
		
		textField_2 = new JTextField();
		textField_2.setBounds(235, 109, 68, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDiscount = new JLabel("Discount:");
		lblDiscount.setBounds(178, 109, 67, 14);
		contentPane.add(lblDiscount);
		
		JLabel lblFullname = new JLabel("Fullname:");
		lblFullname.setBounds(10, 79, 58, 14);
		contentPane.add(lblFullname);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(77, 75, 152, 23);
		contentPane.add(textField_3);
		
		JLabel lblExtra = new JLabel("Extra:");
		lblExtra.setBounds(178, 140, 67, 14);
		contentPane.add(lblExtra);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(235, 140, 68, 20);
		contentPane.add(textField_4);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(333, 114, 86, 18);
		contentPane.add(lblTotal);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(313, 141, 86, 20);
		contentPane.add(textField_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 54, 246, 14);
		contentPane.add(separator);
		
		JButton Paid = new JButton("Paid");
		Paid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Paid.setBounds(265, 7, 134, 23);
		contentPane.add(Paid);
		
		JButton Apply = new JButton("Apply");
		Apply.setBounds(266, 54, 133, 23);
		contentPane.add(Apply);
	}
}
