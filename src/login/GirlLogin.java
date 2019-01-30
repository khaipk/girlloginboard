package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class GirlLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirlLogin frame = new GirlLogin();
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
	public GirlLogin() {
		GirlsData girl = new GirlsData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccount = new JLabel("Account");
		lblAccount.setBounds(10, 11, 46, 14);
		contentPane.add(lblAccount);
		
		textField = new JTextField();
		textField.setBounds(68, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(10, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(68, 39, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(65, 70, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(girl.getName())) {
					JOptionPane.showMessageDialog(null, "Login Successful");
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				girl.setName(textField_1.getText());
				girl.setAge(Integer.parseInt(textField_2.getText()));
			}
		});
		btnNewButton_1.setBounds(65, 138, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 180, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 177, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 211, 46, 14);
		contentPane.add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 208, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 248, 46, 14);
		contentPane.add(lblCity);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(68, 245, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(10, 284, 46, 14);
		contentPane.add(lblHeight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(68, 281, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(10, 321, 46, 14);
		contentPane.add(lblWeight);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(68, 318, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblBody = new JLabel("Body");
		lblBody.setBounds(10, 357, 46, 14);
		contentPane.add(lblBody);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(68, 354, 86, 20);
		contentPane.add(textField_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Do you love me?");
		chckbxNewCheckBox.setBounds(183, 176, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(183, 208, 96, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("About you :");
		lblNewLabel_2.setBounds(193, 248, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnSexy = new JRadioButton("Cute");
		rdbtnSexy.setBounds(183, 280, 109, 23);
		contentPane.add(rdbtnSexy);
		
		JRadioButton radioButton = new JRadioButton("Sexy");
		radioButton.setBounds(183, 317, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton rdbtnLewd = new JRadioButton("Lewd");
		rdbtnLewd.setBounds(183, 353, 109, 23);
		contentPane.add(rdbtnLewd);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(340, 353, 89, 23);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.setBounds(65, 104, 89, 23);
		contentPane.add(btnSignOut);
		
		JTextArea txtrImOnlyInterest = new JTextArea();
		txtrImOnlyInterest.setForeground(Color.RED);
		txtrImOnlyInterest.setWrapStyleWord(true);
		txtrImOnlyInterest.setLineWrap(true);
		txtrImOnlyInterest.setText("I'm only interest in Cute, Sexy, maybe Lewd Girls.");
		txtrImOnlyInterest.setBounds(239, 42, 140, 63);
		contentPane.add(txtrImOnlyInterest);
	}
}
