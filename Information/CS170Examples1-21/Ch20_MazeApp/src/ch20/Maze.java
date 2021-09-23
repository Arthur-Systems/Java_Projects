package ch20;
import java.util.*;

/*  class Maze implements a rectangular matrix using a three-dimensional
boolean matrix.
	Horizontal lines are identified by the left end point of the line segment;
	Vertical   lines are identified by the top  end point of the line segment.

	Boxes within the matrix are identified by the top, left corner of the box.

	The methods start and end give the starting and ending box coordinates for
	the maze.

	The methods up, down, left and right return true if a wall exists that
	would prevent movement in that direction for any given box.

	************************* internal structure  *************************************
	x-coordinate is positive to the right
	y-coordinate is positive pointing down
	the third coordinate is [0] for horizontal, [1] for vertical

	  (0,0)      (1,0)         mazearray[0][0][0]=true (there is an UP horzontal line at (0,0)
	  *-----UP---->*		   mazearray[0][0][1]=true (there is a LEFT vertical  line at (0,0)
	  |
	  |						   mazearray[1][0][1]=false(there is no RIGHT vertical line at (1,0)
	LEFT  Box(0,0) RIGHT
	  |
	  v
	  *----DOWN--->*		mazearray[0][1][0]=true (there is a DOWN horzontal line at (0,0)
	(0,1)		(1,1)
	******************************************************************************
	*  Version 0.9 - one 20 by 20 maze is hardcoded
	*  Later versions may generate random mazes.
	*  Version 1.0 - tested in MazePanel, box[] replaces xPos and yPos
	*  12/5/06 added size and getSize
	********************************************************************************/
public class Maze
{
	boolean [][][] mazearray = new boolean[21][21][3];   // 20 boxes require 21 rows & 21 cols
	int[][]	mazepath = new int[20][20]; //how many times each box was entered
	int[] startpoint 	= {0,4};    //initial 20x20
	int[] endpoint		= {19,19};  // ""
	int[] size			= {19,19};  // ""
	public Maze()
	{
		try
		{
		load20by20();
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println ("trapped!");
		}
	}

	// These four methods determine cursor movement is possible.
	public boolean up   (int[] box)	{ return mazearray[box[0]][box[1]  ][0]; }
	public boolean down (int[] box)	{ return mazearray[box[0]][box[1]+1][0]; }
	public boolean left (int[] box)	{ return mazearray[box[0]  ][box[1]][1]; }
	public boolean right(int[] box)	{ return mazearray[box[0]+1][box[1]][1]; }

	// Start and end points for the maze
	public int[]	getStart()	{	return startpoint;}
	public int[]	getEnd()	{	return endpoint;  }
	public int[]	getSize()	{	return size;  }

	// Set "traveled" status and get "previously traveled"
	public int setPath(int[] box)
	{
		int answer;
		answer=mazepath[box[0]][box[1]]++;
		//System.out.println("***" + box[0] + " - " + box[1] + ": " +answer +"**\n");
		return answer;
	}
	public int getPath(int[] box)	{ return mazepath[box[0]][box[1]]; }

	public void clearPath()	{
		for (int i=0;i<=size[0];i++){
		for (int j=0;j<=size[1];j++){
			mazepath[i][j]=0;
	}}
}






	public boolean[][][] getMazeArray()
	{
		return mazearray;
	}



	private void load20by20()
	{
		String[] stringmaze = string20by20();
		char character;
	  try
	  {

		for (int stringrow=0;stringrow <=40;stringrow+=2) // "__ " are the even rows
		{
			int y=stringrow / 2;
			//System.out.println(y + "--" + stringmaze[stringrow]);

			for (int x=0;x<=20;x++) // columns
			{
				mazearray[x][y][0]=(stringmaze[stringrow].charAt(x) != (' ') );
			}
		}
		for (int stringrow=1;stringrow <=41;stringrow+=2) // "|||" are the odd rows
		{
			int y=(stringrow-1)/2;

			//System.out.println(y + "--" + stringmaze[stringrow]);

			for (int x=0;x<=20;x++) // rows
			{
				mazearray[x][y][1]=(stringmaze[stringrow].charAt(x) != (' ') );
			}
		}


	  }
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println ("trapped! in load20by20");
		}
	}



	protected String[] string20by20()
	{
			startpoint[0] = 0;
			startpoint[1] = 5;

			endpoint[0] = 19;
			endpoint[1] = 19;

			size[0] = 19;
			size[1] = 19;

	String[]  stringmaze =
	{	"____________________ ",
		"|    | |      |     |",
		" ___    ___ _ __  _  ",
		"||| |||||  |||  |||||",
		"        _    __ _    ",
		"||||||||| |||  |  |||",
		"         __  _ ___   ",
		"|||||||||  |||     ||",
		"      _ __   ___ __  ",
		"|| |||     ||  | | ||",
		"  _  ______  _ __    ",
		"|| |||      | |   |||",
		" __   ____________   ",
		"|   | |            ||",
		" _____ ___________   ",
		"|      | |     |  |||",
		" _____   ___ _ __    ",
		"|||   |||    |    |||",
		"    _   __________   ",
		"|| |||||           ||",
		" __     ___________  ",
		"|   | ||| |   |     |",
		"______     __  _____ ",
		"|      ||||| |||  | |",
		" ______         _    ",
		"||  |  |||||||||| |||",
		"     _     _    __   ",
		"|||| | ||||  |||   ||",
		" _ ___    ___  ____  ",
		"| |   ||||    |     |",
		"   __    __________  ",
		"|||  |||||         ||",
		"  __  _   ______ _   ",
		"|||  |   |    | || ||",
		"  ___________ _  __  ",
		"||            | |   |",
		" _____________ _____ ",
		"||      |    |      |",
		" ____ _  ___ _____   ",
		"|     |  |         | ",
		"____________________ ",
		"                     "};

		return stringmaze;
	}
}



