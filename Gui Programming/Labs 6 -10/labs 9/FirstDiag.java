/**
 * @(#)FirstDiag.java
 *
 *
 * @author 
 * @version 1.00 2014/12/2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FirstDiag extends JFrame{
	JFrame frame;
	//constructor
    public FirstDiag() {
    	JOptionPane.showMessageDialog(frame,"This is a message box", "First dialog",JOptionPane.PLAIN_MESSAGE);
    }//end constructor
    
    public static void main(String args[]){
    	new FirstDiag();
    }
    
    
}//end class