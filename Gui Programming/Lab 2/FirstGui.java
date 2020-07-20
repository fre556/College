//import library
import javax.swing.*;
public class FirstGui extends JFrame{

	//main method
	public static void main(String args[]){
		JFrame FirstGui = new FirstGui("First Java GUI Window");


	}//end main method

	//constructor
	public FirstGui(String title){
		//set conditions of frame (size, title..)
		setTitle(title);
		setSize(440,380);
		setLocation(100,100);
		setResizable(false);
		setVisible(true);

	}//end constructor

}//end class