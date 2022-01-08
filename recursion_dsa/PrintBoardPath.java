package recursion_dsa;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintBoardPath(0,10,"");
	}
	
	public static void PrintBoardPath(int start,int end,String result) {
		
		if(start==end) {
			System.out.println(result);
			return ;
		}
		
		if(start>end) {
			return ;
		}
		
		for(int i=1; i<=6; i++) {
			String ch=i+"";
			PrintBoardPath(start+i,end,result+i);
		}
	}

}
