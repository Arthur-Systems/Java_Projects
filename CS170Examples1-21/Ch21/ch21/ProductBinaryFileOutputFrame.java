package ch21;

//product Binary file output Frame and panel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class ProductBinaryFileOutputFrame extends JFrame {
    ProductBinaryFileOutputFrame() {
        setTitle("Product binary file output application");
        centerWindow(this);
        setSize(378, 220);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ProductFileOutputPanel();
        this.add(panel);
    }

    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }
}

class ProductFileOutputPanel extends JPanel implements ActionListener {
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

    private BinayFileOutput fileOutput;
    private String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/products.dat";
    private int count;


    public ProductFileOutputPanel() {
        // display panel
        JPanel productFilePanel = new JPanel();
        productFilePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        IDLabel = new JLabel("Product ID:");
        productFilePanel.add(IDLabel);

        IDTextField = new JTextField(20);
        productFilePanel.add(IDTextField);

        titleLabel = new JLabel("Product name:");
        productFilePanel.add(titleLabel);

        titleTextField = new JTextField(20);
        productFilePanel.add(titleTextField);

        priceLabel = new JLabel("Product price:");
        productFilePanel.add(priceLabel);

        priceTextField = new JTextField(20);
        productFilePanel.add(priceTextField);

        countLabel = new JLabel();
		productFilePanel.add(countLabel);

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
        	fileOutput = new BinayFileOutput(fileName, true);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		count = 0;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton) {
			try {
				fileOutput.closeFile();
			}
			catch (IOException io) {
				System.out.println(io);
			}
            System.exit(0);
		}
        else if (source == saveButton) {
            String ID = IDTextField.getText();
            String title = titleTextField.getText();
            String price = priceTextField.getText();
            try {
            	fileOutput.outUTF(ID);
            	fileOutput.outUTF(title);
            	fileOutput.outDouble(Double.parseDouble(price));
			}
			catch (IOException ioe) {
				System.out.println(ioe);
			}
            IDTextField.setText("");
            titleTextField.setText("");
            priceTextField.setText("");


            countLabel.setText("Record count:                " + ++count);
        }
    }
}
