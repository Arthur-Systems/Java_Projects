package ch15;
//package ch15;

//Application Example:  Use of JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FoodSurveyPanel extends JPanel implements ActionListener {
	//Define member data
   private int pizzaLikeCount, hamburgerLikeCount, kfcLikeCount;
   private int pizzaDislikeCount, hamburgerDislikeCount, kfcDislikeCount;

	//Define GUI components
   private JLabel selectLabel;
	private JTextArea displayTextArea;
	private JCheckBox pizzaBox, hamburgerBox, kfcBox;
	private JButton addButton;

	//Declare radio buttons and button group
   private JRadioButton likeRadioButton, dislikeRadioButton;
   private ButtonGroup buttonGroup;

   public FoodSurveyPanel() {		//Constructor
	   //initialize survey
	   pizzaLikeCount = hamburgerLikeCount = kfcLikeCount = 0;
	   pizzaDislikeCount = hamburgerDislikeCount = kfcDislikeCount = 0;
	   createGUIComponents();
   }

   //Method creatGUIComponents()
   private void createGUIComponents() {
	//Create and add label and check boxes
	selectLabel = new JLabel("Please select one you like or dislike: ");
	add(selectLabel);
   pizzaBox = new JCheckBox("Pizza");
   add(pizzaBox);
   hamburgerBox = new JCheckBox("Hamburger");
   add(hamburgerBox);
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
	  Object source = e.getSource();				//Get event source
		if (source == addButton) {
       if (pizzaBox.isSelected()) {
			if (likeRadioButton.isSelected())
         	pizzaLikeCount++;
         else
         	pizzaDislikeCount++;
		  }
       if (hamburgerBox.isSelected()) {
         if (likeRadioButton.isSelected())
			    hamburgerLikeCount++;
		    else
         	hamburgerDislikeCount++;
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
//Method setupTestArea() to set up the text area for survey
private void setupTextArea() {
	  displayTextArea = new JTextArea();
	  displayTextArea.setBounds(16, 55, 315, 93);
	  displayTextArea.setEditable( false );
	  add(displayTextArea);
}
//Method updateTextArea() to update the survey statistics report
private void updateTextArea() {
	String info = "\tLike\tDislike\n"
	   + "Pizza\t" + pizzaLikeCount + "\t" + pizzaDislikeCount + "\n"
	   + "Hamburger\t" + hamburgerLikeCount + "\t" + hamburgerDislikeCount + "\n"
	   + "KFC\t" + kfcLikeCount + "\t" + kfcDislikeCount;
	displayTextArea.setText(info);
	displayTextArea.setVisible(true);
}

}