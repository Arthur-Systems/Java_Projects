package ch16;
//package ch16;

//Demo:  Use of JTabbedPane with two tabs

import java.awt.*;
import javax.swing.*;

class JTabbedPaneFrame extends JFrame {
	private JTabbedPane tabbedPane;
	private ButtonsPanel buttonsPanel;
	private BorderLayoutPanel borderLayoutPanel;
	public JTabbedPaneFrame() {
		super("Demo: use of JTabbedPane");
		tabbedPane = new JTabbedPane();
		buttonsPanel = new ButtonsPanel();
		borderLayoutPanel = new BorderLayoutPanel();
		tabbedPane.addTab("Buttons", buttonsPanel);
		tabbedPane.addTab("BorderLayout", borderLayoutPanel);
		add(tabbedPane);
	}
}
public class JTabbedPaneFrameTest {
	public static void main(String[] args) {
		JFrame frame = new JTabbedPaneFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
