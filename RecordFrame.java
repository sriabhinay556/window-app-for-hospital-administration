import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JTextArea;

public class RecordFrame {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordFrame window = new RecordFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public RecordFrame() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient Record");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(90, 26, 204, 69);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(-34, 23, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(-62, 75, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 105, 354, 472);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(-82, 587, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_2);
		frame.setBounds(100, 100, 427, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		String content = new String(Files.readAllBytes(Paths.get("D://CourseProject/f1.txt")));

		textArea.setText(content);
		
		
		
}
}