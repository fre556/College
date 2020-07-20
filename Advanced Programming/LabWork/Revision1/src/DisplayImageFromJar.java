
import javax.swing.*;

import java.awt.*;
public class DisplayImageFromJar extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/**
	 * @Jlabel Image 
	 */
	JLabel image = new JLabel();
	
	/**
	 * @param displayImageFromJar
	 * 
	 */
	
	public DisplayImageFromJar(){
		Container c = getContentPane();
		JPanel p = new JPanel();
		displayImage("smile.jpeg");
		
		p.add(image);
		c.add(p);
		
		setVisible(true);
		setSize(400,400);
	}//end constructor
	
	/**
	 * @param string s
	 */
	public void displayImage(String s){
		image.setIcon(new ImageIcon(s));
		
	}//end display image
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		new DisplayImageFromJar();
	}//end main
	
}//end class
