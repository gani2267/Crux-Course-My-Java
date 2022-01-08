package Backtracking;

public class QueenPermutation1D {
	
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenPermutation1D(new boolean[4],2,0,"");
	}
	
	
	//qpsf=queens placed so far
	public static void queenPermutation1D(boolean[] boxes,int tq,int qpsf,String ans) {
		
		if(tq==qpsf) {
			count++;
			System.out.println(count+". "+ans);
			return ;
		}
		
		for(int i=0; i<boxes.length; i++) {
			
			if(boxes[i]==false) {
				boxes[i]=true;
				queenPermutation1D(boxes,tq,qpsf+1,ans+"q"+qpsf+"b"+i+" ");
				boxes[i]=false;                                        //This is backtracking
			}
			
		}
	}

}
