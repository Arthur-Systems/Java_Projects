//Demo: Use of BigDecimal

import java.math.*;

public class BigDecimalTestApp {
	public static void main(String[] args) {

		BigDecimal bigNumber = new BigDecimal("89.1234567890123456789");
		BigDecimal bigRate = new BigDecimal(1000);
		BigDecimal bigResult = new BigDecimal(0);  //bigResult holds 0.0

		//multiply in the two objects and return the result in bigResult
		bigResult = bigNumber.multiply(bigRate);

		//Display the result: 89123.4567890123456789000
		System.out.println(bigResult.toString());  //or System.out.println(bigResult);

		double dData = bigNumber.doubleValue();    //Return the value as double
		System.out.println(dData);  //89.12345678901235


		int iData = bigNumber.intValue();				//Return the int value
		System.out.println("iData: " + iData);			//89
	}
}
