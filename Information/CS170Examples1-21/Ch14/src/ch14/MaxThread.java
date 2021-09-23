package ch14;
//package ch14;

// Use of threads to find out the max value in the matrix

class MaxThread extends Thread {
	   private double max = Double.MIN_VALUE;
	   private double[] eachArray;

	   public MaxThread(double[] eachArray) {
		   this.eachArray = eachArray;
	   }
	   public void run() {  			//
	   		for(int i = 0; i < eachArray.length; i++) {
				max = Math.max(max, eachArray[i]);
			}
		}
	   public double getMax() {
			return max;
	   }
	}

class Matrix {
	public static double[][] generator(int row, int col) {
		double[][] matrix = new double[row][col];
		for(int i = 0; i < row; i++)
		  for(int j = 0; j < col; j++)
		    matrix[i][j] = Math.random() * 101;
		return matrix;
	}
}