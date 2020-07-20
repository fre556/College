import javax.swing.*;
import java.awt.*;
public class Radio extends JFrame{

	public static void main(String args[]){

		Radio frame = new Radio("Radio Buttons");

	}
	public Radio(String t){
		Container c = getContentPane();
		JPanel p = new JPanel();

		JRadioButton dublin = new JRadioButton("Dublin",false);
		JRadioButton cork = new JRadioButton("Cork",false);
		JRadioButton tralee = new JRadioButton("Tralee",false);
		JRadioButton donegal = new JRadioButton("Donegal",false);

		ButtonGroup places = new ButtonGroup();

		p.add(dublin);
		p.add(cork);
		p.add(tralee);
		p.add(donegal);

		c.add(p);

		places.add(dublin);
		places.add(cork);
		places.add(tralee);
		places.add(donegal);

		setVisible(true);
		setSize(100,300);
		setLocation(150,150);
	}
}