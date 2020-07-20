import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MonWorkingGUI extends JFrame implements ActionListener {

  JButton resetButton = new JButton("Reset");
  JButton submitButton = new JButton("Submit");



  public MonWorkingGUI() {

	  JPanel buttonPanel = new JPanel();

	  //resetButton.setText("Not reset");

	  //ImageIcon myImage = new ImageIcon("rainbow.gif");
	  //resetButton.setIcon(myImage);

	  buttonPanel.add(resetButton);
	  buttonPanel.add(submitButton);

	  getContentPane().add(buttonPanel);

	  resetButton.addActionListener(this);
	  submitButton.addActionListener(this);

	  setSize(300,300);

	  setVisible(true);


  }


  public static void main(String[] args) {

	  MonWorkingGUI myGUI = new MonWorkingGUI();


  }

  public void actionPerformed(ActionEvent e) {


	  if(e.getSource()==submitButton) {
		  submitButton.setText("Completed!!!");
	  }
	  else {
		  reset();

	  }
  }

  public void reset() {
	  resetButton.setText("Done");

  }




}