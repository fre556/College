import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ButtonTranslator extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public ButtonTranslator(){
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JButton one = new JButton();
		JButton two = new JButton();
		JButton three = new JButton();
		JButton translate = new JButton();
		
		translate.addActionListener(this);
		
		p.add(one);
		p.add(two);
		p.add(three);
		p.add(translate);
		
		c.add(p);
		
		setSize(200,200);
		setVisible(true);
		
	}//end constructor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonTranslator();
	}//main method
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}//end action listener

}//end class
