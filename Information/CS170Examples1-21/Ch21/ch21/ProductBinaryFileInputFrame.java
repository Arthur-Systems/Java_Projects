package ch21;

//Product binary file input GUI frame and panel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class ProductBinaryFileInputFrame extends JFrame {
    ProductBinaryFileInputFrame() {
        setTitle("Product binary file input application");
        centerWindow(this);
        setSize(350, 240);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ProductBinaryFileInputPanel();
        this.add(panel);
    }

    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }
}

class ProductBinaryFileInputPanel extends JPanel implements ActionListener {
    private JTextField  IDTextField,
                        titleTextField,
                        priceTextField;

    private JLabel      IDLabel,
                        titleLabel,
                        priceLabel,

                        countLabel,
                        totalLabel,
                        endFileLabel;
    private JButton     readButton,
                        exitButton;

    private BinayFileInput fileReader;
    private String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/products.dat";
    private int count;
    //private StringTokenizer token;
    private double total;


    public ProductBinaryFileInputPanel() {
        // display panel
        JPanel productFilePanel = new JPanel();
        productFilePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // payment label
        IDLabel = new JLabel("Product ID:");
        productFilePanel.add(IDLabel);

        // payment text field
        IDTextField = new JTextField(20);
        productFilePanel.add(IDTextField);

        // rate label
        titleLabel = new JLabel("Product name:");
        productFilePanel.add(titleLabel);

        // rate text field
        titleTextField = new JTextField(20);
        productFilePanel.add(titleTextField);

        // years label
        priceLabel = new JLabel("Product price:");
        productFilePanel.add(priceLabel);

        // years text field
        priceTextField = new JTextField(20);
        productFilePanel.add(priceTextField);


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
        	fileReader = new BinayFileInput(fileName);
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
				if (fileReader.hasMore()) {
					String ID = fileReader.getUTF();
					String title = fileReader.getUTF();
					double price = fileReader.getDouble();

					IDTextField.setText(ID);
					titleTextField.setText(title);
            		priceTextField.setText(""+ price);


            		countLabel.setText("Record read in:  " + ++count);

            		total += price;
            		String totalString = Formatter.currency(total);
            		totalLabel.setText("Total: " + totalString);
				}
				else
					endFileLabel.setText("End of file.       ");
			}
			catch (IOException ioe) {
				System.out.println(ioe);
			}
        }
    }
}

