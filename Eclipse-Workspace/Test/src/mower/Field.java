package mower;

public class Field {

	public void setSize(int size) {
		int[][] lawn = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				lawn[i][j] = 0;
			}
		}
		convert(lawn, size);
	}

	public void convert(int[][] lawn, int size) {
		for (int i = 0; i < lawn.length; i++) {
			for (int j = 0; j < lawn.length; j++) {
				char[][] charlawn = new char[size][size];
				if (lawn[i][j] == 0) {
					charlawn[i][j] = 'G';
				}
				System.out.print(charlawn[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void print(charlawn){
		for (int i = 0; i < lawn.length; i++) {
			for (int j = 0; j < lawn.length; j++) {
		System.out.print(charlawn[i][j] + " ");
	}
	System.out.println();	
}
}
}
