package ch21;

//Demo: Binary file buffered output

import java.io.*;

public class BinaryFileBufferedWriteTest {
	public static void main(String[] args) {
		short age = 89;
		int count = 100;
		float price = 89.56f;
		long population = 1300000000;
		double invest = 678900000;
		try {
			DataOutputStream out = new DataOutputStream(
										new BufferedOutputStream(
											new FileOutputStream("myData.dat")));
			out.writeBoolean(false);
			out.writeChar('A');
			out.writeChars("Java");
			out.writeUTF("Java");
			out.writeByte(99);
			out.writeShort(age);
			out.writeInt(count);
			out.writeLong(population);
			out.writeFloat(price);
			out.writeDouble(invest);

			System.out.println("File size: " + out.size() + "bytes");

			out.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}