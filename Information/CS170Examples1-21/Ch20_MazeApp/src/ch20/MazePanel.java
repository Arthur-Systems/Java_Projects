package ch20;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;

/**
 * MazePanel is responsible for drawing the maze, the player piece, and moving the piece.
 */
public class MazePanel extends JPanel {
	int increment = 30; // column/row size for the maze
	int offset = 10;    // offset from the edge of the panel to improve asthetics
	Maze m = new Maze();  // create maze object
	Toolkit tk = Toolkit.getDefaultToolkit();  //create toolkit for importing images
	Image dog = tk.getImage("dog.jpg");        // import image for player piece
	int[] playerPos = m.getStart();     // create an integer array for holding players position, set it to starting position
	int[] Pos = {0,0};

	public MazePanel(){
		//Set Panel size
		this.setPreferredSize(new Dimension(620,620));
		this.setMinimumSize(new Dimension(620,620));
	}

	/*
	 * The paint method handles all drawing on the screen
	 * This method draws the background, then the player piece, then the maze
	 */
	public void clear()
	{
		m.clearPath();
	}
	public void paint(Graphics g1) {

		Graphics2D g = (Graphics2D) g1;   //  cast Graphics to Graphics2D
		Stroke stroke = new BasicStroke(2);
		g.setStroke(stroke);

		g.setColor(Color.lightGray);  //set draw color to light gray
		g.fillRect(0, 0, 620, 620);   // draw over last drawing (fixes some drawing bugs)
		g.clearRect(10,10,20*increment,20*increment);   // draw a rectangle with background color (white) for asthetics
		g.setColor(Color.green);    // set color to green
		g.fillRect(scale(m.getStart()[0]), scale(m.getStart()[1]), increment, increment); // draw start square
		g.setColor(Color.black);      //set draw color to black

		for (Pos[0] = 0; Pos[0] <= m.getSize()[0]; Pos[0]++) {      // for loop for all x positions
		for (Pos[1] = 0; Pos[1] <= m.getSize()[0]; Pos[1]++) {   // for loop for all y positions
					if (Pos[0] != 20){                     // checks if its the last position, prevents drawing of a line beyond the maze
					if (m.up(Pos))             // if theres a wall
						g.drawLine((scale(Pos[0])), (scale(Pos[1])), ((scale(Pos[0])) + increment), (scale(Pos[1]))); // draw the wall
				}
					if (Pos[1] != 20){                      // checks if its the last position, prevents drawing of a line beyond the maze
					if (m.left(Pos))           // if theres a wall
						g.drawLine((scale(Pos[0])), (scale(Pos[1])), (scale(Pos[0])), ((scale(Pos[1])) + increment)); // draw the wall
				}
					if (m.getPath(Pos)!=0)
					{
						//System.out.println( m.getPath(Pos) +" - "+ Pos[0]+" "+  Pos[1]);
						if (m.getPath(Pos)==1)g.setColor(Color.green);
						if (m.getPath(Pos)>=2)g.setColor(Color.red);
						g.fillRect((scale(Pos[0])+10), (scale(Pos[1])+10), increment-20, increment-20); // color Path Box
						g.setColor(Color.black);
					}



			}
		}

		//Draws finish flag in finish position
		for (int i = 0; i < increment; i+=10){
		for (int j = 0; j < increment; j+=10){
				g.fillRect(scale(m.getSize()[0])+i,   scale(m.getSize()[1])+j,   5, 5);
				g.fillRect(scale(m.getSize()[0])+i+5, scale(m.getSize()[1])+j+5, 5, 5);
			}
		}
		g.drawImage(dog, scale(playerPos[0])+5,scale(playerPos[1])+5, this); // draw player piece

	}
	/**
	 *  This method scales coordinates by increment and offset
	 */
	public int scale(int x){
		return x*increment+offset;
	}
	/**
	 *  This method resets the user position and redraws the maze
	 */
	public void reset(){
		m.clearPath();
		playerPos[0] 	=0;
		playerPos[1] 	=5;
		repaint();
	}
	/**
	 * This method checks if the user has gotten to the end
	 */
	public boolean finished(){
		if (playerPos[0] == m.getEnd()[0]&& playerPos[1] == m.getEnd()[1]  )
			return true;
		else
			return false;
	}
	/**
	 * This function accepts a character representing a move
	 * It checks if the player can move that way
	 * If they can, it moves the player piece and returns true
	 * if they cannot, it returns false
	 */
	public boolean move(char c) {
		int[] dogBox = {playerPos[0], playerPos[1]};

		if (c == 'w'){					// UP
			if (!m.up(dogBox)){
				playerPos[1]--;
				m.setPath(dogBox);
				repaint();
				return true;
			}else
				return false;
		}else if (c == 's'){			// DOWN
			if (!m.down(dogBox)){
				playerPos[1]++;
				m.setPath(dogBox);
				repaint();
				return true;
			}else
				return false;
		}else if (c == 'a'){			// LEFT
			if (!m.left(dogBox)){
				playerPos[0]--;
				m.setPath(dogBox);
				repaint();
				return true;
			}else
				return false;
		}else if (c == 'd'){			// RIGHT
			if (!m.right(dogBox)){
				playerPos[0]++;
				m.setPath(dogBox);
				repaint();
				return true;
			}else
				return false;
		}
		return false;
	}
		public boolean retreat(char c) {
		int[] retreatBox = {playerPos[0], playerPos[1]};
		int x=0;
		int y=0;

					if (c == 'w'){x=0;  y=1;}				// UP
			else 	if (c == 's'){x=0;  y=-1;}				// DOWN
			else 	if (c == 'a'){x=1;  y=0;}				// LEFT
			else 	if (c == 'd'){x=-1; y=0;}				// RIGHT
			retreatBox[0] += x;
			retreatBox[1] += y;
			m.setPath(retreatBox);			// Mark retreat square as visited twice, for path color

			//System.out.println ( playerPos[0]+ " " + playerPos[1]+ " " +  retreatBox[0] + " " + retreatBox[1]);
			return false;
		}

}