//import libraries
import javax.swing.*;
import java.awt.*;
public class Labels extends JFrame {
	//main method
	public static void main(String args[]){

		JFrame frame = new Labels();
	}//end main method
	
	//constructor
	public Labels(){
		
		//creates container and panel
		Container c = getContentPane();
		JPanel panel = new JPanel();
		
		//set frame conditions
		setVisible(true);
		setSize(200,200);
		setLocation(100,100);
		
		//label 1 Italic
		JLabel Label1 = new JLabel("My First Label");
		Font newfont = new Font("arial",Font.ITALIC,14);
		Label1.setFont(newfont);
		panel.add(Label1);
		
		//label 2 bold
		JLabel Label2 = new JLabel("My Second Label");
		Font font2 = new Font("times",Font.BOLD,12);
		Label2.setFont(font2);
		panel.add(Label2);
		
		//add panel to container
		c.add(panel);

	}//end constructor


}//end class