package ch17;
//package ch17;

//Application:  Use of Menu, L&F, GridBagLayout, JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
//Application:  Use of Menu, L&F, GridBagLayout, JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FoodSurveyPanel4 extends JPanel implements ActionListener {
private Border loweredBorder, raisedBorder;
private final String metalClassName = "javax.swing.plaf.metal.MetalLookAndFeel",
						motifClassName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
						windowsClassName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
private GridBagConstraints c;
private JPanel menuPanel, selectPanel, buttonPanel, lafPanel;
private int pizzaLikeCount, hamburgerLikeCount, kfcLikeCount;
private int pizzaDislikeCount, hamburgerDislikeCount, kfcDislikeCount;

private JMenuBar menuBar;
private JMenu selectMenu, likeMenu, dislikeMenu, displayMenu, aboutMenu;
private JMenuItem pizzaItem, hamburgerItem, kfcItem, metalItem, motifItem, winItem, contactItem, copyrightItem;
private JMenuItem dPizzaItem, dHamburgerItem, dKfcItem, exitItem;

private JLabel selectLabel;
private JCheckBox pizzaBox, hamburgerBox, kfcBox;
private JRadioButton likeRadioButton, dislikeRadioButton;
private JRadioButton metalRadioButton, motifRadioButton, windowRadioButton;
private ButtonGroup buttonGroup, buttonGroup2;
private JButton addButton,
				   exitButton;
private JTextArea displayTextArea;

public FoodSurveyPanel4() {
	  pizzaLikeCount = hamburgerLikeCount = kfcLikeCount = 0;
	  pizzaDislikeCount = hamburgerDislikeCount = kfcDislikeCount = 0;
	  loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
	  raisedBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);

   createGUIComponents();
}
private void createGUIComponents() {
	  setLayout(new GridBagLayout());
	  c = new GridBagConstraints();

	  menuPanel = new JPanel();
	  menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	  menuBar = new JMenuBar();
	  selectMenu = new JMenu("Select(S)");
	  selectMenu.setMnemonic('S');
	  menuBar.add(selectMenu);
	  likeMenu = new JMenu("Like(L)");
	  likeMenu.setMnemonic('L');
	  selectMenu.add(likeMenu);
	  selectMenu.insertSeparator(1);

	  pizzaItem = new JMenuItem("Pizza");
	  pizzaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.ALT_MASK));
	  likeMenu.add(pizzaItem);
	  pizzaItem.addActionListener(this);
	  hamburgerItem = new JMenuItem("Hamburger");
	  hamburgerItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.ALT_MASK));
	  likeMenu.add(hamburgerItem);
	  hamburgerItem.addActionListener(this);
	  kfcItem = new JMenuItem("KFC");
	  kfcItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.ALT_MASK));
	  likeMenu.add(kfcItem);
	  kfcItem.addActionListener(this);

	  dislikeMenu = new JMenu("Dislike(D)");
	  dislikeMenu.setMnemonic('D');
	  selectMenu.add(dislikeMenu);
	  dPizzaItem = new JMenuItem("Pizza");
	  dPizzaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
	  dPizzaItem.addActionListener(this);
	  dislikeMenu.add(dPizzaItem);
	  dHamburgerItem = new JMenuItem("Hamburger");
	  dHamburgerItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
	  dHamburgerItem.addActionListener(this);
	  dislikeMenu.add(dHamburgerItem);
	  dKfcItem = new JMenuItem("KFC");
	  dKfcItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_MASK));
	  dislikeMenu.add(dKfcItem);
	  dKfcItem.addActionListener(this);

	  exitItem = new JMenuItem("Exit(X)");
	  exitItem.setMnemonic('X');
	  selectMenu.add(exitItem);
	  selectMenu.insertSeparator(3);
	  exitItem.addActionListener(this);


	  displayMenu = new JMenu("Display(D)");
	  menuBar.add(displayMenu);
	  menuPanel.add(menuBar);
	  metalItem = new JMenuItem("Metal");
	  metalItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));
	  displayMenu.add(metalItem);
	  metalItem.addActionListener(this);
	  motifItem = new JMenuItem("Linux");
	  motifItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_MASK));
	  displayMenu.add(motifItem);
	  motifItem.addActionListener(this);
	  winItem = new JMenuItem("Window");
	  winItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK));
	  displayMenu.add(winItem);
	  winItem.addActionListener(this);

	  aboutMenu = new JMenu("Contact Author(C)");
	  aboutMenu.setMnemonic('C');
	  menuBar.add(aboutMenu);
	  aboutMenu.addActionListener(this);
	  contactItem = new JMenuItem("Contact Info");
	  contactItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
	  aboutMenu.add(contactItem);
	  contactItem.addActionListener(this);
	  copyrightItem = new JMenuItem("Copyright");
	  copyrightItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
	  aboutMenu.add(copyrightItem);
	  copyrightItem.addActionListener(this);

	  c = setupConstraints(0, 0, 6, 1, GridBagConstraints.WEST);
	  add(menuPanel);

	  selectPanel = new JPanel();
	  selectPanel.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Select food you like or dislike: "));
	  	  selectPanel.setLayout(new GridLayout(2, 3));
	  	  pizzaBox = new JCheckBox("Pizza");
	  	  selectPanel.add(pizzaBox);
	  	  hamburgerBox = new JCheckBox("Hamburger");
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
	  c = setupConstraints(0, 1, 3, 2, GridBagConstraints.WEST);
   add(selectPanel, c);

	  buttonPanel = new JPanel();
	  buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
   addButton = new JButton("Add");
   buttonPanel.add(addButton);
   addButton.addActionListener(this);
   exitButton = new JButton("Exit");
   buttonPanel.add(exitButton);
   exitButton.addActionListener(this);

   c = setupConstraints(0, 5, 2, 1, GridBagConstraints.WEST);
   add(buttonPanel, c);

	  lafPanel = new JPanel();
	  lafPanel.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Fast Food Survey: "));
	  lafPanel.setLayout(new GridLayout(1, 3));
	  metalRadioButton = new JRadioButton("Metal", true);
	  motifRadioButton = new JRadioButton("Linux");
	  windowRadioButton = new JRadioButton("Window");
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

	  c = setupConstraints(3, 1, 3, 1, GridBagConstraints.WEST);
	  add(lafPanel, c);

   setupTextArea();
   c = setupConstraints(3, 2, 3, 4, GridBagConstraints.WEST);
	  add(displayTextArea, c);
   displayTextArea.setVisible(false);
}
public void actionPerformed(ActionEvent e) {
	  Object source = e.getSource();				//Source of the event
	    if(source == exitButton || source == exitItem)
	     System.exit(0);
		else if (source == addButton) {
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
	   else if (source == contactItem)
	   	  JOptionPane.showMessageDialog(null, "ygao@ohlone.edu");
	   else if (source == copyrightItem)
	     JOptionPane.showMessageDialog(null, "All programs are copyrighted.");
	   else if (source == pizzaItem)
		     pizzaLikeCount++;
	   else if (source == hamburgerItem)
		   hamburgerLikeCount++;
	   else if (source == kfcItem)
	       kfcLikeCount++;
	   else if (source == dPizzaItem)
	      pizzaDislikeCount++;
	   else if (source == dHamburgerItem)
	       hamburgerDislikeCount++;
	   else if (source == dKfcItem)
	       kfcDislikeCount++;
	   updateTextArea();

	   try {
			   if (source == metalRadioButton || source == metalItem) {
				   UIManager.setLookAndFeel(metalClassName);
			   }
			   if (source == motifRadioButton || source == motifItem) {
				   UIManager.setLookAndFeel(motifClassName);
			   }
			   if (source == windowRadioButton || source == winItem) {
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