import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FullTranslationGUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	public FullTranslationGUI(){
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JButton list = new JButton("List All Locales");
		JTextArea text = new JTextArea();
		@SuppressWarnings("rawtypes")
		JComboBox combo = new JComboBox();
		
		p.add(list);
		p.add(text);
		p.add(combo);
		
		c.add(p);
		
		setSize(200,200);
		setVisible(true);
		
	}//end constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FullTranslationGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
