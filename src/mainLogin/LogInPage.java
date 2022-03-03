package mainLogin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class LogInPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage window = new LogInPage();
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
	public LogInPage() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 669, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setUndecorated(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 348, 380);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(".//assets//KSY-53-What_is_a_firewall___1_348x380.jpg"));
		label.setBounds(0, 0, 348, 380);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(350, 0, 319, 380);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(96, 140, 112, 23);
		panel_1.add(lblUserName);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Enter a valid user name\r\n");
		txtUsername.setBounds(51, 159, 207, 33);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPassword.setBounds(96, 203, 112, 23);
		panel_1.add(lblPassword);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFocusable(false);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(new Color(52, 152, 219));
		btnLogIn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLogIn.setBounds(51, 278, 207, 33);
		panel_1.add(btnLogIn);
		
		JLabel userLogo = new JLabel("");
		userLogo.setIcon(new ImageIcon(".//assets//icons8-user-100.png"));
		userLogo.setBounds(96, 31, 100, 98);
		panel_1.add(userLogo);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		btnX.setFocusPainted(false);
		btnX.setBorderPainted(false);
		btnX.setBackground(new Color(240,240,240));
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			btnX.setBackground(Color.red);
			btnX.setForeground(Color.white);
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnX.setBackground(new Color(240,240,240));
				btnX.setForeground(Color.black);
			}
			
		});
		btnX.setBounds(271, 0, 48, 41);
		panel_1.add(btnX);
		
		JLabel lblForgotPassoword = new JLabel("Forgot Passoword?");
		lblForgotPassoword.setBounds(61, 322, 116, 21);
		panel_1.add(lblForgotPassoword);
		
		JLabel lblClickHere = new JLabel("Click Here");
		lblClickHere.setForeground(new Color(30, 144, 255));
		lblClickHere.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblClickHere.setBounds(187, 325, 81, 14);
		panel_1.add(lblClickHere);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(51, 224, 207, 33);
		panel_1.add(passwordField);
		
		JButton button = new JButton("-");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(52, 152, 219));
				button.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(240,240,240));
				button.setForeground(Color.black);
			}
		});
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setBackground(SystemColor.menu);
		button.setBounds(224, 0, 48, 41);
		panel_1.add(button);
	}
}
