package mower;

import java.util.Scanner;
import java.util.ArrayList;
//import math random

public class mowapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the lawn");
		int size = sc.nextInt();
		System.out.println("Enter the position of the mower");
		int mowerX = sc.nextInt();
		int mowerY = sc.nextInt();
		System.out.println("Enter the number of obsitacles");
		int obstacles = sc.nextInt();
		sc.close();
		Field f = new Field();
		f.setSize(size);
		lawnmower lm = new lawnmower();
		lm.setMower(mowerX, mowerY);

	}

}
