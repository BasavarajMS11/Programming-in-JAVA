package Shopping;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



class CreditCard{
	String cardNo;
	String cardType;
	double creditLimit;
	double cashLimit;
	double creditAmt;
	
	CreditCard(){
		
	}
	CreditCard(	String cardNo,String cardType,double creditLimit,double cashLimit,double creditAmt){
		this.cardNo=cardNo;
		this.cardType=cardType;
		this.creditLimit=creditLimit;
		this.cashLimit=cashLimit;
		this.creditAmt=creditAmt;
		
	}
	
}

class Customer{
	String custName;
	String shopName;
	double billAmount;
	
	Customer(){
		
	}
	Customer(String custName,String shopName,double billAmount){
		this.custName=custName;
		this.shopName=shopName;
		this.billAmount=billAmount;
	}
	
}

public class ShoppingBackup extends JFrame {

	private JPanel contentPane;
	
	
	CreditCard[] cards=new CreditCard[5];
	Customer[] customers=new Customer[5];
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	static int count=0;
	static int count1=0;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingBackup frame = new ShoppingBackup();
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
	public ShoppingBackup() {

		
		setTitle("Shopping");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CardNo");
		lblNewLabel.setBounds(38, 54, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CashLimit");
		lblNewLabel_1.setBounds(38, 112, 69, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CreditLimit");
		lblNewLabel_2.setBounds(38, 83, 69, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CardType");
		lblNewLabel_3.setBounds(38, 141, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CreditAmt");
		lblNewLabel_4.setBounds(38, 170, 69, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(119, 51, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 109, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 80, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 167, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elite", "Gold"}));
		comboBox_1.setBounds(141, 138, 94, 22);
		contentPane.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(301, 62, 287, 504);
		contentPane.add(textArea);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(125, 509, 110, 22);
		//comboBox_2.setModel(new DefaultComboBoxModel(new String[] {bookIds[0],bookIds[1],bookIds[2],bookIds[3],bookIds[4]}));
		//contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Create Credit Card");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				String s4=comboBox_1.getSelectedItem().toString();
				String s5=textField_4.getText();
				
				
				double crl=Integer.parseInt(textField_1.getText());
				double csl=Integer.parseInt(textField_2.getText());
				double camt=Integer.parseInt(textField_4.getText());
				
				
				
				
				System.out.println(s1 + ":" + s2 +":" + s3 + ":" + s4 +":"+s5);
				String data="\n"+  s1 + ":" + s4 +":" + s2 + ":" + s3+":"+s5 ;
				
				try {
					
					cards[count]=new CreditCard(s1,s4,crl,csl,camt);
					
					
					count++;
					JOptionPane.showMessageDialog(null, "card created");
					textArea.setLineWrap(true);
					
					textArea.append("\nCredit Card:"+count+"::"+data);
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea.append("\nYou can create Max of 5 cards Only!!!");
				}
				
			}
		});
		btnNewButton.setBounds(105, 225, 153, 22);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_6 = new JLabel("CustName");
		lblNewLabel_6.setBounds(38, 511, 69, 19);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=comboBox_2.getSelectedItem().toString();
				//String uprs=textField_4.getText();
				//double upr=Integer.parseInt(textField_4.getText());
				
				for(int i=0;i<5;i++)
				{
					if(customers[i].custName==id)
					{
						int pos=i+1;
						double d=customers[i].billAmount;
						customers[i].billAmount=0;
						
						String udata= "\n"+"Customer:"+pos+"::"+ customers[i].custName + ":" + customers[i].shopName +":" +customers[i].billAmount;
						
						cards[i].cashLimit-=d;
						
						
						String ccdata="\n"+"Credit Card:"+pos+"::"+cards[i].cardNo+":"+cards[i].cardType+":"+cards[i].creditLimit+":"+cards[i].cashLimit+":"+cards[i].creditAmt+":";
						JOptionPane.showMessageDialog(null, "Display After Clearing Bill");
						textArea.setLineWrap(true);
						
						textArea.append( udata );
						textArea.append( ccdata );
						
					}
				}
				
				
			}
			
		});
		btnNewButton_1.setBounds(125, 544, 110, 22);
		contentPane.add(btnNewButton_1);
		
		
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_8 = new JLabel("Display");
		lblNewLabel_8.setBounds(413, 31, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5 = new JLabel("Card Details:");
		lblNewLabel_5.setBounds(38, 25, 116, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Customer Details:");
		lblNewLabel_7.setBounds(38, 296, 129, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("CustName");
		lblNewLabel_9.setBounds(38, 321, 83, 22);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("ShopName");
		lblNewLabel_10.setBounds(38, 367, 69, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bill Amount");
		lblNewLabel_11.setBounds(38, 409, 83, 22);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Clear Bill:");
		lblNewLabel_12.setBounds(38, 482, 103, 16);
		contentPane.add(lblNewLabel_12);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 331, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(119, 374, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(119, 420, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Create Customer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s6=textField_3.getText();
				String s7=textField_5.getText();
				String s8=textField_6.getText();
				//String s4=comboBox_1.getSelectedItem().toString();
				//String s5=textField_4.getText();
				
				
				double bamt=Integer.parseInt(textField_6.getText());
				String cdata="\n"+  s6 + ":" + s7 +":" + s8 ;
				
				try {
					
					customers[count1]=new Customer(s6,s7,bamt);
					comboBox_2.addItem(s6);
					
					count1++;
					JOptionPane.showMessageDialog(null, "Customer created");
					textArea.setLineWrap(true);
					
					textArea.append("\nCustomer:"+count1+"::"+cdata);
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea.append("\nYou can create Max of 5 Customers Only!!!");
				}
				
			}
		});
		btnNewButton_2.setBounds(105, 455, 144, 22);
		contentPane.add(btnNewButton_2);
	}

}
