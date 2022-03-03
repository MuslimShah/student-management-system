package dashboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import error.error;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {
	private JLayeredPane layeredPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 439);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		//===============showing panel
		mypanel p=new mypanel();
		
		//=============================//
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		
		layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
					.addGap(1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
		);
		CardLayout ccr=new CardLayout();
		layeredPane.setLayout(ccr);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		layeredPane.add(panel_2, "1");
		panel_2.setLayout(null);
		
		JLabel lblIAmInsert = new JLabel("i am insert panel");
		lblIAmInsert.setBounds(81, 55, 249, 114);
		panel_2.add(lblIAmInsert);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 0));
		layeredPane.add(panel_3, "2 ");
		panel_3.setLayout(null);
		
		JLabel lblIAmUpdate = new JLabel("i am update panel");
		lblIAmUpdate.setBounds(92, 89, 217, 65);
		panel_3.add(lblIAmUpdate);
		

		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "inset pressed");
				switchPanel(panel_2);
				
			}
		});
		btnInsert.setBackground(new Color(100, 149, 237));
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel_3);
			}
		});
		btnUpdate.setBackground(new Color(30, 144, 255));
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(p);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(20)
					.addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdate)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(183, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		getContentPane().setLayout(groupLayout);
		//===========================================================================
		
	}
	public void switchPanel(JPanel panel){
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}
