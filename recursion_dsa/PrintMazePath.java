package recursion_dsa;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMazePath(0,0,2,2,"");
	}
	
	public static void PrintMazePath(int starti,int startj,int endi,int endj,String result) {
		
		if(starti == endi && startj == endj) {
			System.out.println(result);
			return ;
		}
		
		if(starti>endi || startj>endj) {
			return ;
		}
		
		PrintMazePath(starti,startj+1,endi,endj,result+"H");
		PrintMazePath(starti+1,startj,endi,endj,result+"V");
		
	}

}
