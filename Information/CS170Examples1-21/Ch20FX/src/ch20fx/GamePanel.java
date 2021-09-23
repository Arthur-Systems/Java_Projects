package ch20fx;

/*********************************************************************************
 * GamePanel class creates all the buttons for the game including
 * start, stop, next game, and 26 alphabet letters
 * This class also has methods to listen to mouse and keyboard.
 *
 *********************************************************************************/

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.applet.*;

class GamePanel extends JPanel implements ActionListener {
	long totalLetters;
	int  rightButton = 0,
	     wrongButton = 0;

	String player;
	public GameLetterPanel gp;
	private JTextArea letterTextArea;
	private JTextField rightButtonTextField,
					   wrongButtonTextField;
	private JLabel rightClickLabel,
				   wrongClickLabel;

	private JButton aButton,
					bButton,
					cButton,
					dButton,
					eButton,
					fButton,
					gButton,
					hButton,
					iButton,
					jButton,
					kButton,
					lButton,
					mButton,
					nButton,
					oButton,
					pButton,
					qButton,
					rButton,
					sButton,
					tButton,
					uButton,
					vButton,
					wButton,
					xButton,
					yButton,
					zButton,
					startButton,
					scoreButton,
					quitButton,
					stopGameButton;

	private AudioClip audioClip;
			URL audioUrl;


	public GamePanel(String player) {
		this.player = player;
		this.setLayout(new BorderLayout());
		// start, next game, quit button
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.white);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		startButton = new JButton("Start", new ImageIcon("images/play.gif"));
		startButton.addActionListener(this);
		buttonPanel.add(startButton);

		stopGameButton = new JButton("Stop", new ImageIcon("images/stop.gif"));
		stopGameButton.addActionListener(this);
		buttonPanel.add(stopGameButton);

		quitButton = new JButton( "Quit",new ImageIcon("images/Shutdown.gif"));
		quitButton.addActionListener(this);
		buttonPanel.add(quitButton);

		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(Color.white);
		scorePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(scorePanel);

		rightClickLabel = new JLabel("Right: ");
		scorePanel.add(rightClickLabel);

		rightButtonTextField = new JTextField(3);
		rightButtonTextField.setEditable(false);
		rightButtonTextField.setFocusable(false);
		scorePanel.add(rightButtonTextField);

		wrongClickLabel = new JLabel("Wrong: ");
		scorePanel.add(wrongClickLabel);


		wrongButtonTextField = new JTextField(3);
		wrongButtonTextField.setEditable(false);
		wrongButtonTextField.setFocusable(false);
		scorePanel.add(wrongButtonTextField);

		this.add(buttonPanel, BorderLayout.NORTH);

		// letters panel display 26 letters
		JPanel lettersPanel = new JPanel();
		lettersPanel.setBackground(Color.white);
		lettersPanel.setLayout(new BorderLayout());

		JPanel firstPanel = new JPanel(); // hold 8 letters
		firstPanel.setBackground(Color.white);
		JPanel secondPanel = new JPanel(); // hold 9 letters
		secondPanel.setBackground(Color.white);
		JPanel thirdPanel = new JPanel();  // hold 9 letters
		thirdPanel.setBackground(Color.white);

		aButton = new JButton(new ImageIcon("images/a.gif"));
		bButton = new JButton(new ImageIcon("images/b.gif"));
		cButton = new JButton(new ImageIcon("images/c.gif"));
		dButton = new JButton(new ImageIcon("images/d.gif"));
		eButton = new JButton(new ImageIcon("images/e.gif"));
		fButton = new JButton(new ImageIcon("images/f.gif"));
		gButton = new JButton(new ImageIcon("images/g.gif"));
		hButton = new JButton(new ImageIcon("images/h.gif"));
		iButton = new JButton(new ImageIcon("images/i.gif"));
		jButton = new JButton(new ImageIcon("images/j.gif"));
		kButton = new JButton(new ImageIcon("images/k.gif"));
		lButton = new JButton(new ImageIcon("images/l.gif"));
		mButton = new JButton(new ImageIcon("images/m.gif"));
		nButton = new JButton(new ImageIcon("images/n.gif"));
		oButton = new JButton(new ImageIcon("images/o.gif"));
		pButton = new JButton(new ImageIcon("images/p.gif"));
		qButton = new JButton(new ImageIcon("images/q.gif"));
		rButton = new JButton(new ImageIcon("images/r.gif"));
		sButton = new JButton(new ImageIcon("images/s.gif"));
		tButton = new JButton(new ImageIcon("images/t.gif"));
		uButton = new JButton(new ImageIcon("images/u.gif"));
		vButton = new JButton(new ImageIcon("images/v.gif"));
		wButton = new JButton(new ImageIcon("images/w.gif"));
		xButton = new JButton(new ImageIcon("images/x.gif"));
		yButton = new JButton(new ImageIcon("images/y.gif"));
		zButton = new JButton(new ImageIcon("images/z.gif"));

		firstPanel.add(aButton);
		firstPanel.add(bButton);
		firstPanel.add(cButton);
		firstPanel.add(dButton);
		firstPanel.add(eButton);
		firstPanel.add(fButton);
		firstPanel.add(gButton);
		firstPanel.add(hButton);


		secondPanel.add(iButton);
		secondPanel.add(jButton);
		secondPanel.add(kButton);
		secondPanel.add(lButton);
		secondPanel.add(mButton);
		secondPanel.add(nButton);
		secondPanel.add(oButton);
		secondPanel.add(pButton);
		secondPanel.add(qButton);

		thirdPanel.add(rButton);
		thirdPanel.add(sButton);
		thirdPanel.add(tButton);
		thirdPanel.add(uButton);
		thirdPanel.add(vButton);
		thirdPanel.add(wButton);
		thirdPanel.add(xButton);
		thirdPanel.add(yButton);
		thirdPanel.add(zButton);

		lettersPanel.add(firstPanel, BorderLayout.NORTH);
		lettersPanel.add(secondPanel, BorderLayout.CENTER);
		lettersPanel.add(thirdPanel, BorderLayout.SOUTH);

        //change the size of the alphabet Letters and stopGameButton
		aButton.setPreferredSize(new java.awt.Dimension(50, 50));
		bButton.setPreferredSize(new java.awt.Dimension(50, 50));
		cButton.setPreferredSize(new java.awt.Dimension(50, 50));
		dButton.setPreferredSize(new java.awt.Dimension(50, 50));
		eButton.setPreferredSize(new java.awt.Dimension(50, 50));
		fButton.setPreferredSize(new java.awt.Dimension(50, 50));
		gButton.setPreferredSize(new java.awt.Dimension(50, 50));
		hButton.setPreferredSize(new java.awt.Dimension(50, 50));
		iButton.setPreferredSize(new java.awt.Dimension(50, 50));
		jButton.setPreferredSize(new java.awt.Dimension(50, 50));
		kButton.setPreferredSize(new java.awt.Dimension(50, 50));
		lButton.setPreferredSize(new java.awt.Dimension(50, 50));
		mButton.setPreferredSize(new java.awt.Dimension(50, 50));
		nButton.setPreferredSize(new java.awt.Dimension(50, 50));
		oButton.setPreferredSize(new java.awt.Dimension(50, 50));
		pButton.setPreferredSize(new java.awt.Dimension(50, 50));
		qButton.setPreferredSize(new java.awt.Dimension(50, 50));
		rButton.setPreferredSize(new java.awt.Dimension(50, 50));
		sButton.setPreferredSize(new java.awt.Dimension(50, 50));
		tButton.setPreferredSize(new java.awt.Dimension(50, 50));
		uButton.setPreferredSize(new java.awt.Dimension(50, 50));
		vButton.setPreferredSize(new java.awt.Dimension(50, 50));
		wButton.setPreferredSize(new java.awt.Dimension(50, 50));
		xButton.setPreferredSize(new java.awt.Dimension(50, 50));
		yButton.setPreferredSize(new java.awt.Dimension(50, 50));
		zButton.setPreferredSize(new java.awt.Dimension(50, 50));

		stopGameButton.setPreferredSize(new java.awt.Dimension(120, 40));

        // add listener to the buttons
		this.add(lettersPanel, BorderLayout.SOUTH);

		aButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "A");	// compare dropping letter with button leter
						}
				}
			);
			bButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "B");
					}
				}
			);
			cButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "C");
					}
				}
			);
			dButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "D");	// compare dropping letter with button leter
					}
				}

			);
			eButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "E");
					}
				}
			);
			fButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "F");
					}
				}
			);
			gButton.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "G");	// compare dropping letter with button leter
					}
				}

			);
			hButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "H");
					}
				}
			);
			iButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "I");
					}
				}
			);
			jButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "J");	// compare dropping letter with button leter
					}
				}

			);
			kButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "K");
					}
				}
			);
			lButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String rl = gp.getLetter();
									matchingLetter(rl, "L");
								}
							}
			);
			mButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "M");
					}
				}
			);
			nButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "N");	// compare dropping letter with button leter
					}
				}
			);
			oButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "O");
					}
				}
			);
			pButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "P");
					}
				}
			);
			qButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "Q");	// compare dropping letter with button leter
					}
				}

			);
			rButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "R");
					}
				}
			);
			sButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "S");
					}
				}
			);
			tButton.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "t");	// compare dropping letter with button leter
					}
				}

			);
			uButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "U");
					}
				}
			);
			vButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "V");
					}
				}
			);
			wButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); // get random dropping letter
						matchingLetter(rl, "W");	// compare dropping letter with button leter
					}
				}
			);
			xButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "X");
					}
				}
			);
			yButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "Y");
					}
				}
			);
			zButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "Z");
					}
				}
			);


			// add keyboard Listeners for each button through keyStup function
			keySetup(aButton);
			keySetup(bButton);
			keySetup(cButton);
			keySetup(dButton);
			keySetup(eButton);
			keySetup(fButton);
			keySetup(gButton);
			keySetup(hButton);
			keySetup(iButton);
			keySetup(jButton);
			keySetup(kButton);
			keySetup(lButton);
			keySetup(mButton);
			keySetup(nButton);
			keySetup(oButton);
			keySetup(pButton);
			keySetup(qButton);
			keySetup(rButton);
			keySetup(sButton);
			keySetup(tButton);
			keySetup(uButton);
			keySetup(vButton);
			keySetup(wButton);
			keySetup(xButton);
			keySetup(yButton);
			keySetup(zButton);
			keySetup(startButton);
			keySetup(quitButton);

		// display panel will display dropping letter or photos of alphabets....
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.white);
		displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		// letter text field
		letterTextArea = new JTextArea(300,40);
		letterTextArea.setBackground(Color.white);
		letterTextArea.disable();
		displayPanel.add(letterTextArea);
		this.add(displayPanel, BorderLayout.CENTER);
	}
	/*
		method: matchingLetter
		purpose: compare dropping letter and button letter that the user selected
				 display message when matching or mismatch
	*/
	public void matchingLetter(String droppingLetter, String buttonLetter) {
		if(droppingLetter.equalsIgnoreCase(buttonLetter)) {
			//PlaySound ps = new PlaySound("sounds/backgroundmusic.au");
			//PlaySound ps = new PlaySound("sounds/cheer.wav");

			try {
					   audioUrl=new URL("file:" + new File(".").getCanonicalPath()
					                                 + "//sounds//cheer.wav");

			           audioClip=Applet.newAudioClip(audioUrl);
			           audioClip.play();
				   }catch(Exception e){
			            System.out.println(e.toString());
			       }

			JOptionPane.showMessageDialog(null, "You got It");
			rightButton += 1;
			rightButtonTextField.setText(Integer.toString(rightButton));
			Object source = startButton;
		}
		else {
			//PlaySound ps = new PlaySound("sounds/error.wav");

			try {
					   audioUrl=new URL("file:" + new File(".").getCanonicalPath()
					                                 + "//sounds//error.wav");

			           audioClip=Applet.newAudioClip(audioUrl);
			           audioClip.play();
				   }catch(Exception e){
			            System.out.println(e.toString());
			       }

			JOptionPane.showMessageDialog(null, "Wrong Letter");
			wrongButton += 1;
			wrongButtonTextField.setText(Integer.toString(wrongButton));
		}
	}

	/*
		method: ActionPerformed
		purpose: listen to buttons
	*/
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == quitButton) {
			System.exit(0);
		}
		else if (source == stopGameButton) {
			gp.stop();
			JOptionPane.showMessageDialog(null, "Thank you " + player + " for playing this game. Your Score is "
											+ rightButton + " right and " + wrongButton + " wrong out of "
											+ GameLetterPanel.nLetterDropped + " letters");
			GameLetterPanel.nLetterDropped = 0;
			rightButton = 0;
			wrongButton = 0;
			rightButtonTextField.setText(Integer.toString(rightButton));
			wrongButtonTextField.setText(Integer.toString(wrongButton));
		}

		/****************************************************
		* Start the game and resets the buttons to 0
		*
		*****************************************************/
		else if (source == startButton) {
			rightButton = 0;
			wrongButton = 0;
			rightButtonTextField.setText(Integer.toString(rightButton));
			wrongButtonTextField.setText(Integer.toString(wrongButton));
			gp = new GameLetterPanel();
			JPanel displayPanel = gp;
			displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			this.add(displayPanel, BorderLayout.CENTER);
			Font f = new Font("SansSerif", Font.BOLD, 48);
			letterTextArea.setFont(f);
		}
    }

	 /***************************************************************************************
     * Assign  the <code> Component</code> keyListener to call matchLetter() with the associated letter
     * @param <code> Component </code> for any Component in the GamePanel
     ************************************************************************************/
	public void keySetup(Component theCandidate){
		 theCandidate.addKeyListener( new KeyAdapter() {
		      public void keyPressed( KeyEvent ke ) {
		        if (ke.getKeyCode()==ke.VK_A){matchingLetter(gp.getLetter(), "A");}
		        else if (ke.getKeyCode()==ke.VK_B){matchingLetter(gp.getLetter(), "B");}
		        else if (ke.getKeyCode()==ke.VK_C){matchingLetter(gp.getLetter(), "C");}
		        else if (ke.getKeyCode()==ke.VK_D){matchingLetter(gp.getLetter(), "D");}
		        else if (ke.getKeyCode()==ke.VK_E){matchingLetter(gp.getLetter(), "E");}
		        else if (ke.getKeyCode()==ke.VK_F){matchingLetter(gp.getLetter(), "F");}
		        else if (ke.getKeyCode()==ke.VK_G){matchingLetter(gp.getLetter(), "G");}
		        else if (ke.getKeyCode()==ke.VK_H){matchingLetter(gp.getLetter(), "H");}
		        else if (ke.getKeyCode()==ke.VK_I){matchingLetter(gp.getLetter(), "I");}
		        else if (ke.getKeyCode()==ke.VK_J){matchingLetter(gp.getLetter(), "J");}
		        else if (ke.getKeyCode()==ke.VK_K){matchingLetter(gp.getLetter(), "K");}
		        else if (ke.getKeyCode()==ke.VK_L){matchingLetter(gp.getLetter(), "L");}
		        else if (ke.getKeyCode()==ke.VK_M){matchingLetter(gp.getLetter(), "M");}
		        else if (ke.getKeyCode()==ke.VK_N){matchingLetter(gp.getLetter(), "N");}
		        else if (ke.getKeyCode()==ke.VK_O){matchingLetter(gp.getLetter(), "O");}
		        else if (ke.getKeyCode()==ke.VK_P){matchingLetter(gp.getLetter(), "P");}
		        else if (ke.getKeyCode()==ke.VK_Q){matchingLetter(gp.getLetter(), "Q");}
		        else if (ke.getKeyCode()==ke.VK_R){matchingLetter(gp.getLetter(), "R");}
		        else if (ke.getKeyCode()==ke.VK_S){matchingLetter(gp.getLetter(), "S");}
		        else if (ke.getKeyCode()==ke.VK_T){matchingLetter(gp.getLetter(), "T");}
		        else if (ke.getKeyCode()==ke.VK_U){matchingLetter(gp.getLetter(), "U");}
		        else if (ke.getKeyCode()==ke.VK_V){matchingLetter(gp.getLetter(), "V");}
		        else if (ke.getKeyCode()==ke.VK_W){matchingLetter(gp.getLetter(), "W");}
		        else if (ke.getKeyCode()==ke.VK_X){matchingLetter(gp.getLetter(), "X");}
		        else if (ke.getKeyCode()==ke.VK_Y){matchingLetter(gp.getLetter(), "Y");}
		        else if (ke.getKeyCode()==ke.VK_Z){matchingLetter(gp.getLetter(), "Z");};
		      };
		    } );
	}
}
