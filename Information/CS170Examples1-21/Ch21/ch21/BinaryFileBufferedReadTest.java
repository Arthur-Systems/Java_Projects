package ch21;

//Demo: Binary file buffered input

import java.io.*;

public class BinaryFileBufferedReadTest {
	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(
									new BufferedInputStream(
										new FileInputStream("myData.dat")));

			boolean flag = in.readBoolean();
			char grade = in.readChar();

			String code ="";
			for (int i = 0; i < 4; i++)
			 code += in.readChar();

			System.out.println("String code = " + code);

			String code2 = in.readUTF();
			byte n = in.readByte();
			short age = in.readShort();
			int count = in.readInt();
			long population = in.readLong();
			float price = in.readFloat();

			System.out.println("flag = " + flag);
			System.out.println("grade = " + grade);
			System.out.println("UTF code = " + code2);
			System.out.println("byte n = " + n);
			System.out.println("short age = " + age);
			System.out.println("long population = " + population);
			System.out.println("float price = " + price);
			System.out.println("invest = " + in.readDouble());

			double total = price * count;
			System.out.println("total = " + total);
			in.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
