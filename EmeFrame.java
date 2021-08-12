import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EmeFrame {

	 JFrame frame;
	 JTextField txtAmbulanceNo;
	 JTextField txtDate;
	 JTextField txtTime;
	 JTextField txtGuardianName;
	 JTextField txtTeatreNo;
	 private JButton btnNewButton_1;
	 private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmeFrame window = new EmeFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmeFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 366, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2.setBounds(-23, 10, 569, 13);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblEmergencyPatientDetails = new JLabel("Emergency patient details");
		lblEmergencyPatientDetails.setBounds(19, 33, 314, 30);
		lblEmergencyPatientDetails.setForeground(Color.RED);
		lblEmergencyPatientDetails.setFont(new Font("Segoe UI", Font.BOLD, 22));
		frame.getContentPane().add(lblEmergencyPatientDetails);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_1.setBounds(-113, 67, 569, 13);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		txtAmbulanceNo = new JTextField();
		txtAmbulanceNo.setBounds(19, 90, 170, 28);
		txtAmbulanceNo.setText("Ambulance no.");
		txtAmbulanceNo.setSelectionColor(new Color(175, 238, 238));
		txtAmbulanceNo.setSelectedTextColor(new Color(175, 238, 238));
		txtAmbulanceNo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtAmbulanceNo.setColumns(10);
		txtAmbulanceNo.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtAmbulanceNo);
		
		txtDate = new JTextField();
		txtDate.setBounds(19, 143, 170, 28);
		txtDate.setText("Date (DD-MM-YY)");
		txtDate.setSelectionColor(new Color(175, 238, 238));
		txtDate.setSelectedTextColor(new Color(175, 238, 238));
		txtDate.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtDate.setColumns(10);
		txtDate.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setBounds(19, 193, 61, 28);
		txtTime.setText("Time");
		txtTime.setSelectionColor(new Color(175, 238, 238));
		txtTime.setSelectedTextColor(new Color(175, 238, 238));
		txtTime.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtTime.setColumns(10);
		txtTime.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtTime);
		
		txtGuardianName = new JTextField();
		txtGuardianName.setBounds(19, 241, 170, 28);
		txtGuardianName.setText("Guardian Name");
		txtGuardianName.setSelectionColor(new Color(175, 238, 238));
		txtGuardianName.setSelectedTextColor(new Color(175, 238, 238));
		txtGuardianName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtGuardianName.setColumns(10);
		txtGuardianName.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtGuardianName);
		
		txtTeatreNo = new JTextField();
		txtTeatreNo.setBounds(19, 297, 94, 28);
		txtTeatreNo.setText("Theatre no.");
		txtTeatreNo.setSelectionColor(new Color(175, 238, 238));
		txtTeatreNo.setSelectedTextColor(new Color(175, 238, 238));
		txtTeatreNo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtTeatreNo.setColumns(10);
		txtTeatreNo.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtTeatreNo);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(129, 349, 108, 21);
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(248, 454, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 454, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
				String an = txtAmbulanceNo.getText();
				bw.write("Ambulance No. : ");	bw.write(an);	bw.write("\r\n");
				
				String d = txtDate.getText();
				bw.write("Date of joining : "); 	bw.write(d); 	bw.write("\r\n");
				
				String t = txtTime.getText();
				bw.write("Time of joining : "); bw.write(t); 	bw.write("\r\n");
				
				String g = txtGuardianName.getText();
				bw.write("Name of the Guardian : "); bw.write(g); bw.write("\r\n");
			
				String tno = txtTeatreNo.getText();
				bw.write("Ward no : "); bw.write(tno); 
//				bw.write("------------------------------------------------------");

				bw.write("\r\n");
				bw.write("------------------------------------------------------");

				bw.close();
				fw.close();
				
				}	
			
				catch(Exception e9) {}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame2 f2 = new Frame2();
				f2.frame.setVisible(true);
			}
		});
		

		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			LoginFrame1 f1 = new LoginFrame1();
			f1.frame.setVisible(true);
			}
		});
	}

}
