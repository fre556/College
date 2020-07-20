/**
 * @(#)InternalLoop.java
 *
 *
 * @author 
 * @version 1.00 2014/12/2
 */

import javax.swing.*;
import java.awt.*;
public class InternalLoop extends JFrame{
	
	//constructor
    public InternalLoop() {
    	//name on frame
    	super("Loop creates frames");
    	//create desktop
    	JDesktopPane desktop = new JDesktopPane();
    	//declare variables
    	int x=100;
    	int y = 100;
    	//for loop to craete frame
    	for(int i=0;i<5;i++){
    		JInternalFrame f = innerframe(i);
    		f.setLocation(x+=50,y+=50);
    		desktop.add(f);
    	}
    	
    	//desktop settings
    	setContentPane(desktop);
        setSize(600,600);
        setVisible(true);
    	
    }//end constructor
    public static void main(String args[]){
    	InternalLoop frame = new InternalLoop();
    	
    }//end main
    
    //method to create frame
    public JInternalFrame innerframe(