/**
 * @(#)FullMenu.java
 *
 *
 * @author Graham Jordan
 * @version 1.00 2014/10/30
 */
//import libraries
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class FullMenu extends JFrame implements ActionListener{
	
	//constructor
    public FullMenu() {
    	super("Menu's");
    	// creates menu bar
    	JMenuBar mb = new JMenuBar();
    	//adds items to the menu
    	JMenu newMenu = new JMenu("New", true);
    	JMenu openMenu = new JMenu("Open", true);
    	JMenu exitMenu = new JMenu("Exit", true);
    	//declare menu item
    	JMenuItem exit;
    	//adds item to menu
    	exitMenu.add(exit = new JMenuItem("exit"));
  		//creates action
    	exit.addActionListener(this);
    	//adds menus to menu bar
    	mb.add(newMenu);
    	mb.add(openMenu);
    	mb.add(exitMenu);
    	//adds menubar to Jmenubar
    	setJMenuBar(mb);
    	
    	setSize(300, 200);
		setVisible(true);
    	
    }//end constructor
    //main method
    public static void main(String args[]){
    	FullMenu menu = new FullMenu();
    	
    }//end main method
    //action event
    public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem){
			if (e.getActionCommand().equals("exit")){
				System.exit(0);
			}
		}

	}//end action method
    
    
}//end class