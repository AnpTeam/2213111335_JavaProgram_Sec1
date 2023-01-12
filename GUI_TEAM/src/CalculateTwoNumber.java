import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.text.*;
import java.awt.Window.Type;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField TFnumber1;
	private JTextField TFnumber2;
	private JTextField TFresult;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculateTwoNumber() {
		setFont(new Font("Elephant", Font.PLAIN, 17));
		setBackground(Color.LIGHT_GRAY);
		setTitle("CalculatorWIthTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBackground(Color.WHITE);
		cmbOperator.setForeground(Color.BLACK);
		cmbOperator.setMaximumRowCount(4);
		cmbOperator.setBounds(121, 133, 83, 22);
		
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("x");
		cmbOperator.addItem("/");
		
		contentPane.add(cmbOperator);
		
		JLabel lblnumber1 = new JLabel("Enter Number 1 :");
		lblnumber1.setForeground(Color.WHITE);
		lblnumber1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		lblnumber1.setBounds(10, 5, 365, 42);
		contentPane.add(lblnumber1);
		
		JLabel lblnumber2 = new JLabel("Enter Number 2 : ");
		lblnumber2.setForeground(Color.WHITE);
		lblnumber2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		lblnumber2.setBounds(10, 81, 176, 15);
		contentPane.add(lblnumber2);
		
		TFnumber1 = new JTextField();
		TFnumber1.setBounds(112, 12, 219, 30);
		contentPane.add(TFnumber1);
		TFnumber1.setColumns(10);
		
		TFnumber2 = new JTextField();
		TFnumber2.setBounds(112, 74, 219, 30);
		contentPane.add(TFnumber2);
		TFnumber2.setColumns(10);
		
		JLabel result = new JLabel("Result");
		result.setForeground(Color.WHITE);
		result.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
		result.setBounds(10, 254, 83, 30);
		contentPane.add(result);
		
		JRadioButton rdbOnedigit = new JRadioButton("1 digit.");
		rdbOnedigit.setForeground(Color.WHITE);
		rdbOnedigit.setBackground(Color.PINK);
		rdbOnedigit.setBounds(121, 173, 109, 23);
		contentPane.add(rdbOnedigit);
		
		JRadioButton rdbTwodigits = new JRadioButton("2 digits.");
		rdbTwodigits.setForeground(Color.WHITE);
		rdbTwodigits.setBackground(Color.PINK);
		rdbTwodigits.setBounds(121, 214, 109, 23);
		contentPane.add(rdbTwodigits);
		
		ButtonGroup group =new ButtonGroup();
		group.add(rdbOnedigit);
		group.add(rdbTwodigits);
		
		 JButton Button_OK = new JButton("OK");
		 Button_OK.setBackground(Color.WHITE);
		Button_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1,num2,sum=0;
				String operator;
				
				if(arg0.getSource()==Button_OK) {
					operator=(String)cmbOperator.getSelectedItem();
				
					num1=Double.parseDouble(TFnumber1.getText());
					num2=Double.parseDouble(TFnumber2.getText());
					
					if(operator.equals("+"))
						sum=num1+num2;
					if(operator.equals("-"))
						sum=num1-num2;
					if(operator.equals("x"))
						sum=num1*num2;
					if(operator.equals("/"))
						sum=num1/num2;

					//result
					DecimalFormat frm=null;
					//JRadioButton
					if(rdbOnedigit.isSelected()) {
						frm=new DecimalFormat("#,###.0");
					}
					else if(rdbTwodigits.isSelected()) {
						frm=new DecimalFormat("#,###.00");
					}
					
					TFresult.setText(String.format("%.2f",sum));	
				}
				
			}
		});
		
		
		Button_OK.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		Button_OK.setBounds(52, 309, 164, 42);
		contentPane.add(Button_OK);
		
		JButton btnCancel = new JButton("EXIT");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		btnCancel.setBounds(313, 309, 164, 42);
		contentPane.add(btnCancel);
		
		
		TFresult = new JTextField();
		TFresult.setBackground(Color.WHITE);
		TFresult.setBounds(121, 257, 219, 30);
		contentPane.add(TFresult);
		TFresult.setColumns(10);
		
		
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setForeground(Color.WHITE);
		lblOperator.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		lblOperator.setBounds(10, 137, 101, 14);
		contentPane.add(lblOperator);
		
		JLabel lbldigits = new JLabel("How to show digit :");
		lbldigits.setForeground(Color.WHITE);
		lbldigits.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		lbldigits.setBounds(10, 176, 164, 14);
		contentPane.add(lbldigits);
		
	}
}
