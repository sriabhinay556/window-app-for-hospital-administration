import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class DiagFrame {

	 JFrame frame;
	 JTextField txtDiagnosisName;
	 JTextField txtFee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiagFrame window = new DiagFrame();
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
	public DiagFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 522, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1.setBounds(-19, 0, 569, 13);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblDiagnosisDetails = new JLabel("Diagnosis Details");
		lblDiagnosisDetails.setBounds(32, 23, 314, 30);
		lblDiagnosisDetails.setForeground(Color.RED);
		lblDiagnosisDetails.setFont(new Font("Segoe UI", Font.BOLD, 22));
		frame.getContentPane().add(lblDiagnosisDetails);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2.setBounds(-41, 56, 569, 13);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		txtDiagnosisName = new JTextField();
		txtDiagnosisName.setBounds(32, 79, 170, 28);
		txtDiagnosisName.setText("Diagnosis Name");
		txtDiagnosisName.setSelectionColor(new Color(175, 238, 238));
		txtDiagnosisName.setSelectedTextColor(new Color(175, 238, 238));
		txtDiagnosisName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtDiagnosisName.setColumns(10);
		txtDiagnosisName.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtDiagnosisName);
		
		txtFee = new JTextField();
		txtFee.setBounds(32, 123, 170, 28);
		txtFee.setText("Amount (Rs./-)");
		txtFee.setSelectionColor(new Color(175, 238, 238));
		txtFee.setSelectedTextColor(new Color(175, 238, 238));
		txtFee.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtFee.setColumns(10);
		txtFee.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(txtFee);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(32, 178, 108, 21);
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(362, 253, 114, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 253, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String dn = txtDiagnosisName.getText();
					String df = txtFee.getText();
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Diagnosis Name : "); 	bw.write(dn); bw.write("\r\n");
					bw.write("Fee : Rs."); 	bw.write(df); bw.write("\r\n");
					bw.write("------------------------------------------------------");
					bw.close();
					fw.close();
				}
				catch(Exception e1) {}
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
