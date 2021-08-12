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

public class CheckupFrame {

	 JFrame frame;
	 JTextField txtDoctorName;
	 JTextField txtDepartment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckupFrame window = new CheckupFrame();
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
	public CheckupFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 514, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(-8, 10, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblCheckupDetails = new JLabel("Check-Up Details");
		lblCheckupDetails.setForeground(Color.RED);
		lblCheckupDetails.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblCheckupDetails.setBounds(43, 26, 314, 30);
		frame.getContentPane().add(lblCheckupDetails);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(-30, 66, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		txtDoctorName = new JTextField();
		txtDoctorName.setText("Doctor Name");
		txtDoctorName.setSelectionColor(new Color(175, 238, 238));
		txtDoctorName.setSelectedTextColor(new Color(175, 238, 238));
		txtDoctorName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtDoctorName.setColumns(10);
		txtDoctorName.setBackground(new Color(175, 238, 238));
		txtDoctorName.setBounds(43, 89, 170, 28);
		frame.getContentPane().add(txtDoctorName);
		
		txtDepartment = new JTextField();
		txtDepartment.setText("Department");
		txtDepartment.setSelectionColor(new Color(175, 238, 238));
		txtDepartment.setSelectedTextColor(new Color(175, 238, 238));
		txtDepartment.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		txtDepartment.setColumns(10);
		txtDepartment.setBackground(new Color(175, 238, 238));
		txtDepartment.setBounds(43, 133, 170, 28);
		frame.getContentPane().add(txtDepartment);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 18));
		btnNewButton.setBounds(43, 188, 108, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(352, 265, 114, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 267, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String dr = txtDoctorName.getText();
					String d = txtDepartment.getText();
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Doctor Name : "); 	bw.write(dr); bw.write("\r\n");
					bw.write("Department : "); 	bw.write(d); bw.write("\r\n");
					bw.write("------------------------------------------------------");
					bw.write("\r\n");
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
