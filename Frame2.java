import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Frame2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Frame2");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Patient Registration");
		rdbtnNewRadioButton.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBounds(28, 45, 200, 30);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Patient Record");
		rdbtnNewRadioButton_1.setFont(new Font("Raavi", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBounds(269, 45, 200, 30);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(13, 81, 456, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(13, 26, 456, 13);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RegFrame f3 = new RegFrame();
				f3.frame.setVisible(true);
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RecordFrame f11 = new RecordFrame();
				f11.frame.setVisible(true);
			}
		});
		
		
		
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 14));
		btnNewButton.setBounds(28, 237, 85, 21);
		frame.getContentPane().add(btnNewButton);
		frame.setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 509, 304);
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
