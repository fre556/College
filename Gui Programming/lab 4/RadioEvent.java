/**
 * @(#)RadioEvent.java
 *
 *
 * @author Graham Jordan
 * @version 1.00 2014/10/29
 */
//import libraries
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class RadioEvent extends JFrame implements ActionListener{
	
	//declare label globally
	JLabel label = new JLabel();
	//constructor
    public RadioEvent(String t) {
		//create container and panel
    	Container c = getContentPane();
		JPanel p = new JPanel();
		//create radio buttons
		JRadioButton dublin = new JRadioButton("Dublin",false);
		JRadioButton cork = new JRadioButton("Cork",false);
		JRadioButton tralee = new JRadioButton("Tralee",false);
		JRadioButton donegal = new JRadioButton("Donegal",false);
		//create event
		dublin.addActionListener(this);
		cork.addActionListener(this);
		tralee.addActionListener(this);
		donegal.addActionListener(this);
		//groups the buttons
		ButtonGroup places = new ButtonGroup();
		
		//adds items to the panel
		p.add(dublin);
		p.add(cork);
		p.add(tralee);
		p.add(donegal);
		p.add(label);
		//adds panel to container
		c.add(p);
		

		setVisible(true);
		setSize(100,300);
		setLocation(150,150);
    }
    //main method
    public static void main(String args[]){

		RadioEvent frame = new RadioEvent("Radio Buttons");

	}
	//method to set text of label
	public void setLabel(String a){
		
		label.setText(a);
	}
	//action method
	public void actionPerformed(ActionEvent e) {

    	if(e.getActionCommand().equals("Dublin")){
    		setLabel("This is correct");
    	}
    	else{
    		setLabel("This is Wrong");
    	}
    	

	}//end action method
}//end class