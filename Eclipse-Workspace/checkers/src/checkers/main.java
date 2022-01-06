package checkers;

public class main {
	private int xCor;
	private int yCor;
	private boolean king;

	public pieces()
	{
	  xCor = 0;
	  yCor = 0;
	  king = false;
	}

	public pieces( int x, int y, boolean b)
	{
	  xCor = x;
	  yCor = y;
	  king = b;
	}

	public int getX() {
		return xCor;
	}

	public int getY() {
		return yCor;
	}

	public boolean kingStatus() {
		return king;
	}

	public void setX(int x) {
		xCor = x;
	}

	public void setY(int y) {
		yCor = y;
	}

	public void makeKing(boolean k) {
		king = k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create new object array from Pieces class
		Pieces[] red = new Pieces[12];
		Pieces[] black = new Pieces[12];

		// create board array
		int[][] board = new int[8][8];

		// initialize board array
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = 0;
			}
		}

		// initialize red pieces
		for (int i = 0; i < 12; i++) {
			red[i] = new Pieces();
		}

		// initialize black pieces
		for (int i = 0; i < 12; i++) {
			black[i] = new Pieces();
		}
		// insert red pieces into board
		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				red[i].setX(i);
				red[i].setY(0);
				board[red[i].getX()][red[i].getY()] = 1;
			} else {
				red[i].setX(i - 6);
				red[i].setY(1);
				board[red[i].getX()][red[i].getY()] = 1;
			}
		}

		// insert black pieces into board
		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				black[i].setX(i);
				black[i].setY(7);
				board[black[i].getX()][black[i].getY()] = 2;
			} else {
				black[i].setX(i - 6);
				black[i].setY(6);
				board[black[i].getX()][black[i].getY()] = 2;
			}
		}

		// print board
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

}
