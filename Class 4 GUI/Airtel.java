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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

class CallPlan{
	
	String planId;
	double locCallRate;
	double STDCallRate;
	int freeMsg;
	
	CallPlan(){
		
	}
	CallPlan(String planId,double locCallRate,double STDCallRate,int freeMsg){
		this.planId=planId;
		this.locCallRate=locCallRate;
		this.STDCallRate=STDCallRate;
		this.freeMsg=freeMsg;
		
	}
}

class CellUser{
	String cellNum;
	String name;
	String callPlan;
	
	CellUser(){
		
	}
	CellUser(String cellNum,String name,String callPlan){
		this.cellNum=cellNum;
		this.name=name;
		this.callPlan=callPlan;
		
	}
}

public class Airtel extends JFrame {

	CallPlan[] cPlans= new CallPlan[5];
	CellUser[] cUsers= new CellUser[5];
	int count=0;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Airtel frame = new Airtel();
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
	public Airtel() {
		setTitle("AirTel Call Centre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Call Plan");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(132, 38, 100, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Call User");
		lblNewLabel_1.setBounds(417, 39, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PlanId");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(26, 95, 60, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("locCallRate");
		lblNewLabel_3.setBounds(26, 145, 72, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STDCallRate");
		lblNewLabel_4.setBounds(26, 204, 72, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("freeSMS");
		lblNewLabel_5.setBounds(26, 257, 72, 20);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(116, 94, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 144, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 203, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 256, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CellNum");
		lblNewLabel_6.setBounds(305, 97, 72, 21);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name");
		lblNewLabel_7.setBounds(305, 147, 72, 21);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CallPlan");
		lblNewLabel_8.setBounds(305, 206, 72, 19);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(401, 94, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(401, 144, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 Month", "2 Months", "3 Months"}));
		comboBox.setBounds(401, 203, 116, 21);
		contentPane.add(comboBox);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(212, 362, 165, 22);
		contentPane.add(textArea_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(93, 521, 176, 36);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(387, 521, 163, 36);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_9 = new JLabel("Search By PlanId");
		lblNewLabel_9.setBounds(93, 397, 116, 21);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Search By CellNum");
		lblNewLabel_10.setBounds(401, 398, 116, 19);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("PlanId");
		lblNewLabel_11.setBounds(26, 433, 56, 16);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Display");
		lblNewLabel_12.setBounds(26, 524, 56, 16);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("CellNum");
		lblNewLabel_13.setBounds(321, 433, 56, 16);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Display");
		lblNewLabel_14.setBounds(319, 524, 56, 16);
		contentPane.add(lblNewLabel_14);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(93, 431, 116, 21);
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(397, 428, 120, 21);
		
		
		JButton btnNewButton = new JButton("Create Call Plan");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(93, 312, 123, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Call User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				double lcr=Integer.parseInt(textField_1.getText());
				String s3=textField_2.getText();
				double scr=Integer.parseInt(textField_2.getText());
				String s4=textField_3.getText();
				int fsms=Integer.parseInt(textField_3.getText());
				
				System.out.println(s1 + ":" + s2 +":" + s3 + ":" + s4 );
				String cpdata="\n"+  s1 + ":" + s2 +":" + s3 + ":" + s4 ;
				
				String s5=textField_2.getText();
				String s6=textField_3.getText();
				String s7=comboBox.getSelectedItem().toString();
				
				System.out.println(s5 + ":" + s6 +":" + s7 );
				String cudata="\n"+ s5 + ":" + s6 +":" + s7 ;
				
				try {
					cPlans[count]=new CallPlan(s1,lcr,scr,fsms);
					comboBox_1.addItem(s1);
					
					count++;
					JOptionPane.showMessageDialog(null, "Call Plan created");
					textArea.setLineWrap(true);
					
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea_2.append("\nYou can create Max of 5 Call Plans Only!!!\n");
				}
				
				try {
					cUsers[count]=new CellUser(s5,s6,s7);
					comboBox_2.addItem(cUsers[count].cellNum);
					
					count++;
					JOptionPane.showMessageDialog(null, "Cell User");
					textArea.setLineWrap(true);
					
				}
				catch(ArrayIndexOutOfBoundsException ae){
					textArea_2.append("\nYou can create Max of 5 Cell Users Only!!!\n");
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(369, 310, 148, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Id");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pid=comboBox_1.getSelectedItem().toString();
				for(int i=0;i<5;i++)
				{
					if(cPlans[i].planId==pid)
					{
						
						String pdata= "\n"+ cPlans[i].planId + ":" + cPlans[i].locCallRate +":" + cPlans[i].STDCallRate + ":" + cPlans[i].freeMsg;
						
						JOptionPane.showMessageDialog(null, "Search Complete");
						textArea.setLineWrap(true);
						
						textArea.append(pdata);
					}
				}
			}
		});
		btnNewButton_2.setBounds(93, 476, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search Num");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s9=comboBox_2.getSelectedItem().toString();
				
				//textArea_1.append("\nYou can create Max of 5 books Only!!!");
				
			}
		});
		btnNewButton_3.setBounds(401, 478, 116, 21);
		contentPane.add(btnNewButton_3);
		
		contentPane.add(comboBox_1);
		
		contentPane.add(comboBox_2);
		
	}

}
