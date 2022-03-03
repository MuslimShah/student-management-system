package error;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import home.Home;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class error extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			error dialog = new error();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public error() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setFocusable(false);
			label.setIcon(new ImageIcon(".//assets//cross_150x150.png"));
			label.setBounds(151, 11, 150, 150);
			contentPanel.add(label);
		}
		{
			JLabel lblErrorOccuredPlease = new JLabel("Error occured please try agian");
			lblErrorOccuredPlease.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblErrorOccuredPlease.setHorizontalAlignment(SwingConstants.CENTER);
			lblErrorOccuredPlease.setBounds(98, 170, 276, 25);
			contentPanel.add(lblErrorOccuredPlease);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblAlertByMuslim = new JLabel("alert by Muslim shah");
				lblAlertByMuslim.setFont(new Font("Tahoma", Font.PLAIN, 7));
				buttonPane.add(lblAlertByMuslim);
			}
			{
				JButton cancelButton = new JButton("close");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						
					}
				});
				cancelButton.setForeground(Color.WHITE);
				cancelButton.setBackground(new Color(100, 149, 237));
				cancelButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
