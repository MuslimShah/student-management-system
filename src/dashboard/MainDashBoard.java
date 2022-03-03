package dashboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import home.Home;
import registerStaff.RegisterStaff;
import registerStudent.RegisterStudent;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainDashBoard extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JButton btnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashBoard frame = new MainDashBoard();
					frame.setVisible(true);
					frame.btnHome.doClick();//when main frame is loaded home button is clicked automatically
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainDashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 59, 72));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(53, 59, 72));
		
		layeredPane = new JLayeredPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)))
		);
		layeredPane.setLayout(new CardLayout(0, 0));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		JLabel lblSchoolManagementSystem = new JLabel("School Management System By Muslim Shah");
		lblSchoolManagementSystem.setForeground(Color.WHITE);
		lblSchoolManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblSchoolManagementSystem);
		
		btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home home =new Home();
				switchPanels(home);
				
			}
		});
		btnHome.setFocusPainted(false);
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHome.setBackground(new Color(220, 221, 225));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color(53, 59, 72));
			}
		});
		
		
		btnHome.setVerticalAlignment(SwingConstants.TOP);
		btnHome.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setBackground(new Color(53, 59, 72));
		btnHome.setFocusable(false);
		
		btnHome.setIconTextGap(20);
		btnHome.setIcon(new ImageIcon(".//assets//icons8-home-24.png"));
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnRegisterStudent = new JButton("Register Student");
		btnRegisterStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterStudent register=new RegisterStudent();
				switchPanels(register);
			}
		});
		btnRegisterStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRegisterStudent.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnRegisterStudent.setBackground(new Color(53, 59, 72));
			}
		});
		btnRegisterStudent.setIconTextGap(10);
		btnRegisterStudent.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegisterStudent.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegisterStudent.setFocusTraversalKeysEnabled(false);
		btnRegisterStudent.setFocusable(false);
		btnRegisterStudent.setFocusPainted(false);
		btnRegisterStudent.setBackground(Color.WHITE);
		btnRegisterStudent.setIcon(new ImageIcon(".//assets//icons8-student-registration-24.png"));
		btnRegisterStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRegisterStudent.setForeground(Color.WHITE);
		btnRegisterStudent.setBackground(new Color(53, 59, 72));
		
		JButton btnRegisterStaff = new JButton("Register Staff");
		btnRegisterStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterStaff rstaff=new RegisterStaff();
				switchPanels(rstaff);
				
			}
		});
		btnRegisterStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegisterStaff.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnRegisterStaff.setBackground(new Color(53, 59, 72));
			}
		});
		btnRegisterStaff.setIcon(new ImageIcon(".//assets//icons8-add-administrator-24.png"));
		btnRegisterStaff.setVerticalAlignment(SwingConstants.TOP);
		btnRegisterStaff.setIconTextGap(10);
		btnRegisterStaff.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegisterStaff.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegisterStaff.setForeground(Color.WHITE);
		btnRegisterStaff.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRegisterStaff.setFocusable(false);
		btnRegisterStaff.setFocusPainted(false);
		btnRegisterStaff.setBackground(new Color(53, 59, 72));
		
		JButton btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdateStudent.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnUpdateStudent.setBackground(new Color(53, 59, 72));
			}
		});
		btnUpdateStudent.setIcon(new ImageIcon(".//assets//icons8-update-24.png"));
		btnUpdateStudent.setVerticalAlignment(SwingConstants.TOP);
		btnUpdateStudent.setIconTextGap(10);
		btnUpdateStudent.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnUpdateStudent.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpdateStudent.setForeground(Color.WHITE);
		btnUpdateStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUpdateStudent.setFocusable(false);
		btnUpdateStudent.setFocusPainted(false);
		btnUpdateStudent.setBackground(new Color(53, 59, 72));
		
		JButton btnUpdateTeacher = new JButton("Update Teacher");
		btnUpdateTeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdateTeacher.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnUpdateTeacher.setBackground(new Color(53, 59, 72));
			}
		});
		btnUpdateTeacher.setIcon(new ImageIcon(".//assets//icons8-edit-24.png"));
		btnUpdateTeacher.setVerticalAlignment(SwingConstants.TOP);
		btnUpdateTeacher.setIconTextGap(10);
		btnUpdateTeacher.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnUpdateTeacher.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpdateTeacher.setForeground(Color.WHITE);
		btnUpdateTeacher.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUpdateTeacher.setFocusable(false);
		btnUpdateTeacher.setFocusPainted(false);
		btnUpdateTeacher.setBackground(new Color(53, 59, 72));
		
		JButton btnShowStudent = new JButton("View Students");
		btnShowStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnShowStudent.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnShowStudent.setBackground(new Color(53, 59, 72));
			}
		});
		btnShowStudent.setIcon(new ImageIcon(".//assets//icons8-view-24.png"));
		btnShowStudent.setVerticalAlignment(SwingConstants.TOP);
		btnShowStudent.setIconTextGap(10);
		btnShowStudent.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnShowStudent.setHorizontalAlignment(SwingConstants.LEFT);
		btnShowStudent.setForeground(Color.WHITE);
		btnShowStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnShowStudent.setFocusable(false);
		btnShowStudent.setFocusPainted(false);
		btnShowStudent.setBackground(new Color(53, 59, 72));
		
		JButton btnViewStaff = new JButton("View Staff");
		btnViewStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnViewStaff.setBackground(new Color(220, 221, 225));
			}
			public void mouseExited(MouseEvent e) {
				btnViewStaff.setBackground(new Color(53, 59, 72));
			}
		});
		btnViewStaff.setIcon(new ImageIcon(".//assets//icons8-view-24.png"));
		btnViewStaff.setVerticalAlignment(SwingConstants.TOP);
		btnViewStaff.setIconTextGap(10);
		btnViewStaff.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnViewStaff.setHorizontalAlignment(SwingConstants.LEFT);
		btnViewStaff.setForeground(Color.WHITE);
		btnViewStaff.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewStaff.setFocusable(false);
		btnViewStaff.setFocusPainted(false);
		btnViewStaff.setBackground(new Color(53, 59, 72));
		
		JLabel lblDashboard = new JLabel("DashBoard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setFont(new Font("Old English Text MT", Font.BOLD, 18));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnViewStaff, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnShowStudent, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnUpdateTeacher, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnUpdateStudent, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnRegisterStaff, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnRegisterStudent, GroupLayout.PREFERRED_SIZE, 165, Short.MAX_VALUE)
						.addComponent(btnHome, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
					.addGap(0))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnHome)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnRegisterStudent)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnRegisterStaff, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdateTeacher, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnShowStudent, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnViewStaff, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}

	
	//====================================== methods==============
	public void switchPanels(JPanel panel){
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}
