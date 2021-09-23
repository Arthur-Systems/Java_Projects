package ch21;

//Provide currency format output

import java.text.*;

public class Formatter {
 	public static String currency(double currence) {
		String currenceStr;
	 	NumberFormat currency = NumberFormat.getCurrencyInstance();
		currenceStr = currency.format(currence);
		return currenceStr;
	}
}