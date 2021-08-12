import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class OpeDetailsFrame {

	 JFrame frame;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpeDetailsFrame window = new OpeDetailsFrame();
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
	public OpeDetailsFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 348, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2.setBounds(-32, 33, 569, 13);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_1.setBounds(-122, 90, 569, 13);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblOperationPatientsDetails = new JLabel("Operation Patients Details");
		lblOperationPatientsDetails.setBounds(10, 56, 314, 30);
		lblOperationPatientsDetails.setForeground(Color.RED);
		lblOperationPatientsDetails.setFont(new Font("Segoe UI", Font.BOLD, 22));
		frame.getContentPane().add(lblOperationPatientsDetails);
		
		textField = new JTextField();
		textField.setBounds(10, 113, 170, 28);
		textField.setText("Name");
		textField.setSelectionColor(new Color(175, 238, 238));
		textField.setSelectedTextColor(new Color(175, 238, 238));
		textField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 151, 67, 28);
		textField_1.setText("Age");
		textField_1.setSelectionColor(new Color(175, 238, 238));
		textField_1.setSelectedTextColor(new Color(175, 238, 238));
		textField_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 151, 108, 28);
		textField_2.setText("Date-of-birth");
		textField_2.setSelectionColor(new Color(175, 238, 238));
		textField_2.setSelectedTextColor(new Color(175, 238, 238));
		textField_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(6, 199, 103, 21);
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(132, 199, 103, 21);
		rdbtnFemale.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		rdbtnFemale.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(rdbtnFemale);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 236, 170, 28);
		textField_3.setText("+91-Contact Number");
		textField_3.setSelectionColor(new Color(175, 238, 238));
		textField_3.setSelectedTextColor(new Color(175, 238, 238));
		textField_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Address Details :");
		lblNewLabel.setBounds(10, 271, 170, 15);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 296, 248, 88);
		textArea.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(97, 409, 108, 21);
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(239, 456, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 458, 85, 21);
		frame.getContentPane().add(btnNewButton_2);

		
rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fr= new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fr);

					// Below constructor argument decides whether to append or override
					
					bw.write("Gender  : Male");
					bw.write("\r\n");
					bw.close();
					fr.close();
				} catch (IOException e1) {
				} 
			}
		});

	
		rdbtnFemale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {

					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Gender : Female");
				bw.write("\r\n");
				bw.close();
				fw.close();
				}
				catch(Exception e1) {}
			}	
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
				String n = textField.getText();
				bw.write("Name : ");	bw.write(n);	bw.write("\r\n");
				
				String a = textField_1.getText();
				bw.write("Age : "); 	bw.write(a); 	bw.write("\r\n");
				
				String dob = textField_2.getText();
				bw.write("D-O-B : "); bw.write(dob); 	bw.write("\r\n"); 	
				bw.write("------------------------------------------------------");

				bw.write("\r\n");
				
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
