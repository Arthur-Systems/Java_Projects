package ch17;
//package ch17;

//Demo: use of JPopupMenu and PopupMenuListener event handlings

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class PopupMenuTest2 extends JFrame implements ActionListener {

    JPopupMenu popup;
    JMenuBar menuBar;
    JMenu optionMenu;
    JMenuItem popupItem, item;

    public PopupMenuTest2() {
		super("Popup Menu Listener Test");
        popup = new JPopupMenu();
        menuBar = new JMenuBar();
	  	optionMenu = new JMenu("Option");
	    optionMenu.setMnemonic('O');
	    menuBar.add(optionMenu);
	    popupItem = new JMenuItem("PopupMenu");
	    optionMenu.add(popupItem);
        popupItem.addActionListener(this);
        popup.add(item = new JMenuItem("Left"));
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Center"));
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Right"));
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Full"));
        item.addActionListener(this);
        popup.setBorder(new BevelBorder(BevelBorder.RAISED));
        popup.addPopupMenuListener(new PopupPrintListener());

        setJMenuBar(menuBar);
    }
    public void actionPerformed(ActionEvent event) {
		System.out.println("Popup menu item [" +
						   event.getActionCommand() + "] was pressed.");
		if(event.getActionCommand().equals("PopupMenu"))
			popup.show(this, 190, 100);
	}

    // An inner class to show when popup events occur
    class PopupPrintListener implements PopupMenuListener {
        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            System.out.println("Popup menu will be visible!");
        }
        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            System.out.println("Popup menu will be invisible!");
        }
        public void popupMenuCanceled(PopupMenuEvent e) {
            System.out.println("Popup menu is canceled!");
        }
    }

    public static void main(String s[]) {
        JFrame frame = new PopupMenuTest2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
