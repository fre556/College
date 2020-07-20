//import libraries
import javax.swing.*;
import java.awt.*;
public class list extends JFrame{
	//main menu
	public static void main(String args[]){

		list frame = new list("Lists");

	}//end main method
	
	//constructor
	public list(String t){
		//create container and panel 
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		//create list
		String choice[] = {"Lion","Monkey","Elephant","Kangaroo","Polar Bear","Penguin", "Ostrich"};
		JList<String> animals = new JList<String>(choice);
		
		//create scroll pane
		JScrollPane pane = new JScrollPane(animals);
		c.add(pane);
		p.add(animals);

		c.add(p);

		setTitle(t);
		setSize(300,300);
		setLocation(150,150);
		setVisible(true);

	}//end constructor

}//end class