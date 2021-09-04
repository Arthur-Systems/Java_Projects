package ch14;
//package ch14;

//Use of threads to find out the max value in a matrix

public class ThreadFindMaxApp {
	public static void main(String[] args) {
		final int ROW = 100,
		          COL = 200;
		long startTime = 0,
		     endTime = 0;
        MaxThread[] eachMaxThread = new MaxThread[ROW];
        double[][] matrix = Matrix.generator(ROW, COL);
        double max = Double.MIN_VALUE;

        for(int i = 0; i < eachMaxThread.length; i++) {
			eachMaxThread[i] = new MaxThread(matrix[i]);
			eachMaxThread[i].start();
		}

       try {
		   startTime = System.currentTimeMillis();
		   System.out.println("start time: " + startTime);
		   for(int i = 0; i < eachMaxThread.length; i++) {
		   		eachMaxThread[i].join();
		   		max = Math.max(max, eachMaxThread[i].getMax());
			}
		   endTime = System.currentTimeMillis();
		   System.out.println("end time: " + endTime);
		}
		catch (InterruptedException e) {
		}
		System.out.println("Max of the matrix is: " + max);
		System.out.println("Completion time: " + (endTime - startTime) + " ms.");
	}
}