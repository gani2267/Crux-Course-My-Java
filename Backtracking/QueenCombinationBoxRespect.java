package Backtracking;

public class QueenCombinationBoxRespect {
	
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenCombBoxRespect(new boolean[4],2,0,"",0);
	}
	
	public static void queenCombBoxRespect(boolean[] boxes,int tq,int qpsf,String ans,int i) {
		
		if(tq==qpsf) {
			count++;
			System.out.println(count+" : "+ans);
			return ; 
		}
		
		if(qpsf>tq) {
			return ;
		}
		
		if(i>=boxes.length) {
			return ;
		}
		
//		boxes[i]=true ;              //not required
		queenCombBoxRespect(boxes,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
//		boxes[i]=false ;             //not required
		queenCombBoxRespect(boxes,tq,qpsf,ans,i+1);
	}
}
