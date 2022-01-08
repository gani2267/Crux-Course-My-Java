package Time_and_complexity;

public class DutchNationalFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,0,2,1,0,2};
		
		//Sort above array with time complaxity O(n)
		//and space complaxity O(1)
		
		ans(arr);

	}
	
	public static void ans(int [] arr) {
		
		int lo=0,mid=0;
		int hi=arr.length-1;
		
		while(mid<=hi) {
			if(arr[mid]==0) {
//				swap(arr[mid],arr[lo]);
				int temp=arr[mid];
				arr[mid]=arr[lo];
				arr[lo]=temp;
				lo++; mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
//				swap(arr[hi],arr[mid]);
				int temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
				hi--;
			}
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
