package Backtracking;

public class CoinChangeCoinRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinChangeCoinRespect(new int[] {2,3,5,6},0,10,0,"");
	}
	
	public static void coinChangeCoinRespect(int[] arr,int i,int amount,int sum,String ans) {
		
		if(sum==amount) {
			System.out.println(ans);
			return ;
		}
		
		if(sum>amount) {
			return ;
		}
		
		if(i>=arr.length) {
			return ;
		}
		
		coinChangeCoinRespect(arr,i,amount,sum+arr[i],ans+arr[i]+" ");       //coin included
		coinChangeCoinRespect(arr,i+1,amount,sum,ans);                       //coin excluded
	}

}
