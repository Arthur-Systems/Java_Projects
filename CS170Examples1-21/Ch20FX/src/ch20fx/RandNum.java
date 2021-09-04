package ch20fx;

/*********************************************************************************
*	randNum.java
*  Random Color, Number, Letter class to return a random .... anything
*It is used by GamePanel class and GameLetterPanel class
*********************************************************************************/
//import java.util.Scanner;
//import java.util.*;
import java.awt.*;

/***************************************************************************************
   * This class is to be used for ramdom numbers, letters, or colors
   * Using the Math.random class
	************************************************************************************/

public class RandNum {
	private String $alphabet="ABCDEFGHIJKLMNOPQRSTUVWXZY";
	private int $width=640;

/***************************************************************************************
   * This class is to be used for ramdom numbers
   * Using the Math.random class
	************************************************************************************/
public int ranNum() {
		int $ranNumber = 20 + (int)(Math.random() * $width);
		return $ranNumber;
	}
/***************************************************************************************
   * This method is to be used for random letters
   * Using the Math.random class
	************************************************************************************/
public String ranNumLetter() {
		int $ranNumLetter = 0 + (int)(Math.random() * 26);
		String $letter = $alphabet.substring($ranNumLetter, $ranNumLetter+1);
		return $letter;
	}
/***************************************************************************************
   * This method is to be used for colors
   * Using the Math.random class for each of the three RGB
	************************************************************************************/

public Color ranNumColor() {
		int $ranColorRed = 0 + (int)(Math.random() * 256);
		int $ranColorBlue = 0 + (int)(Math.random() * 256);
		int $ranColorGreen = 0 + (int)(Math.random() * 256);
    	Color  c = new Color($ranColorRed, $ranColorBlue, $ranColorGreen);
       return c;
	}
}//end of randNum

