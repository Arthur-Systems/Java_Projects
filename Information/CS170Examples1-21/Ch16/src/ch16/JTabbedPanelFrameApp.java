package ch16;
//package ch16;
//Application driver: Use of JTabbedPane with password and two tabs

import java.awt.*;
import javax.swing.*;

public class JTabbedPanelFrameApp {
	public static void main(String[] args) {
		JFrame frame = new PasswordFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280, 120);
		frame.setVisible(true);
	}
}
