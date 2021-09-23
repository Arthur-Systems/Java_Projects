package ch14;
//package ch14;

//Find out the max value in a matrix without using threads

public class MaxWithoutThreadApp {
	public static void main(String[] args) {
		final int ROW = 100,
		          COL = 200;
		long startTime = 0,
		       endTime = 0;
        double[][] matrix = Matrix.generator(ROW, COL);
        double max = Double.MIN_VALUE;

		startTime = System.currentTimeMillis();
		System.out.println("start time: " + startTime);

        for(int i = 0; i < ROW; i++)
         for(int j = 0; j < COL; j++)
          max = Math.max(max, matrix[i][j]);

        endTime = System.currentTimeMillis();
		System.out.println("end time: " + endTime);


		System.out.println("Max of the matrix is: " + max);
		System.out.println("Completion time: " + (endTime - startTime) + " ms.");
	}
}