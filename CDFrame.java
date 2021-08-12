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

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class CDFrame {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CDFrame window = new CDFrame();
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
	public CDFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(0, 10, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("OP-REGISTRATION ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setBounds(63, 20, 283, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(0, 50, 569, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Check-Up");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton.setBounds(63, 69, 200, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Diagnosis");
		rdbtnNewRadioButton_1.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_1.setBounds(63, 104, 200, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(0, 131, 544, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton.setBounds(10, 243, 85, 21);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 531, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CheckupFrame f6 = new CheckupFrame();
				f6.frame.setVisible(true);
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("For : Check-Up");  bw.write("\r\n");
					bw.close();
					fw.close();
				}catch(Exception e1) {}
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DiagFrame f7 = new DiagFrame();
				f7.frame.setVisible(true);
				try {
					File file = new File("D://CourseProject/f1.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("For : Diagnosis");  bw.write("\r\n");
					bw.close();
					fw.close();
				}catch(Exception e1) {}
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			LoginFrame1 f1 = new LoginFrame1();
			f1.frame.setVisible(true);
			}
		});
	}

}
