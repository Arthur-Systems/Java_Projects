package ch17;
//package ch17;

//Demo: use of JPopupMenu and ActionListener event handlings

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class PopupMenuTest extends JFrame implements ActionListener {

    JPopupMenu popup;
    JMenuBar menuBar;
    JMenu optionMenu;
    JMenuItem popupItem, item;

    public PopupMenuTest() {
		super("Popup Menu Test");
        popup = new JPopupMenu();
        menuBar = new JMenuBar();
	  	optionMenu = new JMenu("Option");
	    optionMenu.setMnemonic('O');
	    menuBar.add(optionMenu);
	    popupItem = new JMenuItem("PopupMenu");
	    optionMenu.add(popupItem);
        popupItem.addActionListener(this);
        popup.add(item = new JMenuItem("Left"));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Center"));
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Right"));
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Full"));
        item.addActionListener(this);

        popup.setBorder(new BevelBorder(BevelBorder.RAISED));
        setJMenuBar(menuBar);
    }
    public void actionPerformed(ActionEvent event) {
		System.out.println("Popup menu item [" +
						   event.getActionCommand() + "] was pressed.");
		if(event.getActionCommand().equals("PopupMenu"))
			popup.show(this, 190, 100);
	}
    public static void main(String s[]) {
        JFrame frame = new PopupMenuTest();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}