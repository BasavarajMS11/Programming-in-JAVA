package guipack1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class User{
	String name;
	String email;
	String mobno;
	String gender;
	String date;
	String state;
	String city;
	
	User(){}
	
	User(String name, String email, String mobno, String gender, String date, String state, String city)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
		this.date=date;
		this.state=state;
		this.city=city;
	}
	
	public String toString() {
		return name + ":"  + email + ":"  + gender + ":"  + date + ":"  + state + ":"  + city;
	}
}

public class Userregistration extends JFrame {

	User[] users=new User[2];
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userregistration frame = new Userregistration();
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
	public Userregistration() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(86, 54, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(86, 90, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Registration");
		lblNewLabel_2.setBounds(233, 13, 112, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mob. No");
		lblNewLabel_3.setBounds(86, 134, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(86, 184, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(194, 182, 64, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("DOB");
		lblNewLabel_5.setBounds(86, 228, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(288, 180, 88, 20);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10"}));
		comboBox.setBounds(194, 225, 41, 19);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(184, 51, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 87, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 131, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_1.setBounds(269, 225, 41, 19);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		comboBox_2.setBounds(332, 226, 64, 18);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("State");
		lblNewLabel_6.setBounds(86, 289, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Karnataka", "TamilNadu", "AndraPradesh", "Kerala", "MadhyaPradesh", "Bihar", "Gujarat", "Delhi", "Assam"}));
		comboBox_3.setBounds(194, 286, 106, 21);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setBounds(89, 347, 64, 16);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Dharwad", "Hubli", "Bangalore", "Gulbarga", "Belgaum", "Bagalkot", "Tumkur", "Hasan"}));
		comboBox_4.setBounds(194, 344, 106, 19);
		contentPane.add(comboBox_4);
		
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(427, 51, 143, 149);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g="";
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				
				if(rdbtnNewRadioButton.isSelected())
				{
					g="Male";
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					g="Female";
				}
				
				String s4=comboBox.getSelectedItem().toString();
				String s5=comboBox_1.getSelectedItem().toString();
				String s6=comboBox_2.getSelectedItem().toString();
				
				String date=s4+"/"+s5+"/"+s6;
				
				String s7=comboBox_3.getSelectedItem().toString();
				String s8=comboBox_4.getSelectedItem().toString();
				
				System.out.println(s1 + ":" + s2 +":" + s3 + ":" + date + ":" + s7 +":" +s8);
				
				String data= s1 + ":" + s2 +":" + s3 + ":" + date + ":" + s7 +":" +s8;
				
				try {
					users[count]=new User(s1,s2,s3,g,date,s7,s8);
					count++;
					JOptionPane.showMessageDialog(null, "User created");
					textArea.setLineWrap(true);
					
					textArea.append(data);
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea.append("\nYou can create Max of 2 Users Only!!!");
				}

				
				
			}
		});
		btnNewButton.setBounds(183, 403, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(311, 403, 97, 25);
		contentPane.add(btnNewButton_1);
		

	}
}
