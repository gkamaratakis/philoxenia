import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class resform extends JFrame {

	private JPanel contentPane;
	private JTextField Client;
	private JTextField DOA;
	private JTextField DOD;
	private JTextField Price;
	private boolean haveRooms=false; 
	private rnt rm[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resform frame = new resform();
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
	public resform() {
		setResizable(false);
		setTitle("Philoxenia - Reserve form");
		setBounds(100, 100, 344, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReserve = new JButton("Reserve");
		btnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String doa,String dod,String cname,String rname,float price
				rnt ren1 = new rnt(DOA.getText(),DOD.getText(),Client.getText(),"ROOM",Float.parseFloat(Price.getText()));
				client cl = new client(Client.getText(),"email@here.gr");
				ren1.register();
				cl.register();
				//int i=0;
				//rnt newRn[];
				
				//if (haveRooms){
				//	for (i=0;i<=Integer.parseInt(Amount.getText());i++){
				//		newRn[i]=new rnt(/**/);
				//		newRn[i].register();
				//	}
				//}else{
					//DEN EXO ARKETA EIPAME!
				//}
		
			}
		});
		btnReserve.setBounds(239, 175, 89, 23);
		contentPane.add(btnReserve);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			}
		});
		btnCancel.setBounds(140, 175, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnCheckAvailabiliyt = new JButton("Check availability");
		btnCheckAvailabiliyt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*rm = checkAv(DOD.getText(),DOA.getText());
				if (rm.length < Integer.parseInt(Amount.getText())){
					/// den exo arketa dmatia re file
				} else{
					haveRooms=true;
				}*/
			}
		});
		btnCheckAvailabiliyt.setBounds(193, 109, 135, 32);
		contentPane.add(btnCheckAvailabiliyt);
		
		Client = new JTextField();
		Client.setBounds(121, 11, 183, 20);
		contentPane.add(Client);
		Client.setColumns(10);
		
		DOA = new JTextField();
		DOA.setColumns(10);
		DOA.setBounds(121, 35, 183, 20);
		contentPane.add(DOA);
		
		DOD = new JTextField();
		DOD.setColumns(10);
		DOD.setBounds(121, 61, 183, 20);
		contentPane.add(DOD);
		
		JLabel lblClientsName = new JLabel("Client's name:");
		lblClientsName.setBounds(10, 14, 101, 14);
		contentPane.add(lblClientsName);
		
		JLabel lblDateOfArrival = new JLabel("Date of arrival:");
		lblDateOfArrival.setBounds(10, 38, 117, 14);
		contentPane.add(lblDateOfArrival);
		
		JLabel lblDateOfDeparture = new JLabel("Date of departure:");
		lblDateOfDeparture.setBounds(10, 64, 117, 14);
		contentPane.add(lblDateOfDeparture);
		
		JLabel lblMessageIfAvailable = new JLabel("Message if available:");
		lblMessageIfAvailable.setBounds(91, 150, 183, 14);
		contentPane.add(lblMessageIfAvailable);
		
		JLabel lblAmountOfRooms = new JLabel("Price:");
		lblAmountOfRooms.setBounds(10, 89, 127, 14);
		contentPane.add(lblAmountOfRooms);
		
		Price = new JTextField();
		Price.setText("0");
		Price.setBounds(121, 86, 63, 20);
		contentPane.add(Price);
		Price.setColumns(10);
	}
	
	//public rnt[] checkAv(String date,String date1){
		//rnt array[];
		//// array=SELECT FROM rent WHERE not date=dod....
		//if (array.length==5){
		//	return null;
		//}else{
		//	//return array;
		//}

		
	}

