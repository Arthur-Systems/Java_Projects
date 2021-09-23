package ch16;
//package ch16;
//Example:  Use of JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FoodSurveyPanel extends JPanel implements ActionListener {
private int pizzaLikeCount, humbuggerLikeCount, kfcLikeCount;
private int pizzaDislikeCount, humbuggerDislikeCount, kfcDislikeCount;
private JLabel selectLabel;
private JCheckBox pizzaBox, humbuggerBox, kfcBox;
private JRadioButton likeRadioButton,
						dislikeRadioButton;
private ButtonGroup buttonGroup;
private JButton addButton;
private JTextArea displayTextArea;
public FoodSurveyPanel() {
	  pizzaLikeCount = humbuggerLikeCount = kfcLikeCount = 0;
	  pizzaDislikeCount = humbuggerDislikeCount = kfcDislikeCount = 0;
   createGUIComponents();
}
private void createGUIComponents() {
	  //Create and add label and check boxes
	  	selectLabel = new JLabel("Please select one you like or dislike: ");
	  	add(selectLabel);
	     pizzaBox = new JCheckBox("Pizz");
	     add(pizzaBox);
	     humbuggerBox = new JCheckBox("Humbugger");
	     add(humbuggerBox);
	     kfcBox = new JCheckBox("KFC");
	     add(kfcBox);
	     likeRadioButton = new JRadioButton("Like",true); //Create and add radio buttons
	     dislikeRadioButton = new JRadioButton("Dislike");
	     add(likeRadioButton);
	     add(dislikeRadioButton);
	     buttonGroup = new ButtonGroup();  //Create button group and add radio buttons
	     buttonGroup.add(likeRadioButton);
	     buttonGroup.add(dislikeRadioButton);
	     addButton = new JButton("Add");		//Create button
	     add(addButton);				//Add the button to panel
	     addButton.addActionListener(this);	//Add the button for event handling
	     setupTextArea();				//Call method to establish text area
	     displayTextArea.setVisible(false);	//Don’t display it first
	   }


public void actionPerformed(ActionEvent e) {
	  Object source = e.getSource();				//Source of the event
		if (source == addButton) {
       if (pizzaBox.isSelected()) {
			if (likeRadioButton.isSelected())
         	pizzaLikeCount++;
         else
         	pizzaDislikeCount++;
		  }
       if (humbuggerBox.isSelected()) {
         if (likeRadioButton.isSelected())
			    humbuggerLikeCount++;
		    else
         	humbuggerDislikeCount++;
		  }
       if (kfcBox.isSelected()) {
			if (likeRadioButton.isSelected())
         	kfcLikeCount++;
         else
         	kfcDislikeCount++;
       }
	  updateTextArea();
  }
}

  private void setupTextArea() {
	  displayTextArea = new JTextArea();
	  displayTextArea.setBounds(16, 55, 315, 93);
	  displayTextArea.setEditable( false );
	  add(displayTextArea);
  }
  //Method updateTextArea() to update the survey statistics report
  private void updateTextArea() {
	String info = "\tLike\tDislike\n"
	   + "Pizz\t" + pizzaLikeCount + "\t" + pizzaDislikeCount + "\n"
	   + "Humbugger\t" + humbuggerLikeCount + "\t" + humbuggerDislikeCount + "\n"
	   + "KFC\t" + kfcLikeCount + "\t" + kfcDislikeCount;
	displayTextArea.setText(info);
	displayTextArea.setVisible(true);
  }
}


