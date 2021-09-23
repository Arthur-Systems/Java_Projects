package ch20;

//Demo: Use of fonts

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FontsColorsFrame extends JFrame {
	public FontsColorsFrame() {
		setTitle("Fonts Display");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int width = 500;
		int height = 485;
		setBounds((int) (d.width - width) / 2, (int) (d.height - height) / 2,
				width, height);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		FontsColorsPanel panel = new FontsColorsPanel();
		add(panel);
	}
}

public class FontsColorsFrameApp {
	public static void main(String[] args) {
		FontsColorsFrame frame = new FontsColorsFrame();
		frame.setVisible(true);
	}
}