//The driver code to test out the MileageConverter

import javax.swing.JOptionPane;

public class MileageConverterApp {
	public static void main(String[] args) {

		//create an object of MileagaeConverter
		MileageConverter mc = new MileageConverter();

		String str;  		//declare a string
		double distance;	//declare a double

		//receive input data
		str = JOptionPane.showInputDialog("Welcome to Mileage Converter\n"
											+ "Please a distance: ");

		distance = Double.parseDouble(str);	//convert to double

		mc.setKilometers(distance);				//set as kilometers
		mc.setMiles(distance);				//set as miles

		mc.convertKilometers();					//convert kilometers to miles

		//display the result as miles
		JOptionPane.showMessageDialog(null, str + " kilometers = " + mc.getResult() + " miles");

		mc.convertMiles();					//convert miles to kilometers

		//display the result as gongLi
		JOptionPane.showMessageDialog(null, str + " miles = " + mc.getResult() + " kilometers");

	} //end of main()
} //end of MileageConverterApp
