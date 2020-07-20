import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWithAnonymousInnerClass extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public static void main(String args[]){
		final JLabel message = new JLabel();
		final JButton change = new JButton("Show Message");
		
		final GUIWithAnonymousInnerClass GUI = new GUIWithAnonymousInnerClass();
		
		GUI.getContentPane().setLayout(new FlowLayout());
		GUI.getContentPane().add(change);
		GUI.getContentPane().add(message);
		
		GUI.setVisible(true);
		GUI.setSize(300, 400);
		
		change.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				message.setText("Outer class label set by inner class. " + getClass().getName());
			}
			
		});
	}

}
