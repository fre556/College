//import libraries
import javax.swing.*;
import java.awt.*;

public class InternalFrameMenu extends JFrame{

	//constructor
	public InternalFrameMenu() {
		super("Frames and menus");

		//create desktop and internal frame
		JDesktopPane desktop = new JDesktopPane();
		JInternalFrame innerframe = new JInternalFrame("internal frame",true, true, true, true);
		
		//create menubar and menus
		JMenuBar menubar = new JMenuBar();
		JMenu newmenu = new JMenu("New", true);
		JMenu savemenu = new JMenu("Save", true);
		JMenu closemenu = new JMenu("Close",true);
		
		//create menu items
		JMenuItem New = new JMenuItem("new");
		JMenuItem save = new JMenuItem("save");
		JMenuItem exit = new JMenuItem("exit");
		
		//add menu items to menus
		newmenu.add(New);
		savemenu.add(save);
		closemenu.add(exit);
		
		//add menus to menu bar
		menubar.add(newmenu);
		menubar.add(savemenu);
		menubar.add(closemenu);
		

		//set conditions of internal frame
		innerframe.setSize(640,480);
		innerframe.setLocation(10,10);
		innerframe.setJMenuBar(menubar);
		innerframe.setVisible(true);
		

		//add innerframe to desktop
		desktop.add(innerframe);

		//set contentpane conditions
		setContentPane(desktop);
		setSize(700,700);
		setVisible(true);

	}//end constructor

	//main method
	public static void main(String[] args) {

	        InternalFrameMenu frame = new InternalFrameMenu();

    }//end main

}//end class