package ch20fx;


/*********************************************************************************
 * Frame Class which sets the frame and gets the players information
 *It is used by GamePanel class
 *********************************************************************************/


import javafx.scene.media.AudioClip;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.net.*;

class GameFrame extends JFrame {
	String player = "";
	//AudioClip audioClip;
	URL audioUrl;

	/***************************************************************************************
    *  Function to center the frame
 	************************************************************************************/
	private void centerWindow(Window w) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
	}
	/***************************************************************************************
    *  gets player name and creates the main frame for the program to run in.
    *  Passes the player to the GamePanel
	************************************************************************************/

	public GameFrame() {
		player = JOptionPane.showInputDialog(null,"Enter your name: ");
		setTitle("Welcome "+ player +", play alphabet learning game");
		setSize(820,720);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new GamePanel(player);
		//PlaySound ps = new PlaySound("sounds/backgroundmusic.au");
		try {  
			
			File file = new File("C:\\sound\\undersea.mid"); //file location
			System.out.println("file: " + file);
			AudioClip myAudio = new AudioClip(file.toURI().toString());
			myAudio.setCycleCount(10);		//play 10 times
			myAudio.play();
	   }catch(Exception e){
            System.out.println(e.toString());
       }

		this.add(panel);
		centerWindow(this);
  }
}