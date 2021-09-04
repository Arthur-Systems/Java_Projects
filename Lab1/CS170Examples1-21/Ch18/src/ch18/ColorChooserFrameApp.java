package ch18;
//Use of JColorChooser to select colors
//package ch18;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.*;

class ColorChooserFrame extends JFrame{
	JColorChooser colorChooser;
	ColorSelectionModel model;
	JLabel label;
	ChangeListener changeListener;
	ColorChooserFrame() {
		super("Use of Color Chooser");
		label = new JLabel("I love Java", JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 48));
    	add(label, BorderLayout.SOUTH);
		colorChooser = new JColorChooser(label.getBackground());
		colorChooser.setBorder(BorderFactory.createTitledBorder("Choose your favored color:"));
		add(colorChooser, BorderLayout.CENTER);

		changeListener = new ChangeListener() {
		      public void stateChanged(ChangeEvent changeEvent) {
		        Color newForegroundColor = colorChooser.getColor();
		        label.setForeground(newForegroundColor);
		      }
    	};
    	model = colorChooser.getSelectionModel();
    	model.addChangeListener(changeListener);

    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class ColorChooserFrameApp {
  public static void main(String args[]) {
    JFrame frame = new ColorChooserFrame();
    frame.pack();
    frame.setVisible(true);
  }
}