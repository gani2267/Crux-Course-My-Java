package recursion_dsa;

public class PrintNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[4][4];
		PrintNQueens(board,0,"");
	}
	
	public static void PrintNQueens(boolean[][] board,int row,String result) {
		
		if(row>=board.length) {
			System.out.println(result);
			return ;
		}
		
		for(int col=0; col<board[row].length; col++) {
			
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				PrintNQueens(board,row+1,result+"("+row+","+col+") ");
				board[row][col]=false;
			}
		}
	}
	
	public static boolean isSafe(boolean[][] board,int row,int col) {
		
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
