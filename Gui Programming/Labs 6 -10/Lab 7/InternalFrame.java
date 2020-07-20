//import libraries
import javax.swing.*;
import java.awt.*;

public class InternalFrame extends JFrame{

	//constructor
	public InternalFrame() {
		super("Internal Frames");

		//create desktop and internal frame
		JDesktopPane desktop = new JDesktopPane();
		JInternalFrame innerframe = new JInternalFrame("My first internal frame",false, true, true, true);

		//set conditions of internal frame
		innerframe.setSize(640,480);
		innerframe.setLocation(10,10);
		innerframe.setVisible(true);

		//add innerframe to desktop
		desktop.add(innerframe);

		//set contentpane conditions and
		setContentPane(desktop);
		setSize(700,700);
		setVisible(true);

	}//end constructor

	//main method
	public static void main(String[] args) {

	        InternalFrame frame = new InternalFrame();

    }//end main

}//end class