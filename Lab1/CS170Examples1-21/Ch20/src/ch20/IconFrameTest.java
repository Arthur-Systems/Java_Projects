package ch20;

//package ch20;
//Demo:Icon display
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IconFrameTest extends JFrame {
	private ImageIcon numberIcon;

	public IconFrameTest() {
		setTitle("Icon frame test");

		numberIcon = new ImageIcon("images\\numberIcon.gif");
		Image numberImage = numberIcon.getImage();
		setIconImage(numberImage);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int width = 560;
		int height = 240;
		setBounds((int) (d.width - width) / 2, (int) (d.height - height) / 2,
				width, height);
		// setResizable(false);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		IconPanel panel = new IconPanel();
		this.add(panel);
	}

	public static void main(String[] args) {
		IconFrameTest frame = new IconFrameTest();
		frame.setVisible(true);
	}
}

class IconPanel extends JPanel {
	private ImageIcon javaIcon, jugglerIcon, numberIcon, nextIcon,
			javaLogoIcon;
	private JButton startButton, jugglerButton, introButton, nextButton;

	public IconPanel() {

		javaIcon = new ImageIcon("images\\javaIcon.png");
		startButton = new JButton("Start Java", javaIcon);
		jugglerIcon = new ImageIcon("images\\jugglerIcon.png");
		jugglerButton = new JButton("Juggler");
		jugglerButton.setIcon(jugglerIcon);
		introButton = new JButton(new ImageIcon("images\\numberIcon.gif"));
		nextIcon = new ImageIcon("images\\next.gif");
		nextButton = new JButton(nextIcon);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(startButton);
		buttonPanel.add(jugglerButton);
		buttonPanel.add(introButton);
		buttonPanel.add(nextButton);
		buttonPanel.setBackground(Color.red);
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		javaLogoIcon = new ImageIcon("images\\smiley.gif");
		Image javaImage = javaLogoIcon.getImage();
		g.drawImage(javaImage, 260, 50, this);
	}
}