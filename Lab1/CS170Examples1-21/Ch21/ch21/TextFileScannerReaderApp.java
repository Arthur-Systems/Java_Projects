package ch21;
//Driver of TextFileScannerReader

import java.io.*;
import java.util.*;

public class TextFileScannerReaderApp {
    public static void main(String[] args) {
		String fileName = "C:/Java_Art_Examples_1-23/Ch21/numberData.txt";
		try {
			TextFileScannerReader read = new TextFileScannerReader(fileName);

			int age = read.getInt();
			int score = read.getInt();
			double price = read.getDouble();
			long population = read.getLong();
			double invest = read.getDouble();
			double rate = read.getDouble();
			String text = read.getString();
			read.closeFile();

			System.out.println("age: " + age);
			System.out.println("score: " + score);
			System.out.println("price: " + price);
			System.out.println("invest: " + invest);
			System.out.println("population: " + population);
			System.out.println("rate: " + rate);
			System.out.println("text: " + text);
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
    }
}