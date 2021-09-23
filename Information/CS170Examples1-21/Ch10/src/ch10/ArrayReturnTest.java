package ch10;

//Array as return type test

public class ArrayReturnTest {
   public static void main( String args[] ) {
		double[] firstArray = { 89.2, 192.09, 87.77, 299.102, 920.02, 82.2 };  //create and initialize array
		double[] secondArray = { 0.934, 0.087, 0.056, 0.0625};
		//combined array to hold all elements of two arrays
		double[] combinedArray; // = new double[firstArray.length + secondArray.length];

		combinedArray = ArrayUse.append(firstArray, secondArray); //call append() method

		for( double element : combinedArray)
			System.out.print(element + "  ");

		System.out.println("\n");
	}
}