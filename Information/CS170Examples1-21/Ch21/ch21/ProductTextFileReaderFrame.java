package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

class ProductTextFileReaderFrame extends JFrame {
    ProductTextFileReaderFrame()
    {
        setTitle("Product Text File Reader");
        centerWindow(this);
        setSize(410, 250);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ProductFileReaderPanel();
        this.add(panel);
    }

    private void centerWindow(Window w)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }
}

class ProductFileReaderPanel extends JPanel implements ActionListener
{
    private JTextField  IDTextField,
                        titleTextField,
                        priceTextField,
                        infoTextField;
    private JLabel      IDLabel,
                        titleLabel,
                        priceLabel,
                        infoLabel,
                        countLabel,
                        totalLabel,
                        endFileLabel;
    private JButton     readButton,
                        exitButton;

    private TextFileReader fileReader;
    private String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/products.txt";
    private int count;
    private StringTokenizer token;
    private double total;


    public ProductFileReaderPanel()
    {
        // display panel
        JPanel productFilePanel = new JPanel();
        productFilePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // product number label
        IDLabel = new JLabel("Product Number:");
        productFilePanel.add(IDLabel);

        // product number text field
        IDTextField = new JTextField(20);
        productFilePanel.add(IDTextField);

        // product name label
        titleLabel = new JLabel("Product Name:");
        productFilePanel.add(titleLabel);

        // product name text field
        titleTextField = new JTextField(20);
        productFilePanel.add(titleTextField);

        // price label
        priceLabel = new JLabel("Product Price:  ");
        productFilePanel.add(priceLabel);

        // product price text field
        priceTextField = new JTextField(22);
        productFilePanel.add(priceTextField);
        // file path label
        infoLabel = new JLabel("File Path:");
        productFilePanel.add(infoLabel);
        infoLabel.setVisible(false);

        // file path text field
        infoTextField = new JTextField(35);
        infoTextField.setEditable(false);
        infoTextField.setFocusable(false);
        productFilePanel.add(infoTextField);
        infoTextField.setVisible(false);

        countLabel = new JLabel();
		productFilePanel.add(countLabel);

		totalLabel = new JLabel();
		productFilePanel.add(totalLabel);

		endFileLabel = new JLabel();
		productFilePanel.add(endFileLabel);

        // button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // calculate button
        readButton = new JButton("Read");
        readButton.addActionListener(this);
        buttonPanel.add(readButton);

        // exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

        // add panels to main panel
        this.setLayout(new BorderLayout());
        this.add(productFilePanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        try {
        	fileReader = new TextFileReader(fileName);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		count = 0;
		total = 0.0;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton) {
			try {
				fileReader.closeFile();
			}
			catch (IOException io) {
				System.out.println(io);
			}
            System.exit(0);
		}
        else if (source == readButton) {
			try {
				String data = fileReader.getData();
				System.out.println(data);
				if (data != null) {
					token = new StringTokenizer(data, "|");
					String ID = token.nextToken();
					IDTextField.setText(ID);
					String title = token.nextToken();
					titleTextField.setText(title);
            		String price = token.nextToken();
            		priceTextField.setText(price);

            		infoLabel.setVisible(true);
            		infoTextField.setVisible(true);
            		infoTextField.setText(fileName);
            		countLabel.setText("Record No.:  " + ++count);

            		total += Double.parseDouble(price);
            		String totalString = Formatter.currency(total);
            		totalLabel.setText("Total: " + totalString);
            		//data = fileReader.getData();
				}
				else
					endFileLabel.setText("All reacords have been read in.      ");
			}
			catch (IOException ioe) {
				System.out.println(ioe);
			}
        }
    }
}
