package guipack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num1");
		lblNewLabel.setBounds(30, 43, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num2");
		lblNewLabel_1.setBounds(30, 72, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(30, 112, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(98, 40, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 69, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 109, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				int result=num1+num2;
				
				Integer n=new Integer(result);
				
				textField_2.setText(n.toString());
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("E:\\5th_sem_NOTES\\JAVA\\Images\\plus.jpg"));
		btnNewButton.setBounds(12, 154, 90, 73);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				int result=num1-num2;
				
				Integer n=new Integer(result);
				
				textField_2.setText(n.toString());
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("E:\\5th_sem_NOTES\\JAVA\\Images\\minus.JPG"));
		btnNewButton_1.setBounds(114, 144, 84, 83);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				int result=num1*num2;
				
				Integer n=new Integer(result);
				
				textField_2.setText(n.toString());
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\5th_sem_NOTES\\JAVA\\Images\\mul.JPG"));
		btnNewButton_2.setBounds(213, 144, 98, 83);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				int result=num1/num2;
				
				Integer n=new Integer(result);
				
				textField_2.setText(n.toString());
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("E:\\5th_sem_NOTES\\JAVA\\Images\\div.JPG"));
		btnNewButton_3.setBounds(323, 144, 84, 83);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnNewButton_4.setIcon(new ImageIcon("E:\\5th_sem_NOTES\\JAVA\\Images\\stop.JPG"));
		btnNewButton_4.setBounds(258, 0, 132, 135);
		contentPane.add(btnNewButton_4);
	}

}
