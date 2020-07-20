/**
 * @(#)ButtonAction.java
 *
 *
 * @author Graham Jordan
 * @version 1.00 2014/10/29
 */
//import libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonAction extends JFrame implements ActionListener {
	//declare label globally
	JLabel label = new JLabel();
	//constructor
    public ButtonAction() {

    	Container c = getContentPane();
    	JPanel panel = new JPanel();
    	//declares icon and font
    	Icon pic = new ImageIcon("bug1.gif");
    	Font buttonfont = new Font("Serif",Font.ITALIC,20);

    	JButton button1 = new JButton("Button 1", pic);//adds icon to button
    	JButton button2 = new JButton("Button 2");
    	JButton button3 = new JButton("Button 3");
    	button2.setFont(buttonfont);//adds font to button

    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);

    	panel.add(button1);
    	panel.add(button2);
    	panel.add(button3);
    	panel.add(label);

    	c.add(panel);
    	setSize(400,400);
    	setVisible(true);


    }//end constructor
    //main method
    public static void main(String args[]){

    	ButtonAction event = new ButtonAction();

    }//end main method
    //set label
    public void setLabel(String a){
    	label.setText(a);
    }//end set method
    //action method
    public void actionPerformed(ActionEvent e){
    	if(e.getActionCommand().equals("Button 1")){
    		setLabel("Button 1 was clicked");
    	}
    	else if(e.getActionCommand().equals("Button 2")){
    		setLabel("Button 2 was clicked");
    	}
    	else if(e.getActionCommand().equals("Button 3")){
    		setLabel("Button 3 was clicked");
    	}

    }//end action event


}//end class