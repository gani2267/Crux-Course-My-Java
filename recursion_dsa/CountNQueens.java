package recursion_dsa;

public class CountNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println(CountNQueens(board, 0));
	}

	public static int CountNQueens(boolean[][] board, int row) {

		if (row >= board.length) {
			return 1;
		}

		int count = 0;

		for (int col = 0; col < board[row].length; col++) {

			if (isSafe(board, row, col)) {
				board[row][col] = true;
				count = count + CountNQueens(board, row + 1);
				board[row][col] = false;
			}
		}

		return count;
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {

		for (int i = 0; i <= row; i++) {
			if (board[i][col] == true) {
				return false;
			}
			if ((col - i) >= 0 && (row-i)>=0) {
				if (board[row - i][col - i] == true) {
					return false;
				}
			}
			if ((col + i) < board[row].length && (row-i)>=0) {
				if (board[row - i][col + i] == true) {
					return false;
				}
			}
		}

		return true;
	}
}
