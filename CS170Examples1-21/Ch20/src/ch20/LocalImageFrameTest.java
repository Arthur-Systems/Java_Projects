package ch20;

//Demo: driver class for LocalImagePanel

//package ch20;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LocalImageFrameTest extends JFrame {
	public LocalImageFrameTest() throws Exception {
		setTitle("Image display");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int width = 435;
		int height = 240;
		setBounds((int) (d.width - width) / 2, (int) (d.height - height) / 2,
				width, height);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		JPanel panel = new LocalImagePanel();
		add(panel);
	}

	public static void main(String[] args) throws Exception {
		JFrame frame = new LocalImageFrameTest();
		frame.setVisible(true);
	}
}