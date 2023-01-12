import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class tempConvertion extends JFrame {
	private JLabel celsiusLabel;
	private JLabel fahrenheightLabel;

	private JTextField celsiusTF;
	private JTextField fahrenheightTF;

	private static final int WIDTH = 16*40;
	private static final int HEIGHT = 9*10;
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final double OFFSET = 32;

	// constructor
	public tempConvertion() {
		setTitle("Temp Convertor");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));

		//DEFINECOMPONENTLABEL
		celsiusLabel=new JLabel("Temp in Celsius: ");
		fahrenheightLabel=new JLabel("Temp in Farenheight: ");
		
		//TEXTFIELD
				celsiusTF=new JTextField(5);
				fahrenheightTF=new JTextField(5);
				
		//ADD COMPONENT
				c.add(celsiusLabel);
				c.add(celsiusTF);
				c.add(fahrenheightLabel);
				c.add(fahrenheightTF);
				
				//ADD KEYLISTENER
				celsHandler celHand = new celsHandler();
				farenHandler farenHand =new farenHandler();
				celsiusTF.addActionListener(celHand);
				fahrenheightTF.addActionListener(farenHand);
				
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CenteredFrame(this);
	}

	public void CenteredFrame(javax.swing.JFrame objFrame) {
		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
		int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
		objFrame.setLocation(iCoordX, iCoordY);
	}
	
	private class celsHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double celsuis,farenheight;
			celsuis=Double.parseDouble(celsiusTF.getText());
			farenheight=celsuis*CTOF+OFFSET;
			fahrenheightTF.setText(String.format("%.2f",farenheight));
		
		}
		
	}
	
	private class farenHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double celsuis,farenheight;
			farenheight=Double.parseDouble(fahrenheightTF.getText());
			celsuis=(farenheight-OFFSET)*FTOC;
			celsiusTF.setText(String.format("%.3f",celsuis));
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempConvertion tempConv = new tempConvertion();

	}

}
