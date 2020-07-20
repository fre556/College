/**
 * @(#)InputDiag.java
 *
 *
 * @author 
 * @version 1.00 2014/12/2
 */
//import libraries
import javax.swing.*;
import java.awt.*;
public class InputDiag extends JFrame{
	//craete frame and icon
	ImageIcon icon;
	JFrame frame;
	//constructor
    public InputDiag() {
    	//craete array of choices
    	Object[] choices = {"Black","Green","Blue"};
    	//message box setup
    	String s = (String)JOptionPane.showInputDialog(
                                        frame,
                                        "Whats the missing Primary colour:\n"
                                        + "\"Red, yellow and...\"",
                                        "Options",
                                        JOptionPane.PLAIN_MESSAGE,
                                        icon,
                                        choices,
                                        "Black");
        //check for right answer                                
		if(s.matches("Blue")){
			JOptionPane.showMessageDialog(frame,"That is correct","Options",JOptionPane.PLAIN_MESSAGE);
		}//end if
		else{
			JOptionPane.showMessageDialog(frame,"You were wrong","Options",JOptionPane.PLAIN_MESSAGE);
		}//end else
		
    }//end constructor
    
    //main
    public static void main(String args[]){
    	new InputDiag();	
    }//end main method
    	
    	
}//end class