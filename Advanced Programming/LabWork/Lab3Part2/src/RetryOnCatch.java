import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class RetryOnCatch extends JFrame implements ActionListener{
	//declare components for GUI
	JButton stringLengthButton = new JButton("Get String Length");
	JLabel outputLabel = new JLabel("String Length = ");
	JTextField inputField = new JTextField(30);
	
	//constructor
	public RetryOnCatch(){
		//add components to panel and define container
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		GridLayout grid = new GridLayout(3,1);
		
		stringLengthButton.addActionListener(this);
		
		p.setLayout(grid);
		
		p.add(inputField);
		p.add(outputLabel);
		p.add(stringLengthButton);
		
		c.add(p);
		
		setVisible(true);
		setSize(400,400);
		
	}//end constructor
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RetryOnCatch();
	}//end main
	
	//method to change the label in the program
	public void setText(int num){
		outputLabel.setText(outputLabel.getText() + num);;
	}//end set text
	
	@SuppressWarnings("null")
	public void actionPerformed(ActionEvent e) {
		int num;
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Get String Length")){
			try{
				num = inputField.getText().length();
				if(num==0){
					num=(Integer) null;
				}//end if for no input
				else{
					setText(num);
				}//end else to set length
				
			}//end try
			catch(NullPointerException f){
				String output = JOptionPane.showInputDialog("Error, No string entered. Please input a String");
				num = output.length();
				setText(num);
			}//end catch
		}//end if for action
	}//end action performed

}//end class
