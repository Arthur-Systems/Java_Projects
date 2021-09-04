package ch17;
//package ch17;

//Demo:  use of JFileChooser

import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class FileChooserFrame extends JFrame {
  JMenuBar menuBar;
  JMenu fileMenu;
  JMenuItem openItem, saveItem, exitItem;
  JLabel statusLabel;
FileChooserFrame() {
 menuBar = new JMenuBar();
 fileMenu = new JMenu("File");
 	   menuBar.add(fileMenu);
 	   openItem = new JMenuItem("Open");
 	   fileMenu.add(openItem);
 	   fileMenu.insertSeparator(1);
 	   exitItem = new JMenuItem("Exit");
 	   fileMenu.add(exitItem);
 	   setJMenuBar(menuBar);
 	   statusLabel = new JLabel("  It will display the file name and the statistics of the word count for .txt file");


 add(statusLabel);

 // Create a file chooser that opens up as an Open dialog
 openItem.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
     JFileChooser chooser = new JFileChooser();
     int wordsCount = 0;
     //chooser.setMultiSelectionEnabled(true);
     int option = chooser.showOpenDialog(null);
     if (option == JFileChooser.APPROVE_OPTION) {
       File file = chooser.getSelectedFile();
       wordsCount = countWordsInFile(file);
       statusLabel.setText("  File Name: " + file.getName() + " Word count: " + wordsCount);
     }
     else {
       statusLabel.setText("You have canceled the file selection.");
     }
   }
 });
 exitItem.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
	 System.exit(0);
	}
 });
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 int countWordsInFile(File file) {
         int numberOfWords = 0;
         String word = null;
         try {
             Scanner sc = new Scanner(file);
             while (sc.hasNext()) {
                 word = sc.next();
                 numberOfWords++;
             }
             sc.close();
         } catch (FileNotFoundException e) {
             JOptionPane.showMessageDialog(null, e);
         }
         return numberOfWords;
     }
}
public class FileChooserFrameApp {
	public static void main(String args[]) {
	 JFrame frame = new FileChooserFrame();
	 frame.setTitle("Word count using File Chooser");
	 frame.setSize(450, 200);
	 frame.setVisible(true);
	}
}
