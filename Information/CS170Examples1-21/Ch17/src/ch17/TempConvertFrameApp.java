package ch17;
//package ch17;

//Use of JSliders to convert temperatures
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;

class TempConvertFrame extends JFrame {
	JSlider fSlider, cSlider;
	Border loweredBorder, raisedBorder;
	JPanel cSliderPanel, fSliderPanel;
	double cTemp, fTemp;
	TempConvertFrame() {
		super("Temperature Conversion");
		loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		raisedBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);

		cSliderPanel = new JPanel();
		cSliderPanel.setLayout(new BoxLayout(cSliderPanel, BoxLayout.Y_AXIS));

		cSlider= new JSlider (-20, 40);
		cSlider.setMinorTickSpacing(1);
		cSlider.setMajorTickSpacing(5);
		cSlider.setPaintTicks(true);
		cSlider.setPaintLabels(true);
		cSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Celsius: " + 10));
		ChangeListener  changeListener = new SliderChangeListener();
		cSlider.addChangeListener(changeListener);
		cSliderPanel.add (cSlider);
		add(cSliderPanel, BorderLayout.NORTH);

		fSliderPanel = new JPanel();
		fSliderPanel.setLayout(new BoxLayout(fSliderPanel, BoxLayout.Y_AXIS));
		fSlider= new JSlider (0, 100);
		fSlider.setMinorTickSpacing(1);
		fSlider.setMajorTickSpacing(5);
		fSlider.setPaintTicks(true);
		fSlider.setPaintLabels(true);
		fSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Fahrenheit: " + 50));
		changeListener = new SliderChangeListener();
		fSlider.addChangeListener(changeListener);
		fSliderPanel.add (fSlider);
		add(fSliderPanel, BorderLayout.SOUTH);
	}
	class SliderChangeListener implements ChangeListener {
	  public void stateChanged(ChangeEvent e) {
	    Object source = e.getSource();
	     if (source == fSlider) {
			 if (!cSlider.getValueIsAdjusting()) {
	          cTemp = fToCConvert(fSlider.getValue());
	          cSlider.setValue((int)cTemp);
	          cSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Celsius: " + cTemp));
	          fSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Fahrenheit: " + fSlider.getValue()));
			}
		}
		else if (source == cSlider) {
			if (!fSlider.getValueIsAdjusting()) {
				fTemp = cToFConvert(cSlider.getValue());
				fSlider.setValue((int)fTemp);
				fSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Fahrenheit: " + fTemp));
				cSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Celsius: " + cSlider.getValue()));
		    }
		}
	  }
	}
	double cToFConvert(int cTemp) {
		return 9/5.0*cTemp + 32;
	}
	double fToCConvert(int fTemp) {
		return 5/9.0*(fTemp-32);
	}
}

public class TempConvertFrameApp {
  public static void main(String args[]) {
    JFrame f = new TempConvertFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize (600, 200);
	f.setVisible (true);
  }
}