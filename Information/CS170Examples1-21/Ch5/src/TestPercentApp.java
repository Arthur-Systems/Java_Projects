//Demo: Use of percent format

import java.util.*;
import java.text.*;

public class TestPercentApp {
	public static void main(String[] args) {
		//Define percent format
		NumberFormat percent = NumberFormat.getPercentInstance();
		String rate = percent.format(0.0756);
		System.out.println("Interest rate: " + rate);

		rate = percent.format(0.0651);
		System.out.println("Output of percent of 0.0651: " + rate);

		rate = percent.format(0.0650);
		System.out.println("Output of ercent of 0.0650: " + rate);

		//Define percent using cascading
		double interest = 0.065;
		rate = NumberFormat.getPercentInstance().format(interest);
		System.out.println("rate2: " + rate);

		rate = NumberFormat.getPercentInstance().format(0.065001);
		System.out.println("rate3: " + rate);
		rate = NumberFormat.getPercentInstance().format(0.075);
		System.out.println("rate4: " + rate);

		NumberFormat percent2 = NumberFormat.getPercentInstance();
		percent2.setMinimumFractionDigits(4);		//Mini fraction display as 4 decimals
		String rate3 = percent2.format(.0650);
		String rate4 = percent2.format(0.075);
		System.out.println("rate3 = " + rate3 + "\trate4 = " + rate4);


		NumberFormat percent3 = NumberFormat.getPercentInstance(Locale.ITALY);
		percent3.setMaximumFractionDigits(4);		//Max fraction display as 4 decimals
		String rate2 = percent3.format(0.07551008);
		System.out.println("rate2: " + rate2);
	}
}
