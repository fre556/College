import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIWithInnerClass extends JFrame{

	private static final long serialVersionUID = 1L;
	JLabel note = new JLabel();
	JButton one = new JButton("Get name");
	
	public GUIWithInnerClass(){
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		p.add(one);
		p.add(note);
		c.add(p);
		
		setSize(600,400);
		setVisible(true);
	
	}//end constuctor
	
	private class ButtonResponder implements ActionListener { {
		one.addActionListener(this);}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals("Get name")){
				note.setText("Outer Class label set by inner class.\n "+ ButtonResponder.class.getName() );
			}//end if
		}//end action performed
		
	}//end private class
	
	public static void main(String args[]){
		new GUIWithInnerClass();
		new GUIWithInnerClass().new ButtonResponder().actionPerformed(null);
	}//end main 

}//end class

