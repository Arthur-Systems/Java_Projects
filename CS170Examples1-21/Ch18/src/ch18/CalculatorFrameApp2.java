package ch18;
//package ch18;

//Caluclator simulation (2)
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.StringTokenizer;

class CalculatorFrame2 extends JFrame {  //Create a frame
   private DisplayPanel displayPanel;
   private ControlPanel controlPanel;
   private EntryPanel entryPanel;
   private JButton offButton, ceButton;
   private JButton[] buttons;
   private JButton divideButton,
			multiplyButton,
			minusButton,
			plusButton,
			decimalButton,
			equalButton;
	private JTextArea display;
	boolean done = false;
	private CalculatorHandler handler;

   CalculatorFrame2() {					//Constructor of the frame
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

	  handler = new CalculatorHandler();

	  setTitle("Calculator"); // set title bar string
	  setSize(190, 260);          // set window size
	  setResizable(false);
	  setVisible(true);           // display window
   	 }
   class DisplayPanel extends JPanel {		//Define the display panel
	   DisplayPanel() {
		   display = new JTextArea(3, 20);
		   display.setLineWrap(true);
		   display.setWrapStyleWord(true);
		   display.setEditable(false);
		   display.addKeyListener(new CalculatorHandler());
		   display.setBorder(new LineBorder(Color.BLACK));
		   add(display);
	   }
   }
   class ControlPanel extends JPanel {		//Define the control panel
	 	private JTextField solarDisplay;
	 	ControlPanel() {
			offButton = new JButton("Esc");
			add(offButton);
			offButton.addActionListener(new CalculatorHandler());
			solarDisplay = new JTextField(15);
			solarDisplay.setEditable(false);
			add(solarDisplay);
			ceButton = new JButton("c");
			add(ceButton);
			ceButton.addActionListener(new CalculatorHandler());
		}
	}
	class EntryPanel extends JPanel {		//Define the entry panel
		EntryPanel() {
			buttons = new JButton[10];
		    for(int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton(Integer.toString(i));
			   	add(buttons[i]);
			   	buttons[i].addActionListener(new CalculatorHandler());
		    }
	       	 plusButton = new JButton("+");
			 add(plusButton);
			 plusButton.addActionListener(new CalculatorHandler());

	         minusButton = new JButton("-");
			 add(minusButton);
			 minusButton.addActionListener(new CalculatorHandler());

			 multiplyButton = new JButton("*");
			 add(multiplyButton);
			 multiplyButton.addActionListener(new CalculatorHandler());

	         divideButton = new JButton("/");
			 add(divideButton);
			 divideButton.addActionListener(new CalculatorHandler());

			 decimalButton = new JButton(".");
			 add(decimalButton);
			 decimalButton.addActionListener(new CalculatorHandler());

			 equalButton = new JButton("=");
			 add(equalButton);
			 equalButton.addActionListener(new CalculatorHandler());
		 }

   }
    class CalculatorHandler extends KeyAdapter implements ActionListener {  //Event handling
		     String expression = null;
		     private char operator;
			 double operandValue, currentTotal;

   			 public void actionPerformed(ActionEvent e) {
				 Object source = e.getSource();
				 if (done) {
				   display.setText("");
				   done = false;
			   	 }

				 for (int i = 0; i < buttons.length; i++) {
				 	if( source == buttons[i])
						display.append("" + i);
				}
				if (source == plusButton)
					display.append(" + ");
				else if (source == minusButton)
					display.append(" - ");
				else if (source == multiplyButton)
					display.append(" * ");
				else if (source == divideButton)
					display.append(" / ");
				else if (source == decimalButton)
					display.append(".");
				else if (source == equalButton) {
					showResult();
				}
				else if (source == ceButton)
					display.setText("");
				else if (source == offButton)
					System.exit(0);
		 	}
		 	public void keyPressed(KeyEvent e) {
				char source = e.getKeyChar();

				if (done) {
				   display.setText("");
				   done = false;
			   	 }
				for (char ch = '0'; ch <= '9'; ch++) {
					if (source == ch )
					  display.append("" + ch);
				}
		 		if (source == '+')
					display.append(" + ");
				else if (source == '-')
					display.append(" - ");
				else if (source == '*')
					display.append(" * ");
				else if (source == '/')
					display.append(" / ");
				else if (source == '.')
					display.append(".");
				else if (source == '=' || source == '\n') 	//return key
				  showResult();
				else if (source == ' ')
					display.setText("");
				else if (e.getKeyCode() == KeyEvent.VK_ESCAPE)  //Esc key
					System.exit(0);
			}
		 private void parseExpression() {			//Define the parsing expression
				String operatorStr;
				char[] operatorArray = new char[1];
				StringTokenizer tokens = new StringTokenizer(expression);
						currentTotal = Double.parseDouble(tokens.nextToken());
						while (tokens.hasMoreTokens()) {
							operatorStr = tokens.nextToken();
							operatorArray = operatorStr.toCharArray();
							operator = operatorArray[0];
							operandValue = Double.parseDouble(tokens.nextToken());
							compute();
				}
		 }
		private void compute() {			//Perfomr the calculation
			switch (operator) {
				case '+':  currentTotal += operandValue;
						   break;
				case '-':  currentTotal -= operandValue;
						   break;
				case '*':  currentTotal *= operandValue;
						   break;
				case '/':  currentTotal /= operandValue;
						   break;
				default:   System.out.println("wrong operator...");
						   break;
				}
		}
		private void showResult() {			//Dispaly the result
			try {
				expression = display.getText();
				parseExpression();
				display.append(" = " + currentTotal);
				done = true;
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Wrong enter.  Click on the display and trye again...");
				display.setText("");
				done = true;
				display.requestFocus();
			}
		}
	}
}
public class CalculatorFrameApp2 {				//The driver code
   public static void main(String args[]) {
      JFrame frame = new CalculatorFrame2();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
}



