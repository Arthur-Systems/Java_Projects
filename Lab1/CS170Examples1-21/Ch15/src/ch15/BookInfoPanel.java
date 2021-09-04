package ch15;
//package ch15;
//Example:  Use of JCheckBox, other componenets and event handling

import javax.swing.*;
import java.awt.event.*;

class BookInfoPanel extends JPanel implements ActionListener{
	private JLabel entryLabel;
	private JTextField entryField, titleField;
	private JCheckBox authorBox, publisherBox;
	private JButton okButton;
	public BookInfoPanel() {						//构造器
		entryLabel = new JLabel("Enter the book code:");
		add(entryLabel);
		entryField = new JTextField("Java or C/C++", 12);
		add(entryField);
		entryField.addActionListener(this);
		titleField = new JTextField(43);
		titleField.setEditable(false);
		titleField.setVisible(false);
		add(titleField);
		authorBox = new JCheckBox("Author", true);
		authorBox.setVisible(false);
		add(authorBox);
		authorBox.addActionListener(this);
		publisherBox = new JCheckBox("Publisher");
		publisherBox.setVisible(false);
		add(publisherBox);
		publisherBox.addActionListener(this);
		okButton = new JButton("Ok");
		add(okButton);;
		okButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {	//完善事件处理接口方法
		Object source = e.getSource();				//得到事件发生源
		String info = null;
		if (source == okButton) {
		    if (entryField.getText().equals("Java")) {
			   titleField.setText("Programming Art in Java");
			   info = titleField.getText();
			   setVisibles();
		    }
		    else if (entryField.getText().equals("C/C++")) {
			   titleField.setText("Complete Programming in C/C++");
			   info = titleField.getText();
	     	   setVisibles();
			}
		}
		if (source == okButton && authorBox.isSelected()) {
			  info += getAuthorInfo();
			  titleField.setText(info);
		 }
		if(source == okButton && publisherBox.isSelected()) {
			  info += getPressInfo();
			  titleField.setText(info);
		 }
	}
	public void setVisibles() {
		entryLabel.setVisible(false);
		entryField.setEditable(false);
		titleField.setVisible(true);
		authorBox.setVisible(true);
		publisherBox.setVisible(true);
	}
	public String getAuthorInfo() {
		return ", Gao Yong Qiang, Ph.D.";
	}
	public String getPressInfo() {
		return ", Tsinghua University Press.";
	}
}