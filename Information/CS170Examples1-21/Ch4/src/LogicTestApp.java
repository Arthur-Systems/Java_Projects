/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YGao
 */
//Demo:  test logical expressions

import java.util.Scanner;

public class LogicTestApp {
	public static void main(String[] args) {
		boolean x, y, z, applyStatus;
		String myGrade;
		int a, b, c,
			midtermScore, finalScore, grantAmount = 0;
		Scanner sc = new Scanner(System.in);	//Create object of Scanner
		
		//test out the basics
		System.out.print("Please enter boolean value of x: ");
		x = sc.nextBoolean();	
		System.out.print("Please enter boolean value of y: ");
		y = sc.nextBoolean();		
		System.out.print("Please enter boolean value of z: ");
		z = sc.nextBoolean();		
		System.out.println("x && y: " + (x && y)); 
		System.out.println("x || y: " + (x || y)); 
		System.out.println("!x: " + !x); 
		System.out.println("x != y && x != z: " + (x != y && x != z));
		System.out.println("x == y || x == z: " + (x == y || x == z));
		
		//test out the examples in section 4.1.3
		System.out.print("Please enter your miterm score as integer: ");
		midtermScore = sc.nextInt();
		System.out.print("Please enter your final score as integer: ");
		finalScore = sc.nextInt();
		
		if (midtermScore >= 90 && finalScore >= 90)
			applyStatus = true;
		else
			applyStatus = false;
		System.out.println("Your midterm score: " + midtermScore);
		System.out.println("Your final score: " + finalScore);
		System.out.println("Your apply status: " + applyStatus);
		
		if (midtermScore > 90 || finalScore > 90)
			grantAmount = 2500;
		System.out.println("Your grant amount: " + grantAmount);
		
		System.out.print("Please enter your grade of the class: ");
		myGrade = sc.next();
		
		if (!myGrade.equalsIgnoreCase("A"))
			grantAmount = 0;
		else
			applyStatus = true;
		System.out.println("Your grant amount: " + grantAmount);
		System.out.println("Your apply status: " + applyStatus);
		
		//test out the examples in table 4-3
		System.out.print("Please enter integer value of a: ");
		a = sc.nextInt();	
		System.out.print("Please enter integer value of b: ");
		b = sc.nextInt();		
		System.out.print("Please enter integer value of c: ");
		c = sc.nextInt();
		System.out.println("a != b && a != c: " + (a != b && a != c));
		System.out.println("a == b || a == c: " + (a == b || a == c));
		System.out.println("a < b + 1 || a >= c ¨C 1: " + (a < b + 1 || a >= c - 1)); 	
		
		sc.close();  //Close the  scanner
	}
}

