import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Translation extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	public Translation(){
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JLabel label = new JLabel("Hello");
		JButton english = new JButton("English");
		english.addActionListener(this);
		JButton french = new JButton("French");
		french.addActionListener(this);
		JButton German = new JButton("German");
		German.addActionListener(this);
		
		p.add(english);
		p.add(french);
		p.add(German);
		p.add(label);
		
		c.add(p);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Translation();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("English")){
			
		}
		if(e.getActionCommand().equals("French")){
			
		}
		if(e.getActionCommand().equals("German")){
			
		}
		
	}

	
}
