import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class RegFrame {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegFrame window = new RegFrame();
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
	public RegFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setForeground(new Color(72, 209, 204));
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("OUT-Patient (OP)");
		rdbtnNewRadioButton.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBounds(49, 80, 200, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("IN-Patient");
		rdbtnNewRadioButton_1.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_1.setBounds(49, 115, 200, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("PATIENT REGISTRATION ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setBounds(49, 31, 283, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(-14, 61, 569, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(-14, 21, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(-14, 142, 544, 13);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
			
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw= new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);

					// Below constructor argument decides whether to append or override
					bw.write("\r\n");
					bw.write("Patient Status : Out-Patient");
					bw.write("\r\n");
					bw.close();
					fw.close();
				} catch (IOException e1) {
				} 
				ODetailsFrame f4 = new ODetailsFrame();
				f4.frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw= new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);

					// Below constructor argument decides whether to append or override
					bw.write("\r\n");
					bw.write("Patient Status : IN-Patient");
					bw.write("\r\n");
					bw.close();
					fw.close();
				} catch (IOException e1) {
				} 
				OEFrame f8 = new OEFrame();
				f8.frame.setVisible(true);
			}
		});
		
		
		
		
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton.setBounds(10, 227, 85, 21);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 518, 294);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			LoginFrame1 f1 = new LoginFrame1();
			f1.frame.setVisible(true);
			}
		});
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
}
