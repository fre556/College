
//program used to create a login screen for a user
//import libraries
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {

	//main method
	public static void main(String args[]){

		JFrame frame = new Login("Login");

	}//end main method

	//constructor to set text and password fields
	public Login(String t){
		//create container and panel
		Container c = getContentPane();
		JPanel panel = new JPanel();
		
		//creates label
		JLabel namelabel = new JLabel("Username");
		panel.add(namelabel);
		
		//creates text field
		JTextField uname = new  JTextField(20);
		uname.setEditable(true);
		panel.add(uname);
		
		//creates label
		JLabel plabel = new JLabel("Password");
		panel.add(plabel);
		
		//creates password field
		JPasswordField pfield = new JPasswordField(20);
		pfield.setEchoChar('*');
		panel.add(pfield);
		
		setVisible(true);
		setTitle(t);
		setSize(300,300);
		setLocation(150,150);

		c.add(panel);

	}//end constructor

}//end class