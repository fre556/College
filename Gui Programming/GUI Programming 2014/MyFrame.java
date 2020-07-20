import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

//import java.awt.Container;

public class MyFrame extends JFrame {


	public static void main(String[] args) {

		MyFrame first = new MyFrame("MyFrame");

		//first.setSize(200,200);
		//first.setVisible(true);
		//first.setTitle("MyFrame");

	}

	public MyFrame(String myTitle) {

		super(myTitle);
		setSize(200,200);
		setVisible(true);
		setLocation(50,50);
		JLabel leftLabel = new JLabel("Left click here: ");
		JLabel rightLabel = new JLabel("Right click here: ");
		/*
		JTextField field1 = new JTextField(20);
		*/


		//Container c = getContentPane();
		JPanel buttonPanel = new JPanel();
		JButton leftButton = new JButton("Left");
		JButton rightButton = new JButton("Right");
		rightButton.setEnabled(false);
		buttonPanel.add(leftLabel);
		buttonPanel.add(leftButton);
		buttonPanel.add(rightLabel);
		buttonPanel.add(rightButton);

		//Add directly to frame...we don't do!!!
		getContentPane().add(leftButton);
		getContentPane().add(rightButton);

		getContentPane().add(buttonPanel);

		//Get a referencer to the Container
		//Create my button
		//Add my button to the Container




	}
}