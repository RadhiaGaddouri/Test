import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAdmin frame = new FrameAdmin();
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
	public FrameAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setBounds(167, 36, 178, 16);
		contentPane.add(lblAdministration);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(51, 90, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 132, 56, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(135, 87, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 129, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
