package Backtracking;

public class CoinChangePermutation {
	
	static int amount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6};
		amount=10;
		CoinChangeCombination(arr,0,"");
	}
	
    public static void CoinChangeCombination(int[] arr,int sum,String ans) {
		
		if(amount==sum) {
			System.out.println(ans);
			return ;
		}
		
		if(sum>amount) {
			return ; 
		}
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			CoinChangeCombination(arr,sum,ans+arr[i]+" ");
			sum-=arr[i];                               //This is backtracking
		}
		
	}


}
