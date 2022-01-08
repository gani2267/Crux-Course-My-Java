package Backtracking;

public class CoinChangeCombination {
	
	static int amount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6};
		amount=10;
		CoinChangeCombination(arr,0,0,"");
	}
	
	public static void CoinChangeCombination(int[] arr,int lastIndex,int sum,String ans) {
		
		if(amount==sum) {
			System.out.println(ans);
			return ;
		}
		
		if(sum>amount) {
			return ; 
		}
		
		for(int i=lastIndex; i<arr.length; i++) {
			sum+=arr[i];
			CoinChangeCombination(arr,i,sum,ans+arr[i]+" ");
			sum-=arr[i];                               //This is backtracking
		}
		
	}

}
