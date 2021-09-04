package ch17;
//package ch17;

//Use of JTable with change of the size.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableFrame extends JFrame {
	String rowData[][] = {
			{ "1", "one", "un", "I" },
	        { "2", "two", "deux", "II" },
	        { "3", "three", "trois", "III" },
	        { "4", "four", "quatre", "IV" },
	        { "5", "five", "cinq", "V" },
	        { "6", "six", "treiza", "VI" },
	        { "7", "seven", "sept", "VII" },
	        { "8", "eight", "huit", "VIII" },
	        { "9", "nine", "neur", "IX" },
        	{ "10", "ten", "dix", "X" } };
	 String columnNames[] = {"Number", "English", "French", "Roman" };
	 String modes[] = { "Change column size", "Reset"};
	 int modeKey[] =  { JTable.AUTO_RESIZE_ALL_COLUMNS, JTable.AUTO_RESIZE_OFF};
	 JTable table;
	 JScrollPane scrollPane;
	 JComboBox resizeModeComboBox;
	 ItemListener itemListener;
	 int defaultMode = 1;

	 TableFrame() {
		 table = new JTable(rowData, columnNames);
		 scrollPane = new JScrollPane(table);
		 resizeModeComboBox = new JComboBox(modes);
		 table.setAutoResizeMode(modeKey[defaultMode]);
		 resizeModeComboBox.setSelectedIndex(defaultMode);

		 add(resizeModeComboBox, BorderLayout.NORTH);
		 add(scrollPane, BorderLayout.CENTER);

		 itemListener = new ItemListener() {
		   public void itemStateChanged(ItemEvent e) {
			 JComboBox source = (JComboBox) e.getSource();
			 int index = source.getSelectedIndex();
			 table.setAutoResizeMode(modeKey[index]);
		   }
		 };
    	 resizeModeComboBox.addItemListener(itemListener);
    	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
}

public class TableFrameApp {
  public static void main(String args[]) {
  		JFrame frame = new TableFrame();
  		frame.setTitle("JTable Demo");
    	frame.setSize(600, 300);
    	frame.setVisible(true);
  }
}
