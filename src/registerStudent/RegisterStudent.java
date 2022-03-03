package registerStudent;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import javax.swing.JFormattedTextField.AbstractFormatter;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


public class RegisterStudent extends JPanel {
	private JTextField firstName;
	private JTextField LastName;
	private JTextField fatherName;
	private JTextField gaurdianContact;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JTextField city;
	private JTextField txtAutoPicked;
	private JRadioButton rbtnPaid;
	private JRadioButton rbtnUnpaid;
	private JCheckBox studentInfo;

	/**
	 * Create the panel.
	 */
	public RegisterStudent() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 59, 72));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
		JLabel label = new JLabel("");
		label.setIconTextGap(10);
		label.setIcon(new ImageIcon(".//assets//icons8-student-registration-45.png"));
		panel.add(label);
		
		JLabel lblRegisterNewStudent = new JLabel("Register New Student");
		lblRegisterNewStudent.setForeground(Color.WHITE);
		lblRegisterNewStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblRegisterNewStudent);
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
		);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		firstName = new JTextField();
		firstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		LastName = new JTextField();
		LastName.setColumns(10);
		
		JLabel lblFatherName = new JLabel("Father Name");
		lblFatherName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFatherName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		fatherName = new JTextField();
		fatherName.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JDateChooser dateOfBirth = new JDateChooser();
		
		
		JLabel lblSelectClass = new JLabel("Select Class");
		lblSelectClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectClass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox selectClass = new JComboBox();
		String clses[]={"nursery","kg","first","second","third"};
		for(int i=0;i<clses.length;i++){
			selectClass.addItem(clses[i]);
			
		}
		
		JLabel lblGaurdianContact = new JLabel("Gaurdian Contact");
		lblGaurdianContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblGaurdianContact.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		gaurdianContact = new JTextField();
		gaurdianContact.setColumns(10);
		
		JLabel lblGender = new JLabel("Select Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMale.isSelected()){
					rdbtnFemale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
				
			}
		});
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFemale.isSelected()){
					rdbtnMale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnFemale.setForeground(new Color(0, 0, 0));
		
		rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(rdbtnOther.isSelected()){
					rdbtnMale.setSelected(false);
					rdbtnFemale.setSelected(false);
				}
			}
		});
		rdbtnOther.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblEnterProvince = new JLabel("Enter Province");
		lblEnterProvince.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterProvince.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblEnterCity = new JLabel("Enter City");
		lblEnterCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterCity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		city = new JTextField();
		city.setColumns(10);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblFee.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtAutoPicked = new JTextField();
		txtAutoPicked.setEditable(false);
		txtAutoPicked.setText("auto picked");
		txtAutoPicked.setColumns(10);
		
		JLabel label_1 = new JLabel("Fee Status");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		/*
		 * radio buttons
		 * radio button paid for fee paid
		 * radio button unpaid for fee unpaid
		 * i also have add actionlistener to these buttons for making groups */
		rbtnPaid = new JRadioButton("Paid");
		rbtnPaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnPaid.isSelected()){
					rbtnUnpaid.setSelected(false);
				}
			}
		});
		rbtnPaid.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		rbtnUnpaid = new JRadioButton("Unpaid");
		rbtnUnpaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnUnpaid.isSelected()){
					rbtnPaid.setSelected(false);
					
				}
			}
		});
		rbtnUnpaid.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		studentInfo = new JCheckBox("The above information is correct");
		studentInfo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton addStudent = new JButton("Add Student");
		addStudent.setIcon(new ImageIcon(".//assets//icons8-add-24.png"));
		addStudent.setIconTextGap(20);
		addStudent.setHorizontalTextPosition(SwingConstants.RIGHT);
		addStudent.setHorizontalAlignment(SwingConstants.LEFT);
		addStudent.setForeground(Color.WHITE);
		addStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		addStudent.setFocusable(false);
		addStudent.setFocusPainted(false);
		addStudent.setBackground(new Color(53, 59, 72));
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label_2 = new JLabel("Permanent Address");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox province = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(studentInfo, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(addStudent, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(rdbtnMale, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnFemale)
								.addGap(18)
								.addComponent(rdbtnOther)
								.addGap(41)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(rbtnPaid, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(rbtnUnpaid, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(txtAutoPicked, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblSelectClass, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(selectClass, 0, 210, Short.MAX_VALUE)
										.addGap(18)
										.addComponent(lblGaurdianContact, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(gaurdianContact, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblEnterProvince, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(province, 0, 219, Short.MAX_VALUE)
										.addGap(18)
										.addComponent(lblEnterCity, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(city, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(firstName, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblFatherName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(fatherName, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
										.addGap(18)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
												.addGap(5))
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblDateOfBirth, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
												.addGap(0)))
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addComponent(dateOfBirth, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
											.addComponent(LastName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
								.addGap(48)))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(firstName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(LastName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dateOfBirth, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
							.addComponent(lblFatherName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(fatherName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDateOfBirth, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSelectClass, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGaurdianContact, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(gaurdianContact, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(selectClass, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMale)
						.addComponent(rdbtnFemale)
						.addComponent(rdbtnOther)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbtnPaid, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbtnUnpaid, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEnterProvince, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(city, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEnterCity, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(province, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAutoPicked, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(studentInfo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(addStudent, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		setLayout(groupLayout);

	}
}
