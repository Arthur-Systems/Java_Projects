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
		System.out.println("XPOS:");
		int mowerX = sc.nextInt();
		System.out.println("YPOS:");
		int mowerY = sc.nextInt();
		System.out.println("Enter the number of obstacles");
		int obstacles = sc.nextInt();
		sc.close();
		Field f = new Field();
		f.setSize(size, obstacles);
		// lawnmower lm = new lawnmower();
		// lm.setMower(mowerX, mowerY);

	}

}
