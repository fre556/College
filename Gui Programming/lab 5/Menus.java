/**
 * @(#)Menu.java
 *
 *
 * @author Graham Jordan
 * @version 1.00 2014/10/30
 */

//import libraries
import javax.swing.*;
import java.awt.*;
public class Menus extends JFrame{
	
	//constructor
    public Menus() {
    	super("Menu's");
    	// creates menu bar
    	JMenuBar mb = new JMenuBar();
    	//creates help item on menu bar
    	JMenu helpMenu = new JMenu("Help", true);
    	//creates items in help menu
    	helpMenu.add(new JMenuItem("Help Topics"));
    	helpMenu.addSeparator();
    	helpMenu.add(new JMenuItem("Technical Support"));
    	helpMenu.add(new JMenuItem("FAQ"));
    	helpMenu.add(new JMenuItem("TextPad on the Web"));
    	helpMenu.add(new JMenuItem("Update Licence.."));
    	helpMenu.add(new JMenuItem("Ordering information"));
    	helpMenu.add(new JMenuItem("Check for Updates"));
    	helpMenu.addSeparator();
    	helpMenu.add(new JMenuItem("Tip of the day"));
    	helpMenu.addSeparator();
    	helpMenu.add(new JMenuItem("about Textpad"));
    	//adds help to menu
    	mb.add(helpMenu);
    	//adds menubar to Jmenubar
    	setJMenuBar(mb);
    	
    	setSize(200, 200);
		setVisible(true);
    }//end constructor
    //main method
    public static void main(String args[]){
    	Menus first = new Menus();
    	
    }//end main method
    
    
}//end class