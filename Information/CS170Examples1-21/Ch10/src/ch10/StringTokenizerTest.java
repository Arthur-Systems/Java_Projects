package ch10;
//Demo:  Test StringTokenizer's methods

import java.util.StringTokenizer;

public class StringTokenizerTest {
   public static void main( String args[] ) {

	   StringTokenizer dateToken = new StringTokenizer("10-15-2007", "-", true);
	   while(dateToken.hasMoreTokens() ) {
	   		System.out.println(dateToken.nextToken());
	   		System.out.println("Number of tokens left: " + dateToken.countTokens());
	   }

	}
}


