package Backtracking;

public class QueenCombination1D {

	static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 queenCombination1D(new boolean[4],2,0,"",-1);
	}
	
    public static void queenCombination1D(boolean[] boxes,int tq,int qpsf,String ans,int lastBoxUsed) {
		
		if(tq==qpsf) {
			count++;
			System.out.println(count+". "+ans);
			return ;
		}
		
		for(int i=lastBoxUsed+1; i<boxes.length; i++) {
				 queenCombination1D(boxes,tq,qpsf+1,ans+"q"+qpsf+"b"+i+" ",i);
		}
	}

}
