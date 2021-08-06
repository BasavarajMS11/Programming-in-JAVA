package guipack1;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class BankAccount{
	int accNo;
	double accBal;
	
	public BankAccount() {
		
	}
	
	BankAccount(int accNo, double accBal)
	{
		this.accBal=accBal;
		this.accNo=accNo;
	}
	
	public String toString() {
		return accNo + ":" + accBal;
	}
}

public class Demo4BA extends JFrame {

	BankAccount[] accounts=new BankAccount[5];
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	static int count=0;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo4BA frame = new Demo4BA();
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
	public Demo4BA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acc No");
		lblNewLabel.setBounds(26, 24, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Acc Bal");
		lblNewLabel_1.setBounds(26, 65, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(94, 21, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 62, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int accno=Integer.parseInt(textField.getText());
				double d=Double.parseDouble(textField_1.getText());
				
				accounts[count]=new BankAccount(accno,d);
				
				JOptionPane.showMessageDialog(null, "Account is Created"+accounts[count].accNo);
				
				count++;
				if(count>5)
				{
					dispose();
				}
				
			}
		});
		btnNewButton.setBounds(94, 107, 126, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Acc No");
		lblNewLabel_2.setBounds(12, 165, 99, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 162, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 197, 256, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n=Integer.parseInt(textField_2.getText());
				
				for(int i=0;i<accounts.length;i++)
				{
					if(accounts[i].accNo==n)
					{
						textField_3.setText(accounts[i].accNo+":"+accounts[i].accBal);
					}
				}
				
			}
		});
		btnNewButton_1.setBounds(5, 196, 97, 25);
		contentPane.add(btnNewButton_1);
	}

}
