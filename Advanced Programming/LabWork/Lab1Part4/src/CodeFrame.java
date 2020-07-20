import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

/**
 * 
 */

/**
 * @author Flash
 *
 */

@SuppressWarnings("serial")
public class CodeFrame extends JFrame implements ActionListener{
	
	public JTextField input = new JTextField(20);
	public JTextField output = new JTextField(20);
	 
	/**
	 * @param args
	 * @param main
	 * @param CodeFrame
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CodeFrame();
	}//end main
	
	public CodeFrame(){
		//declare containers
		Container c = getContentPane();
		JPanel p = new JPanel();
		JButton encode = new JButton("Encode");
		
		encode.addActionListener(this);
		JLabel entry = new JLabel("Enter text to encode ");
		JLabel result = new JLabel("The Encoded text is ");
		
		//add elements to container
		p.add(entry);
		p.add(input);
		
		p.add(result);
		p.add(output);
		p.add(encode);
		
		c.add(p);
		
		//set frame
		setVisible(true);
		setSize(300,300);
		
	}//end CodeFrame

	@Override
	public void actionPerformed(ActionEvent e) {
		String text;
		String num="";
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Encode")){
			text = input.getText();
			int j = text.length();
			int encode[] = new int[j];
			//encoding for loop
			for(int i=0;i<j;i++){
				char key = text.charAt(i);
				encode[i] = ((int)key);
			}//end for loop
			for(int i=0;i<j;i++){
				
				num += encode[i] + " ";
			}//end for loop
			output.setText(num);
		}//end get command
	}//end action event

}//end class
