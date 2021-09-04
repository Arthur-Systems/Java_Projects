//Demo: use of number format

import java.text.*;

public class TestNumberApp {
	public static void main(String[] args) {
		//Define number format
		double num = 6543.2154;
		String ns = "";
		String s = "";
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		ns = number.format(num);
		System.out.println(ns);		//6,543.22

		//Complete code in TestNumberApp.java in Ch5
		//"0" – a digit.  Display 0 if there is no such digit in a number
		NumberFormat formatter = new DecimalFormat("000,000");	//Create an object and                          //specify the format

		//"#" – any digits in the whole number; will not display if there is no such digit //in a number; it only displays a single decimal if it used after decimal point //and it will round up

		formatter = new DecimalFormat("#");
		s = formatter.format(-1234.567);	//Output: -1235 //Round up; not display decimal
		s = formatter.format(0);				//Output: 0
		formatter = new DecimalFormat("#00");
		s = formatter.format(0);                		//Output: 00

		//"." – Indicate decimal point
		formatter = new DecimalFormat(".00");
		s = formatter.format(-.567);             		//Output: -.57  //round up
		formatter = new DecimalFormat("0.00");
		s = formatter.format(-.567);             		//Output: -0.57
		formatter = new DecimalFormat("#.#");
		s = formatter.format(-1234.557);         	//Output: -1234.6

	}

}
