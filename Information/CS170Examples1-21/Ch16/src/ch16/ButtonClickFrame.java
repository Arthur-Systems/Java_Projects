package ch16;
//package ch16;
//Demo:  Use of FlowLayout and annomous inner class to show 3 positions

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonClickFrame extends JFrame {
	private FlowLayout flowLayout;
	private JButton button;
	private int postCount = 0;
	private Container container;
	public ButtonClickFrame() {
		setTitle("Use of FlowLayout");
		flowLayout = new FlowLayout(FlowLayout.LEFT);
		container = getContentPane();
		setLayout(flowLayout);
		button = new JButton("Click me");
		add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flowLayout.setAlignment(postCount++ % 3);
				flowLayout.layoutContainer(container);
			}
		});
	}
}