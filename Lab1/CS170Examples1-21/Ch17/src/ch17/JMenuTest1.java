package ch17;
//package ch17;

//Demo:  Test of JMenu with submenu

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenuPanel extends JPanel implements ActionListener{
		JMenuBar productMenuBar;		//Declare menu bar
		JMenu fileMenu;					//Declare file menu
		JMenu openMenu;
		JMenuItem openFromFile, openFromDatabase;			//Declare menu items
		JMenuItem exitItem;
		JMenuItem saveItem;

	public JMenuPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));

		productMenuBar = new JMenuBar();	//Create menu bar
		fileMenu = new JMenu("File");		//Create menu
		productMenuBar.add(fileMenu);		//Add menu to the menu bar

		fileMenu.addActionListener(this);

		openMenu = new JMenu("Open");
		fileMenu.add(openMenu);

		fileMenu.setMnemonic('F');

		openMenu.addActionListener(this);

		openFromFile = new JMenuItem("Open from File");
		openFromDatabase = new JMenuItem("Open from Database");
		openMenu.add(openFromFile);
		openMenu.add(openFromDatabase);

		openFromFile.addActionListener(this);
		openFromDatabase.addActionListener(this);

		exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);
		exitItem.addActionListener(this);

		if (productMenuBar.getMenu(0)  == fileMenu)
			System.out.println("The menu name is File");
		System.out.println(productMenuBar.getMenuCount());
		if(fileMenu.getItem(1) == exitItem)
			System.out.println("The menu item is Exit");
		System.out.println(fileMenu.getItemCount());

		fileMenu.insertSeparator(1);

		add(productMenuBar);
	}
 	public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == exitItem) {
				JOptionPane.showMessageDialog(null, "You have selected to exit.");
				System.exit(0);
			}
			else if(source == saveItem)
					JOptionPane.showMessageDialog(null, "You have selected Save from File.");
			else if (source == openFromFile)
					JOptionPane.showMessageDialog(null, "You have selected Open from File.");
			else if (source == openFromDatabase)
					JOptionPane.showMessageDialog(null, "You have selected Open from Database.");
	}
}

class JMenuFrame extends JFrame {
	JMenuFrame() {
		JPanel panel = new JMenuPanel();						//reate panel
		this.add(panel);							//Add the panel for display
		setTitle("JMenu Demo");
		setSize(300,150);							//Size of the frame
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
	}
	private void centerWindow(JFrame frame) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension d = tk.getScreenSize();
			int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
			int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
			frame.setLocation(centeredWidth, centeredHeight);
	}

}
 class JMenuTest1 {
	public static void main(String[] args) {
		JMenuFrame menuFrame = new JMenuFrame();
		menuFrame.setVisible(true);
	}
}


