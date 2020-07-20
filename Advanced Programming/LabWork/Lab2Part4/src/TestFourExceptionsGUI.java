import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

/**
 * 
 */

/**
 * @author Flash
 *
 */
@SuppressWarnings("serial")
public class TestFourExceptionsGUI extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestFourExceptionsGUI();
	}//end main method

	public  TestFourExceptionsGUI() {
		// TODO Auto-generated method stub
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JButton io = new JButton("Test IO Exception");
		io.addActionListener(this);
		JButton url = new JButton("Test URL Exception");
		url.addActionListener(this);
		JButton np = new JButton("Test Null Pointer Exception");
		np.addActionListener(this);
		JButton gen = new JButton("Test General Exception");
		gen.addActionListener(this);
		
		p.add(io);
		p.add(url);
		p.add(np);
		p.add(gen);
		
		c.add(p);
		
		//set frame
		setVisible(true);
		setSize(300,300);
	}
	
	public void testException(String string, String filename, String url, Boolean generalExceptionActivated){
		try{
			string.toCharArray(); //Null string potential error
			new FileReader(filename); //Unknown filename potential error
			new URL(url); //Badly written URL potential error
			if(generalExceptionActivated) { //Potential error
				this.clone(); //Will be caught as a general error!
			}//end if for general exception
		}//end try
		catch(MalformedURLException e){
			JOptionPane.showMessageDialog(null, "A URL has been badly written " + e.getMessage());
		}//end catch on malformed URL
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "An IO Exception has been badly written " + e.getMessage());
		}//end catch on IO
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "A Null Pointer Exception has been badly written " + e.getMessage());
		}//end catch on Null pointer
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Some general unidentified Exception has been caught " + e.getMessage());
		}//end catch on general exception
		finally{
			JOptionPane.showMessageDialog(null, "The finally block has been called");
		}//end finally
	}//end test exception

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Test IO Exception")){
			testException("Hi","Whatever.txt","http://www.itb.ie", false);
		}
		if(e.getActionCommand().equals("Test Null Pointer Exception")){
			testException(null,"Real.txt","http://www.itb.ie", false);
		}
		if(e.getActionCommand().equals("Test URL Exception")){
			testException("Hi","Real.txt","ht://www.itb.ie", false);
		}
		if(e.getActionCommand().equals("Test General Exception")){
			testException("Hi","Real.txt","http://www.itb.ie", true);
		}
		
	}//end action performed


}//end class
