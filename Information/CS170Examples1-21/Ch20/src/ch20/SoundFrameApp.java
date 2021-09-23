package ch20;

//package ch20;
//Demo: Play sound clip in a frame

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;

class SoundFrame extends JFrame {
	SoundFrame() {
		JPanel soundPanel = new SoundPanel(); // Create the panel
		add(soundPanel); // Register
		setTitle("Sound Play Frame");
		setSize(250, 80);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
	}

	private void centerWindow(JFrame frame) { // Display at the center
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int centeredWidth = ((int) d.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int) d.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}

public class SoundFrameApp {
	public static void main(String[] args) {
		JFrame frame = new SoundFrame();
		frame.setVisible(true);
	}
}

class SoundPanel extends JPanel implements ActionListener { // Event handling
	JButton playButton, stopButton; // Declare buttons
	String musicName; // Declare file name
	AudioClip music;
	URL localUrl; // Declare url

	SoundPanel() {
		playButton = new JButton("Play"); // Create the button
		add(playButton);
		playButton.addActionListener(this);
		stopButton = new JButton("Stop");
		add(stopButton);
		stopButton.addActionListener(this);
		musicName = "sounds\\event.au"; // The path of the file
		try {
			localUrl = new URL("file:" + new File(".").getCanonicalPath()
					+ "\\" + musicName);
			music = Applet.newAudioClip(localUrl); // Get the music object
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent e) { // Event handling
		Object source = e.getSource();
		if (source == playButton)
			music.loop(); // Loop
		else if (source == stopButton)
			music.stop(); // Stop
	}
}
