package ch10;
//demo: simulating the frequency of each side in a die
import java.util.Random;		//for ranom number generation

public class DieStatisticsTest {
   public static void main( String[] args ) {

		int side = 1;
		int[] frequencies = new int[6];		//array to hold each side

		Random randomNumber = new Random();	//use API Random class to create an object

		for(int roll = 1; roll <= 10000; roll++)
			++frequencies[randomNumber.nextInt(6)];

      	System.out.println("Side\t" + "Frequency");
      	for (int frequency : frequencies)
      	 	System.out.println(side++ + "\t" + frequency);
   }
}