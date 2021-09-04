package ch20;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;

/**
 * GamePanel is the main panel that houses:
 * 		1) MazePanel
 * 		2) Timer, score, moves, etc labels
 * 		3) Exit, Start/Stop buttons
 * 		4) Code for handling events such as:
 * 			a) Clicking start/stop
 * 			b) Moving the player piece (using w,a,s,d)
 *
 */

public class GamePanel extends JPanel {

		//Create variables
		Border etchedBorder = BorderFactory.createEtchedBorder(); // etched border for labels
		int retreats;  // holds retreats
		int bumps;     // holds "bumps" or, attempts to move through a wall
		int moves;     // holds moves
		boolean active;  // indicates whether or not the maze should be active
		char lastMove;
		int handicap;
		User[] highScoreData = new User[6];
		String[] highScoreDisplay = new String[5];
		User player, bob, joe, sally, james, mary;
		java.applet.AudioClip bumpSound, backgroundSound, winSound, startSound,	retreatSound;

		MazePanel mazePanel = new MazePanel();  // create maze panel that draws the maze

		JLabel jlHighScoreList = new JLabel("High Scores");
		JList highScoreList = new JList();
		JPanel highScorePanel = new JPanel();

		JLabel spacer = new JLabel(" ");       // spacers used to adjust the placement of objects in the pane
		JLabel spacer1 = new JLabel(" ");
		JLabel spacer2 = new JLabel(" ");
		JLabel spacer3 = new JLabel(" ");

		JPanel timerPanel = new JPanel();     // Timer panel
		JLabel jlTimer = new JLabel("0");     // Timer display label
		JLabel jlTimerLabel = new JLabel(" Timer");  // Timer description label

		JLabel jlRetreatLabel = new JLabel("Retreats"); //description
		JLabel jlRetreat = new JLabel("0");             //display
		JPanel retreatPanel = new JPanel();             //panel

		JLabel jlMovesLabel = new JLabel(" Moves");     //description
		JLabel jlMoves = new JLabel("0");               //display
		JPanel movesPanel = new JPanel();               //panel

		JLabel jlBumpsLabel = new JLabel(" Bumps");     //description
		JLabel jlBumps = new JLabel("0");               //display
		JPanel bumpsPanel = new JPanel();               //panel

		JLabel jlScoreLabel = new JLabel(" Score");     //description
		JLabel jlScore = new JLabel("0");               //display
		JPanel scorePanel = new JPanel();               //panel

		JButton jbStartStop = new JButton("Start");    //Start/stop button
		JButton jbExit = new JButton("Exit");          //Exit button

		Thread timer = new Thread(new Timer(jlTimer));   //Thread that counts seconds and updates
														 //  jlTimer with the current time every 250ms

		public GamePanel(){
			setLayout(new GridBagLayout());                  //Layout
			this.setPreferredSize(new Dimension(850,620));   //Set size
			jbStartStop.addKeyListener(new MoveListener());  //Adds keylistener for start/stop button
			jbExit.addKeyListener(new MoveListener());       //adds keylistener for exit button

			//set user objects with data to display on the high scores list
			bob = new User("Robert", 8);
			joe = new User("Joe", 6);
			sally = new User("Sally", 9);
			james = new User("James", 5);
			mary = new User("Mary", 10);
			bob.setScore(1200);
			joe.setScore(1100);
			sally.setScore(1000);
			james.setScore(900);
			mary.setScore(800);

			//add user objects to the highScoreData array and sort it
			highScoreData[0] = bob;
			highScoreData[1] = joe;
			highScoreData[2] = sally;
			highScoreData[3] = james;
			highScoreData[4] = mary;
			for (int i = 0; i < 5; i++){
				highScoreDisplay[i] = highScoreData[i].toString();
			}

			//set the source file for each sound
			try{
				bumpSound = java.applet.Applet.newAudioClip(new java.net.URL("file:sounds//doh.au"));
				backgroundSound = java.applet.Applet.newAudioClip(new java.net.URL("file:sounds//background.au"));
				winSound = java.applet.Applet.newAudioClip(new java.net.URL("file:sounds//win.au"));
				startSound = java.applet.Applet.newAudioClip(new java.net.URL("file:sounds//start.au"));
				retreatSound = java.applet.Applet.newAudioClip(new java.net.URL("file:sounds//retreat.au"));
			}
			catch (MalformedURLException e){System.out.println("FAILED TO LOAD MUSIC");}

			//define variables
			retreats = 0;
			bumps = 0;
			moves = 0;
			active = false;
			lastMove = 'd';
			handicap = 0;
			player = new User("", 0);

			highScoreList.setListData(highScoreDisplay);

			highScorePanel.setBorder(etchedBorder);
			highScoreList.setMinimumSize(new Dimension(165,100));
			highScoreList.setPreferredSize(new Dimension(165,100));
			highScorePanel.add(highScoreList);


			//set font size, which affects the label size
			spacer.setFont(new Font("Courier", Font.PLAIN,12));
			spacer1.setFont(new Font("Courier", Font.PLAIN,12));
			spacer2.setFont(new Font("Courier", Font.PLAIN,12));
			spacer3.setFont(new Font("Courier", Font.PLAIN,20));

			//adjust Timer label settings, and add jlTimer to timerPanel
			jlTimer.setFont(new Font("Courier", Font.PLAIN,30));
			jlTimerLabel.setFont(new Font("Courier", Font.PLAIN,20));
			timerPanel.setBorder(etchedBorder);
			timerPanel.setMinimumSize(new Dimension(90, 55));
			timerPanel.add(jlTimer);

			//adjust Retreat label settings, and add jlRetreat to retreatPanel
			jlRetreat.setFont(new Font("Courier", Font.PLAIN,30));
			jlRetreatLabel.setFont(new Font("Courier", Font.PLAIN,20));
			retreatPanel.setBorder(etchedBorder);
			retreatPanel.setMinimumSize(new Dimension(90, 55));
			retreatPanel.add(jlRetreat);

			//adjust Moves label settings, and add jlMoves to movesPanel
			jlMoves.setFont(new Font("Courier", Font.PLAIN,30));
			jlMovesLabel.setFont(new Font("Courier", Font.PLAIN,20));
			movesPanel.setBorder(etchedBorder);
			movesPanel.setMinimumSize(new Dimension(90, 55));
			movesPanel.add(jlMoves);

			//adjust Bumps label settings, and add jlBumps to bumpsPanel
			jlBumps.setFont(new Font("Courier", Font.PLAIN,30));
			jlBumpsLabel.setFont(new Font("Courier", Font.PLAIN,20));
			bumpsPanel.setBorder(etchedBorder);
			bumpsPanel.setMinimumSize(new Dimension(90, 55));
			bumpsPanel.add(jlBumps);

			//adjust Score label settings, and add jlScore to scorePanel
			jlScore.setFont(new Font("Courier", Font.PLAIN,30));
			jlScoreLabel.setFont(new Font("Courier", Font.PLAIN,20));
			scorePanel.setBorder(etchedBorder);
			scorePanel.setMinimumSize(new Dimension(90, 55));
			scorePanel.add(jlScore);

			//Add components to the panel
			/*                  GridBag Column numbers
			 *  |-------------0------------|--1--|--2--|--3--|--4--|
			 * |----------------------------------------------------|
			 * ||-------------------------| --------spacer--------- |  0    Grid
			 * ||                         | jlTimerLab    jlTimer   |  1   Bag
			 * ||                         | jlRetreatl   jlRetreat  |  2   Rows
			 * ||                         | jlMovesLab    jlMoves   |  3
			 * ||           Maze          | jlBumpsLab    jlBumps   |  4
			 * ||                         | jlScoreLab    jlScore   |  5
			 * ||                         |  -------spacer1-------- |  6
			 * ||                         | spac2 jbSt  jbExi       |  7
			 * ||-------------------------|                         |
			 * |----------------------------------------------------|
			 *        jlTimerLab == jlTimerLabel
			 *        spac2 = spacer2
			 *        jbSt = jbStartStop
			 *        jbExi = jbExit
			 *
			 *        getConstraints format is (column, row, # col wide, # row tall, anchorpoint)
			 */
			//Column 0
			this.add(mazePanel, getConstraints(0,0,1,12,GridBagConstraints.WEST));

			//Row 0
			this.add(spacer, getConstraints(2,0,2,1,GridBagConstraints.WEST));

			this.add(jlHighScoreList, getConstraints(2,1,2,1,GridBagConstraints.WEST));

			this.add(highScorePanel, getConstraints(2,2,2,1,GridBagConstraints.WEST));

			this.add(spacer1, getConstraints(2,3,2,1,GridBagConstraints.WEST));

			//Row 1
			this.add(jlTimerLabel, getConstraints(1,4,2,1,GridBagConstraints.WEST));
			this.add(timerPanel, getConstraints(3,4,2,1,GridBagConstraints.WEST));

			//Row 2
			this.add(jlRetreatLabel, getConstraints(1,5,2,1,GridBagConstraints.WEST));
			this.add(retreatPanel, getConstraints(3,5,2,1,GridBagConstraints.WEST));

			//Row 3
			this.add(jlMovesLabel, getConstraints(1,6,2,1,GridBagConstraints.WEST));
			this.add(movesPanel, getConstraints(3,6,2,1,GridBagConstraints.WEST));

			//Row 4
			this.add(jlBumpsLabel, getConstraints(1,7,2,1,GridBagConstraints.WEST));
			this.add(bumpsPanel, getConstraints(3,7,2,1,GridBagConstraints.WEST));

			//Row 5
			this.add(jlScoreLabel, getConstraints(1,8,2,1,GridBagConstraints.WEST));
			this.add(scorePanel, getConstraints(3,8,2,1,GridBagConstraints.WEST));

			//Row 6
			this.add(spacer2, getConstraints(1,9,4,1,GridBagConstraints.WEST));

			//Row 7
			this.add(jbStartStop, getConstraints(2,10,1,1,GridBagConstraints.WEST));
			this.add(spacer3, getConstraints(1,10,1,1,GridBagConstraints.WEST));
			this.add(jbExit, getConstraints(3,10,1,1,GridBagConstraints.WEST));

			//Add action listeners for key presses
			jbStartStop.addActionListener(new StartStopListener());
			jbExit.addActionListener(new ExitListener());
		}

		/**
		 * This method prompts the user for their name and age, then activates the maze
		 *
		 */
		public void startMaze(){
			mazePanel.reset();
			mazePanel.clear();
			resetCounters();
			player = new User(Validator.getValidName("Please Enter Your Name"), Validator.getIntInRange("Please Enter Your Age", 1, 100));

			if ( player.getAge() <= 6 )
				handicap = 20;
			else if ( player.getAge() <= 10)
				handicap = 15;
			else
				handicap = 10;
			startSound.play();
			JOptionPane.showMessageDialog(null, "Ready? Set? GO!");
			jbStartStop.setText("Stop");
			startTimer();  //Starts a new Timer thread
			active = true; // activates the actionlisteners
			backgroundSound.loop();
		}

		/**
		 * This method is called when the user makes it to the end of the maze.
		 * It calculates the score and de-activates the maze
		 */
		public void win(){
			player.setScore((200 + (60 - Integer.parseInt(jlTimer.getText())) - moves - (bumps*2) - (retreats*2)) * handicap);
			jlScore.setText(Integer.toString(player.getScore()));
			stopMaze();
			winSound.play();
			addToHighScoreList();
		}
		public void addToHighScoreList(){
			highScoreData[5] = player;
			Arrays.sort(highScoreData);
			for (int i = 0; i < 5; i++){
				highScoreDisplay[i] = highScoreData[i].toString();
			}
			highScoreList.removeAll();
			highScoreList.setListData(highScoreDisplay);
		}

		/**
		 * This method stops the timer thread, resets the user position on the maze, disables the action listener and stops the background sound
		 */
		public void stopMaze(){
			timer.interrupt();
			jbStartStop.setText("Start");
			active = false;
			backgroundSound.stop();
		}

		/**
		 * This method creates a new Timer thread and starts it
		 */
		public void startTimer(){
			timer = new Thread(new Timer(jlTimer));
			timer.start();
		}
		public void checkRetreat(char key)
		{
			boolean retflag=false;
			switch (lastMove)
			{
				case 'w': if (key == 's')retflag=true; break;
				case 's': if (key == 'w')retflag=true; break;
				case 'a': if (key == 'd')retflag=true; break;
				case 'd': if (key == 'a')retflag=true; break;

			}
			System.out.println ( lastMove + " " + key + " " +  retflag );
			if (retflag)
			{
				retreats++;
				retreatSound.play();
				mazePanel.retreat(key);
				jlRetreat.setText(Integer.toString(retreats));
			}
			lastMove = key;
		}


		/**
		 * This method resets labels and counters
		 */
		public void resetCounters(){
			timer.interrupt();
			jlTimer.setText("0");
			jlRetreat.setText("0");
			retreats = 0;
			jlBumps.setText("0");
			bumps = 0;
			jlMoves.setText("0");
			moves = 0;
			jlScore.setText("0");
			lastMove = 'f'; //resets last move to "left" so a retreat is not caused at the start of a game
		}

		/**
		 * This method creats a GridBagConstraints object based on the input
		 *
		 * @param gridx An integer that represents the starting column for this object to be placed
		 * @param gridy An integer that represents the starting row for this object to be placed
		 * @param gridwidth An integer that represents how many columns it will fill
		 * @param gridheight An integer that represents how many rows it will fill
		 * @param anchor An integer that represents where the anchor is for the object
		 * @return A GridBagConstraints object to be used to add an object to a panel using GridBagLayout
		 */
		private GridBagConstraints getConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor)
		{
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

	/**
	 * This class listens for a click of the Start/Stop button
	 */
	class StartStopListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (active == false){
				startMaze();
			}
			else{
				stopMaze();
			}

		}
	}
	/**
	 * This class listens for a click of the Exit button
	 */
	class ExitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	/**
	 * This class listens for a key press.  It then verifies that the maze is active
	 * Then it verifies the key pressed matches either "w", "a", "s", or "d" (arrow keys are also able to be used)
	 * Then it checks with the MazePanel object to verify if a move in that direction can be made
	 * Depending on the response, it either increments "moves" or "bumps", the MazePanel handles the actual move
	 * It then checks to see if you have won, if so it calls the win() method
	 */
	class MoveListener implements KeyListener {
		public void keyTyped (KeyEvent e){
			if (active == true){
				if (e.getKeyChar() == 's' || e.getKeyChar() == 'w' || e.getKeyChar() == 'a' || e.getKeyChar() == 'd'){
					if (!mazePanel.move(e.getKeyChar())){
						bumps++;
						jlBumps.setText(Integer.toString(bumps));
						bumpSound.play();
					}else{
						moves++;
						jlMoves.setText(Integer.toString(moves));
						checkRetreat(e.getKeyChar());
					}
				}
				if (mazePanel.finished()){
					win();
					JOptionPane.showMessageDialog(null, "You Won!");
				}

			}
		}
		public void keyPressed (KeyEvent e)
		{
		  if (active == true){

			char keychar=(char)0;

			if (e.getKeyCode() == KeyEvent.VK_UP) 	 keychar='w';
			if (e.getKeyCode() == KeyEvent.VK_DOWN)  keychar='s';
			if (e.getKeyCode() == KeyEvent.VK_LEFT)  keychar='a';
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) keychar='d';

			if	(keychar!=(char)0)
			{
					if (!mazePanel.move(keychar))
					{
						bumps++;
						jlBumps.setText(Integer.toString(bumps));
						bumpSound.play();
					}else
					{
						moves++;

						jlMoves.setText(Integer.toString(moves));
						checkRetreat(keychar);
					}
			}
			if (mazePanel.finished()){
					win();
					JOptionPane.showMessageDialog(null, "You Won!");

			}
	  	  }
		}
		public void keyReleased (KeyEvent e){}
	}
}