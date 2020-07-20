import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.swing.*;

public class PlayMySoundApplication extends JFrame implements ActionListener{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String args[]){
		new PlayMySoundApplication();
		
	}
	
	public static AudioClip getAudioClip(URL url){
		//AudioClip audioClip = Applet.getAudioClip(url);
		return null;
	}
	

	public PlayMySoundApplication(){
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		JButton play = new JButton("Play");
		play.addActionListener(this);
		
		p.add(play);
		c.add(p);
		
		setSize(200,200);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Play")){
			//AudioClip audioClip = Applet.getAudioClip("G:\itb year 2\semester 4\Advanced programming\semester4\Lab4Part1", "Bottle-open.wav");
			play("G:/itb year 2/semester 4/Advanced programming/semester4/Lab4Part1", "Bottle-open.wav");
			
			
		}
	}//end action performed

	private void play(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
