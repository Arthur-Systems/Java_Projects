//Demo: Currency format output

import java.util.*;
import java.text.*;

public class TestCurrencyApp {
	public static void main(String[] args) {
		//Define the currency format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String price = currency.format(1290.6051);
		System.out.println("Your price: " + price);

		//Define the currency format using cascading
		double total = 999999.999;
		price = NumberFormat.getCurrencyInstance().format(total);
		System.out.println("Your price: " + price);

		//Define currency format using locale
		Locale locale = Locale.PRC;	//Define locale as Chinese currency
		String money = NumberFormat.getCurrencyInstance(locale).format(12000003.45556);
		System.out.println("Chinese Yuan " + money);

		//Define currency as US dollar (defualt)
		String dollars = NumberFormat.getCurrencyInstance(Locale.US).format(12000003.45556);
		System.out.println("US " + dollars);

		//Define currency as France
		String frances= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(1234.454);
		System.out.println("France " + frances );

	}
}
