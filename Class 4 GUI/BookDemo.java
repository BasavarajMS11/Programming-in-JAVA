package guipack1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Book{
	String bookId;
	String bookTitle;
	String publisher;
	String year;
	double price;
	String category;
	
	Book(){
		
	}
	Book(String bookId, String bookTitle,String publisher, String year, double price, String category )
	{
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.publisher=publisher;
		this.year= year;
		this.price= price;
		this.category = category;
		
	}
}

public class BookDemo extends JFrame {

	Book[] books= new Book[5];
	String[] bookIds= new String[5];
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	static int count=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDemo frame = new BookDemo();
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
	public BookDemo() {
		setTitle("Book UI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Id");
		lblNewLabel.setBounds(38, 31, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Title");
		lblNewLabel_1.setBounds(38, 65, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Publisher");
		lblNewLabel_2.setBounds(38, 108, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year");
		lblNewLabel_3.setBounds(38, 141, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Price");
		lblNewLabel_4.setBounds(38, 170, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Category");
		lblNewLabel_5.setBounds(38, 209, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(119, 28, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 62, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 105, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 167, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Technical", "Fiction", "Social"}));
		comboBox.setBounds(141, 206, 94, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2010", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		comboBox_1.setBounds(141, 138, 94, 22);
		contentPane.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(301, 62, 287, 221);
		contentPane.add(textArea);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(125, 346, 110, 22);
		//comboBox_2.setModel(new DefaultComboBoxModel(new String[] {bookIds[0],bookIds[1],bookIds[2],bookIds[3],bookIds[4]}));
		//contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Create Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				String s4=comboBox.getSelectedItem().toString();
				
				String pr=textField_4.getText();
				double p=Integer.parseInt(textField_4.getText());
				String s5=comboBox_1.getSelectedItem().toString();
				
				
				System.out.println(s1 + ":" + s2 +":" + s3 + ":" + s4 + ":" + p +":" +s5 + ":" );
				String data="\n"+  s1 + ":" + s2 +":" + s3 + ":" + s4 + ":" + pr +":" +s5 + ":" ;
				
				try {
					books[count]=new Book(s1,s2,s3,s4,p,s5);
					bookIds[count]=new String(s1);
					comboBox_2.addItem(bookIds[count]);
					
					count++;
					JOptionPane.showMessageDialog(null, "Book created");
					textArea.setLineWrap(true);
					
					textArea.append(data);
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea.append("\nYou can create Max of 5 books Only!!!");
				}
				
			}
		});
		btnNewButton.setBounds(119, 281, 119, 25);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_6 = new JLabel("Update BookId");
		lblNewLabel_6.setBounds(38, 349, 94, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(369, 346, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(347, 422, 201, 50);
		contentPane.add(textArea_1);
		
		JButton btnNewButton_1 = new JButton("Update Price");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=comboBox_2.getSelectedItem().toString();
				String uprs=textField_4.getText();
				double upr=Integer.parseInt(textField_4.getText());
				
				for(int i=0;i<5;i++)
				{
					if(books[i].bookId==id)
					{
						books[i].price=upr;
						String udata= "\n"+ books[i].bookId + ":" + books[i].bookTitle +":" + books[i].publisher + ":" + books[i].year + ":" + uprs +":" +books[i].category + ":" ;
						
						JOptionPane.showMessageDialog(null, "Book Price Updated");
						textArea.setLineWrap(true);
						
						textArea_1.append("\n"+ books[i].bookId + ":" + books[i].bookTitle +":" + books[i].publisher + ":" + books[i].year + ":" + uprs +":" +books[i].category + ":" );
						
					}
				}
				
				
			}
			
		});
		btnNewButton_1.setBounds(125, 398, 110, 22);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Price");
		lblNewLabel_7.setBounds(301, 349, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_8 = new JLabel("Display");
		lblNewLabel_8.setBounds(413, 31, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		
		JLabel lblNewLabel_9 = new JLabel("Update details");
		lblNewLabel_9.setBounds(395, 398, 102, 16);
		contentPane.add(lblNewLabel_9);
		

	}
}
