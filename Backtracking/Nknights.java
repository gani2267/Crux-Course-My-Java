package Backtracking;

import java.util.Scanner;

public class Nknights {
	
	static Scanner sc=new Scanner(System.in);
	static int count=0;

	public static void main(String[] args) {
		
		int n=sc.nextInt();
		 NKnights(new boolean[n][n],0,0,"",0);
	}
	
	public static void NKnights(boolean[][] board,int row,int col,String ans,int kpsf) {
		
		if(kpsf==board.length) {
			count++;
			System.out.println(count+" : "+ans);
			return ;
		}
		
		if(col==board[0].length) {
			row++;
			col=0;
		}
		
		if(row>=board.length) {
			return;
		}
		
		if(isSafeForKnightsSmartWork(board,row,col)) {
		board[row][col]=true;
		 NKnights(board,row,col+1,ans+"k"+row+""+col+" ",kpsf+1);
		board[row][col]=false;                  //backtracking
		}
		 NKnights(board,row,col+1,ans,kpsf);
	}
	
	//below is long method
	public static boolean isSafeForKnights(boolean[][] board,int i,int j) {
		
		if((i+2)<board.length && (j+1)<board.length) {
		if(board[i+2][j+1]) { return false; }
		}
		
		if((i+2)<board.length && (j-1)>=0) {
		if(board[i+2][j-1]) { return false; }
		}
		
		if((i-2)>=0 && (j+1)<board.length ) {
		if(board[i-2][j+1]) { return false; }
		}
		
		if((i-2)>=0 && (j-1)>=0) {
		if(board[i-2][j-1]) { return false; }
		}
		
		if((i+1)<board.length && (j+2)<board.length ) {
		if(board[i+1][j+2]) { return false; }
		}
		
		if((i-1)>=0 && (j+2)<board.length ) {
		if(board[i-1][j+2]) { return false; }
		}
		
		if((i+1)<board.length && (j-2)>=0) {
		if(board[i+1][j-2]) { return false; }
		}
		
		if((i-1)>=0 && (j-2)>=0) {
		if(board[i-1][j-2]) { return false; }
		}
		
		return true;
	}
	
	//below is smart method
	public static boolean isSafeForKnightsSmartWork(boolean[][] board,int i,int j) {
		
		int[] arr1= {2,2,-2,-2};
		int[] arr2= {-1,+1,-1,+1};
		
		for(int y=0; y<arr1.length; y++) {
			
			int r=i+arr1[y];
			int c=j+arr2[y];
			if(r>=0 && r<board.length && c>=0 && c<board.length) {
				if(board[r][c]) {
					return false;
				}
			}
			
			r=i+arr2[y];
			c=j+arr1[y];
			
			if(r>=0 && r<board.length && c>=0 && c<board.length) {
				if(board[r][c]) {
					return false;
				}
			}
		}
		
		return true;
	}

	
}
