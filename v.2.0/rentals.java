import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class rentals extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JButton button;
	JTextField txtDate;
	private JLabel lblNavigate;
	private JPanel panel;
	private JTextField textField_21;
	private JLabel lblTotalday;
	private JLabel lblSoftengTeam;
	private JLabel lblComments;
	private JSeparator separator_1;
	private JButton btnNewButton_3;
	private JLabel lblLoggedInAs;

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
		setBounds(100, 100, 518, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Statistics");
		btnNewButton.setBounds(314, 401, 163, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check availability");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame chav = new chav();
				chav.setTitle("Philoxenia - Availability");
				chav.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(314, 361, 163, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogoff = new JButton("logout");
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				philform frame = new philform();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnLogoff.setBounds(420, 21, 80, 23);
		contentPane.add(btnLogoff);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(397, 320, 80, 40);
		contentPane.add(btnPrint);
		
		JButton btnSaveChanges = new JButton("Save");
		btnSaveChanges.setBounds(314, 320, 79, 40);
		contentPane.add(btnSaveChanges);
		
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
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("0");
		textField_21.setBackground(Color.YELLOW);
		textField_21.setColumns(10);
		textField_21.setBounds(418, 289, 48, 20);
		contentPane.add(textField_21);
		
		lblTotalday = new JLabel("Total \u20AC / day:");
		lblTotalday.setBounds(339, 292, 81, 14);
		contentPane.add(lblTotalday);
		
		lblNavigate = new JLabel("Navigation calendar");
		lblNavigate.setBounds(168, 4, 138, 14);
		contentPane.add(lblNavigate);
		
		lblSoftengTeam = new JLabel("Softeng Team 2013");
		lblSoftengTeam.setBounds(397, 462, 117, 14);
		contentPane.add(lblSoftengTeam);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 103, 494, 8);
		contentPane.add(separator);
		
		lblComments = new JLabel("Comments:");
		lblComments.setBounds(6, 292, 132, 14);
		contentPane.add(lblComments);
		
		JTextArea txtrtypeHereYour = new JTextArea();
		txtrtypeHereYour.setText("(type here your daily comments)");
		txtrtypeHereYour.setBackground(Color.LIGHT_GRAY);
		txtrtypeHereYour.setBounds(10, 308, 282, 133);
		contentPane.add(txtrtypeHereYour);
		
		JButton btnCheckOut = new JButton("Check out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame ch = new checkout();
				ch.setTitle("Philoxenia - Checkout");
				ch.setVisible(true);	
							}
		});
		btnCheckOut.setBounds(28, 66, 105, 23);
		contentPane.add(btnCheckOut);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(3, 278, 497, 8);
		contentPane.add(separator_1);
		
		JButton btnReserve = new JButton("Reserve");
		btnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resform res= new resform();
				res.setVisible(true);
			}
		});
		btnReserve.setBounds(28, 21, 105, 23);
		contentPane.add(btnReserve);
		
		JList list = new JList();
		list.setBackground(UIManager.getColor("Button.shadow"));
		list.setBounds(6, 122, 494, 141);
		contentPane.add(list);
		
		JLabel lblView = new JLabel("View:");
		lblView.setBounds(6, 103, 46, 14);
		contentPane.add(lblView);
		
		btnNewButton_3 = new JButton("Checkin");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chin chin= new chin();
				chin.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(28, 44, 105, 23);
		contentPane.add(btnNewButton_3);
		
		lblLoggedInAs = new JLabel("Logged in as:");
		lblLoggedInAs.setBounds(339, 4, 80, 14);
		contentPane.add(lblLoggedInAs);
	}
}
