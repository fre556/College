//import libraries
import javax.swing.*;
import java.awt.*;
public class TextFields extends JFrame {
	//main method
	public static void main(String args[]){
		
		JFrame frame = new TextFields("Textfield");

	}//end main method
	
	//constuctor
	public TextFields(String title){
		//create container and panel
		Container c = getContentPane();
		JPanel panel = new JPanel();

		//text area 1
		JTextArea text1 = new JTextArea();
		text1.setEditable(true);
		text1.setText("this is my first text area");
		text1.setSize(50,50);
		panel.add(text1);

		//text area 2
		JTextArea text2 = new JTextArea();
		text2.setEditable(false);
		text2.setText("this is my second text area");
		text2.setSize(50,50);
		panel.add(text2);
		
		//add panel to container
		c.add(panel);
		
		//define frame
		setTitle(title);
		setVisible(true);
		setSize(400,400);
		setLocation(100,100);


	}//end constructor

}//end class