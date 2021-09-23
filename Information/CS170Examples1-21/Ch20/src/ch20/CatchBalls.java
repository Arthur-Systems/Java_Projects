package ch20;

//package ch20;

/**
 * Multiple dot are created, like balls and move it randomly using program logic.
 * Each ball is created with different color and each ball is moved at different speed
 * If the user clicks on the ball the moving ball will stop and points will be awarded.
 *
 */

import java.text.NumberFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
import java.net.*;
import java.applet.*;
import java.io.*;
import java.util.Random;
import java.io.*;

/**
 * The Main Class : CatchTheDots2 which extends JFrame and implements Runnable,
 * ActionListener
 */

public class CatchBalls extends JFrame implements Runnable, ActionListener {
	private JPanel LeftPanel, mainPanel, LeftPanel2;
	private JTextField cardNumberTextField, PlayerNameTextField,
			gameTimeTextField;
	private JButton aboutButton, instructionButton, playAgainButton;

	private JLabel playerLbl, gameTimeLbl;
	static AudioClip callmeClip, applClip, burstClip;
	static URL callmeUrl, applUrl, burstUrl;
	Cursor appcursor = new Cursor(Cursor.HAND_CURSOR);
	Cursor normalcursor = new Cursor(Cursor.DEFAULT_CURSOR);
	int score = 0, scoreOnDisplay = 0;
	long startTime, endTime;
	int totalBalls = 6;
	int adjustmentFactor = 40;
	int x = 0, y = 0;
	int mcXPos, mcYPos, ballsLeft = totalBalls, ballsCaught = 0;
	int[] xPos = new int[totalBalls];
	int[] yPos = new int[totalBalls];
	int[] newX = new int[totalBalls];
	int[] newY = new int[totalBalls];
	int[] dotSize = { 10, 15, 20, 25, 30, 35 };
	int[] ballBoundary = { 10, 20, 30, 40, 50, 60 };
	int[] ballSpeed = { 1, 2, 1, 2, 1, 2 };
	Graphics2D gg;
	boolean[] reverseX = { false, false, false, false, false, false };
	boolean[] reverseY = { false, false, false, false, false, false };
	boolean[] ballActive = { true, true, true, true, true, true };
	Color[] ballColor = { Color.blue, Color.black, Color.red, Color.pink,
			Color.magenta, Color.orange };
	int color, sleep;
	boolean firstShow = true, mouseClicked = false, isFinished = false;
	int WINDOWSIZE = 450;
	private Timer increment;
	private int TimeCount = 0;
	String player;
	NumberFormat iInstance;

	/**
	 * This takes 4 arguments. Starting x postion, y position and sleep time.
	 * This sleep time, color are not used however in this program. They are
	 * hooks for future.
	 */

	public CatchBalls() throws java.net.MalformedURLException,
			java.io.IOException {
		super("Catching balls Game");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new MouseClickHandler());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setSize(WINDOWSIZE + 300, WINDOWSIZE);
		// setResizable(false);
		// startTime = System.currentTimeMillis();
		positBalls();

		JPanel panel2 = new GridPanel();
		panel2.setBorder(BorderFactory.createRaisedBevelBorder());

		add(panel2, BorderLayout.EAST);
		setVisible(true);

		setPlayer();

		/**
		 * Three different sound waves are used. 1) callmeClip -> The main
		 * background. Is it 80's? 2) burstClip -> Well it is close enough. 3)
		 * applClip -> Applause. You need to finish the game to hear this.
		 */
		callmeUrl = new URL("file:" + new File(".").getCanonicalPath() + "/"
				+ "catchBallsSounds//callme.mid");
		callmeClip = Applet.newAudioClip(callmeUrl);
		burstUrl = new URL("file:" + new File(".").getCanonicalPath() + "/"
				+ "catchBallsSounds//SOUND26.WAV");
		burstClip = Applet.newAudioClip(burstUrl);
		applUrl = new URL("file:" + new File(".").getCanonicalPath() + "/"
				+ "catchBallsSounds//applause.wav");
		applClip = Applet.newAudioClip(applUrl);

		// Set Timer
		// increment = new Timer(1000);
		increment = new Timer(1000, this);
		// Set default
		gameTimeTextField.setText(Integer.toString(TimeCount));
		iInstance = NumberFormat.getIntegerInstance();
		cardNumberTextField.setText(iInstance.format(0));
		increment.start();

		setCursor(appcursor);
		// setVisible(true);
		Thread tx = new Thread(this);
		PlayerNameTextField.setText(player);

		tx.start();

	}

	private void positBalls() {
		for (int i = 0; i < totalBalls; i++) {
			xPos[i] = x + getRandom();
			newX[i] = x + getRandom();
			yPos[i] = y + getRandom();
			newY[i] = y + getRandom();
		}
	}

	private void setPlayer() {
		player = JOptionPane.showInputDialog("Please enter your name: ");
		// JOptionPane.showMessageDialog(null, player);
	}

	/**
	 * Very important method. This is called when repaint() is called. It first
	 * loops through all the balls. if the ball is not active, next ball will be
	 * checked right away as the loops proceeds to the next iteration. if the
	 * ball is active, at the current position for the balls size the background
	 * color is painted At the new position, the ball is painted with the
	 * specific (ball) color. if the mouse click flag is set, using the mouce
	 * clicked coordinates check the ball's coordinates for every active ball. a
	 * small adjustment factor is used to be not so hard on kids :)
	 */
	public void paint(Graphics g) {
		super.paint(g);

		gg = (Graphics2D) g;

		int i;
		if (firstShow) {
			firstShow = false;
			for (i = 0; i < totalBalls; i++) {
				gg.setColor(ballColor[i]);
				gg.fill(new Ellipse2D.Double(xPos[i], yPos[i], dotSize[i],
						dotSize[i]));
			}
		} else {
			for (i = 0; i < totalBalls; i++) {
				if (ballActive[i]) {
					gg.setColor(getBackground());
					gg.fill(new Ellipse2D.Double(xPos[i], yPos[i], dotSize[i],
							dotSize[i]));
					gg.setColor(ballColor[i]);
					gg.fill(new Ellipse2D.Double(xPos[i] = newX[i],
							yPos[i] = newY[i], dotSize[i], dotSize[i]));
				}
			}
		}
		if (mouseClicked) {
			mouseClicked = false;

			for (i = 0; i < totalBalls; i++) {
				if (ballActive[i]) {
					if (mcXPos > (xPos[i] - adjustmentFactor)
							&& mcXPos < (xPos[i] + adjustmentFactor)
							&& mcYPos > (yPos[i] - adjustmentFactor)
							&& mcYPos < (yPos[i] + adjustmentFactor)) {
						endTime = System.currentTimeMillis();
						int BonusTimeScore = 0;

						BonusTimeScore = 300 - TimeCount;
						if (BonusTimeScore < 0)
							BonusTimeScore = 0;
						score = score + 100 + BonusTimeScore;
						callmeClip.stop();
						burstClip.play();
						gg.setColor(getBackground());
						gg.fill(new Ellipse2D.Double(xPos[i], yPos[i],
								dotSize[i], dotSize[i]));

						try {
							Thread.sleep(45);
						} catch (Exception e) {
						}
						ballActive[i] = false;
						ballsCaught++;
						ballsLeft--;
						callmeClip.loop();
					}
				}
			}
		}
	}

	private int getRandom() {
		Random random = new Random((long) (Math.random() * 100)); // seed inside
		return random.nextInt(400);
	}

	/**
	 * Another critical methods, implementation of runnable. when thread.start()
	 * is executed this method will be called. ballBoundary is creating an
	 * imaginary boundary. For each ball this boundary varies. New x, y position
	 * is computed by adding or subtracting (ballspeed,1) or (ballspeed,2)
	 * reverse flag playes a very crucial role. Two reverse flags are there. one
	 * for x (reverseX), other for y (reverseY). if the imaginary boundary is
	 * reached, appropriate reverse flag is set or unset. For example To start
	 * with the x and y are incremanted by ballSpeed+1, ballSpeed+2. if the ball
	 * is reaching the bottom boundary. reverseY flag is set. Now only x will be
	 * incremented Y will be decremented. This creates the 1st bounce. When the
	 * righ boundary is hit. both X and Y will be decremented. This will create
	 * the 2nd bounce. When the top boundary is reached. reverse Flag for Y will
	 * be turned off. Now Y will increase, x will still decrese. This will
	 * create the 3rd bounce. When the left boundary is reached. reverse Flag
	 * for x will be turned off. Now both X and Y will be incremented. This
	 * creates the 4th bounce. This continues. when all the balls are done calls
	 * executed the final logics
	 */

	public void run() {
		callmeClip.loop();
		while (ballsLeft > 0) {
			// r1 = (int) ( Math.random() * 10.0) ;
			for (int i = 0; i < totalBalls; i++) {
				if (xPos[i] > (WINDOWSIZE - ballBoundary[i]))
					reverseX[i] = true;
				if (yPos[i] > (WINDOWSIZE - ballBoundary[i]))
					reverseY[i] = true;
				if (xPos[i] < ballBoundary[i])
					reverseX[i] = false;
				if (yPos[i] < (ballBoundary[i] + 20))
					reverseY[i] = false;

				if (reverseX[i])
					newX[i] = xPos[i] - ballSpeed[i] - 1;
				else
					newX[i] = xPos[i] + ballSpeed[i] + 1;

				if (reverseY[i])
					newY[i] = yPos[i] - ballSpeed[i] - 2;
				else
					newY[i] = yPos[i] + ballSpeed[i] + 2;
			}
			if (score > scoreOnDisplay) {
				// setsocre
				cardNumberTextField.setText(iInstance.format(score));
				scoreOnDisplay = score;
			}

			repaint();

			try {
				Thread.sleep(25);
			} catch (Exception e) {
			}
		}
		if (ballsLeft == 0) {
			isFinished = true;
			endTime = System.currentTimeMillis();
			playAgainButton.setEnabled(true);
			callmeClip.stop();
			increment.stop();
			applClip.play();
			setCursor(normalcursor);
			JOptionPane.showMessageDialog(null, "Game is over, " + player + "!"
					+ "\nYou have used " + TimeCount + " seconds."
					+ " \nYour score is " + score);

		}

	}

	/**
	 * Implementation for mouse click handler. The mouse click coordinates are
	 * captured here in mcXPos, mcYPos.
	 */

	private class MouseClickHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			mcXPos = e.getX();
			mcYPos = e.getY();
			mouseClicked = true;
			repaint();

		}
	}

	/** The Main procedure. CatchTheDots2 object is created here */

	public static void main(String args[])
			throws java.net.MalformedURLException, java.io.IOException {
		new CatchBalls();
		callmeClip.loop();
	}

	// ************************************************************
	// This class handles timer events
	//
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == increment) {
			TimeCount++;
			gameTimeTextField.setText(Integer.toString(TimeCount)); // increment
																	// timer on
																	// display
			// JOptionPane.showMessageDialog(null, TimeCount);
		}
	}

	/** PlayAgain procedure. All the values are reinitialized here */

	public void playAgain() {

		reset();
		changeSizeAndSpeed();

		Thread tx = new Thread(this);
		tx.start();
		increment.start();
		repaint();

	}

	private void reset() {
		totalBalls = 6;
		adjustmentFactor += 2;
		ballsLeft = totalBalls;
		ballsCaught = 0;
		for (boolean flag : reverseX)
			flag = false;

		for (boolean flag : reverseY)
			flag = false;

		for (int i = 0; i < ballActive.length; i++)
			ballActive[i] = true;

		firstShow = true;
		mouseClicked = false;
		isFinished = false;
		ballsCaught = 0;
		startTime = System.currentTimeMillis();
		endTime = 0;
		TimeCount = 0;
		setCursor(appcursor);

	}

	private void changeSizeAndSpeed() {
		for (int i = 0; i < dotSize.length; i++) {
			if (dotSize[i] > 8)
				dotSize[i] -= 2;
			ballSpeed[i]++;
		}
	}

	/** The famous gridbag layout. Defines the controls, positions them */

	class GridPanel extends JPanel implements ActionListener {
		// private JTextField cardNumberTextField;
		private JButton acceptButton, exitButton;
		private JLabel cardTypeLabel, cardNumberLabel;

		public GridPanel() {

			// display panel
			// JPanel displayPanel = new JPanel();
			// displayPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

			setLayout(new GridBagLayout());

			Border loweredBorder = BorderFactory
					.createBevelBorder(BevelBorder.LOWERED);

			// Player Name Label
			playerLbl = new JLabel("Player");
			add(playerLbl, getConstraints(0, 1, 1, 1, GridBagConstraints.EAST));

			// Player's Name text field
			PlayerNameTextField = new JTextField(10);
			add(PlayerNameTextField,
					getConstraints(1, 1, 2, 1, GridBagConstraints.EAST));
			PlayerNameTextField.setEditable(false);

			// card type label
			cardTypeLabel = new JLabel("Score");
			add(cardTypeLabel,
					getConstraints(0, 2, 1, 1, GridBagConstraints.EAST));

			// card number text field
			cardNumberTextField = new JTextField(5);
			add(cardNumberTextField,
					getConstraints(1, 2, 2, 1, GridBagConstraints.WEST));
			cardNumberTextField.setEditable(false);

			// Game Time Lable
			gameTimeLbl = new JLabel("Game time");
			add(gameTimeLbl,
					getConstraints(0, 3, 1, 1, GridBagConstraints.EAST));

			// Player's Name text field
			gameTimeTextField = new JTextField(10);
			add(gameTimeTextField,
					getConstraints(1, 3, 2, 1, GridBagConstraints.EAST));
			gameTimeTextField.setEditable(false);

			// Instruction Button
			instructionButton = new JButton("Instruction");
			instructionButton.addActionListener(this);
			add(instructionButton,
					getConstraints(1, 4, 1, 1, GridBagConstraints.WEST));

			// Play Again Button
			playAgainButton = new JButton("Play Again");
			playAgainButton.addActionListener(this);
			add(playAgainButton,
					getConstraints(1, 5, 1, 1, GridBagConstraints.WEST));
			playAgainButton.setEnabled(false);

			// exit button
			exitButton = new JButton("  Exit ");
			exitButton.addActionListener(this);
			add(exitButton, getConstraints(1, 6, 1, 1, GridBagConstraints.WEST));

			// exit button
			aboutButton = new JButton("   About   ");
			aboutButton.addActionListener(this);
			add(aboutButton,
					getConstraints(1, 7, 1, 1, GridBagConstraints.WEST));
		}

		/** A method for setting grid bag constraints */

		private GridBagConstraints getConstraints(int gridx, int gridy,
				int gridwidth, int gridheight, int anchor) {
			GridBagConstraints c = new GridBagConstraints();
			c.insets = new Insets(5, 5, 5, 5);
			c.ipadx = 0;
			c.ipady = 0;
			c.gridx = gridx;
			c.gridy = gridy;
			c.gridwidth = gridwidth;
			c.gridheight = gridheight;
			c.anchor = anchor;
			return c;
		}

		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == exitButton) {
				JOptionPane.showMessageDialog(null, "Good bye!");
				System.exit(0);
			} else if (e.getSource() == instructionButton) {
				// --increment.stop();
				JOptionPane
						.showMessageDialog(
								null,
								"Move the mouse pointer around.\n When the mouse pointer is right on top of a moving dot \n Click the left mouse button to catch the dot. ");
			}

			else if (e.getSource() == aboutButton) {
				JOptionPane.showMessageDialog(null, "Catch the Dots\n\n"
						+ "Version 1.0.0\n\n"
						+ "Authors: Gana, Dung Tran, sudhakar"
						+ "\n\nHAVE FUN!");
			} else if (e.getSource() == playAgainButton) {
				// JOptionPane.showMessageDialog(null,"Play Again \n" );
				playAgainButton.setEnabled(false);
				playAgain();
			}

		} // end actionPerformed method

	}

}// End class CatchTheDots
