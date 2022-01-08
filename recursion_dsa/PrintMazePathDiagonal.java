package recursion_dsa;

public class PrintMazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMazePathDiagonal(0,0,2,2,"");
	}
	
	public static void PrintMazePathDiagonal(int starti,int startj,int endi,int endj,String result) {
		
		if(starti==endi && startj==endj) {
			System.out.println(result);
			return ;
		}
		
		if(starti>endi || startj>endj) {
			return;
		}
		
		PrintMazePathDiagonal(starti,startj+1,endi,endj,result+"H");
		PrintMazePathDiagonal(starti+1,startj,endi,endj,result+"V");
		PrintMazePathDiagonal(starti+1,startj+1,endi,endj,result+"D");
	}

}
