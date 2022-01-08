package Backtracking;

import java.util.Scanner;
public class NQueens {
	
	static int count = 0 ;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		queenComb2DKill(new boolean[n][n],0,0,"",n,0);
		
		System.out.println("\n");
		count=0;
		nQueen(new boolean[n][n],0,0,"");                //this is a better code
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
	
	public static void nQueen(boolean[][] board,int row,int qpsf,String ans) {
		
		if(qpsf==board.length) {              //as board length is n
			count++;
			System.out.println(count+" : "+ans);
			return ;
		}
		
		if(row>=board.length) {
			return ;
		}
		
		
		for(int col=0; col<board[0].length; col++) {
			
			if(isSafe(board,row,col)) {
				board[row][col]=true; 
				nQueen(board,row+1,qpsf+1,ans+"b"+row+""+col+" ");
				board[row][col]=false;
			}
		}
	}
	
	
}
