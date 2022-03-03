package dashboard;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class mypanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public mypanel() {
		setLayout(null);
		
		JLabel lblIAmPanel = new JLabel("i am panel");
		lblIAmPanel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIAmPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIAmPanel.setBounds(77, 66, 188, 81);
		add(lblIAmPanel);
		
	}

}
