package home;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JPanel {
	private JLabel schoolName;
	private JPanel totalStaff;
	private JPanel totalStudents;
	private JPanel feeStructure;
	private JPanel disAbledStudents;
	private JLabel lblTotalStaffMembers;
	private JLabel staff;
	private JLabel lblTotalStudentsIn;
	private JLabel totalStudents_1;
	private JLabel memberIcon;
	private JLabel studentIcon;
	private JLabel lblClickOnThis;
	private JLabel feeIcon;
	private JLabel lblClickToView;
	private JLabel lblDisableStudents;
	private JLabel label_2;
	private JLabel disableStudents;
	private JButton btnLogOut;

	/**
	 * Create the panel.
	 */
	public Home() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		schoolName = new JLabel("Hira Secondary School Shawar Swat");
		schoolName.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(schoolName);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(".//assets//The-Professor-Money-Heist-PNG-HD-Quality_200x200.png"));
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		totalStaff = new JPanel();
		totalStaff.setBackground(new Color(46, 204, 113));
		
		totalStudents = new JPanel();
		
		feeStructure = new JPanel();
		
		feeStructure.setBackground(new Color(68, 189, 50));
		totalStudents.setBackground(new Color(52, 152, 219));
		
		disAbledStudents = new JPanel();
		disAbledStudents.setBackground(new Color(230, 126, 34));
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		btnLogOut.setFocusable(false);
		btnLogOut.setFocusTraversalKeysEnabled(false);
		btnLogOut.setFocusPainted(false);
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogOut.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogOut.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnLogOut.setBackground(new Color(240,240,240));
		btnLogOut.setIcon(new ImageIcon(".//assets//logout_50x50.png"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(feeStructure, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
								.addComponent(totalStaff, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(35)
									.addComponent(disAbledStudents, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(36)
									.addComponent(totalStudents, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblProfessor, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(44))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(585, Short.MAX_VALUE)
					.addComponent(btnLogOut, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(totalStudents, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(totalStaff, GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(disAbledStudents, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(feeStructure, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(lblProfessor, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(btnLogOut, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
		);
		
		lblDisableStudents = new JLabel("Total Disable Students");
		lblDisableStudents.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDisableStudents.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(".//assets//icons8-disabled-access-30.png"));
		
		disableStudents = new JLabel("20");
		disableStudents.setFont(new Font("Times New Roman", Font.BOLD, 16));
		disableStudents.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_disAbledStudents = new GroupLayout(disAbledStudents);
		gl_disAbledStudents.setHorizontalGroup(
			gl_disAbledStudents.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_disAbledStudents.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_disAbledStudents.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDisableStudents, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
						.addGroup(gl_disAbledStudents.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(disableStudents, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
							.addGap(14)))
					.addContainerGap())
		);
		gl_disAbledStudents.setVerticalGroup(
			gl_disAbledStudents.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_disAbledStudents.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDisableStudents, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addGroup(gl_disAbledStudents.createParallelGroup(Alignment.LEADING)
						.addComponent(disableStudents, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		disAbledStudents.setLayout(gl_disAbledStudents);
		
		lblClickOnThis = new JLabel("Fee Structure");
		lblClickOnThis.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblClickOnThis.setHorizontalAlignment(SwingConstants.CENTER);
		
		feeIcon = new JLabel("");
		feeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		feeIcon.setIcon(new ImageIcon(".//assets//icons8-money-30.png"));
		
		lblClickToView = new JLabel("Click To view");
		lblClickToView.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickToView.setFont(new Font("Times New Roman", Font.BOLD, 16));
		GroupLayout gl_feeStructure = new GroupLayout(feeStructure);
		gl_feeStructure.setHorizontalGroup(
			gl_feeStructure.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_feeStructure.createSequentialGroup()
					.addContainerGap()
					.addComponent(feeIcon, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblClickToView, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
					.addGap(23))
				.addGroup(gl_feeStructure.createSequentialGroup()
					.addGap(62)
					.addComponent(lblClickOnThis, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(62))
		);
		gl_feeStructure.setVerticalGroup(
			gl_feeStructure.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_feeStructure.createSequentialGroup()
					.addGap(5)
					.addComponent(lblClickOnThis, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_feeStructure.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_feeStructure.createSequentialGroup()
							.addComponent(lblClickToView, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addGap(11))
						.addComponent(feeIcon, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
		);
		feeStructure.setLayout(gl_feeStructure);
		
		lblTotalStudentsIn = new JLabel("Total Students In School");
		lblTotalStudentsIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotalStudentsIn.setHorizontalAlignment(SwingConstants.CENTER);
		
		totalStudents_1 = new JLabel("200");
		totalStudents_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		totalStudents_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		studentIcon = new JLabel("");
		studentIcon.setIcon(new ImageIcon(".//assets//icons8-member-30.png"));
		studentIcon.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_totalStudents = new GroupLayout(totalStudents);
		gl_totalStudents.setHorizontalGroup(
			gl_totalStudents.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_totalStudents.createSequentialGroup()
					.addGap(23)
					.addComponent(lblTotalStudentsIn, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(19))
				.addGroup(gl_totalStudents.createSequentialGroup()
					.addContainerGap()
					.addComponent(studentIcon, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(totalStudents_1, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
					.addGap(43))
		);
		gl_totalStudents.setVerticalGroup(
			gl_totalStudents.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_totalStudents.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalStudentsIn, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_totalStudents.createParallelGroup(Alignment.TRAILING)
						.addComponent(totalStudents_1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addComponent(studentIcon, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		totalStudents.setLayout(gl_totalStudents);
		
		lblTotalStaffMembers = new JLabel("Total Staff Members In School");
		lblTotalStaffMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalStaffMembers.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		staff = new JLabel("10");
		staff.setHorizontalAlignment(SwingConstants.CENTER);
		staff.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		memberIcon = new JLabel("");
		memberIcon.setHorizontalAlignment(SwingConstants.CENTER);
		memberIcon.setIcon(new ImageIcon(".//assets//icons8-member-30.png"));
		GroupLayout gl_totalStaff = new GroupLayout(totalStaff);
		gl_totalStaff.setHorizontalGroup(
			gl_totalStaff.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_totalStaff.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalStaffMembers, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(11))
				.addGroup(gl_totalStaff.createSequentialGroup()
					.addGap(3)
					.addComponent(memberIcon, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(staff, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addGap(52))
		);
		gl_totalStaff.setVerticalGroup(
			gl_totalStaff.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_totalStaff.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalStaffMembers)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_totalStaff.createParallelGroup(Alignment.TRAILING)
						.addComponent(staff, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addComponent(memberIcon, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		totalStaff.setLayout(gl_totalStaff);
		setLayout(groupLayout);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
