package ch20;
import javax.swing.*;
import java.awt.*;

/**
 * Maze Frame houses the GamePanel
 */

public class MazeFrame extends JFrame {
	public MazeFrame() {

		setTitle("Maze Game"); //Set Title
		//setResizable(false);  //Disable resizing
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit on close
		setLayout(new BorderLayout()); // Border layout manager

		JPanel gamePanel = new GamePanel(); //Create panel to house the maze
		add(gamePanel, BorderLayout.CENTER); // Add panel

		this.pack(); // resize frame to match panels size
	}
}