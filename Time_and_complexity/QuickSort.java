package Time_and_complexity;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,10,30,50,60,5,80,25};
		quickSort(arr,0,arr.length-1);
		display(arr);

	}
	
	public static void quickSort(int[] arr,int lo,int hi) {
		
		//base case
		if(lo>=hi) {
			return ;
		}
		
		//1 partioning
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		
		int left=lo;
		int right=hi;
		
		while(left<=right) {
			
			if(arr[left]>=pivot) {
				
				if(arr[right]<=pivot) {
					int temp=arr[right];
					arr[right]=arr[left];
					arr[left]=temp;
					
					left++; right--;
				}else {
					right--;
				}
				
			}else {
				left++;
			}
		}
		
		//recursive call
		quickSort(arr,lo,right);
		quickSort(arr,left,hi);
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	

}
