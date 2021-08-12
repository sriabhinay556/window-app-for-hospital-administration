import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class LoginFrame1 {

	 JFrame frame;
	 JTextField textField;
	 JLabel lblNewLabel_1;
	 JLabel lblNewLabel_4;
	 JButton btnNewButton;
	 JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame1 window = new LoginFrame1();
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
	public LoginFrame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XXX GROUP OF HOSPITALS");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		lblNewLabel.setBounds(106, 33, 272, 30);
		lblNewLabel.setBackground(new Color(0, 0, 139));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Raavi", Font.BOLD, 18));
		lblNewLabel_2.setBounds(106, 123, 92, 46);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setFont(new Font("Raavi", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(106, 179, 92, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(175, 238, 238));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(208, 137, 116, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 71, 456, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_4 = new JLabel("-----------------------------------------------------------------");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 10, 456, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Raavi", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(179, 235, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(175, 238, 238));
		passwordField.setBounds(208, 183, 116, 19);
		frame.getContentPane().add(passwordField);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String u = textField.getText();
				String p = passwordField.getText();
				
				if(u.equals("srec")&&p.equals("java")) {
				
				Frame2 f2 = new Frame2();
				f2.frame.setVisible(true);
			}
				else {
					JOptionPane.showMessageDialog(null, "Enter correct password");
				}
			}
		});
		frame.setBounds(100, 100, 483, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
