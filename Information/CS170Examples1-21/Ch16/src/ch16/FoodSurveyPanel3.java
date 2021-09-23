package ch16;
//package ch16;
//Application:  Use of L&F, GridBagLayout, JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.UIManager.*;

public class FoodSurveyPanel3 extends JPanel implements ActionListener {
private Border loweredBorder, raisedBorder;
private final String metalClassName = "javax.swing.plaf.metal.MetalLookAndFeel",
						motifClassName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
						windowsClassName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
private GridBagConstraints c;
private int pizzaLikeCount, hamburgerLikeCount, kfcLikeCount;
private int pizzaDislikeCount, hamburgerDislikeCount, kfcDislikeCount;
private JLabel selectLabel;
private JCheckBox pizzaBox, hamburgerBox, kfcBox;
private JRadioButton likeRadioButton, dislikeRadioButton;
private JRadioButton metalRadioButton, motifRadioButton, windowRadioButton;
private ButtonGroup buttonGroup, buttonGroup2;
private JButton addButton,
				   exitButton;
private JTextArea displayTextArea;
public FoodSurveyPanel3() {
	  pizzaLikeCount = hamburgerLikeCount = kfcLikeCount = 0;
	  pizzaDislikeCount = hamburgerDislikeCount = kfcDislikeCount = 0;
	  loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
	  raisedBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);

   createGUIComponents();
}
private void createGUIComponents() {
	  setLayout(new GridBagLayout());
	  c = new GridBagConstraints();

	  JPanel selectPanel = new JPanel();
	  selectPanel.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Select food you like or dislike: "));
	  selectPanel.setLayout(new GridLayout(2, 3));
	  pizzaBox = new JCheckBox("Pizza");
	  selectPanel.add(pizzaBox);
	  hamburgerBox = new JCheckBox("Burger");
	  selectPanel.add(hamburgerBox);
	  kfcBox = new JCheckBox("KFC");
	  selectPanel.add(kfcBox);
	  likeRadioButton = new JRadioButton("Like", true);
      dislikeRadioButton = new JRadioButton("Dislike");
	  selectPanel.add(likeRadioButton);
	  selectPanel.add(dislikeRadioButton);
	  buttonGroup = new ButtonGroup();
	  buttonGroup.add(likeRadioButton);
	  buttonGroup.add(dislikeRadioButton);
	  c = setupConstraints(0, 0, 3, 2, GridBagConstraints.WEST);
   add(selectPanel, c);

	  JPanel buttonPanel = new JPanel();
	  buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
   addButton = new JButton("Add");
   buttonPanel.add(addButton);
   addButton.addActionListener(this);
   exitButton = new JButton("Exit");
   buttonPanel.add(exitButton);
   exitButton.addActionListener(this);

   c = setupConstraints(0, 4, 2, 1, GridBagConstraints.WEST);
   add(buttonPanel, c);

	  JPanel lafPanel = new JPanel();
	  lafPanel.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Select L&F you like: "));
	  lafPanel.setLayout(new GridLayout(1, 3));
	  metalRadioButton = new JRadioButton("Unix", true);
	  motifRadioButton = new JRadioButton("Linux");
	  windowRadioButton = new JRadioButton("Metal");
	  lafPanel.add(metalRadioButton);
	  lafPanel.add(motifRadioButton);
	  lafPanel.add(windowRadioButton);
	  metalRadioButton.addActionListener(this);
	  motifRadioButton.addActionListener(this);
	  windowRadioButton.addActionListener(this);
	  buttonGroup2 = new ButtonGroup();
	  buttonGroup2.add(metalRadioButton);
	  buttonGroup2.add(motifRadioButton);
	  buttonGroup2.add(windowRadioButton);

	  c = setupConstraints(3, 0, 3, 1, GridBagConstraints.WEST);
	  add(lafPanel, c);

   setupTextArea();
   c = setupConstraints(3, 1, 3, 4, GridBagConstraints.WEST);
	  add(displayTextArea, c);
   displayTextArea.setVisible(false);
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
	   else if(source == exitButton)
	     System.exit(0);
	   try {
			   if (source == metalRadioButton) {
				   UIManager.setLookAndFeel(metalClassName);
			   }
			   if (source == motifRadioButton) {
				   UIManager.setLookAndFeel(motifClassName);
			   }
			   if (source == windowRadioButton) {
				   UIManager.setLookAndFeel(windowsClassName);
			   }
			SwingUtilities.updateComponentTreeUI(this);
	   	}
	   	catch (Exception ex) {
			System.out.println(ex);
		}
}
private void setupTextArea() {
	  displayTextArea = new JTextArea(4, 20);
	  displayTextArea.setEditable( false );
}
private void updateTextArea() {
	  String info = "\tLike\tDislike\n"
	  	  	   + "Pizza\t" + pizzaLikeCount + "\t" + pizzaDislikeCount + "\n"
	  	  	   + "Burger\t" + hamburgerLikeCount + "\t" + hamburgerDislikeCount + "\n"
	   	   	   + "KFC\t" + kfcLikeCount + "\t" + kfcDislikeCount;
	  displayTextArea.setText(info);
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