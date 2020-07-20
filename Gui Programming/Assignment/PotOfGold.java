/**
 * @(#)PotOfGold.java
 * This is a game of chance where the player will have a set number of lives to find the pot of gold
 * if the gold is found the player wins
 * if the player hits a rainbow they gain a life
 * if the player hits a leprechaun they lose a life
 * if the player runs out of lives the game is over
 *
 * @author Graham Jordan
 * @version 1.00 2014/10/31
 */
//import libraries
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class PotOfGold extends JFrame implements ActionListener{
	//declare global variables
	int life = 2;
	int score = 0;
	int counter=0;
	
	JLabel state = new JLabel();
	JLabel lives = new JLabel("Lives: " + life);
    JLabel rainbow = new JLabel("Rainbows: " + score);
	
	JButton[] button = new JButton[9];
	
	//constructor
    public PotOfGold() {
    	//create panels and container
    	Container c = getContentPane();
    	JPanel p = new JPanel();
    	JPanel p2 = new JPanel(new GridLayout(3,3));
    	
    	//creates the buttons using a for loop
    	for(int i=0; i<9; i++){
			button[i] = new JButton("Button "+ (i+1));
			p2.add(button[i]);
			button[i].addActionListener(this);
			button[i].setBackground(Color.lightGray);//hides text
			button[i].setForeground(Color.lightGray);//hides text
		}
    	//adds labels to panel
    	p.add(lives);
    	p.add(rainbow);
    	p.add(state);
    	
    	//creates the reset button
    	JButton Reset = new JButton("Reset");
    	Reset.addActionListener(this);
    	p.add(Reset);
    	
    	//sets layout and adds panels to container
    	c.add(p,BorderLayout.NORTH);
    	c.add(p2,BorderLayout.CENTER);
    	
    	//set constrains of frame
    	setVisible(true);
    	setSize(400,400);
		setLocation(150,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
    }//end constructor
    
    
    //main menu
    public static void main(String args[]){
    	PotOfGold start = new PotOfGold();
    }//end main menu
    
    //Action event
    public void actionPerformed(ActionEvent e){
     	int outcome = 1 + (int)(Math.random()*4);
    	if(e.getActionCommand().equals("Reset")){
    		reset();	
    	}//end if
    	else for(int n=0;n<9;n++){
    		if(e.getActionCommand().equals("Button " + (n+1))){
    			picture(outcome,n);
    		}//end if
    	}//end else
    	
    }//end action event
    
    //reset method
    public void reset(){
    	//reset stats
    	life = 2;
		score = 0;
		state.setText("");
		setScore();
		//resets buttons
		for(int i=0;i<9;i++){
			button[i].setEnabled(true);
			button[i].setIcon(null);
			button[i].setText("Button " + (i+1));
			button[i].setBackground(Color.lightGray);//hides text
			button[i].setForeground(Color.lightGray);//hides text
		}//end for
    }//end reset method
    
    //set score method
    public void setScore(){
    	//updates scores
    	lives.setText("Lives: " + life);
    	rainbow.setText("Rainbows: " + score);
    }//end set core
    
    //sets images and stae of game
    public void picture(int a, int n){
    	//declare pics
    	Icon rain = new ImageIcon("rain2.png");
    	Icon gold = new ImageIcon("gold.png");
    	Icon lep = new ImageIcon("lep2.png");
    	Icon blank = new ImageIcon("blank2.png");
    	
    	//if statement to set state of each button depending on random number generator
    	//sets state if rainbow is hit
    	if(a==1){
    		button[n].setIcon(rain);
    		button[n].setDisabledIcon(rain);
    		button[n].setText("");
    		life++;
    		score++;
    		setScore();
    		button[n].setEnabled(false);
    		
    	}//end if for rainbow
    	
    	//sets state if blank is hit
    	else if(a==2){
    		button[n].setIcon(blank);
    		button[n].setDisabledIcon(blank);
    		button[n].setText("");
    		button[n].setEnabled(false);
    	}//end else for blank
    	
    	//sets state if gold is hit
    	else if(a==3){
    		button[n].setIcon(gold);
    		button[n].setDisabledIcon(gold);
    		button[n].setText("");
    		state.setText("Game Over, You Win");
    		//sets buttons to disabled to declare game over
    		for(int i=0;i<9;i++){
    			button[i].setEnabled(false);
    			button[i].setText("");
    			button[i].setForeground(Color.white);
    			button[i].setBackground(Color.white);//hides text
    		}//end for
    	}//end else for gold
    	
    	//sets state if lep is hit
    	else{
    		button[n].setIcon(lep);
    		button[n].setDisabledIcon(lep);
    		button[n].setText("");
    		life--;
    		setScore();
    		//checks to see if you of lives
    		if(life==0){
    			state.setText("Game Over, You Lose");
    			for(int i=0;i<9;i++){
    				button[i].setEnabled(false);
    				button[n].setText("");
    			}//end for loop
    		}//end if
    		//disables the button if game not over
    		button[n].setEnabled(false);
    		
    	}//end else
    }//end pictures
    
}//end class