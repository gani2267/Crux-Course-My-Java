package Backtracking;

public class NQueen2 {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueen2(new boolean[4][4], 0, 0, 0, 3, "");
	}

	public static void nQueen2(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		if (tq == qpsf) {
			count++;
			System.out.println(count + " : " + ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row >= board.length) {
			return;
		}

		if (isSafe(board, row, col)) {
			board[row][col] = true;
			nQueen2(board, row+1, 0, qpsf + 1, tq, ans + "b" + row + "" + col + " ");
//			nQueen2(board, row,col+1, qpsf + 1, tq, ans + "b" + row + "" + col + " ");     //this also valid
			board[row][col] = false;
		}

		nQueen2(board, row, col + 1, qpsf, tq, ans);
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {

		// vertical
		for (int i = 0; i < row; i++) {
			if (board[i][col]) {
				return false;
			}
		}

		// horizontal
		for (int i = 0; i < col; i++) {
			if (board[row][i]) {
				return false;
			}
		}

		// diagonally left
		int i = row - 1;
		int j = col - 1;
		while (i >= 0 && j >= 0) {
			if (board[i][j]) {
				return false;
			}
			i--;
			j--;
		}

		// diagonally right
		i = row - 1;
		j = col + 1;
		while (i >= 0 && j < board[0].length) {
			if (board[i][j]) {
				return false;
			}
			i--;
			j++;
		}

		return true;
	}
}
