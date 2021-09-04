package ch10;
//Two dimension array test

public class TwoDArrayTest {
   public static void main( String args[] )

   {
		int[][] scores = { {89, 92, 87}, {99, 90, 82} };  //create and initialize array
		int sum = 0;
		double average;

		for( int row = 0; row < scores.length; row++) {			//outer loop controls rows
		 for( int col = 0; col < scores[row].length; col++) {	//inner loop controls columns
			System.out.print(scores[row][col] + "\t");
			sum += scores[row][col];
		 }
		System.out.println("\n");
		}
		average = (double) sum / (scores.length * scores[0].length); //2 * 3
		System.out.println("Average score: " + average);
   }
}