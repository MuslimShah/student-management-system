import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import error.error;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
/*
 * import the package
 * load and register the driver
 * establish the connection
 * create the statement
 * execute the query
 * process the results
 * close the connection
 * 
 * */
import java.sql.*;
public class loginform implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogIn;
	private JLabel lblUserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform window = new loginform();
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
	public loginform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		
		lblUserName = new JLabel("User Name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUserName.setBounds(217, 76, 125, 14);
		frame.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(178, 101, 201, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setBounds(217, 132, 125, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 159, 201, 30);
		frame.getContentPane().add(passwordField);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogIn.setBackground(new Color(100, 149, 237));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBounds(217, 201, 127, 30);
		btnLogIn.addActionListener(this);
		frame.getContentPane().add(btnLogIn);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		// database connection
		try{
			String path="jdbc:mysql://localhost:3306/academy";
			String userName="root";
			String password="";
			String query="select *from user";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(path,userName,password);
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			String pass=rs.getString(2);
			if(textField.getText().equals(name) && passwordField.getText().equals(pass) ){
				JOptionPane.showMessageDialog(null, "welcome");
				frame.setVisible(false);
				
			}
			else{
				//JOptionPane.showMessageDialog(null, "wrong username or password entered");
				error err=new error();
				err.setVisible(true);
				
			}
			
			
		}catch(Exception a){
			JOptionPane.showMessageDialog(null, "unable to connect "+a);
		}
		
	}
}
