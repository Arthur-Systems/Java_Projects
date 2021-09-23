package ch16;
//package ch16;

//Calculator simulation application (1)

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class CalculatorFrame extends JFrame {
   private DisplayPanel displayPanel;
   private ControlPanel controlPanel;
   private EntryPanel entryPanel;

   CalculatorFrame() {
	  displayPanel = new DisplayPanel();
	  displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));

	  controlPanel = new ControlPanel();
	  controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));
	  controlPanel.setBorder( new LineBorder( Color.BLACK ) );

      entryPanel = new EntryPanel();
      entryPanel.setLayout(new GridLayout(4, 4));
      entryPanel.setBorder(new LineBorder(Color.BLACK));

      add(displayPanel, BorderLayout.NORTH);
      add(controlPanel, BorderLayout.CENTER);
      add(entryPanel, BorderLayout.SOUTH);

	  setTitle("Calculator"); // set title bar string
	  setSize(190, 260);          // set window size
	  setResizable(false);
	  setVisible(true);           // display window
   	 }
   }
   class DisplayPanel extends JPanel {
	   private JLabel name;
	   private JTextArea display;
	   DisplayPanel() {
		   name = new JLabel("  Texas Instruments Computing");
		   add(name);
		   display = new JTextArea(3, 20);
		   display.setEditable(false);
		   display.setBorder(new LineBorder(Color.BLACK));
		   add(display);
	   }
   }
   class ControlPanel extends JPanel {
	 	private JButton onButton, ceButton;
	 	private JTextField solarDisplay;
	 	ControlPanel() {
			onButton = new JButton("on/c");
			add(onButton);
			solarDisplay = new JTextField(15);
			solarDisplay.setEditable(false);
			add(solarDisplay);
			ceButton = new JButton("ce");
			add(ceButton);
		}
	}

	class EntryPanel extends JPanel {
		   private JButton 	oneButton,
							twoButton,
							threeButton,
							fourButton,
							fiveButton,
							sixButton,
							sevenButton,
							eightButton,
							nineButton,
							zeroButton,
							dividButton,
							multiplyButton,
							minusButton,
							plusButton,
							decimalButton,
							equalButton;

		EntryPanel() {
	         oneButton = new JButton("7");
	         add(oneButton);
	         twoButton = new JButton("8");
	         add(twoButton);

	         threeButton = new JButton("9");
	         add(threeButton);
	         dividButton = new JButton("/");
			 add(dividButton);

	         fourButton = new JButton("4");
	         add(fourButton);
	         fiveButton = new JButton("5");
	         add(fiveButton);
	         sixButton = new JButton("6");
	         add(sixButton);
	         multiplyButton = new JButton("*");
			 add(multiplyButton);

	         sevenButton = new JButton("1");
	         add(sevenButton);
	         eightButton = new JButton("2");
	         add( eightButton );
	         nineButton = new JButton("3");
	         add( nineButton );
	         minusButton = new JButton("-");
			 add(minusButton);

			 zeroButton = new JButton("0");
			 add(zeroButton);
			 decimalButton = new JButton(".");
			 add(decimalButton);
			 equalButton = new JButton("=");
			 add(equalButton);
			 plusButton = new JButton("+");
			 add(plusButton);
		 }
   }
public class CalculatorFrameApp1 {
   public static void main(String args[]) {
      JFrame frame = new CalculatorFrame();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
}
