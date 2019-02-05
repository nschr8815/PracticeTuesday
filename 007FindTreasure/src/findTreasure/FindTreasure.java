package findTreasure;

import java.awt.Color;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class FindTreasure extends JFrame {

//field 
	int j;
	int x = 5;
	int y = 5;
	JLabel[][] choiceLabel = new JLabel[x][y];
	JLabel label = new JLabel();
	
	ImageIcon gnome = new ImageIcon("Gnomed150x150.png");
	JButton newButton = new JButton();
	int gnomeLocation;
	Random myRandom = new Random();
	

	 public static void main(String args[])
	  {
	    // create frame
	    new FindTreasure().setVisible(true);
	  }
//constructor 
	public FindTreasure() {
		setTitle("Find the Treasure - By Nicholas Schroeder - Nov. 2018");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
				}
		});
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;
		for (int i = 0; i < 5; i++) {
			gridConstraints = new GridBagConstraints();
			choiceLabel[x][y].setPreferredSize(new Dimension(gnome.getIconWidth(), gnome.getIconHeight()));
			choiceLabel[x][y].setOpaque(true);
			choiceLabel[x][y].setBackground(Color.RED);
			gridConstraints.gridx = x;
			gridConstraints.gridy = x;
			gridConstraints.insets = new Insets(10, 10, 10, 10);
			getContentPane().add(choiceLabel[x][y], gridConstraints);
			choiceLabel[x][y].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					labelMouseClicked(e);
				}
			
		
			});
			newButton.setText("Play Again");
			gridConstraints = new GridBagConstraints();
			gridConstraints.gridx = 1;
			gridConstraints.gridy = 1;	
			gridConstraints.insets = new Insets(10, 10, 10, 10);
			getContentPane().add(newButton, gridConstraints);
			newButton.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e) {
					newButtonActionPerformed(e);
				}	
				
			});
			
		}
		//pack();
		//newButton.doClick();
		//setVisible(true);
		 getContentPane().setBackground(Color.WHITE);
		    pack();
		    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());
		    // start first game
		    newButton.doClick();
	}// end of constructor

	//methods
	
	private void labelMouseClicked(MouseEvent e)
	{
		Component clickedComponent = e.getComponent();
		int choice;
		for (choice = 0; choice < 3; choice++)
		{
			if (clickedComponent == choiceLabel[choice][choice])
			{
				break;
			}
		}
		choiceLabel[choice][choice].setBackground(Color.WHITE);
		if (choice == gnomeLocation)
		{
			choiceLabel[choice][choice].setIcon(gnome);
			newButton.setEnabled(true);
		}
	
	}
	

	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}
	
	
	
	private void newButtonActionPerformed(ActionEvent e)
	{
		//to clear boxes and hide gnome
		for ( int i = 0; i < 3 ; i++)
		{
			choiceLabel[x][y].setIcon(null);
			choiceLabel[x][y].setBackground(Color.RED);
		}
		gnomeLocation = myRandom.nextInt(3);
		newButton.setEnabled(false);
		}
	}
// end of Class FindTreasure