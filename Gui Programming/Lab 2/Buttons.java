//import libraries

import javax.swing.*;
import java.awt.*;
public class Buttons extends JFrame {
	//main method
	public static void main(String args[]){

		JFrame frame = new Buttons("Buttons GUI");

	}//end main method
	
	//contructor
	public Buttons(String title){
		//create panel and container
		Container c = getContentPane();
		JPanel panel = new JPanel();
		//set variables for frame
		setTitle(title);
		setVisible(true);
		setSize(200,200);
		setLocation(100,100);
		//button 1
		JButton button1 = new JButton("My first button");
		button1.setSize(30,50);
		panel.add(button1);
		//button 2 with bold font
		JButton button2 = new JButton("My second button");
		Font arial = new Font("arial",Font.BOLD,12);
		button2.setFont(arial);
		panel.add(button2);
		//button 3 with italic font
		JButton button3 = new JButton("My third button");
		Font serif = new Font("serif",Font.ITALIC,14);
		button3.setFont(serif);
		panel.add(button3);
		button3.setEnabled(false);
		
		c.add(panel);



	}//end constructor


}//end class