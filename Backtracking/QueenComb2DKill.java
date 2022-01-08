package Backtracking;

public class QueenComb2DKill {
	
	static int count = 0 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenComb2DKill(new boolean[3][4],0,0,"",3,0);
	}
	
	public static void queenComb2DKill(boolean[][] board,int i,int j,String ans,int tq,int qpsf) {
		
		if(tq==qpsf) {
			count++;
			System.out.println(count +" : "+ans);
			return;
		}
		
		if(j==board[0].length) {
			i++;
			j=0;
		}
		
		if(i>=board.length) {
			return ;
		}
		
		
		if(isSafe(board,i,j)) {
			board[i][j]=true ;
			queenComb2DKill(board,i,j+1,ans+"b"+i+""+j+" ",tq,qpsf+1);
			board[i][j]=false;
			
		}
		queenComb2DKill(board,i,j+1,ans,tq,qpsf);
		
	}
	
	public static boolean isSafe(boolean[][] board,int row,int col) {
		
		//vertical
		for(int i=0; i<row; i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//horizontal
		for(int i=0; i<col; i++) {
			if(board[row][i]) {
				return false;
			}
		}
		
		//diagonally left
		int i=row-1;
		int j=col-1;
		while(i>=0 && j>=0) {
			if(board[i][j]) {
				return false;
			}
			i--;j--;
		}
		
		//diagonally right
		i=row-1;
		j=col+1;
		while(i>=0 && j<board[0].length) {
			if(board[i][j]) {
				return false;
			}
			i--; j++;
		}
		
		return true; 
	}
}
