package ch17;
//package ch17;

//Demo: use of JPopupMenu and MouseAdapter event handlings

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class PopupMenuTest3 extends JFrame implements ActionListener {
    JPopupMenu popup;
    JMenuItem popupItem, item;

    public PopupMenuTest3() {
		super("Popup Menu Listener Test");
        popup = new JPopupMenu();

	    popupItem = new JMenuItem("PopupMenu");
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

        addMouseListener(new PopupHandler());
    }
    public void actionPerformed(ActionEvent event) {
		System.out.println("Popup menu item [" +
						   event.getActionCommand() + "] was pressed.");
	}

    class PopupHandler extends MouseAdapter {
	        public void mouseReleased(MouseEvent e) {
	            if (e.isPopupTrigger())
	                popup.show(e.getComponent(), e.getX(), e.getY());
	        }
    }
    public static void main(String s[]) {
        JFrame frame = new PopupMenuTest3();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
