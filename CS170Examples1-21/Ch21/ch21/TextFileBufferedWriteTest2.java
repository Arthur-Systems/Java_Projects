package ch21;

//Demo: Text file buffered output with numerical data

import java.io.*;

public class TextFileBufferedWriteTest2 {
	public static void main(String[] args) {
		short age = 89;
		int count = 100;
		float price = 89.56f;
		long population = 1300000000;
		double invest = 678900000;

		try {
			PrintWriter out = new PrintWriter(					//Buffered writing
									new BufferedWriter(
										new FileWriter(
											new File("numberData.txt"), true)));

			out.println(age);		//out to the file
			out.println(count);
			out.println(price);
			out.println(population);
			out.println(invest);
			out.println(invest/population);
			out.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
