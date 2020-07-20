/**
 * @(#)Assignment2.java
 *
 *
 * @author Graham Jordan
 * @version 1.00 2014/12/2
 */
//import libraries
import javax.swing.border.LineBorder;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Assignment2 extends JFrame implements ActionListener, MouseInputListener{
	//declare string and ints
	String num ="", shape;
	String choice[] = {"Square","Circle","Triangle"};
	int counter=0, lcounter=0, current=1, m=0;

	//declare pane and frames
	JDesktopPane desktop;
	JInternalFrame cbframe;
	JInternalFrame shframe;

	//declare menu items
	JMenuItem Exit;
	JMenuItem New;
	JMenuItem Shapes;
	JMenuItem Combolock;

	//declare icons
	Icon square = new ImageIcon("square.png");
   	Icon circle = new ImageIcon("circle.png");
   	Icon triangle = new ImageIcon("triangle.png");

	//declare labels
	JLabel[] label = new JLabel[9];
	JLabel[] label2 = new JLabel[3];

	JLabel ans;
	JLabel pic;

	//declare combo box
	JComboBox LanguageList;

	//declare pannels
	JPanel sPanel;
	JPanel p = new JPanel(new GridLayout(1,2));
	JPanel centrep;

////////////////////////////////////////////// constructor /////////////////////////////////////////////////////////
	//constructor
    public Assignment2() {


    	//name frame
    	super("Assignment 2");
    	//creates menubar
    	setJMenuBar(menu());
    	//calls method to create internal frames
    	CFrame();
    	SFrame();

    	//creates a container and panel to layout the internal frames
    	Container c = getContentPane();


    	combo();
    	shapes();

    	//adds internal frames to panel
    	c.add(p);

    	//settings for main frame
    	setSize(700,700);
    	setVisible(true);
    }//end constructor

//////////////////////////////////////// Design //////////////////////////////////////////////////////////////////////////

    public JMenuBar menu(){
    	//craete menubar
    	JMenuBar mb = new JMenuBar();

    	//create menus
    	JMenu Selectmenu = new JMenu("Select");
    	Selectmenu.setMnemonic(KeyEvent.VK_L);
    	JMenu Filemenu = new JMenu("File");
    	Filemenu.setMnemonic(KeyEvent.VK_F);

    	//creates menu items and mnemonics
    	Combolock = new JMenuItem("Combo Lock");
    	Combolock.setMnemonic(KeyEvent.VK_C);
    	Combolock.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
    	Combolock.addActionListener(this);

    	Shapes = new JMenuItem("Shapes");
    	Shapes.setMnemonic(KeyEvent.VK_S);
    	Shapes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
    	Shapes.addActionListener(this);

    	New = new JMenuItem("new");
    	New.setMnemonic(KeyEvent.VK_N);
    	New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
    	New.addActionListener(this);

    	Exit = new JMenuItem("exit");
    	Exit.setMnemonic(KeyEvent.VK_X);
    	Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
    	Exit.addActionListener(this);

    	//adds items to menu
    	Filemenu.add(New);
    	Filemenu.add(Exit);
    	Selectmenu.add(Combolock);
    	Selectmenu.add(Shapes);

    	//adds menus to menubar
    	mb.add(Filemenu);
    	mb.add(Selectmenu);

    	//sends menubar
    	return mb;

    }//end menubar method


    //creates internal frame for combo
    public void CFrame(){
    	cbframe = new JInternalFrame("Combinations",false, true, true, true);
    	cbframe.setSize(350,500);
    	cbframe.setLocation(0,50);
    	cbframe.setVisible(true);

    }//end cframe

    //creates internal frame for shapes
    public void SFrame(){
    	shframe = new JInternalFrame("Shapes",false, true, true, true);
    	shframe.setSize(350,500);
    	shframe.setLocation(350,50);
    	shframe.setVisible(true);

    }//end sframe

 //////////////////////////////////////// Action performed ///////////////////////////////////////////////////////////////
    //action menu
    public void actionPerformed(ActionEvent e){
    	//sets actions for menu items
    	if (e.getSource() instanceof JMenuItem){
			if (e.getSource() == Exit){
				System.exit(0);
			}//end exit
			else if(e.getSource() == New){

			}//end new
			else if(e.getSource() == Combolock){
				p.add(cbframe);
			}//end cblock
			else if(e.getSource() == Shapes){
				p.add(shframe);
			}//end shframe
		}//end if for JMenuItem

		//sets action for JCombobox
		if(e.getSource() instanceof JComboBox){
			int index = LanguageList.getSelectedIndex();

			//used index to set text of label
			if(index == 0){
				System.out.println("English");
				String choice[] = {"Square", "Circle", "Triangle"};

				for(int i=0;i<3;i++){
					label2[i] = new JLabel();
					label2[i].setText(choice[i]);
				}
				shframe.revalidate();
				shframe.repaint();
			}
			else if(index == 1 ){
				System.out.println("Irish");
				String choice[] = {"cearnach", "ciorcal", "triant�n"};
				for(int i=0;i<3;i++){
					label2[i].setText(choice[i]);
				}
				shframe.revalidate();
				shframe.repaint();
			}
			else if(index == 2){
				System.out.println("French");
				String choice[] = {"carr�", "cercle", "Triangle"};
				for(int i=0;i<3;i++){
					label2[i].setText(choice[i]);
				}
				shframe.revalidate();
				shframe.repaint();
			}//end else 2
		}//end combobox instance

    }//end action performaed




////////////////////////////////// Combo frame ////////////////////////////////////////////////////////////////////////

    //method to check combination for correct answer
    public void checknum(){
    	JFrame frame = new JFrame();;
    	if(num.matches("1234")){
    		JOptionPane.showMessageDialog(frame,"Password Correct", "Check Code",JOptionPane.PLAIN_MESSAGE);
    		num="";
    		counter=0;
    		ans.setText("Enter pin: ");
    	}//end if
    	else{
    		JOptionPane.showMessageDialog(frame,"Password incorrect", "Check Code",JOptionPane.PLAIN_MESSAGE);
    		num="";
    		counter=0;
    		ans.setText("Enter pin: ");
    	}//end else
    }//end check sum

	//internal frame for combination lock
    public void combo(){

    	JPanel p2 = new JPanel(new GridLayout(3,3));

    	for(int i=0;i<9;i++){
    		label[i] = new JLabel(""+(i+1));
    		label[i].setVerticalAlignment(JLabel.CENTER);
    		label[i].setHorizontalAlignment(JLabel.CENTER);
    		label[i].setBorder(new LineBorder(Color.BLACK));
    		label[i].addMouseListener(this);
    		p2.add(label[i]);
    	}//end for
    	JPanel mPanel = new JPanel();
    	mPanel.setLayout(new BorderLayout());
    	ans = new JLabel("Enter Pin: ");
    	ans.setBorder(new LineBorder(Color.BLACK));
    	mPanel.add(ans,BorderLayout.SOUTH);
    	mPanel.add(p2);
    	cbframe.add(mPanel);
    }//end combo method



    //main method
    public static void main(String args[]){
    	new Assignment2();
    }//end main

//////////////////////////////////////// Mouse events //////////////////////////////////////////////////////////

    public void mouseClicked(MouseEvent e){
    		//comparative for combination lock
    		if(e.getSource() instanceof JLabel) {
				for(int i=0;i<9;i++){
					if(e.getSource() == label[i]){
						num += (i+1);
						ans.setText(num);
						counter++;
					}//end if for num
				}//end if for for loop
				if(counter==4){
					checknum();
				}


    		}//end if for label

    		//comparitive for Shapes
    		if(e.getSource() instanceof JLabel) {
    			if(e.getSource() == label2[m]) {

    				String pick = (((JLabel)e.getSource()).getText());
    				if(pick == choice[m]){
						result(m);
					}//end if for num
					else{
						result(-1);
					}
    			}
    			else{
    				result(-1);
    			}
    		}//end if instance

    }//end mouse clicked

    //mouse entered
    public void mouseEntered(MouseEvent e){

    }//end mouse entered
     public void mouseExited(MouseEvent e){

    }//end mouse exited

    public void mousePressed(MouseEvent e){

    }//end mouse pressed

    public void mouseReleased(MouseEvent e){

    }//end mouse released

    public void mouseDragged(MouseEvent e){

    }//end mouse dragged

    public void mouseMoved(MouseEvent e){

    }//end mouse moved


//////////////////////////////////////// Shapes Frame ////////////////////////////////////////////////////////////

	public void shapes(){
		sPanel = new JPanel();
    	sPanel.setLayout(new BorderLayout());

    	String Language[] = {"English", "Irish", "French"};
		LanguageList = new JComboBox(Language);

		LanguageList.addActionListener(this);

		if(m==0){
			LanguageList.setSelectedIndex(0);
			English();
		}
		else{
			English();
		}

		sPanel.add(LanguageList,BorderLayout.NORTH);

		shframe.add(sPanel);


	}

	//creates panels for inner frame for
	public void English(){
		JPanel engPanel = new JPanel();
    	engPanel.setLayout(new BorderLayout());
    	JPanel centrep = new JPanel(new GridLayout(1,3));

    	pic = new JLabel();

    	if(m==0){
    		pic = new JLabel(square);
    		engPanel.add(pic,BorderLayout.NORTH);
    		for(int j=0;j<3;j++){
    			label2[j].setBorder(new LineBorder(Color.BLACK));
    			label2[j].addMouseListener(this);
    			centrep.add(label2[j]);
    		}//end for loop
    		engPanel.add(centrep, BorderLayout.CENTER);
    		sPanel.add(engPanel,BorderLayout.CENTER);

    	}//end if

	}//end panel


	//checks to see if user selected the right option
	public void result(int c){
		JFrame frame = new JFrame();
		if(m==0){
			if(c==0){
				JOptionPane.showMessageDialog(frame,"you are Correct - Square", "Check Shape",JOptionPane.PLAIN_MESSAGE);
				m++;
				pic.setIcon(circle);
				shframe.revalidate();
				shframe.repaint();
			}//end if 0
			else{
				JOptionPane.showMessageDialog(frame,"you are incorrect - Square", "Check Shape",JOptionPane.PLAIN_MESSAGE);
				m++;
				pic.setIcon(circle);
				shframe.revalidate();
				shframe.repaint();
			}//end else 0
		}//end 0
		else if(m==1){
			if(c==1){
				System.out.println("Correct Circle " + m);
				JOptionPane.showMessageDialog(frame,"you are Correct - Circle", "Check Shape",JOptionPane.PLAIN_MESSAGE);
				m++;
				pic.setIcon(triangle);
				shframe.revalidate();
				shframe.repaint();
			}//end if 1
			else{
				JOptionPane.showMessageDialog(frame,"you are incorrect  - Circle", "Check Shape",JOptionPane.PLAIN_MESSAGE);
				m++;
				pic.setIcon(triangle);
				shframe.revalidate();
				shframe.repaint();
			}//end else 1
		}//end 1
		else if(m==2){
			if(c==2){
				JOptionPane.showMessageDialog(frame,"you are Correct - Triangle", "Check Shape",JOptionPane.PLAIN_MESSAGE);

			}//end if 2
			else{
				JOptionPane.showMessageDialog(frame,"you are incorrect - Triangle", "Check Shape",JOptionPane.PLAIN_MESSAGE);

			}//end else 2
		}//end 2
	}//end result method


}//end class