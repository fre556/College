/**
 * @(#)DropList.java
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
public class DropList extends JFrame implements ListSelectionListener {
	//declare list and label
	JList list;
	String choices[] = {"Lion", "Monkey", "Elephant", "Kangaroo", "Polar Bear", "Penguin", "Ostrich"};
	JLabel label = new JLabel();
	
	//constructor
    public DropList() {    	
    	Container c = getContentPane();
    	JPanel panel = new JPanel();
    	list = new JList(choices);
		list.addListSelectionListener(this);
		JScrollPane pane = new JScrollPane(list);
		
		panel.add(pane);
		panel.add(label);
		
		c.add(panel);
		
		setSize(300,300);
		show();
    }//end constructor
    //method to set text of label
    public void setLabel(String a){
    	label.setText(a);
    }//end set method
    //main method
    public static void main(String[] args){
		  DropList myList = new DropList();
	
	}//end main method
	
	public void valueChanged(ListSelectionEvent e){
		Object source = e.getSource();
		if (source == list){
			setLabel("You have selected the " + list.getSelectedValue());
		
		}//end if
		
	}//end action event
    
    
   
}//end class