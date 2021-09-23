package ch21;

//Product text file data output GUI

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class ProductTextFileWriterFrame extends JFrame {
    ProductTextFileWriterFrame()
    {
        setTitle("Product Text File Writer");
        centerWindow(this);
        setSize(370, 220);
       setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ProductTextFileWriterPanel();
        this.add(panel);
    }

    private void centerWindow(Window w)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }
}

class ProductTextFileWriterPanel extends JPanel implements ActionListener
{
    private JTextField  IDTextField,
                        titleTextField,
                        priceTextField,
                        infoTextField;
    private JLabel      IDLabel,
                        titleLabel,
                        priceLabel,
                        infoLabel,
                        countLabel;
    private JButton     saveButton,
                        exitButton;

    private TextFileWriter fileWriter;
    private String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/products.txt";
    private int count;


    public ProductTextFileWriterPanel()
    {
        // display panel
        JPanel productFilePanel = new JPanel();
        productFilePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // product number label
        IDLabel = new JLabel("Product No.:");
        productFilePanel.add(IDLabel);

        // product number text field
        IDTextField = new JTextField(20);
        productFilePanel.add(IDTextField);

        //product name label
        titleLabel = new JLabel("Product Name:");
        productFilePanel.add(titleLabel);

        //product name text field
        titleTextField = new JTextField(20);
        productFilePanel.add(titleTextField);

        //price label
        priceLabel = new JLabel("Product Price:");
        productFilePanel.add(priceLabel);

        //price text field
        priceTextField = new JTextField(20);
        productFilePanel.add(priceTextField);

        //File path label
        infoLabel = new JLabel("File Path:");
        productFilePanel.add(infoLabel);
        infoLabel.setVisible(false);

        //file path text field
        infoTextField = new JTextField(30);
        infoTextField.setEditable(false);
        infoTextField.setFocusable(false);
        productFilePanel.add(infoTextField);
        infoTextField.setVisible(false);

        countLabel = new JLabel();
		productFilePanel.add(countLabel);
       // countLabel.setVisible(false);

        // button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // calculate button
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        buttonPanel.add(saveButton);

        // exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

        // add panels to main panel
        this.setLayout(new BorderLayout());
        this.add(productFilePanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        try {
        	fileWriter = new TextFileWriter(fileName, true);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		count = 0;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton) {
			fileWriter.closeFile();
            System.exit(0);
		}
        else if (source == saveButton) {
            String ID = IDTextField.getText();
            String title = titleTextField.getText();
            String price = priceTextField.getText();
            fileWriter.output(ID, title, price);

            IDTextField.setText("");
            titleTextField.setText("");
            priceTextField.setText("");

            infoLabel.setVisible(true);
            infoTextField.setVisible(true);
            infoTextField.setText(fileName);
            countLabel.setText("Count::                " + ++count);
            //countLabel.setVisible(true);
        }
    }
}
