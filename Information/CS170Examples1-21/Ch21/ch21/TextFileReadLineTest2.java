package ch21;

//Demo: Text file input

import java.io.*;

public class TextFileReadLineTest2 {
	public static void main(String[] args) {
		short age = 0;
		int count = 0;
		float price = 0.0F;
		long population = 0L;
		double	invest = 0.0,
		      	total = 0.0;
		try {

			BufferedReader in = new BufferedReader(
									new FileReader("numberData.txt"));

			String line = in.readLine();
			age = Short.parseShort(line);
			line = in.readLine();
			count = Integer.parseInt(line);
			price = Float.parseFloat(in.readLine());
			population = Long.parseLong(in.readLine());
			invest = Double.parseDouble(in.readLine());
			total = count * price;
			System.out.println("Age: " + age);
			System.out.println("Population: " + population);
			System.out.println("Invest: " + invest);
			System.out.println("Total: " + total);
			System.out.println("Average: " + Double.parseDouble(in.readLine()));

			in.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			System.out.println(e); 
		}
	}
}