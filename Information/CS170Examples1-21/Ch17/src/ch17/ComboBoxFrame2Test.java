package ch17;

//Demo:  Test of JComboBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SelectPanel extends JPanel implements ActionListener {		//Event handling
		JComboBox myComboBox;					//Declare combobox
	public SelectPanel() {						//The panel
		myComboBox = new JComboBox();			//Create the combobox
		myComboBox.addItem("Pizza");			//Add items
		myComboBox.addItem("Hamburger");
		myComboBox.addItem("KFC");
		myComboBox.insertItemAt("French Fries", 2);			//Use insert
		add(myComboBox);
		myComboBox.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == myComboBox) {				//If the source is the combobox
			if (myComboBox.getSelectedItem() == "Pizza")
				JOptionPane.showMessageDialog(null, "You have selected Pizza.");
			else if (myComboBox.getSelectedItem() == "Hamburger")
				JOptionPane.showMessageDialog(null, "You have selected Hamburger.");
			else if (myComboBox.getSelectedItem() == "French Fries")
				JOptionPane.showMessageDialog(null, "You have selected French Fries.");
			else
				JOptionPane.showMessageDialog(null, "You have selected KFC.");
		}
	}
}
class ComboBoxFrame2 extends JFrame {
	public ComboBoxFrame2() {
		JPanel selectPanel = new SelectPanel();						//Create the panel
		this.add(selectPanel);										//Add the panel
		setTitle("JComboBox Test");
		setSize(250,120);											//Szie of the frame
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);											//Center display
	}
	private void centerWindow(JFrame frame) {						//Method for center display
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class ComboBoxFrame2Test {						//Driver code
	public static void main(String[] args) {
		JFrame frame = new ComboBoxFrame2();
		frame.setVisible(true);
	}
}

