package ch17;
//package ch17;

//Application:  Use of GridBagLayout, Border, JComboBox, JTextArea and event handling
//to show common used OOP terms.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class OOPPanel extends JPanel implements ActionListener {
private Border loweredBorder;
private GridBagConstraints c;

private JPanel comboBoxPanel, buttonPanel, button2Panel, textPanel, textAreaPanel;
private JComboBox comboBox;
private JLabel termLabel;
private JTextField termField;

private JButton newItemButton,
				   submitButton,
				   exitButton;
private JTextArea explainTextArea, displayTextArea;
private String[] OOPs = {"Encapsulation", "Inheritance","Polymorphism"};
private String[] explains = {"Information hidden; use of functionalities and    properties "	//Description array
		+ "without knowing how they are written or implemented.  "
		+ "All API classes have this feature.  Good programmers "
		+ "should write code with this feature as well.",
           "Inherit properties, including variables and methods, "
		+ "by a subclass from superclass(es), saving time "
		+ "in case the code is re-written.",
		"A method can carry out a variety of functionalities depending on "
		+ "the object that overrides and dynamically calls it."
		};

private LinkedList<String> explainList = new LinkedList<String>(Arrays.asList(explains));

public OOPPanel() {
	  loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
   createGUIComponents();
}
private void createGUIComponents() {
	  setLayout(new GridBagLayout());
	  c = new GridBagConstraints();

	  comboBoxPanel = new JPanel();
	  comboBoxPanel.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Select an OOP term: "));
	  comboBoxPanel.setLayout(new GridLayout(1, 2));
   comboBox = new JComboBox(OOPs);
   comboBox.addActionListener(this);
   comboBoxPanel.add(comboBox);

   c = setupConstraints(0, 0, 2, 1, GridBagConstraints.WEST);
   add(comboBoxPanel, c);

   buttonPanel = new JPanel();
	  buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	  newItemButton = new JButton("New Term");
	  buttonPanel.add(newItemButton);
	  newItemButton.addActionListener(this);
	  exitButton = new JButton("Exit");
	  buttonPanel.add(exitButton);
	  exitButton.addActionListener(this);

	  c = setupConstraints(0, 3, 2, 1, GridBagConstraints.WEST);
	  add(buttonPanel, c);


	  textPanel = new JPanel();
	  textPanel.setLayout(new GridLayout(1, 2));
	  termLabel = new JLabel("New term: ");
   termField = new JTextField(8);
   textPanel.add(termLabel);
   textPanel.add(termField);
	  c = setupConstraints(0, 0, 2, 1, GridBagConstraints.WEST);
	  add(textPanel, c);
	  textPanel.setVisible(false);


	  textAreaPanel = new JPanel();
	  textAreaPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
   explainTextArea = setupTextArea(explainTextArea, 3, 15, true);
	  textAreaPanel.add(explainTextArea);
   c = setupConstraints(0, 1, 2, 3, GridBagConstraints.WEST);
   add(textAreaPanel, c);
   textAreaPanel.setVisible(false);

   button2Panel = new JPanel();
	  button2Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	  submitButton = new JButton("Submit");
	  button2Panel.add(submitButton);
	  submitButton.addActionListener(this);


	  c = setupConstraints(2, 3, 1, 1, GridBagConstraints.WEST);
	  add(button2Panel, c);
	  button2Panel.setVisible(false);

   displayTextArea = setupTextArea(displayTextArea, 5, 20, true);
   comboBox.setSelectedIndex(0);
   updateTextArea(0);
   c = setupConstraints(3, 0, 3, 5, GridBagConstraints.WEST);
	  add(displayTextArea, c);

}

public void actionPerformed(ActionEvent e) {
	  int index = 0;
	  Object source = e.getSource();				//得到事件发生源
	    if (source == exitButton) {
			System.exit(0);
		}
		else if (source == comboBox) {
       index = comboBox.getSelectedIndex();
	  	  updateTextArea(index);
	   }
	   else if(source == newItemButton) {
		   comboBoxPanel.setVisible(false);
		   buttonPanel.setVisible(false);
		   displayTextArea.setVisible(false);

		   textPanel.setVisible(true);
		   textAreaPanel.setVisible(true);
		   button2Panel.setVisible(true);
	   }
	   else if (source == submitButton) {
		   comboBox.addItem(termField.getText());
		   explainList.addLast(explainTextArea.getText());

		   comboBoxPanel.setVisible(true);
		   buttonPanel.setVisible(true);
		   displayTextArea.setVisible(true);

		   textPanel.setVisible(false);
		   textAreaPanel.setVisible(false);
		   button2Panel.setVisible(false);
	   }
}

private JTextArea setupTextArea(JTextArea textArea, int rows, int cols, boolean editable) {
	  textArea = new JTextArea(rows,cols);
	  textArea.setLineWrap(true);
	  textArea.setWrapStyleWord(true);
	  textArea.setEditable( editable );
	  textArea.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Explanation: "));
	  return textArea;
}
private void updateTextArea(int index) {
	  displayTextArea.setText(explainList.get(index));
	  displayTextArea.setVisible(true);
}


private GridBagConstraints setupConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor) {
	  GridBagConstraints c = new GridBagConstraints();
	  c.gridx = gridx;
	  c.gridy = gridy;
	  c.insets = new Insets(5, 5, 5, 5);
	  c.ipadx = c.ipady = 0;
	  c.gridwidth = gridwidth;
	  c.gridheight = gridheight;
	  c.anchor = anchor;
	  return c;
 }

}