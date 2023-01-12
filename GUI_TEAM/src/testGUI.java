import java.awt.*;
import javax.swing.*;

public class testGUI extends JFrame{

	private static final int WIDTH=400;
	private static final int HEIGHT=300;
	private JLabel lengthL,widthL,areaL,perimeterL;
	
	//Constructor
	public testGUI() {
		setTitle("AREA and PERIMETER");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lengthL=new JLabel(" Enter the length");
		widthL=new JLabel(" Enter the width");
		areaL=new JLabel(" AREA:");
		perimeterL=new JLabel(" Perimeter:");
		
		
		//GRID LAYOUT
		GridLayout L= new GridLayout(4,1);
		setLayout(L);
		
		//ADD COMPONENT
		add(lengthL);
		add(widthL);
		add(areaL);
		add(perimeterL);
		
	}
	public static void main(String[] args) {
		testGUI prog = new testGUI();
		
	}

}
