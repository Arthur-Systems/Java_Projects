package mower;

public class Field {

	public void setSize(int size) { // sets the size of the field, the size is the number of rows and columns
		int[][] lawn = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				lawn[i][j] = 0;
			}
		}
		convert(lawn, size);

	};

	public void convert(int[][] lawn, int size) { // converts the lawn to a Char and converts all 0 to G
		char[][] charlawn = new char[size][size];
		for (int i = 0; i < lawn.length; i++) {
			for (int j = 0; j < lawn.length; j++) {
				if (lawn[i][j] == 0) {
					charlawn[i][j] = 'G';
				} else if (lawn[i][j] == 1) {
					charlawn[i][j] = 'T';
				}
			}
		}
		print(charlawn, lawn);
	}

	public void setObstacles(int obstacles) { // sets the number of obstacles

	}

	public void placeObstacles(int[][] lawn, int obstacles) { // places the obstacles in the lawn
		for (int i = 0; i < obstacles; i++) {
			int x = (int) (Math.random() * lawn.length);
			int y = (int) (Math.random() * lawn.length);
			lawn[x][y] = 1;
		}
	}

	public void print(char[][] charlawn, int[][] lawn) { // prints the lawn
		for (int i = 0; i < lawn.length; i++) {
			for (int j = 0; j < lawn.length; j++) {
				System.out.print(charlawn[i][j] + " ");
			}
			System.out.println();
		}
	}

}