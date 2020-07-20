//program used to create a login screen for a user

import javax.swing.*;
import java.awt.*;
public class LoginButton extends JFrame {

	//main method
	public static void main(String args[]){

		LoginButton Login = new LoginButton("Login");

	}//end main method

	//constructor to set text and password fields
	public LoginButton(String t){

		//define container and panels
		Container c = getContentPane();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		//set layout
		c.setLayout(new BorderLayout());
		
		//Label for username
		JLabel namelabel = new JLabel("Username");
		panel.add(namelabel);
		//text field for username
		JTextField uname = new  JTextField(20);
		uname.setEditable(true);
		panel.add(uname);
		//Password label
		JLabel plabel = new JLabel("Password");
		panel.add(plabel);
		//password text field
		JPasswordField pfield = new JPasswordField(20);
		pfield.setEchoChar('*');
		panel.add(pfield);
		
		//buttons
		JButton ok = new JButton("ok");
		JButton close = new JButton("close");
		
		//adds buttons to second panel
		panel2.add(ok);
		panel2.add(close);
		
		//adds panels to container in specific sections
		c.add(panel,BorderLayout.CENTER);
		c.add(panel2,BorderLayout.SOUTH);
		
		//container settings
		setVisible(true);
		setTitle(t);
		setSize(300,300);
		setLocation(150,150);


	}//end constructor



}//end class