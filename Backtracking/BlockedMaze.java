package Backtracking;

public class BlockedMaze {
	
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[4][4];
		arr[0][1]=1;
		arr[2][1]=1;
		arr[3][2]=1;
		blockedMaze(arr,0,0,"");
	}
	
	public static void blockedMaze(int[][] arr,int starti,int startj,String ans) {
		
		if(starti==arr.length-1 && startj==arr[0].length-1) {
			count++;
			System.out.println(count+" : "+ans);
			return ;
		}
		
		if(starti<0 || starti>=arr.length || startj<0 ||startj>=arr[0].length) {
			return ;
		}
		
		if(arr[starti][startj]==1) {
			return ;
		}
		
		arr[starti][startj]=1;
		blockedMaze(arr,starti,startj+1,ans+"R");
		
		blockedMaze(arr,starti+1,startj,ans+"D");
		
		blockedMaze(arr,starti-1,startj,ans+"U");		
		
		blockedMaze(arr,starti,startj-1,ans+"L");
		arr[starti][startj]=0;
	}

}
