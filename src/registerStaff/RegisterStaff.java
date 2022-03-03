package registerStaff;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterStaff extends JPanel {
	private JTextField firstName;
	private JTextField fatherName;
	private JTextField lastName;
	private JTextField contact;
	private JTextField textField_5;
	private JTextField CNIC;
	private JRadioButton rbtnMale;
	private JRadioButton rbtnOther;
	private JRadioButton rbtnFemale;

	/**
	 * Create the panel.
	 */
	public RegisterStaff() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 59, 72));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Muslim Shah\\Downloads\\icons8-add-administrator-45.png"));
		label.setIconTextGap(10);
		panel.add(label);
		
		JLabel lblRegisterNewStaff = new JLabel("Register New Staff Member");
		lblRegisterNewStaff.setForeground(Color.WHITE);
		lblRegisterNewStaff.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblRegisterNewStaff);
		
		JPanel panel_1 = new JPanel();
		
		JCheckBox staffInfo = new JCheckBox("The above information is correct");
		staffInfo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnAddStaff = new JButton("Add Staff");
		btnAddStaff.setIconTextGap(20);
		btnAddStaff.setIcon(new ImageIcon(".//assets//icons8-add-24.png"));
		btnAddStaff.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAddStaff.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddStaff.setForeground(Color.WHITE);
		btnAddStaff.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddStaff.setFocusable(false);
		btnAddStaff.setFocusPainted(false);
		btnAddStaff.setBackground(new Color(53, 59, 72));
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		firstName = new JTextField();
		firstName.setColumns(10);
		
		JLabel label_2 = new JLabel("Father Name");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		fatherName = new JTextField();
		fatherName.setColumns(10);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_4 = new JLabel("Date Of Birth");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		lastName = new JTextField();
		lastName.setColumns(10);
		
		JDateChooser dateOfBirth = new JDateChooser();
		
		JLabel label_5 = new JLabel("Select Gender");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rbtnMale = new JRadioButton("Male");
		rbtnMale.addActionListener(new ActionListener() {
			/*
			 * when the user select the radio button other buttons will be disselected automatically*/
			public void actionPerformed(ActionEvent arg0) {
				if(rbtnMale.isSelected()){
					rbtnOther.setSelected(false);
					rbtnFemale.setSelected(false);
				}
			}
		});
		rbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rbtnFemale = new JRadioButton("Female");
		rbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnFemale.isSelected()){
					rbtnOther.setSelected(false);
					rbtnMale.setSelected(false);
				}
			}
		});
		rbtnFemale.setForeground(Color.BLACK);
		rbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rbtnOther = new JRadioButton("Other");
		rbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnOther.isSelected()){
					rbtnMale.setSelected(false);
					rbtnFemale.setSelected(false);
				}
			}
		});
		rbtnOther.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblCnic = new JLabel("CNIC");
		lblCnic.setHorizontalAlignment(SwingConstants.CENTER);
		lblCnic.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		contact = new JTextField();
		contact.setColumns(10);
		
		JLabel label_9 = new JLabel("Enter Province");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_10 = new JLabel("Enter City");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		CNIC = new JTextField();
		CNIC.setColumns(10);
		
		JComboBox subject = new JComboBox();
		
		JLabel lblRelegion = new JLabel("Relegion");
		lblRelegion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelegion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox relegion = new JComboBox();
		
		JLabel lblEnterPermanentAddress = new JLabel("Permanent Address");
		lblEnterPermanentAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterPermanentAddress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JComboBox province = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(staffInfo, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(rbtnMale, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rbtnFemale)
							.addGap(44)
							.addComponent(rbtnOther)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblSubject, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(subject, 0, 239, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblRelegion, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
											.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(province, 0, 233, Short.MAX_VALUE))
										.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
											.addComponent(lblCnic, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(CNIC, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
										.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
											.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(firstName, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
										.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
											.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(fatherName, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
											.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGap(5))
										.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
											.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addGap(0))
										.addComponent(lblContact, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_10, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lastName, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
									.addGap(48))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(contact, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
										.addComponent(dateOfBirth, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
									.addGap(46))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
											.addGap(36))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnAddStaff, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
												.addComponent(relegion, 0, 213, Short.MAX_VALUE))
											.addGap(30))))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblEnterPermanentAddress, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(322))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(firstName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lastName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dateOfBirth, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(fatherName, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCnic, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(contact, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(28)
							.addComponent(CNIC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbtnMale)
								.addComponent(rbtnOther)
								.addComponent(rbtnFemale))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(province, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblSubject, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(subject, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblRelegion, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(relegion, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPermanentAddress, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(staffInfo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddStaff, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(93)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
