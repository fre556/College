import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StopTheLight extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public StopTheLight(){
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		start.addActionListener(this);
		stop.addActionListener(this);
		
		p.add(start);
		p.add(stop);
		
		c.add(p);
		
		setSize(400,400);
	    setVisible(true);
	}
	
	public static void main(String[] args){
		new StopTheLight();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawRect( 120, 100, 150, 250);
		
		g.setColor(Color.green);
		g.fillOval(170, 130, 50, 50);
		
		g.setColor(Color.orange);
		g.fillOval(170, 200, 50, 50);
		
		g.setColor(Color.red);
		g.fillOval(170, 270, 50, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Start")){
			Graphics g = null;
			g .drawRect( 120, 100, 150, 250);
			
			g.setColor(Color.green);
			g.fillOval(170, 130, 50, 50);
		}
		else if(e.getActionCommand().equals("Stop")){
			Graphics g = null;
			g .drawRect( 120, 100, 150, 250);
			
			g.setColor(Color.red);
			g.fillOval(170, 270, 50, 50);
		}
	}
	
}
