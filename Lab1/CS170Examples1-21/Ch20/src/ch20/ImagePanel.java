 package ch20;

//package ch20;

import javax.swing.*;
import java.awt.*;
import java.net.*;

class ImagePanel extends JPanel {
	Toolkit tk; // Declare
	Image flowers, myPhoto, javaLogo;
	URL imageUrl;

	public ImagePanel() { // Constructor
		tk = Toolkit.getDefaultToolkit();
		flowers = tk.createImage("flowers.gif"); // From the current folder
		myPhoto = tk.getImage("images//ygao.jpg"); // From the subfolder
		try {
			// Image from a website
			imageUrl = new URL("http://img9.3lian.com/c1/vector2/03/07/03.jpg");
			javaLogo = tk.getImage(imageUrl);
		} catch (MalformedURLException e) {
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(flowers, 0, 0, this); // Display
		gg.drawImage(myPhoto, 265, 5, this);
		gg.drawImage(javaLogo, 480, 0, this);

	}
}
