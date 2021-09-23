package ch20;

//package ch20;
//Demo: Use of fonts and colors

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.ColorSelectionModel;

class FontsColorsPanel extends JPanel implements ItemListener {
	JComboBox fontComboBox, sizeComboBox;//
	JCheckBox boldCheckBox, italicCheckBox;
	Font font;

	JColorChooser colorChooser;
	ColorSelectionModel model;
	Color newColor;
	ChangeListener changeListener;

	public FontsColorsPanel() {

		GraphicsEnvironment ge;
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontComboBox = new JComboBox(ge.getAvailableFontFamilyNames());
		fontComboBox.setSelectedItem("SansSerif");
		fontComboBox.addItemListener(this);

		String[] sizes = { "8", "10", "12", "14", "16", "18", "20", "22", "24",
				"26", "28", "30" };
		sizeComboBox = new JComboBox(sizes);
		sizeComboBox.setSelectedItem("18");
		sizeComboBox.addItemListener(this);

		boldCheckBox = new JCheckBox("Bold");
		boldCheckBox.addItemListener(this);
		italicCheckBox = new JCheckBox("Italic");
		italicCheckBox.addItemListener(this);

		JPanel northPanel = new JPanel();
		northPanel.add(fontComboBox);
		northPanel.add(sizeComboBox);
		northPanel.add(italicCheckBox);
		northPanel.add(boldCheckBox);

		setLayout(new BorderLayout());
		add(northPanel, BorderLayout.NORTH);
		font = new Font("¡• È", Font.PLAIN, 18);

		colorChooser = new JColorChooser();
		colorChooser.setBorder(BorderFactory
				.createTitledBorder("Color Chooser"));
		add(colorChooser, BorderLayout.SOUTH);

		changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
				newColor = colorChooser.getColor();
				repaint();
			}
		};
		model = colorChooser.getSelectionModel();
		model.addChangeListener(changeListener);
	}

	public void itemStateChanged(ItemEvent e) {
		String fontFamily = (String) fontComboBox.getSelectedItem();
		int style = Font.PLAIN;
		String sizeInt = (String) sizeComboBox.getSelectedItem();
		int size = Integer.parseInt(sizeInt);

		if ((boldCheckBox.isSelected()) && (italicCheckBox.isSelected()))
			style = Font.BOLD + Font.ITALIC;
		else if (boldCheckBox.isSelected())
			style = Font.BOLD;
		else if (italicCheckBox.isSelected())
			style = Font.ITALIC;
		font = new Font(fontFamily, style, size);
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(font);
		g.setColor(newColor);
		String text = "I love life, I love Java";
		g.drawString(text, 60, 80);
	}
}
